/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Calendar;

/**
 *
 * @author Pão De Forma
 */
public class IUEmprestimo extends javax.swing.JDialog {

    /**
     * Creates new form IUEmprestimo
     */
    public IUEmprestimo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       // texto_nome_usuario.setEditable(false);
       // texto_tipo_usuario.setEditable(false);
        botao_usuario.setEnabled(false);
        botao_concluir.setEnabled(false);
        //texto_nome_livro.setEditable(false);
        //texto_ano_livro.setEditable(false);
        botao_adicionar_livro.setEnabled(false);
        label_usuario_selecionado_1.setVisible(false);
        label_usuario_selecionado_2.setVisible(false);
        label_usuario_inexistente.setVisible(false);
        label_livro_inexistente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        label_codigo_usuario = new javax.swing.JLabel();
        label_nome_usuario = new javax.swing.JLabel();
        label_tipo_usuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_codigo_usuario = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto_nome_usuario = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        texto_tipo_usuario = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        texto_codigo_livro = new javax.swing.JTextArea();
        label_codigo_livro = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        texto_nome_livro = new javax.swing.JTextArea();
        label_nome_livro = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        texto_ano_livro = new javax.swing.JTextArea();
        label_ano_livro = new javax.swing.JLabel();
        label_livros = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        botao_adicionar_livro = new javax.swing.JButton();
        botao_limpar_livro = new javax.swing.JButton();
        botao_concluir = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        botao_usuario = new javax.swing.JButton();
        label_usuario_selecionado_1 = new javax.swing.JLabel();
        label_usuario_selecionado_2 = new javax.swing.JLabel();
        label_usuario_inexistente = new javax.swing.JLabel();
        label_livro_inexistente = new javax.swing.JLabel();

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Emprestimo");

        label_codigo_usuario.setText("Código do Usuário");

        label_nome_usuario.setText("Nome do Usuário");

        label_tipo_usuario.setText("Tipo do Usuário");

        texto_codigo_usuario.setColumns(20);
        texto_codigo_usuario.setRows(5);
        texto_codigo_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                texto_codigo_usuarioFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(texto_codigo_usuario);

        texto_nome_usuario.setEditable(false);
        texto_nome_usuario.setColumns(20);
        texto_nome_usuario.setRows(5);
        jScrollPane2.setViewportView(texto_nome_usuario);

        texto_tipo_usuario.setEditable(false);
        texto_tipo_usuario.setColumns(20);
        texto_tipo_usuario.setRows(5);
        jScrollPane4.setViewportView(texto_tipo_usuario);

        texto_codigo_livro.setColumns(20);
        texto_codigo_livro.setRows(5);
        texto_codigo_livro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                texto_codigo_livroFocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(texto_codigo_livro);

        label_codigo_livro.setText("Código do Livro");

        texto_nome_livro.setEditable(false);
        texto_nome_livro.setColumns(20);
        texto_nome_livro.setRows(5);
        jScrollPane6.setViewportView(texto_nome_livro);

        label_nome_livro.setText("Nome do Livro");

        texto_ano_livro.setEditable(false);
        texto_ano_livro.setColumns(20);
        texto_ano_livro.setRows(5);
        jScrollPane7.setViewportView(texto_ano_livro);

        label_ano_livro.setText("Ano do Livro");

        label_livros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_livros.setText("Livros");

        label_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_usuario.setText("Usuário");

        botao_adicionar_livro.setText("Adicionar");
        botao_adicionar_livro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                botao_adicionar_livroFocusLost(evt);
            }
        });
        botao_adicionar_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_adicionar_livroActionPerformed(evt);
            }
        });

        botao_limpar_livro.setText("Limpar");
        botao_limpar_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limpar_livroActionPerformed(evt);
            }
        });

        botao_concluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botao_concluir.setText("Concluir Empréstimo");
        botao_concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_concluirActionPerformed(evt);
            }
        });

        label_titulo.setText("Emprestimo");

        botao_usuario.setText("Selecionar Usuário");
        botao_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_usuarioActionPerformed(evt);
            }
        });

        label_usuario_selecionado_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_usuario_selecionado_1.setForeground(new java.awt.Color(0, 200, 0));
        label_usuario_selecionado_1.setText("Usuário Selecionado:");

        label_usuario_selecionado_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_usuario_selecionado_2.setForeground(new java.awt.Color(0, 200, 0));
        label_usuario_selecionado_2.setText("jLabel3");

        label_usuario_inexistente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_usuario_inexistente.setForeground(new java.awt.Color(255, 0, 0));
        label_usuario_inexistente.setText("Usuário Inexistente");

        label_livro_inexistente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_livro_inexistente.setForeground(new java.awt.Color(255, 0, 0));
        label_livro_inexistente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_livro_inexistente.setText("Livro Inexistente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label_usuario_selecionado_1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label_usuario_selecionado_2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botao_usuario)
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_concluir)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(label_usuario_inexistente))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_codigo_livro)
                                    .addComponent(label_nome_livro)
                                    .addComponent(label_ano_livro))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao_adicionar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botao_limpar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane5)
                                    .addComponent(jScrollPane6)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(label_livros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                    .addComponent(label_livro_inexistente, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_tipo_usuario)
                                        .addComponent(label_codigo_usuario)
                                        .addComponent(label_nome_usuario))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                        .addComponent(jScrollPane4)
                                        .addComponent(jScrollPane1)))))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(label_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_usuario_inexistente))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_codigo_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nome_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_tipo_usuario)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botao_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_usuario_selecionado_1)
                    .addComponent(label_usuario_selecionado_2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_livro_inexistente)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_livros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_codigo_livro)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_nome_livro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_ano_livro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_adicionar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_limpar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(botao_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texto_codigo_usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texto_codigo_usuarioFocusLost
        String codigo = texto_codigo_usuario.getText();
        Usuario usuario = Bibliotec.buscaUsuario(codigo);
        if(usuario == null){
            botao_usuario.setEnabled(false);
            texto_codigo_livro.setEnabled(false);
            //texto_nome_livro.setEnabled(false);
            //texto_ano_livro.setEnabled(false);
            botao_adicionar_livro.setEnabled(false);
            botao_limpar_livro.setEnabled(false);
            botao_concluir.setEnabled(false);
            label_usuario_inexistente.setVisible(true);
        }
        else{
            texto_nome_usuario.setText(usuario.getNome());
            texto_tipo_usuario.setText(usuario.getTipo());
            botao_usuario.setEnabled(true);
            texto_codigo_livro.setEnabled(true);
            //texto_nome_livro.setEnabled(true);
            //texto_ano_livro.setEnabled(true);
            botao_adicionar_livro.setEnabled(true);
            botao_limpar_livro.setEnabled(true);
            botao_concluir.setEnabled(false);
            label_usuario_inexistente.setVisible(false);
        }
    }//GEN-LAST:event_texto_codigo_usuarioFocusLost

    private void botao_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_usuarioActionPerformed
        String codigo = texto_codigo_usuario.getText();
        Usuario usuario = Bibliotec.buscaUsuario(codigo);
        if(usuario != null){
            Emp.setCodUsuario(codigo);
            texto_codigo_usuario.setEditable(false);
            //texto_nome_usuario.setEditable(false);
            //texto_tipo_usuario.setEditable(false);
            botao_usuario.setEnabled(false);
            label_usuario_selecionado_1.setVisible(true);
            label_usuario_selecionado_2.setVisible(true);
            label_usuario_selecionado_2.setText(usuario.getNome());
        }
    }//GEN-LAST:event_botao_usuarioActionPerformed

    private void texto_codigo_livroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texto_codigo_livroFocusLost
        String codigo = texto_codigo_livro.getText();
        Livro livro = Bibliotec.buscaLivro(codigo);
        if(livro == null){
            botao_adicionar_livro.setEnabled(false);
            //texto_nome_livro.setEnabled(false);
            //texto_ano_livro.setEnabled(false);
            label_livro_inexistente.setText("Livro Inexistente");
            label_livro_inexistente.setVisible(true);
        }
        else if(livro.estaEmprestado() == true){
            botao_adicionar_livro.setEnabled(false);
            //texto_nome_livro.setEnabled(false);
            //texto_ano_livro.setEnabled(false);
            label_livro_inexistente.setText("Livro Indisponível");
            label_livro_inexistente.setVisible(true);
        }
        else if(Emp.getContItens() == 7){
            botao_adicionar_livro.setEnabled(false);
            label_livro_inexistente.setText("Limite Máximo de 7 Livros Atingido");
            label_livro_inexistente.setVisible(true);
        }
        else{
            texto_nome_livro.setEnabled(true);
            texto_ano_livro.setEnabled(true);
            texto_nome_livro.setText(livro.getNome());
            texto_ano_livro.setText(Integer.toString(livro.getAno()));
            botao_adicionar_livro.setEnabled(true);
            label_livro_inexistente.setVisible(false);
        }
    }//GEN-LAST:event_texto_codigo_livroFocusLost

    private void botao_adicionar_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_adicionar_livroActionPerformed
        String codigoLivro = texto_codigo_livro.getText();
        String codigoEmprestimo = Emp.getCodEmprestimo();
        Item item = new Item(codigoEmprestimo, codigoLivro);
        Emp.addItem(item);
        Livro livro = Bibliotec.buscaLivro(codigoLivro);
        livro.emprestar();
        texto_codigo_livro.setText("");
        texto_nome_livro.setText("");
        texto_ano_livro.setText("");
        botao_concluir.setEnabled(true);
    }//GEN-LAST:event_botao_adicionar_livroActionPerformed

    private void botao_limpar_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limpar_livroActionPerformed
        texto_codigo_livro.setText("");
        texto_nome_livro.setText("");
        texto_ano_livro.setText("");
    }//GEN-LAST:event_botao_limpar_livroActionPerformed

    private void botao_adicionar_livroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_botao_adicionar_livroFocusLost
       
    }//GEN-LAST:event_botao_adicionar_livroFocusLost

    private void botao_concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_concluirActionPerformed
        Calendar dataAtual = Calendar.getInstance();
        Emp.setDataEmprestimo(dataAtual);
        Calendar dataDev = dataAtual;
        Usuario usuario = Bibliotec.buscaUsuario(Emp.getCodUsuario());
        dataDev.add(Calendar.DAY_OF_MONTH, usuario.getDiasEmprestimo());
        Emp.setDataDevolucao(dataDev);
        Emp.setDataDevolucaoItens();
        Bibliotec.registrarEmprestimo(Emp);
        this.dispose();
    }//GEN-LAST:event_botao_concluirActionPerformed

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
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUEmprestimo dialog = new IUEmprestimo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botao_adicionar_livro;
    private javax.swing.JButton botao_concluir;
    private javax.swing.JButton botao_limpar_livro;
    private javax.swing.JButton botao_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel label_ano_livro;
    private javax.swing.JLabel label_codigo_livro;
    private javax.swing.JLabel label_codigo_usuario;
    private javax.swing.JLabel label_livro_inexistente;
    private javax.swing.JLabel label_livros;
    private javax.swing.JLabel label_nome_livro;
    private javax.swing.JLabel label_nome_usuario;
    private javax.swing.JLabel label_tipo_usuario;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JLabel label_usuario_inexistente;
    private javax.swing.JLabel label_usuario_selecionado_1;
    private javax.swing.JLabel label_usuario_selecionado_2;
    private javax.swing.JTextArea texto_ano_livro;
    private javax.swing.JTextArea texto_codigo_livro;
    private javax.swing.JTextArea texto_codigo_usuario;
    private javax.swing.JTextArea texto_nome_livro;
    private javax.swing.JTextArea texto_nome_usuario;
    private javax.swing.JTextArea texto_tipo_usuario;
    // End of variables declaration//GEN-END:variables

    Emprestimo Emp = new Emprestimo();

}
