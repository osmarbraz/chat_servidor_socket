
import javax.swing.text.DefaultCaret;
import static javax.swing.text.DefaultCaret.ALWAYS_UPDATE;

/**
 *
 * @author osmar
 */
public class FrmServidor extends javax.swing.JFrame {

    /**
     * Cria um novo formulário FrmServidor
     */
    public FrmServidor() {
        setTitle("Servidor Chat Socket");
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jbtIniciar = new javax.swing.JButton();
        jbtnParar = new javax.swing.JButton();
        jbtFechar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMensagens = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtPortaServidor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblConexoes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeServidor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaximoConexoes = new javax.swing.JTextField();
        chkReplicarMensagens = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbtIniciar.setText("Iniciar");
        jbtIniciar.setName("btnIniciar"); // NOI18N
        jbtIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIniciarActionPerformed(evt);
            }
        });

        jbtnParar.setText("Parar");
        jbtnParar.setEnabled(false);
        jbtnParar.setName("btnParar"); // NOI18N
        jbtnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPararActionPerformed(evt);
            }
        });

        jbtFechar.setText("Fechar");
        jbtFechar.setName("btnFechar"); // NOI18N
        jbtFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtFechar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnParar)
                        .addComponent(jbtIniciar)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnParar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(jbtFechar)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Mensagens servidor:");

        txtMensagens.setColumns(20);
        txtMensagens.setRows(5);
        jScrollPane2.setViewportView(txtMensagens);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
        );

        jLabel1.setText("Porta servidor:");

        txtPortaServidor.setText("4444");
        txtPortaServidor.setName("txtPortaServidor"); // NOI18N

        jLabel3.setText("Conexões:");

        lblConexoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConexoes.setText("0");

        jLabel4.setText("Nome Servidor:");

        txtNomeServidor.setText("OOL");

        jLabel5.setText("Máximo conexões:");

        txtMaximoConexoes.setText("50");

        chkReplicarMensagens.setSelected(true);
        chkReplicarMensagens.setText("Replicar mensagens");
        chkReplicarMensagens.setToolTipText("Replica a mensagem de um cliente para todos os clientes conectados.");
        chkReplicarMensagens.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkReplicarMensagensStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeServidor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPortaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkReplicarMensagens)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblConexoes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaximoConexoes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtMaximoConexoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPortaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(chkReplicarMensagens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblConexoes))
                        .addGap(4, 4, 4)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIniciarActionPerformed
        //Muda o estado dos botões
        jbtIniciar.setEnabled(false);
        jbtnParar.setEnabled(true);
        
        //Posiciona o text area no final
        DefaultCaret caret = (DefaultCaret) txtMensagens.getCaret();
        caret.setUpdatePolicy(ALWAYS_UPDATE);

        //Mensagem inicial
        txtMensagens.append("\nIniciando servidor.");
        
        //Informações do servidor
        String nomeServidor = txtNomeServidor.getText();
        int portaServidor = Integer.parseInt(txtPortaServidor.getText());
        int maximoConexoes = Integer.parseInt(txtMaximoConexoes.getText());
        boolean replicarMensagens = chkReplicarMensagens.isSelected();
        
        //Instanciando o servidor
        servidor = new Servidor(nomeServidor, portaServidor, maximoConexoes, replicarMensagens, txtMensagens, lblConexoes);       
        
        //Instanciando e iniciando o servidor como uma Thread
        threadServidor = new Thread(servidor);
        threadServidor.start();

    }//GEN-LAST:event_jbtIniciarActionPerformed

    private void jbtFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFecharActionPerformed
        //Sai do servidor
        System.exit(0);
    }//GEN-LAST:event_jbtFecharActionPerformed

    private void jbtnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPararActionPerformed
        //Parada do servidor
        jbtIniciar.setEnabled(true);
        jbtnParar.setEnabled(false);
                
        txtMensagens.append("\nParando servidor.");
        
        //Interrompendo a Thread do servidor
        threadServidor.interrupt();   
        
        txtMensagens.append("\nServidor parado.");
    }//GEN-LAST:event_jbtnPararActionPerformed

    private void chkReplicarMensagensStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkReplicarMensagensStateChanged
        //Configura a replicação de mensagens aos clientes
        if (servidor != null){
            //Verifica o checkbox
            boolean replicarMensagens = chkReplicarMensagens.isSelected();
            //Altera o servidor
            servidor.setReplicarMensagens(replicarMensagens);
        }
    }//GEN-LAST:event_chkReplicarMensagensStateChanged
    
    //Servidor e sua Thread
    Servidor servidor = null;
    Thread threadServidor = null;
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkReplicarMensagens;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtFechar;
    private javax.swing.JButton jbtIniciar;
    private javax.swing.JButton jbtnParar;
    private javax.swing.JLabel lblConexoes;
    private javax.swing.JTextField txtMaximoConexoes;
    private javax.swing.JTextArea txtMensagens;
    private javax.swing.JTextField txtNomeServidor;
    private javax.swing.JTextField txtPortaServidor;
    // End of variables declaration//GEN-END:variables
}
