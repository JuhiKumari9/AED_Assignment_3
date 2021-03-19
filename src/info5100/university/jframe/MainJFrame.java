/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.jframe;
import java.awt.CardLayout;
 import java.awt.Graphics;  
 import java.awt.Image;  
 import java.awt.Toolkit;  
import javax.swing.JOptionPane;
 import javax.swing.JPanel;  
/**
 *
 * @author juhip
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJfrane
     */
    public MainJFrame() {
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

        btnAdmin = new javax.swing.JButton();
        btnTeacher = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        mainJPanel = new javax.swing.JPanel();
        panelStudent = new javax.swing.JPanel();
        labelStudent = new javax.swing.JLabel();
        lableStuPassword = new javax.swing.JLabel();
        lablStuUserName = new javax.swing.JLabel();
        textStuUserName = new javax.swing.JTextField();
        textStuPassword = new javax.swing.JTextField();
        btnStuLogin = new javax.swing.JButton();
        btnStuSignout = new javax.swing.JButton();
        panelTeacher = new JPanel() {
            public void paintComponent(Graphics g) {
                Image img = Toolkit.getDefaultToolkit().getImage(
                    MainJFrame.class.getResource("/image/Teacher-image.png"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        labelTeacher = new javax.swing.JLabel();
        lableTeacherPass = new javax.swing.JLabel();
        lablTeacherUserName = new javax.swing.JLabel();
        textTeacUserName = new javax.swing.JTextField();
        textTeachPassword = new javax.swing.JTextField();
        btnTeachLogin = new javax.swing.JButton();
        btnTeachSignout = new javax.swing.JButton();
        panelAdmin = new javax.swing.JPanel();
        lableAdmin = new javax.swing.JLabel();
        lableAdminPass = new javax.swing.JLabel();
        lablAdminUserName = new javax.swing.JLabel();
        textAdminUserName = new javax.swing.JTextField();
        textAdminPassword = new javax.swing.JTextField();
        btnAdminLogin = new javax.swing.JButton();
        btnAdminSignout = new javax.swing.JButton();
        labelUniRanking = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University Ranking");
        setBackground(new java.awt.Color(219, 243, 243));
        setResizable(false);

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnTeacher.setText("Teacher");
        btnTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherActionPerformed(evt);
            }
        });

        btnStudent.setText("Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        mainJPanel.setLayout(new java.awt.CardLayout());

        panelStudent.setBackground(new java.awt.Color(219, 242, 242));

        labelStudent.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelStudent.setText("Student Login");

        lableStuPassword.setText("Password");

        lablStuUserName.setText("Username");

        btnStuLogin.setText("Login");
        btnStuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStuLoginActionPerformed(evt);
            }
        });

        btnStuSignout.setText("Sign Out");

        javax.swing.GroupLayout panelStudentLayout = new javax.swing.GroupLayout(panelStudent);
        panelStudent.setLayout(panelStudentLayout);
        panelStudentLayout.setHorizontalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStudentLayout.createSequentialGroup()
                .addGroup(panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStudentLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(labelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelStudentLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lableStuPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lablStuUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textStuUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textStuPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelStudentLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnStuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStuSignout, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        panelStudentLayout.setVerticalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStudentLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lablStuUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStuUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textStuPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableStuPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStuLogin)
                    .addComponent(btnStuSignout))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        mainJPanel.add(panelStudent, "studentCard");

        labelTeacher.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelTeacher.setText("Teacher Login");

        lableTeacherPass.setText("Password");

        lablTeacherUserName.setText("Username");

        btnTeachLogin.setText("Login");
        btnTeachLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeachLoginActionPerformed(evt);
            }
        });

        btnTeachSignout.setText("Sign Out");

        javax.swing.GroupLayout panelTeacherLayout = new javax.swing.GroupLayout(panelTeacher);
        panelTeacher.setLayout(panelTeacherLayout);
        panelTeacherLayout.setHorizontalGroup(
            panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeacherLayout.createSequentialGroup()
                .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTeacherLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnTeachLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTeachSignout, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTeacherLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lablTeacherUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lableTeacherPass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTeachPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTeacUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTeacherLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(labelTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        panelTeacherLayout.setVerticalGroup(
            panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeacherLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lablTeacherUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTeacUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableTeacherPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTeachPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTeachLogin)
                    .addComponent(btnTeachSignout))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        mainJPanel.add(panelTeacher, "teacherCard");

        lableAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lableAdmin.setText("Admin Login");

        lableAdminPass.setText("Password");

        lablAdminUserName.setText("Username");

        btnAdminLogin.setText("Login");
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });

        btnAdminSignout.setText("Sign Out");

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lablAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lableAdminPass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(lableAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdminSignout, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lableAdmin)
                .addGap(32, 32, 32)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lablAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableAdminPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminLogin)
                    .addComponent(btnAdminSignout))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        mainJPanel.add(panelAdmin, "adminCard");

        labelUniRanking.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelUniRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUniRanking.setText("University Ranking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStudent))
                        .addGap(88, 88, 88)
                        .addComponent(mainJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(labelUniRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(labelUniRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mainJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(btnTeacher)
                        .addGap(18, 18, 18)
                        .addComponent(btnStudent)))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainJPanel.getLayout();
         card.show(mainJPanel, "adminCard");
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherActionPerformed
        CardLayout card = (CardLayout)mainJPanel.getLayout();
         card.show(mainJPanel, "teacherCard");
         
    }//GEN-LAST:event_btnTeacherActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
       CardLayout card = (CardLayout)mainJPanel.getLayout();
         card.show(mainJPanel, "studentCard");
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnStuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStuLoginActionPerformed
       StudentLogin stuLogin = new StudentLogin();
       stuLogin.setVisible(true);
    }//GEN-LAST:event_btnStuLoginActionPerformed

    private void btnTeachLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeachLoginActionPerformed
        TeacherLogin teacherLogin = new TeacherLogin();
        teacherLogin.setVisible(true);
    }//GEN-LAST:event_btnTeachLoginActionPerformed

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        AdminLogin adminLog = new AdminLogin();
        adminLog.setVisible(true);
    }//GEN-LAST:event_btnAdminLoginActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JButton btnAdminSignout;
    private javax.swing.JButton btnStuLogin;
    private javax.swing.JButton btnStuSignout;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnTeachLogin;
    private javax.swing.JButton btnTeachSignout;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JLabel labelStudent;
    private javax.swing.JLabel labelTeacher;
    private javax.swing.JLabel labelUniRanking;
    private javax.swing.JLabel lablAdminUserName;
    private javax.swing.JLabel lablStuUserName;
    private javax.swing.JLabel lablTeacherUserName;
    private javax.swing.JLabel lableAdmin;
    private javax.swing.JLabel lableAdminPass;
    private javax.swing.JLabel lableStuPassword;
    private javax.swing.JLabel lableTeacherPass;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelStudent;
    private javax.swing.JPanel panelTeacher;
    private javax.swing.JTextField textAdminPassword;
    private javax.swing.JTextField textAdminUserName;
    private javax.swing.JTextField textStuPassword;
    private javax.swing.JTextField textStuUserName;
    private javax.swing.JTextField textTeacUserName;
    private javax.swing.JTextField textTeachPassword;
    // End of variables declaration//GEN-END:variables
}
