/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Options;

import DatabaseManager.DatabaseManager;
import GUI.*;
import GUI.Security.TransactionManager;


/**
 *
 * @author User
 */
public class Deposit extends javax.swing.JPanel{

    
    
    
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form Welcome
     */
    public Deposit() {
        initComponents();
        
        
        OptionsManager.init(HolderName, HolderAccNo, HolderAmount);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        HolderName = new javax.swing.JLabel();
        HolderAccNo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Ammount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HolderAmount = new javax.swing.JLabel();

        setBackground(new java.awt.Color(88, 173, 255));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 244, 244));
        jLabel1.setText("EasyMoneyTrans");

        jLabel3.setBackground(new java.awt.Color(242, 242, 242));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Next: Proceed...");

        nextButton.setBackground(new java.awt.Color(139, 214, 255));
        nextButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 244, 244));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/assets/Go-Button.png"))); // NOI18N
        nextButton.setText("Go..");
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
        exitButton.setText("..Exit");
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

        jPanel1.setBackground(new java.awt.Color(52, 144, 233));
        jPanel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1063, 416));

        Ammount.setBackground(new java.awt.Color(139, 214, 255));
        Ammount.setColumns(19);
        Ammount.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Ammount.setForeground(new java.awt.Color(255, 255, 255));
        Ammount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ammount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Ammount.setDisabledTextColor(new java.awt.Color(88, 173, 255));
        Ammount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AmmountFocusGained(evt);
            }
        });
        Ammount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AmmountKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        jLabel5.setText("Enter The Amount");

        jSeparator1.setBackground(new java.awt.Color(139, 214, 255));
        jSeparator1.setForeground(new java.awt.Color(139, 214, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setName("divider"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        jLabel6.setText("advartize here");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/assets/card_paypass-256png.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(139, 214, 255));
        jLabel4.setText("DEPOSIT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ammount, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel6)))
                .addGap(194, 194, 194))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ammount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel5)
                .addGap(75, 75, 75))
        );

        HolderAmount.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        HolderAmount.setForeground(new java.awt.Color(52, 144, 233));
        HolderAmount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/assets/rupee-indian-32.png"))); // NOI18N
        HolderAmount.setText("Amount000000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(nextButton))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1147, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(HolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HolderAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HolderAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(HolderAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(HolderName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(HolderAccNo))))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(nextButton)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
        float Amt;
        try{
            Amt = Long.parseLong( Ammount.getText());
            TransactionManager.deposit(Amt);
        }catch(NumberFormatException e)
        {
            ApplicationManager.Notify.sendNotification("invalid Input", 1);
        }
        
        
        
        
        
    
        
        
        
        System.out.println("deposit button clicked");
        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        
        
        //clear the customer info after Exit
        DatabaseManager.cust.setDefault();
        ApplicationManager.application.loadScene(new Welcome());
    }//GEN-LAST:event_exitButtonActionPerformed

    private void AmmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmmountKeyReleased
//        // TODO add your handling code here:
//
//        JTextField an = (JTextField)evt.getSource();
//
//        //        System.out.println("hii");
//
//        try{
//            if(KeyLen != 1){
//                Key =  Integer.parseInt(an.getText());
//            }
//        }catch(Exception e)
//        {
//            System.out.println("error in Key");
//        }
//
//        KeyLen =  an.getText().length() ;
//
//        if(KeyLen >= 4)
//        {
//            System.out.println("4 exceed");
//            an.setEnabled(false);
//            //            nextButton.setEnabled(true);
//            ApplicationManager.DBManager.cust.Key=Key;
//        }
    }//GEN-LAST:event_AmmountKeyReleased

    private void AmmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AmmountFocusGained
        // TODO add your handling code here:
        ApplicationManager.Notify.hide();
    }//GEN-LAST:event_AmmountFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ammount;
    private javax.swing.JLabel HolderAccNo;
    private javax.swing.JLabel HolderAmount;
    private javax.swing.JLabel HolderName;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
