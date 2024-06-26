/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankupgraded;

import javax.swing.JOptionPane;
import bankupgraded.BankUpgraded;

/**
 *
 * @author tadiw
 */
public class Home
        extends javax.swing.JFrame {

/**
 * Creates new form Home
 */
public Home() {
    
    initComponents();
}
 BankUpgraded ZAR = new BankUpgraded();
/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b_withdraw = new javax.swing.JButton();
        b_deposit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        accNum = new javax.swing.JTextField();
        b_balance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_withdraw.setText("With Draw");
        b_withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_withdrawActionPerformed(evt);
            }
        });

        b_deposit.setText("Deposit");
        b_deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_depositActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome to your Number 1 Bank");

        jLabel2.setText("Please Enter Accout Number");

        accNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accNumActionPerformed(evt);
            }
        });

        b_balance.setText("Balance");
        b_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_balanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(b_withdraw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(accNum, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_balance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {accNum, b_balance, b_deposit, b_withdraw});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(b_withdraw)
                    .addComponent(b_balance)
                    .addComponent(b_deposit))
                .addGap(127, 127, 127))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_depositActionPerformed
        // TODO add your handling code here:
        
          int confirm = JOptionPane.showConfirmDialog(null,
                "Confirm account Number\n" + Integer.parseInt(accNum.getText()));
       
       if(confirm == 0 ){
          double  amt = Double.parseDouble(JOptionPane.showInputDialog("How much do you want to Deposit?"));
          ZAR.setDeposit(amt);
          JOptionPane.showMessageDialog(null,
                  ZAR.Depositing(amt) );
          }
    }//GEN-LAST:event_b_depositActionPerformed

    private void accNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accNumActionPerformed

    private void b_withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_withdrawActionPerformed
        // TODO add your handling code here:
        
             int confirm = JOptionPane.showConfirmDialog(null,
                "Confirm account Number\n" + Integer.parseInt(accNum.getText()));
       
       if(confirm == 0 ){
          double  amt = Double.parseDouble(JOptionPane.showInputDialog("How much do you want to withdraw?"));
          ZAR.setWithdraw(amt);
          JOptionPane.showMessageDialog(null,
                  ZAR.withdrawing(amt) );
          }
       

    }//GEN-LAST:event_b_withdrawActionPerformed

    private void b_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_balanceActionPerformed
        // TODO add your handling code here:
         int confirm = JOptionPane.showConfirmDialog(null,
                "Confirm account Number\n" + Integer.parseInt(accNum.getText()));
         JOptionPane.showMessageDialog(null,
                  "Your current Balance is\nR " +ZAR.getBalance());
    }//GEN-LAST:event_b_balanceActionPerformed

/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                .getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Home.class.getName())
                .log(java.util.logging.Level.SEVERE,
                        null,
                        ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Home.class.getName())
                .log(java.util.logging.Level.SEVERE,
                        null,
                        ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Home.class.getName())
                .log(java.util.logging.Level.SEVERE,
                        null,
                        ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Home.class.getName())
                .log(java.util.logging.Level.SEVERE,
                        null,
                        ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new Home().setVisible(true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accNum;
    private javax.swing.JButton b_balance;
    private javax.swing.JButton b_deposit;
    private javax.swing.JButton b_withdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
