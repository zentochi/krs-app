// @author Danuarta

import javax.swing.DefaultListModel;

public class mainFrame extends javax.swing.JFrame {
    DefaultListModel choose;
    public mainFrame() {
        initComponents();
        choose = new DefaultListModel();
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MataKuliahLabel = new javax.swing.JLabel();
        ChoosenMataKuliahLabel = new javax.swing.JLabel();
        MataKuliahScrollPanel = new javax.swing.JScrollPane();
        MataKuliahList = new javax.swing.JList<>();
        ChoosenMataKuliahScrollPanel = new javax.swing.JScrollPane();
        ChoosenMataKuliahList = new javax.swing.JList<>();
        CopyButton = new javax.swing.JButton();
        ChooseMataKuliahLabel = new javax.swing.JLabel();
        ChoosenMataKuliahLabel1 = new javax.swing.JLabel();
        ChooseMataKuliahtextField = new javax.swing.JTextField();
        ChoosenMataKuliahtextField = new javax.swing.JTextField();
        DeleteChoosenMataKuliahButton = new javax.swing.JButton();
        AngkatanLabel = new javax.swing.JLabel();
        AngkatanComboBox = new javax.swing.JComboBox<>();
        CalculateButton = new javax.swing.JButton();
        ResumeScrollPane = new javax.swing.JScrollPane();
        ResumeTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MataKuliahLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MataKuliahLabel.setText("Daftar Mata Kuliah");

        ChoosenMataKuliahLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChoosenMataKuliahLabel.setText("Mata Kuliah Terpilih");

        MataKuliahList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pemrograman Visual", "Mikrokontroller", "Robotika", "Pemrograman Android", "Logika Fuzzy ", "Kecerdasan Buatan" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        MataKuliahScrollPanel.setViewportView(MataKuliahList);

        ChoosenMataKuliahScrollPanel.setViewportView(ChoosenMataKuliahList);

        CopyButton.setText(">>");

        ChooseMataKuliahLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChooseMataKuliahLabel.setText("Pilih Mata kuliah");

        ChoosenMataKuliahLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChoosenMataKuliahLabel1.setText("Banyaknya Mata Kuliah Terpilih");

        ChooseMataKuliahtextField.setEditable(false);

        ChoosenMataKuliahtextField.setEditable(false);
        ChoosenMataKuliahtextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        DeleteChoosenMataKuliahButton.setText("Hapus MK Terpilih");

        AngkatanLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AngkatanLabel.setText("Angkatan");

        AngkatanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2018", "2017", "<2017" }));
        AngkatanComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AngkatanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AngkatanComboBoxActionPerformed(evt);
            }
        });

        CalculateButton.setText("Hitung Biaya");

        ResumeTextArea.setColumns(20);
        ResumeTextArea.setRows(5);
        ResumeScrollPane.setViewportView(ResumeTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MataKuliahLabel)
                    .addComponent(ChooseMataKuliahLabel)
                    .addComponent(ChooseMataKuliahtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AngkatanLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AngkatanComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CalculateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MataKuliahScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(CopyButton)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChoosenMataKuliahLabel)
                    .addComponent(ChoosenMataKuliahLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ChoosenMataKuliahtextField)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteChoosenMataKuliahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ChoosenMataKuliahScrollPanel)
                    .addComponent(ResumeScrollPane))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MataKuliahLabel)
                    .addComponent(ChoosenMataKuliahLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MataKuliahScrollPanel)
                            .addComponent(ChoosenMataKuliahScrollPanel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(CopyButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChooseMataKuliahLabel)
                    .addComponent(ChoosenMataKuliahLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChooseMataKuliahtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChoosenMataKuliahtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteChoosenMataKuliahButton))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AngkatanLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AngkatanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CalculateButton))
                    .addComponent(ResumeScrollPane))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AngkatanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AngkatanComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AngkatanComboBoxActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AngkatanComboBox;
    private javax.swing.JLabel AngkatanLabel;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JLabel ChooseMataKuliahLabel;
    private javax.swing.JTextField ChooseMataKuliahtextField;
    private javax.swing.JLabel ChoosenMataKuliahLabel;
    private javax.swing.JLabel ChoosenMataKuliahLabel1;
    private javax.swing.JList<String> ChoosenMataKuliahList;
    private javax.swing.JScrollPane ChoosenMataKuliahScrollPanel;
    private javax.swing.JTextField ChoosenMataKuliahtextField;
    private javax.swing.JButton CopyButton;
    private javax.swing.JButton DeleteChoosenMataKuliahButton;
    private javax.swing.JLabel MataKuliahLabel;
    private javax.swing.JList<String> MataKuliahList;
    private javax.swing.JScrollPane MataKuliahScrollPanel;
    private javax.swing.JScrollPane ResumeScrollPane;
    private javax.swing.JTextArea ResumeTextArea;
    // End of variables declaration//GEN-END:variables
}
