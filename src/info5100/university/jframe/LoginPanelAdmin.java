/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.jframe;

import java.awt.Color;

/**
 *
 * @author amishagupta
 */
public class LoginPanelAdmin extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanelAdmin
     */
    public LoginPanelAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lablAdminUserName = new javax.swing.JLabel();
        lableAdmin = new javax.swing.JLabel();
        textAdminUserName = new javax.swing.JTextField();
        btnAdminLogin = new javax.swing.JButton();
        lableAdminPass = new javax.swing.JLabel();
        textAdminPassword = new javax.swing.JPasswordField();
        adminLoginError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 225, 234));

        lablAdminUserName.setText("Username");

        lableAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lableAdmin.setText("Admin Login");

        btnAdminLogin.setText("Login");
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });

        lableAdminPass.setText("Password");

        textAdminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAdminPasswordActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(lablAdminUserName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lableAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textAdminUserName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnAdminLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lableAdminPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textAdminPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(adminLoginError, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lableAdminPass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(lablAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(adminLoginError, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lableAdmin)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lableAdmin)
                .addGap(27, 27, 27)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lablAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lableAdminPass, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(textAdminPassword))
                .addGap(7, 7, 7)
                .addComponent(adminLoginError, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdminLogin))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(502, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        AdminLogin adminLog = new AdminLogin();
        //         adminLog.setVisible(true);
        if (textAdminUserName.getText().trim().equals("admin") && textAdminPassword.getText().trim().equals("admin")) {
            adminLog.setVisible(true);
            adminLoginError.setText("");
        } else {
            adminLoginError.setForeground(Color.RED);
            adminLoginError.setText(" Invalid username or password.");
        }
    }//GEN-LAST:event_btnAdminLoginActionPerformed

    private void textAdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAdminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAdminPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLoginError;
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lablAdminUserName;
    private javax.swing.JLabel lableAdmin;
    private javax.swing.JLabel lableAdminPass;
    private javax.swing.JPasswordField textAdminPassword;
    private javax.swing.JTextField textAdminUserName;
    // End of variables declaration//GEN-END:variables
}