/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sudonym
 */
public class HelpTweetTIF extends javax.swing.JDialog {

    /**
     * Creates new form HelpTweetTIF
     */
    public HelpTweetTIF(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help TweetTIF");

        jTextPane1.setEditable(false);
        jTextPane1.setText("Frequently Asked Questions (FAQ) TweetTIF\n\n1. A : Cara login menggunakan Akun twitter pribadi ?\n   Q : Klik tombol Get Token, namun pastikan terlebih dahulu pada folder tempat Anda menyimpan file tweettif.jar tidak ada file dengan nama twitter4j.properties\n\n2. A : Saya sudah pernah login dan berhasil, namun saya ingin login lagi dengan akun saya yang lain ?\n    Q : Hapus file twitter4j.properties pada folder tempat Anda menyimpan file tweettif.jar, selanjutnya lakukan login/get token seperti yang pernah dilakukan sebelumnya.\n\n3. A : Saya sudah mendapat pesan bahwa saya sudah berhasil akses token, namun kenapa pada menu timeline tetap tidak bisa menampilkan timeline, update status, menampilkan status, dan pencarian ?\n    Q : Pastikan setelah mendapat pesan berhasil mendapatkan token, Anda merestart aplikasi TweetTIF, dengan cara keluar dari aplikasi dan buka kembali aplikasi TweetTIF, dan pastikan Anda tidak menghapus file twitter4j.properties yang ada di folder tempat Anda menyimpan file tweetif.jar.\n\n4. A : Apakah saya boleh menghapus folder lib dalam paket TweetTIF ?\n    Q : Tidak, kami tidak menyarankan untuk menghapus folder tersebut, karena folder tersebut berisi library yang menghubungkan aplikasi ini dengan twitter.\n\nPertanyaan lain, dapat disampaikan melalui email ke : muhamadmashudiardiwinata[at]gmail.com");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(649, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HelpTweetTIF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpTweetTIF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpTweetTIF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpTweetTIF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HelpTweetTIF dialog = new HelpTweetTIF(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
