package riskmanager;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class StartForm extends javax.swing.JFrame {
    
Facade futuresFacade;
List<FuturesDAO> futuresList;

    public StartForm() {
        initComponents();
        
        
        futuresFacade = new Facade();
        futuresList = futuresFacade.selectAllFutures();
        setListToComboBox(futuresList); // load list to combobox
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jTextField_sl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_step_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_TP_SL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ButtonCalculate = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonClean = new javax.swing.JButton();
        jButtonRefreshData = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFielddeposit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_timeout = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane5.setFocusCycleRoot(true);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Фьючерс");
        jLabel1.setToolTipText("");

        jLabel2.setText("Кол-во контрактов");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jSpinner1.setValue(1);

        jLabel3.setText("Stop-loss (pp)");

        jTextField_sl.setText("10");
        jTextField_sl.setToolTipText("");

        jLabel4.setText("Шаг цены (пп.)");

        jTextField_step_price.setText("4.19388");
        jTextField_step_price.setToolTipText("");

        jLabel6.setText("TP/SL");

        jTextField_TP_SL.setText("4");

        jLabel7.setText("1  /");
        jLabel7.setToolTipText("");

        ButtonCalculate.setText("Calculate");
        ButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculateActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jButtonClean.setText("Clean");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jButtonRefreshData.setText("Refresh Data");
        jButtonRefreshData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshDataActionPerformed(evt);
            }
        });

        jLabel5.setText("Депозит (руб.)");
        jLabel5.setToolTipText("");

        jTextFielddeposit.setText("120000");
        jTextFielddeposit.setToolTipText("");

        jLabel8.setText("TimeOut (мс.)");

        jTextField_timeout.setText("5000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_sl)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(ButtonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButtonRefreshData))
                            .addComponent(jTextField_step_price, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField_timeout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFielddeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_TP_SL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButtonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_sl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_TP_SL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_step_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFielddeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_timeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCalculate)
                    .addComponent(jButtonRefreshData))
                .addGap(36, 36, 36)
                .addComponent(jButtonClean)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Risk Calculator", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane5.getAccessibleContext().setAccessibleName("Risk Calculator");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Calculator calc = new Calculator();                       
            
    private void ButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculateActionPerformed
        FuturesDAO current_f = (FuturesDAO)jComboBox1.getSelectedItem();
        
        Object[] output = calc.calculate(
        jTextField_step_price.getText(),
        jTextField_TP_SL.getText(),
        jTextField_sl.getText(),
        jSpinner1.getValue().toString(),
        jComboBox1.getSelectedItem().toString(),
        jTextFielddeposit.getText(),
        current_f.getMargin(),
         current_f.getStep()
        );
        
        jTextArea1.append("Stop-loss: "+jTextField_sl.getText()+" пп -> "+output[0]+" RUB\n");
        jTextArea1.append("Take-profit: "+output[1]+" пп -> "+output[2]+" RUB\n");
        jTextArea1.append("Leverage: "+output[3]+"\n");
        jTextArea1.append("\n");
        
    }//GEN-LAST:event_ButtonCalculateActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        jTextArea1.setText(null);
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jButtonRefreshDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshDataActionPerformed
        
             // в конструткор треда передаем ссылку на TextArea для вывода текста и таймаут
        Thr thr = new Thr(this.jTextArea1, Integer.parseInt(jTextField_timeout.getText()), this);
      
// отчищаем комбобокс
int itemCount = jComboBox1.getItemCount();
for(int i=0;i<itemCount-1;i++){
    jComboBox1.removeItemAt(1);
     }
// отчищаем TextArea
 jTextArea1.setText(null);    
       
       
       
    }//GEN-LAST:event_jButtonRefreshDataActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        FuturesDAO current_f = (FuturesDAO)jComboBox1.getSelectedItem();
        jTextArea1.setText(null);
        jTextField_step_price.setText(String.valueOf(current_f.getPrice_step()));
        jTextArea1.append(current_f.getTicker());
        jTextArea1.append("\n");
                jTextArea1.append(current_f.getName());
        jTextArea1.append("\n");
                jTextArea1.append("Гарантийное обеспечение (ГО, руб.): "+String.valueOf(current_f.getMargin()));
        jTextArea1.append("\n");
               jTextArea1.append("Шаг цены: "+String.valueOf(current_f.getStep()));
        jTextArea1.append("\n");
               jTextArea1.append("Стоимость шага цены: "+String.valueOf(current_f.getPrice_step()));
        jTextArea1.append("\n");
        jTextArea1.append("\n");
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

     public void setListToComboBox(List<FuturesDAO> futuresList){    
    
     for(Object item : futuresList){
             FuturesDAO fItem = (FuturesDAO) item;
           jComboBox1.addItem(fItem);
     }
     }
     
     
    public static void main(String args[]) {
        
        
         try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(StartForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new StartForm().setVisible(true);
                
               StartForm forma1 = new StartForm();
               forma1.setVisible(true);
               //forma1.
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ButtonCalculate;
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonRefreshData;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_TP_SL;
    private javax.swing.JTextField jTextField_sl;
    private javax.swing.JTextField jTextField_step_price;
    private javax.swing.JTextField jTextField_timeout;
    private javax.swing.JTextField jTextFielddeposit;
    // End of variables declaration//GEN-END:variables


    
}
