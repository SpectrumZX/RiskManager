package riskmanager;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Facade {
    
private int current, max;
private List<FuturesEntity> list = new ArrayList<>(); // лист фьючерсов
public static Connection con = null; // хранит соединение с БД
    
   public Facade(){   
   
    }
   
       public void connect(){ 
                    
         try {
                  
            Driver driver = (Driver) Class.forName("org.sqlite.JDBC").newInstance();
            String url = "jdbc:sqlite:RiskM.DB";
            con = DriverManager.getConnection(url);
            
            }  catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) 
            {                  
                closeConnect();
                e.printStackTrace();     
            }
           
        
    }
       
       public void closeConnect() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) { ex.printStackTrace(); }
    }
       

    public List<FuturesEntity>  selectAllFutures() {
     
        String sql = "SELECT * FROM tickers"; // подготовка SQL запроса
        connect();
       try {     
           
           Statement stment = con.createStatement();
           ResultSet res = stment.executeQuery(sql); // выполнение SQL запроса        
           list.clear();
           while (res.next())  {
               // наполняем List экземплярами Futures
               
               FuturesEntity futures = new FuturesEntity();
               futures.setName(res.getString("name"));
               futures.setTicker(res.getString("ticker"));
               futures.setMargin(res.getFloat("margin"));
               futures.setPrice_step(res.getFloat("price_step"));
               futures.setStep(res.getFloat("step"));
               System.out.println("read from db: "+futures.getTicker());
               list.add(futures);
               
           }
             } catch (SQLException e) {System.out.println("error from selectAll()");
             e.printStackTrace();
             } 
       closeConnect();
       return list;
    }
    
    public void addAllFutures(List<FuturesEntity> futures_list){
        
       connect();
    try {
        
        //удаляем старые записи БД не трогаем ТЕСТ-тикер
       Statement stment2 = con.createStatement();
            //удаляем старые записи БД не трогаем ТЕСТ-тикер c ID = 1
            String sql2 = "DELETE FROM tickers WHERE id != 1";
            
            stment2.executeUpdate(sql2);
       

 
        Statement stment3 = con.createStatement();
        // добавляем новые тиккеры в БД
          for(FuturesEntity current_ticker:futures_list){            

           String sql3 = "INSERT INTO tickers (name, ticker, margin, price_step, step) " +
                        "VALUES ('"+current_ticker.getName()+"', '"+current_ticker.getTicker()+"', "+current_ticker.getMargin()+", "+
                                    current_ticker.getPrice_step()+", "+current_ticker.getStep()+");"; 
           stment3.executeUpdate(sql3);           
 
        }
        

    } catch (SQLException ex) {
        Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    closeConnect();
   
    }
    

    public int getCurrent() {
        return current;
    }

    public int getMax() {
        return max;
    }
    
    
}
