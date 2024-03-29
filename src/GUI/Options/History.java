/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Options;

import DatabaseManager.Transfer;
import DatabaseManager.TransferDAO;
import GUI.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class History extends javax.swing.JPanel{

    
    
    
    
    /**
     * Creates new form Welcome
     */
    private long accountNo;
    
    public History() {
        initComponents();
        
//        initializing all of these fields
        OptionsManager.init(HolderName, HolderAccNo, HolderAmount);
        
        load();
       
    }
    private void load() {
        
        ArrayList<Transfer> trans;
       
        trans = ApplicationManager.DBManager.t.getTransaction(ApplicationManager.DBManager.cust.AccountNo);
        
        Transfer t[] = new Transfer[trans.size()];
        
        t= trans.toArray(t);
        
        System.out.println("transaction"+trans.toString());
        for(int i=0;i<t.length;i++)
        {
            if(i>=10)
            {
                break;
            }
            
            if(t[i].Deposit)
            {
                history.setValueAt("Deposit", i, 0);
            }
            else{
                history.setValueAt("Withdraw", i, 0);
            }
            
//            history.setValueAt(t[i].Deposit, i, 0);
            history.setValueAt(t[i].Date, i, 1);
            history.setValueAt(t[i].Time, i, 2);
            history.setValueAt(t[i].Amount, i, 3);
        }
        
       history.setEnabled(false);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        HolderName = new javax.swing.JLabel();
        HolderAccNo = new javax.swing.JLabel();
        HolderAmount = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        history = new javax.swing.JTable();

        setBackground(new java.awt.Color(88, 173, 255));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 244, 244));
        jLabel1.setText("EasyMoneyTrans");

        nextButton.setBackground(new java.awt.Color(139, 214, 255));
        nextButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 244, 244));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/assets/Go-Button.png"))); // NOI18N
        nextButton.setText(" Go");
        nextButton.setBorder(null);
        nextButton.setBorderPainted(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setFocusPainted(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(139, 214, 255));
        exitButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 244, 244));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/assets/Exit-Button.png"))); // NOI18N
        exitButton.setText(" Exit");
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        HolderName.setBackground(new java.awt.Color(139, 214, 255));
        HolderName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        HolderName.setForeground(new java.awt.Color(88, 173, 255));
        HolderName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HolderName.setText("HolderName");
        HolderName.setOpaque(true);

        HolderAccNo.setBackground(new java.awt.Color(139, 214, 255));
        HolderAccNo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        HolderAccNo.setForeground(new java.awt.Color(88, 173, 255));
        HolderAccNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HolderAccNo.setText("1000000000000000000");
        HolderAccNo.setOpaque(true);

        HolderAmount.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        HolderAmount.setForeground(new java.awt.Color(52, 144, 233));
        HolderAmount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/assets/rupee-indian-32.png"))); // NOI18N
        HolderAmount.setText("Amount000000");

        history.setBackground(new java.awt.Color(88, 173, 255));
        history.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        history.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Transaction type", "Date", "Time", "Amount"
            }
        ));
        history.setRowHeight(36);
        jScrollPane1.setViewportView(history);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(exitButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HolderAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(nextButton)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HolderAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HolderName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HolderAccNo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HolderAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nextButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
       
        
        
        
        
    
        
        
        
        System.out.println("next button clicked");
        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        ApplicationManager.application.loadScene(new Welcome());
    }//GEN-LAST:event_exitButtonActionPerformed
    
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HolderAccNo;
    private javax.swing.JLabel HolderAmount;
    private javax.swing.JLabel HolderName;
    private javax.swing.JButton exitButton;
    private javax.swing.JTable history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
