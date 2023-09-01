package VIEW;
import DTO.*;
public class LoginVIEW extends javax.swing.JFrame {

    String nome, senha;
    
    public LoginVIEW() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Sistema Registro Confeitaria");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nomeUserText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        senhaText = new javax.swing.JPasswordField();
        entrarButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        cadastroButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(196, 137, 148));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nome de Usuário:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 32));
        jPanel1.add(nomeUserText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 224, 32));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(196, 137, 148));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Senha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, 30));
        jPanel1.add(senhaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 224, 32));

        entrarButton.setBackground(new java.awt.Color(196, 137, 148));
        entrarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 110, 30));

        sairButton.setBackground(new java.awt.Color(196, 137, 148));
        sairButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sairButton.setForeground(new java.awt.Color(255, 255, 255));
        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sairButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 110, 30));

        cadastroButton.setBackground(new java.awt.Color(196, 137, 148));
        cadastroButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cadastroButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastroButton.setText("Cadastrar");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cadastroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/fundoarrumado.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, -1, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        nome = nomeUserText.getText();
        senha = senhaText.getText();
        Comportamento.Login(nome, senha, this);
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        CriarUsuarioVIEW criaUser = new CriarUsuarioVIEW();
        criaUser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        UsuarioDTO usuarioDTO = new UsuarioDTO();
//        try{
//        usuarioDTO.setDataNasc(22, 6, 2023);
//        } catch (AnoInvalidoDTO ex){
//            System.out.println("anoinvalido");
//        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeUserText;
    private javax.swing.JButton sairButton;
    private javax.swing.JPasswordField senhaText;
    // End of variables declaration//GEN-END:variables
}
