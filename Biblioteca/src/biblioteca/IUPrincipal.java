/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MastodonteEngasgado
 */
public class IUPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form IUPrincipal
     */
    public IUPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        botao_emprestimo = new javax.swing.JButton();
        botao_salvar_dados = new javax.swing.JButton();
        botao_limpar_emprestimos = new javax.swing.JButton();
        botao_info = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botao_emprestimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_emprestimo.setText("Realizar um Empréstimo");
        botao_emprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_emprestimoActionPerformed(evt);
            }
        });

        botao_salvar_dados.setText("Salvar Dados");
        botao_salvar_dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_salvar_dadosActionPerformed(evt);
            }
        });

        botao_limpar_emprestimos.setText("Limpar Emprestimos");
        botao_limpar_emprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limpar_emprestimosActionPerformed(evt);
            }
        });

        botao_info.setText("Info");
        botao_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_infoActionPerformed(evt);
            }
        });

        jMenu1.setText("Cadastro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Livro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Aluno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem13.setText("Professor");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");

        jMenuItem3.setText("Todos os Usuários");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Todos os Alunos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Todos os Professores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Usuário(Livros Emprestados)");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Usuário(Livros Atrasados)");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Todos os Livros");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Livros Disponíveis");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Livros Emprestados");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Livros com Atraso");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Usuários com Atraso");
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botao_salvar_dados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_limpar_emprestimos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_info)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(botao_emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(botao_emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_salvar_dados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_limpar_emprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        IURelatorio IURel = new IURelatorio(this, true);
        IURel.setLocationRelativeTo(this);
        IURel.setRelatorio("Todos os Usuários", Bibliotec.relatorioTodosUsuarios());   
        IURel.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        IURelatorioEspecifico IURel = new IURelatorioEspecifico(this, true);
        IURel.setLocationRelativeTo(this);
        IURel.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        IUCadastroLivro IUCad = new IUCadastroLivro(this, true);
        IUCad.setLocationRelativeTo(this);
        IUCad.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        IUCadastroAluno IUCad = new IUCadastroAluno(this, true);
        IUCad.setLocationRelativeTo(this);
        IUCad.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        IUCadastroProfessor IUCad = new IUCadastroProfessor(this, true);
        IUCad.setLocationRelativeTo(this);
        IUCad.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        IURelatorio IURel = new IURelatorio(this, true);
        IURel.setLocationRelativeTo(this);
        IURel.setRelatorio("Todos os Alunos", Bibliotec.relatorioAlunos());
        IURel.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        IURelatorio IURel = new IURelatorio(this, true);
        IURel.setLocationRelativeTo(this);
        IURel.setRelatorio("Todos os Professores", Bibliotec.relatorioProfessores());
        IURel.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        IURelatorio IURel = new IURelatorio(this, true);
        IURel.setLocationRelativeTo(this);
        IURel.setRelatorio("Todos os Livros", Bibliotec.relatorioLivros());
        IURel.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void botao_emprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_emprestimoActionPerformed
        IUEmprestimo IUEmp = new IUEmprestimo(this, true);
        IUEmp.setLocationRelativeTo(this);
        IUEmp.setVisible(true);
    }//GEN-LAST:event_botao_emprestimoActionPerformed

    private void botao_salvar_dadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_salvar_dadosActionPerformed
       Bibliotec B = Biblioteca.getBiblioteca();
        try {
            B.usuariosArquivo();
        } catch (IOException ex) {
            Logger.getLogger(IUPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            B.emprestimosArquivo();
        } catch (IOException ex) {
            Logger.getLogger(IUPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            B.livrosArquivo();
        } catch (IOException ex) {
            Logger.getLogger(IUPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        IUMensagem IUMsg = new IUMensagem(this, true);
        IUMsg.setTexto("Dados Salvos!");
        IUMsg.setLocationRelativeTo(this);
        IUMsg.setVisible(true);
    }//GEN-LAST:event_botao_salvar_dadosActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void botao_limpar_emprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limpar_emprestimosActionPerformed
        Bibliotec B = new Bibliotec();
        try {
            B.limparEmprestimos();
        } catch (IOException ex) {
            Logger.getLogger(IUPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botao_limpar_emprestimosActionPerformed

    private void botao_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_infoActionPerformed
        IURelatorio IURel = new IURelatorio(this, true);
        String info = "Este botão irá limpar o vetor e o arquivo de emprestimos, além de colocar todos os livros como disponíveis. \n O objetivo disto é facilitar o teste do programa.";
        IURel.setRelatorio("Botão Limpar Emprestimos", info);
        IURel.setLocationRelativeTo(this);
        IURel.setVisible(true);
    }//GEN-LAST:event_botao_infoActionPerformed

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
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_emprestimo;
    private javax.swing.JButton botao_info;
    private javax.swing.JButton botao_limpar_emprestimos;
    private javax.swing.JButton botao_salvar_dados;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}