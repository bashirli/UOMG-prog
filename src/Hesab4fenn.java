
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Bashirli
 */
public class Hesab4fenn extends javax.swing.JFrame {

    /**
     * Creates new form Hesab4fenn
     */
    public Hesab4fenn() {
        
        initComponents();  this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Kredit4 = new javax.swing.JTextField();
        Bal3 = new javax.swing.JTextField();
        Bal4 = new javax.swing.JTextField();
        Kredit1 = new javax.swing.JTextField();
        Kredit2 = new javax.swing.JTextField();
        Bal2 = new javax.swing.JTextField();
        Bal1 = new javax.swing.JTextField();
        Kredit3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ortalama_bal = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        Hesabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ortalama Hesab");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ortalama hesabla");

        jLabel2.setText("Bal");

        jLabel3.setText("Bal");

        jLabel4.setText("Bal");

        jLabel5.setText("Bal");

        jLabel6.setText("Kredit");

        jLabel7.setText("Kredit");

        jLabel8.setText("Kredit");

        jLabel9.setText("Kredit");

        Bal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bal1ActionPerformed(evt);
            }
        });

        ortalama_bal.setEditable(false);
        ortalama_bal.setColumns(20);
        ortalama_bal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ortalama_bal.setRows(5);
        jScrollPane1.setViewportView(ortalama_bal);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Ortalama Bal:");

        Hesabla.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Hesabla.setText("Hesabla");
        Hesabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HesablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(Bal1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(Kredit1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(Bal2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(Kredit2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(Bal3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(Kredit3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(Bal4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addComponent(Kredit4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(Hesabla, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel10))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kredit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kredit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bal3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kredit3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kredit4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))))
                .addGap(52, 52, 52)
                .addComponent(Hesabla, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bal1ActionPerformed

    private void HesablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HesablaActionPerformed
        // TODO add your handling code here:
if(error_tapma(Bal1.getText())==0||error_tapma(Bal2.getText())==0||error_tapma(Bal3.getText())==0||error_tapma(Bal4.getText())==0){
    return;
}
      if(error_tapma(Kredit1.getText())==0||error_tapma(Kredit2.getText())==0||error_tapma(Kredit3.getText())==0||error_tapma(Kredit4.getText())==0){
          return;
      }
        
      double balcemi=Integer.parseInt(Bal1.getText())*Integer.parseInt(Kredit1.getText())  +Integer.parseInt(Bal2.getText())*Integer.parseInt(Kredit2.getText())
                +Integer.parseInt(Bal3.getText())*Integer.parseInt(Kredit3.getText())+Integer.parseInt(Bal4.getText())*Integer.parseInt(Kredit4.getText());
      double kreditcemi=Integer.parseInt(Kredit1.getText())+Integer.parseInt(Kredit2.getText())
                +Integer.parseInt(Kredit3.getText())+Integer.parseInt(Kredit4.getText());
        double ortalamabalimiz= (balcemi/kreditcemi);
    
       
          
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hesab4fenn.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        String mesaj=""+ortalamabalimiz;
        ortalama_bal.setText(mesaj);
        
        
        
    }//GEN-LAST:event_HesablaActionPerformed

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
            java.util.logging.Logger.getLogger(Hesab4fenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hesab4fenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hesab4fenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hesab4fenn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hesab4fenn().setVisible(true);
            }
        });
    }

    public int error_tapma(String setr){
        if(setr.length()==0){
            JOptionPane.showMessageDialog(this, "Qiymet daxil edilmeyib!");
            return 0;
        }
        for(int i=0;i<setr.length();i++){
            if(setr.charAt(i)<48||setr.charAt(i)>57){
                JOptionPane.showMessageDialog(this, "Sadece eded(müsbet) olmalıdır!");
            return 0;
            }
        }
       if(Integer.parseInt(setr)>100){
            JOptionPane.showMessageDialog(this, "Bal ve ya kredit sehv daxil edilib. \n Bal ve kredit 100-den çox ola bilmez.");
        return 0;
       }
        
       
       
       
       
        
        return 1;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bal1;
    private javax.swing.JTextField Bal2;
    private javax.swing.JTextField Bal3;
    private javax.swing.JTextField Bal4;
    private javax.swing.JButton Hesabla;
    private javax.swing.JTextField Kredit1;
    private javax.swing.JTextField Kredit2;
    private javax.swing.JTextField Kredit3;
    private javax.swing.JTextField Kredit4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ortalama_bal;
    // End of variables declaration//GEN-END:variables
}