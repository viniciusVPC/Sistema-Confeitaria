package VIEW;

import javax.swing.JOptionPane;

public class CriarUsuarioVIEW extends javax.swing.JFrame {

    //Atributos
    private String nome, celular, cpf, rg, email, senha;
    private int dia, mes, ano;
    boolean houveErro, editando;

    public CriarUsuarioVIEW() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        textNome = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        diaText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        celularText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cpfText = new javax.swing.JTextField();
        anoText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mesText = new javax.swing.JTextField();
        rgText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        senha2Text = new javax.swing.JPasswordField();
        senhaText = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/fundoarrumado.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/fundoarrumado.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Criação de Usuário");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 290, -1));

        textNome.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        textNome.setForeground(new java.awt.Color(196, 137, 148));
        textNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textNome.setText("Nome:");
        jPanel1.add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 32));

        nomeText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 370, 32));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(196, 137, 148));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Data de Nascimento:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 32));
        jPanel1.add(diaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 40, 30));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(196, 137, 148));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CPF:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 32));

        celularText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                celularTextFocusLost(evt);
            }
        });
        jPanel1.add(celularText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 370, 32));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(196, 137, 148));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Telefone Celular:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 32));
        jPanel1.add(cpfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 370, 32));
        jPanel1.add(anoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 40, 30));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Dia");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 40, 21));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mês");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 40, 20));

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ano");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 40, 20));

        mesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesTextActionPerformed(evt);
            }
        });
        jPanel1.add(mesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 40, 30));
        jPanel1.add(rgText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 370, 32));

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(196, 137, 148));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("RG:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 32));
        jPanel1.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 370, 32));

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(196, 137, 148));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Email:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 32));

        jLabel15.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(196, 137, 148));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Repita sua Senha:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, 32));

        jLabel16.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(196, 137, 148));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Senha:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, 32));

        cadastrar.setBackground(new java.awt.Color(196, 137, 148));
        cadastrar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar.setText("Cadastrar Usuário");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 160, 42));

        senha2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha2TextActionPerformed(evt);
            }
        });
        jPanel1.add(senha2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 370, 32));
        jPanel1.add(senhaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 370, 32));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Logo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/fundoarrumado.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/fundoarrumado.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/fundoarrumado.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jLabel2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/fundoarrumado.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 650, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void apagarTextos() {
        nomeText.setText("");
        diaText.setText("");
        mesText.setText("");
        anoText.setText("");
        celularText.setText("");
        cpfText.setText("");
        rgText.setText("");
        emailText.setText("");
        senhaText.setText("");
        senha2Text.setText("");
        nomeText.grabFocus();
    }
    
    private void celularTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_celularTextFocusLost
        /**
         * try{ System.out.println(tempoText.getText());
         * System.out.println(custoText.getText());
         * produto.setValor(Double.parseDouble(tempoText.getText()),
         * Double.parseDouble(custoText.getText())); }
         * catch(NumberFormatException ex){
         *
         * }
         *
         */
    }//GEN-LAST:event_celularTextFocusLost

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        nome = nomeText.getText();
        try {
            dia = Integer.parseInt(diaText.getText());
        } catch (NumberFormatException ex) {
            houveErro = true;
            JOptionPane.showMessageDialog(null, "Erro InserirProdutoVIEW: Dia inválido! Por favor digite um número!");
        }
        try {
            mes = Integer.parseInt(mesText.getText());
        } catch (NumberFormatException ex) {
            houveErro = true;
            JOptionPane.showMessageDialog(null, "Erro InserirProdutoVIEW: Mês inválido! Por favor digite um número!");
        }
        try {
            ano = Integer.parseInt(anoText.getText());
        } catch (NumberFormatException ex) {
            houveErro = true;
            JOptionPane.showMessageDialog(null, "Erro InserirProdutoVIEW: Ano inválido! Por favor digite um número!");
        }
        
        celular = celularText.getText();
        System.out.println(celular);
        
        try {
            long temp;
            temp = Long.parseLong(cpfText.getText());
            cpf = cpfText.getText();
        } catch (NumberFormatException ex) {
            houveErro = true;
            JOptionPane.showMessageDialog(null, "Erro InserirProdutoVIEW: CPF inválido! Por favor digite um número!");
        }
        try {
            long temp;
            temp = Long.parseLong(rgText.getText());
            rg = rgText.getText();
        } catch (NumberFormatException ex) {
            houveErro = true;
            JOptionPane.showMessageDialog(null, "Erro InserirProdutoVIEW: RG inválido! Por favor digite um número!");
        }
        email = emailText.getText();
        
               
        if (senhaText.getText().equals(senha2Text.getText())) {
            senha = senhaText.getText();
        } else {
            houveErro = true;
            JOptionPane.showMessageDialog(null, "Erro InserirProdutoVIEW: As senhas não são iguais! Verifique que ambas as senhas são iguais.");
        }
        
        if (!houveErro) {
            Comportamento.InserirUsuario(nome, dia, mes, ano, celular, cpf, rg, email, senha, this, null, false);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar um usuário!");
            houveErro = false;
        }

        if (editando) {
            this.dispose();
            //JanelaAdmVIEW menu = new JanelaAdmVIEW();
            //menu.setVisible(true);
        }

    }//GEN-LAST:event_cadastrarActionPerformed

    private void senha2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha2TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha2TextActionPerformed

    private void mesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoText;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField celularText;
    private javax.swing.JTextField cpfText;
    private javax.swing.JTextField diaText;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mesText;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField rgText;
    private javax.swing.JPasswordField senha2Text;
    private javax.swing.JPasswordField senhaText;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
