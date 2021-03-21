/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.jframe;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author ababar
 */
public class DashboardJPanel extends JFrame {

    public DashboardJPanel(String applicationTitle, String chartTitle) {

        super("");

        JFreeChart barChart = ChartFactory.createBarChart(
                "Job Performance of Students and Academic Units",
                "Category",
                "",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        JFreeChart lineChart = ChartFactory.createLineChart(
                "Courses and their relevance to graduates growth",
                "Courses",
                "",
                createLineChartDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Employment Status",
                createPieChartDataset());

        ChartPanel chartPanel = new ChartPanel(barChart);
        ChartPanel chartPanel2 = new ChartPanel(lineChart);
        ChartPanel chartPanel3 = new ChartPanel(pieChart);

        CollegeRanking collegeRanking = new CollegeRanking();
        JFrame frame = new JFrame("Dashboard");

        chartPanel.setPreferredSize(new java.awt.Dimension(720, 450));
        chartPanel2.setPreferredSize(new java.awt.Dimension(720, 300));
        chartPanel3.setPreferredSize(new java.awt.Dimension(720, 300));
        
        
        frame.getContentPane().add(chartPanel, BorderLayout.WEST);
        frame.getContentPane().add(chartPanel2, BorderLayout.SOUTH);
        frame.getContentPane().add(collegeRanking, BorderLayout.NORTH);
        frame.getContentPane().add(chartPanel3, BorderLayout.EAST);
        
//      ChartPanel chartPanel = new ChartPanel( barChart );        
        
        frame.pack();
        frame.setVisible(true);
//      setContentPane( chartPanel ); 
//      setContentPane( chartPanel2 );
//     setExtendedState(DashboardJPanel.MAXIMIZED_BOTH);
    }

    private CategoryDataset createDataset() {
        final String jobPerformance = "Job Performance";
        final String units = "Academic Units";
//      final String ford = "FORD";        
        final String student1 = "Student 1";
        final String student2 = "Student 2";
        final String student3 = "Student 3";
        final String student4 = "Student 4";
        final String student5 = "Student 5";
        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        dataset.addValue(1.0, jobPerformance, student1);
        dataset.addValue(3.0, jobPerformance, student2);
        dataset.addValue(4.0, jobPerformance, student3);
        dataset.addValue(3.8, jobPerformance, student4);
        dataset.addValue(3.8, jobPerformance, student5);

        dataset.addValue(3.6, units, student1);
        dataset.addValue(3.2, units, student2);
        dataset.addValue(4.0, units, student3);
        dataset.addValue(3.5, units, student4);
        dataset.addValue(3.8, units, student5);

        return dataset;
    }

    private CategoryDataset createLineChartDataset() {
        final String jobPerformance = "Courses Rating";
//      final String ford = "FORD";        
        final String course1 = "AED";
        final String course2 = "DMDD";
        final String course3 = "Web Design";
        final String course4 = "PSA";
        final String course5 = "Web Tools";
        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        dataset.addValue(4.0, jobPerformance, course1);
        dataset.addValue(2.8, jobPerformance, course2);
        dataset.addValue(4.0, jobPerformance, course3);
        dataset.addValue(3.8, jobPerformance, course4);
        dataset.addValue(3.8, jobPerformance, course5);

        return dataset;
    }

    private PieDataset createPieChartDataset() {
        final DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Yes", new Double(20));
        dataset.setValue("No", new Double(2));
        return dataset;

    }

    /**
     * Creates new form DashboardJPanel
     */
//    public DashboardJPanel() {
//        initComponents();
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(187, 209, 223));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
