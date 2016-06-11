/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.IngressosJa.view;

import br.com.IngressosJa.controller.Autentica;
import br.com.IngressosJa.controller.MoradorController;
import br.com.IngressosJa.model.Visitante;
import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class TelaOpcoes extends javax.swing.JFrame {
    Autentica aut = new Autentica();
    /**
     * Creates new form TelaOpcoes
     */
    public TelaOpcoes() {
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

        jPanel1 = new javax.swing.JPanel();
        jSairOpcoesButton = new javax.swing.JButton();
        jComprarIngOpcoes = new javax.swing.JButton();
        jCadastroMorOpcoes = new javax.swing.JButton();
        jCadastroVisOpcoes = new javax.swing.JButton();
        jCadastrarEvenOpcoes = new javax.swing.JButton();
        jRelatorioEvenOpcoes = new javax.swing.JButton();
        jRelatorioCadOpcoes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelEventos = new javax.swing.JMenuItem();
        jMenuItemRelCadastros = new javax.swing.JMenuItem();
        jMenuComprar = new javax.swing.JMenu();
        jMenuItemComprarIngressos = new javax.swing.JMenuItem();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCadMorador = new javax.swing.JMenuItem();
        jMenuItemCadVisitante = new javax.swing.JMenuItem();
        jMenuItemCadEvento = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        jSairOpcoesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancel Red Button.png"))); // NOI18N
        jSairOpcoesButton.setText("Sair");
        jSairOpcoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairOpcoesButtonActionPerformed(evt);
            }
        });

        jComprarIngOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/shopping.png"))); // NOI18N
        jComprarIngOpcoes.setText("Comprar Ingressos");
        jComprarIngOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComprarIngOpcoesActionPerformed(evt);
            }
        });

        jCadastroMorOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/User.png"))); // NOI18N
        jCadastroMorOpcoes.setText("Cadastrar Morador");
        jCadastroMorOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroMorOpcoesActionPerformed(evt);
            }
        });

        jCadastroVisOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Users.png"))); // NOI18N
        jCadastroVisOpcoes.setText("Cadastrar Visitante");
        jCadastroVisOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroVisOpcoesActionPerformed(evt);
            }
        });

        jCadastrarEvenOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/calendario.png"))); // NOI18N
        jCadastrarEvenOpcoes.setText("Cadastrar Evento");
        jCadastrarEvenOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarEvenOpcoesActionPerformed(evt);
            }
        });

        jRelatorioEvenOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorioPdf.png"))); // NOI18N
        jRelatorioEvenOpcoes.setText("Relatório de Eventos");

        jRelatorioCadOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorioPdf.png"))); // NOI18N
        jRelatorioCadOpcoes.setText("Relatório de Cadastro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSairOpcoesButton)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCadastroVisOpcoes)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCadastroMorOpcoes)
                                .addGap(32, 32, 32)
                                .addComponent(jComprarIngOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCadastrarEvenOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRelatorioEvenOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jRelatorioCadOpcoes)))
                        .addContainerGap(186, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCadastroMorOpcoes)
                    .addComponent(jComprarIngOpcoes))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCadastroVisOpcoes)
                    .addComponent(jRelatorioCadOpcoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCadastrarEvenOpcoes)
                    .addComponent(jRelatorioEvenOpcoes))
                .addGap(19, 19, 19)
                .addComponent(jSairOpcoesButton)
                .addGap(22, 22, 22))
        );

        jMenuArquivo.setText("Arquivo");

        jMenuItemSair.setText("Sair");
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemRelEventos.setText("Relatórios de Eventos");
        jMenuRelatorios.add(jMenuItemRelEventos);

        jMenuItemRelCadastros.setText("Relatórios de Cadastros");
        jMenuRelatorios.add(jMenuItemRelCadastros);

        jMenuBar1.add(jMenuRelatorios);

        jMenuComprar.setText("Comprar");

        jMenuItemComprarIngressos.setText("Comprar Ingressos");
        jMenuItemComprarIngressos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemComprarIngressosActionPerformed(evt);
            }
        });
        jMenuComprar.add(jMenuItemComprarIngressos);

        jMenuBar1.add(jMenuComprar);

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemCadMorador.setText("Cadastrar Morador");
        jMenuItemCadMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMoradorActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadMorador);

        jMenuItemCadVisitante.setText("Cadastrar Visitante");
        jMenuItemCadVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadVisitanteActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadVisitante);

        jMenuItemCadEvento.setText("Cadastrar Evento");
        jMenuItemCadEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadEventoActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadEvento);

        jMenuBar1.add(jMenuCadastrar);

        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setText("Sobre");
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComprarIngOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComprarIngOpcoesActionPerformed
        TelaCompraIngressos t7 = new TelaCompraIngressos();
        t7.setVisible(true);
        
    }//GEN-LAST:event_jComprarIngOpcoesActionPerformed

    private void jCadastroVisOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroVisOpcoesActionPerformed
        TelaCadastroVisitante t4 = new TelaCadastroVisitante();
        t4.setVisible(true);
        
    }//GEN-LAST:event_jCadastroVisOpcoesActionPerformed

    private void jCadastroMorOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroMorOpcoesActionPerformed
        TelaCadastroMorador t3 = new TelaCadastroMorador();
        t3.setVisible(true);
    }//GEN-LAST:event_jCadastroMorOpcoesActionPerformed

    private void jCadastrarEvenOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarEvenOpcoesActionPerformed
        this.checaUsuarioGerente();
        /**
         * fazer um select pegando o byte se é ou nao gerente, para poder abrir a tela de cadastro de evento
         */
        //if(MoradorController.gerente( 8888  ,morador) == 1){
        //   
        //}
        
    }//GEN-LAST:event_jCadastrarEvenOpcoesActionPerformed

    private void jSairOpcoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairOpcoesButtonActionPerformed
        dispose();
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
        
    }//GEN-LAST:event_jSairOpcoesButtonActionPerformed

    private void jMenuItemComprarIngressosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemComprarIngressosActionPerformed
        TelaCompraIngressos t7 = new TelaCompraIngressos();
        t7.setVisible(true);
    }//GEN-LAST:event_jMenuItemComprarIngressosActionPerformed

    private void jMenuItemCadMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMoradorActionPerformed
        TelaCadastroMorador t3 = new TelaCadastroMorador();
        t3.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadMoradorActionPerformed

    private void jMenuItemCadVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadVisitanteActionPerformed
        TelaCadastroVisitante t4 = new TelaCadastroVisitante();
        t4.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadVisitanteActionPerformed

    private void jMenuItemCadEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadEventoActionPerformed
        this.checaUsuarioGerente();
        /**
         * fazer um select pegando o byte se é ou nao gerente, para poder abrir a tela de cadastro de evento
         */
        //if(MoradorController.gerente( 8888  ,morador) == 1){
        //   
        //}
    }//GEN-LAST:event_jMenuItemCadEventoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOpcoes().setVisible(true);
            }
        });
    }

    public void checaUsuarioGerente(){
        if(aut.getMorOrVis().equals("1")){
            TelaCadastroEvento t5 = new TelaCadastroEvento();
            t5.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Você não tem a permissão para cadastrar evento!\n"
                    + "Esta permissão só é concedida a Moradores que são Gerentes no condomínio.");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCadastrarEvenOpcoes;
    private javax.swing.JButton jCadastroMorOpcoes;
    private javax.swing.JButton jCadastroVisOpcoes;
    private javax.swing.JButton jComprarIngOpcoes;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenu jMenuComprar;
    private javax.swing.JMenuItem jMenuItemCadEvento;
    private javax.swing.JMenuItem jMenuItemCadMorador;
    private javax.swing.JMenuItem jMenuItemCadVisitante;
    private javax.swing.JMenuItem jMenuItemComprarIngressos;
    private javax.swing.JMenuItem jMenuItemRelCadastros;
    private javax.swing.JMenuItem jMenuItemRelEventos;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRelatorioCadOpcoes;
    private javax.swing.JButton jRelatorioEvenOpcoes;
    private javax.swing.JButton jSairOpcoesButton;
    // End of variables declaration//GEN-END:variables
}
