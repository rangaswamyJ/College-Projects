/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Options;

import GUI.*;

/**
 *
 * @author User
 */
public class TestOptions extends javax.swing.JPanel{

    
    
    
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form Welcome
     */
    public TestOptions() {
        initComponents();
        
//        OptionsTabMenu.addTab("example", new Withdraw());
        validate();
       
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
        OptionsTabMenu = new javax.swing.JTabbedPane();
        TabWithdraw = new javax.swing.JPanel();
        TabDeposit = new javax.swing.JPanel();
        TabHistory = new javax.swing.JPanel();
        TabOnline = new javax.swing.JPanel();

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

        HolderName.setBackground(new java.awt.Color(52, 144, 233));
        HolderName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        HolderName.setForeground(new java.awt.Color(255, 244, 244));
        HolderName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HolderName.setText("HolderName");
        HolderName.setOpaque(true);

        HolderAccNo.setBackground(new java.awt.Color(52, 144, 233));
        HolderAccNo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        HolderAccNo.setForeground(new java.awt.Color(255, 244, 244));
        HolderAccNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HolderAccNo.setText("1000000000000000000");
        HolderAccNo.setOpaque(true);

        OptionsTabMenu.setBackground(new java.awt.Color(88, 173, 255));
        OptionsTabMenu.setName(""); // NOI18N
        OptionsTabMenu.setOpaque(true);

        TabWithdraw.setBackground(new java.awt.Color(88, 173, 255));

        javax.swing.GroupLayout TabWithdrawLayout = new javax.swing.GroupLayout(TabWithdraw);
        TabWithdraw.setLayout(TabWithdrawLayout);
        TabWithdrawLayout.setHorizontalGroup(
            TabWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1063, Short.MAX_VALUE)
        );
        TabWithdrawLayout.setVerticalGroup(
            TabWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        OptionsTabMenu.addTab("Withdraw", TabWithdraw);

        TabDeposit.setBackground(new java.awt.Color(88, 173, 255));

        javax.swing.GroupLayout TabDepositLayout = new javax.swing.GroupLayout(TabDeposit);
        TabDeposit.setLayout(TabDepositLayout);
        TabDepositLayout.setHorizontalGroup(
            TabDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1063, Short.MAX_VALUE)
        );
        TabDepositLayout.setVerticalGroup(
            TabDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        OptionsTabMenu.addTab("Deposit", TabDeposit);

        TabHistory.setBackground(new java.awt.Color(88, 173, 255));

        javax.swing.GroupLayout TabHistoryLayout = new javax.swing.GroupLayout(TabHistory);
        TabHistory.setLayout(TabHistoryLayout);
        TabHistoryLayout.setHorizontalGroup(
            TabHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1063, Short.MAX_VALUE)
        );
        TabHistoryLayout.setVerticalGroup(
            TabHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        OptionsTabMenu.addTab("History", TabHistory);

        TabOnline.setBackground(new java.awt.Color(88, 173, 255));

        javax.swing.GroupLayout TabOnlineLayout = new javax.swing.GroupLayout(TabOnline);
        TabOnline.setLayout(TabOnlineLayout);
        TabOnlineLayout.setHorizontalGroup(
            TabOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1063, Short.MAX_VALUE)
        );
        TabOnlineLayout.setVerticalGroup(
            TabOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        OptionsTabMenu.addTab("Online", TabOnline);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(HolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HolderAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OptionsTabMenu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(exitButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)
                                .addComponent(nextButton)))
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HolderName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HolderAccNo)))
                .addGap(31, 31, 31)
                .addComponent(OptionsTabMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(nextButton)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31))
        );

        OptionsTabMenu.getAccessibleContext().setAccessibleName("Withdraw");
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
        
        
        ApplicationManager.application.loadScene(new AccountValidation());
        
    
        
        
        
        System.out.println("welcome button clicked");
        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HolderAccNo;
    private javax.swing.JLabel HolderName;
    private javax.swing.JTabbedPane OptionsTabMenu;
    private javax.swing.JPanel TabDeposit;
    private javax.swing.JPanel TabHistory;
    private javax.swing.JPanel TabOnline;
    private javax.swing.JPanel TabWithdraw;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
