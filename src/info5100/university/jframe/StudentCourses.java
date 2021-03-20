/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.jframe;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author juhip
 */
public class StudentCourses extends javax.swing.JPanel {

    /**
     * Creates new form StudentCourses
     */
    public StudentCourses() {
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

        lblSelectTerm = new javax.swing.JLabel();
        comboTerm = new javax.swing.JComboBox<>();
        scrollRegister = new javax.swing.JScrollPane();
        tableRegisterCourse = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        scrollSelectPane = new javax.swing.JScrollPane();
        tableSelect = new javax.swing.JTable();
        btnRegister = new javax.swing.JButton();

        lblSelectTerm.setText("Select Term");

        comboTerm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring 2021", "Fall 2021", "Summer 2021" }));

        tableRegisterCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course Title", "Description", "Register Course", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollRegister.setViewportView(tableRegisterCourse);

        btnSelect.setText("Select Course");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        tableSelect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"AED 5100", "", 4, "Kal Bugrara"},
                {"Web Design 6120", "", 4, "Amuthan Arulraj"},
                {"DMDD 1000", "", 4, "Wuping Wyang"},
                {"PSA 4352", "", 4, "Robert Hillyard"}
            },
            new String [] {
                "Course Title", "Description", "Credits Per Hour", "Lecturer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollSelectPane.setViewportView(tableSelect);

        btnRegister.setText("Register Course");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblSelectTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(comboTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollSelectPane, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollSelectPane, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnSelect)
                .addGap(42, 42, 42)
                .addComponent(scrollRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnRegister)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed

        TableModel tabel1= tableSelect.getModel();
        int[] indexes = tableSelect.getSelectedRows();
        if(indexes.length<0){
            JOptionPane.showMessageDialog(this, "Please select the course");
            return;
        }else{
        DefaultTableModel tabel2= (DefaultTableModel) tableRegisterCourse.getModel();
        TableModel table2 = tableRegisterCourse.getModel();
         Object[] row = new Object[4];
         for(int i=0; i<indexes.length; i++){
            row[0] = tableSelect.getValueAt(i, 0);
            System.out.println("row[0]" + row[0]);
            row[1] = tableSelect.getValueAt(i, 1);
            row[2] = tableSelect.getValueAt(i, 2);
            row[3] = tableSelect.getValueAt(i, 3);
             System.out.println("row"+ row[i]);
              tabel2.addRow(row);
         }
        }
    }//GEN-LAST:event_btnSelectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox<String> comboTerm;
    private javax.swing.JLabel lblSelectTerm;
    private javax.swing.JScrollPane scrollRegister;
    private javax.swing.JScrollPane scrollSelectPane;
    private javax.swing.JTable tableRegisterCourse;
    private javax.swing.JTable tableSelect;
    // End of variables declaration//GEN-END:variables
}