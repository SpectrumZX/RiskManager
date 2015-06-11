package riskmanager;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;



public class Thr extends Thread {
    
    String url_ticker;
    Integer time_out;
    StartForm form;
    JTextArea jTextArea1;
    
    public Thr(JTextArea jTextArea1, Integer time_out, StartForm form){
        this.jTextArea1 = jTextArea1;
        this.form = form;
        this.time_out = time_out;
        start();      
    }
    
  
    
    @Override
    public void run() {
       
        try {    
            
            Parser parser = new Parser(time_out, jTextArea1);       
            List<FuturesEntity> futuresList = parser.getFuturesList();
            form.setListToComboBox(futuresList);  // setListToComboBox самописный местод         
            // записываем свежий лист фьючерсов в БД
            new Facade().addAllFutures(futuresList);
            
        } catch (IOException ex) {
            Logger.getLogger(Thr.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }
    
    
    
    
}
