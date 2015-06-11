package riskmanager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTextArea;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parser{

    int time_out, current, max;
    JTextArea jTextArea1;

    public Parser(int time_out, JTextArea jTextArea1) {
    this.time_out = time_out;
    this.jTextArea1 = jTextArea1;
    }
    

    public List<FuturesEntity> getFuturesList() throws IOException {
        List<FuturesEntity> futuresList = new ArrayList<>();
        
        String tickers[] = parseURL();
      //  max = tickers.length;
       // current = 0;
        for (String ticker : tickers) {
           // current++;

            //печатаем на форме и в консоль
            futuresList.add(parsePage(ticker));
            System.out.println("Парсинг: " + ticker);
            jTextArea1.append("\n");
            jTextArea1.append("Парсинг: " + ticker);
            jTextArea1.setCaretPosition(jTextArea1.getDocument().getLength());

        }
            jTextArea1.append("\n\n");
            jTextArea1.append("База обновлена");
            jTextArea1.setCaretPosition(jTextArea1.getDocument().getLength());
        return futuresList;
    }
        

//    public String[] parse(String url_ticker) throws IOException {
//        
//        Document doc = Jsoup.connect("http://moex.com" + url_ticker).get();
//        Elements name = doc.select("table[class=table3px] tr:contains(Наименование контракта) td[class=pvalue]");
//        Elements step = doc.select("table[class=table3px] tr:contains(Стоимость шага цены) td[class=pvalue]");
//        String[] ticker = Jsoup.parse(url_ticker).text().split("code=*"); // select ticker name
//        String[] output = new String[]{ticker[1] + ": " + name.text(), "Стоимость шага цены: " + step.text()};
//        return output;
//    }

    public FuturesEntity parsePage(String url_ticker) throws IOException {
        Document doc = Jsoup.connect("http://moex.com" + url_ticker).timeout(time_out).get();
        Elements name = doc.select("table[class=table3px] tr:contains(Наименование контракта) td[class=pvalue]");
        Elements price_step = doc.select("table[class=table3px] tr:contains(Стоимость шага цены) td[class=pvalue]");
        Elements step = doc.select("table[class=table3px] tr:contains(Шаг цены) td[class=pvalue]");
        Elements margin = doc.select("table[class=table3px] tr:contains(Гарантийное обеспечение) td[class=pvalue]");
        String str_margin = margin.text().replace(",", ".");
        FuturesEntity futures = new FuturesEntity();
        String[] ticker = Jsoup.parse(url_ticker).text().split("code=*"); // select ticker name
        futures.setTicker(ticker[1]); //тикер
        futures.setName(name.text()); // название фьючерса
        futures.setStep(Float.valueOf(step.text().replace(",", "."))); // шаг цены
        futures.setPrice_step(Float.valueOf(price_step.text().replace(",", "."))); //Стоимость шага цены   
        futures.setMargin(Float.valueOf(str_margin.replace(" ", ""))); // Гарантийное обеспечение
        return futures;
    }

    public String[] parseURL() throws IOException {

        Document doc = Jsoup.connect("http://moex.com/ru/derivatives/").get();
        Elements step = doc.select("a[href*=/ru/contract.aspx?code]");

        Iterator<Element> itr = step.iterator();
        String[] output = new String[step.size()];
        int i = 0;
        while (itr.hasNext()) {
            output[i] = itr.next().attr("href");
            //печатаем на форме и в консоль
            System.out.println(output[i]);
            jTextArea1.append("\n");
            jTextArea1.append(output[i]);
            jTextArea1.setCaretPosition(jTextArea1.getDocument().getLength());
            i++;
        }
        return output;

    }

}
