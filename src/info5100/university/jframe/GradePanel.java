/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.jframe;

/**
 *
 * @author amishagupta
 */
public class GradePanel extends javax.swing.JPanel {

    /**
     * Creates new form GradePanel
     */
    public GradePanel() {
        initComponents();
         Course_Name1.setText("PSA 4352");
         Course_Name2.setText("Web Design 6120");
         Course_Name3.setText("AED 5100");
         Course_Name4.setText("DMDD 1000");
         Grade1.setText("3.4");
         Grade2.setText("3.6");
         Grade3.setText("3.8");
         Grade4.setText("4.0");
         float course1=Float.parseFloat(Grade1.getText());
         float course2=Float.parseFloat(Grade2.getText());
         float course3=Float.parseFloat(Grade3.getText());
         float course4=Float.parseFloat(Grade4.getText());
         float total=course1+course2+course3+course4;
         float avg=total/4;
         OverallGPA.setText(Float.toString(avg));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        Course_Name1 = new javax.swing.JTextField();
        Course_Name2 = new javax.swing.JTextField();
        Course_Name3 = new javax.swing.JTextField();
        Course_Name4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Grade1 = new javax.swing.JTextField();
        Grade2 = new javax.swing.JTextField();
        Grade3 = new javax.swing.JTextField();
        Grade4 = new javax.swing.JTextField();
        OverallGPA = new javax.swing.JTextField();

        lblHeading.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHeading.setText("Grades");

        Course_Name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Course_Name1ActionPerformed(evt);
            }
        });

        Course_Name4.setToolTipText("");
        Course_Name4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Course_Name4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("GPA");

        Grade1.setText("3.2");

        Grade2.setText("3.6");

        Grade3.setText("3.8");

        Grade4.setText("4.0");
        Grade4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grade4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Course_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Course_Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Course_Name3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Course_Name4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(OverallGPA, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Grade3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addComponent(Grade2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Grade1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Grade4)))))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblHeading)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course_Name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course_Name3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course_Name4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OverallGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Course_Name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_Name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Course_Name1ActionPerformed

    private void Course_Name4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_Name4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Course_Name4ActionPerformed

    private void Grade4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grade4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Grade4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Course_Name1;
    private javax.swing.JTextField Course_Name2;
    private javax.swing.JTextField Course_Name3;
    private javax.swing.JTextField Course_Name4;
    private javax.swing.JTextField Grade1;
    private javax.swing.JTextField Grade2;
    private javax.swing.JTextField Grade3;
    private javax.swing.JTextField Grade4;
    private javax.swing.JTextField OverallGPA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHeading;
    // End of variables declaration//GEN-END:variables
}