/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viw;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import controle.Usuario_controle;
import java.awt.Desktop;
import model.Usuario_Modelo;

/**
 *
 * @author JOSÉ ULISSES DA SILVA
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * CRIANDO O FORMULARIO DE LOGIN
     */
    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        root = new javax.swing.JPanel();
        log = new javax.swing.JPanel();
        SubPainelLog = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSenhaLog = new javax.swing.JPasswordField();
        lblRedefinir = new javax.swing.JLabel();
        btnLogin = new javax.swing.JToggleButton();
        lblLogoUser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtUserLog = new javax.swing.JFormattedTextField();
        Redefinir = new javax.swing.JPanel();
        SubPainelRedefinir = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnVoltarAdmAutenticacao1 = new javax.swing.JButton();
        txtRedefinirid = new javax.swing.JTextField();
        btnRedefinir = new javax.swing.JToggleButton();
        lblLogoRedefinir = new javax.swing.JLabel();
        txtRedefinirSenha = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txtRedefinirUser = new javax.swing.JFormattedTextField();
        AdmLog = new javax.swing.JPanel();
        SubPainelAdmLog = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnVoltarAdmAutenticacao = new javax.swing.JButton();
        txtAdmSenha = new javax.swing.JPasswordField();
        btnAutenticar = new javax.swing.JToggleButton();
        lblLogoAdm = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtAdmUser = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        root.setBackground(new java.awt.Color(255, 255, 255));
        root.setLayout(new java.awt.CardLayout());

        log.setBackground(new java.awt.Color(255, 255, 255));
        log.setForeground(new java.awt.Color(0, 8, 90));
        log.setPreferredSize(new java.awt.Dimension(850, 500));

        SubPainelLog.setBackground(new java.awt.Color(0, 8, 90));
        SubPainelLog.setPreferredSize(new java.awt.Dimension(377, 465));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MercoCenter");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/sacolas-de-compras (1).png"))); // NOI18N

        javax.swing.GroupLayout SubPainelLogLayout = new javax.swing.GroupLayout(SubPainelLog);
        SubPainelLog.setLayout(SubPainelLogLayout);
        SubPainelLogLayout.setHorizontalGroup(
            SubPainelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelLogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SubPainelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap())
        );
        SubPainelLogLayout.setVerticalGroup(
            SubPainelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelLogLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtSenhaLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenhaLog.setForeground(new java.awt.Color(0, 8, 90));
        txtSenhaLog.setText("3532");
        txtSenhaLog.setBorder(null);
        txtSenhaLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenhaLogMouseClicked(evt);
            }
        });
        txtSenhaLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaLogActionPerformed(evt);
            }
        });

        lblRedefinir.setForeground(new java.awt.Color(0, 0, 153));
        lblRedefinir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRedefinir.setText("Esqueceu a senha?");
        lblRedefinir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRedefinirMouseClicked(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 8, 90));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblLogoUser.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLogoUser.setForeground(new java.awt.Color(0, 8, 90));
        lblLogoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoUser.setText("Login");

        jSeparator1.setForeground(new java.awt.Color(0, 8, 90));

        jSeparator2.setForeground(new java.awt.Color(0, 8, 90));

        txtUserLog.setBorder(null);
        txtUserLog.setForeground(new java.awt.Color(0, 8, 90));
        try {
            txtUserLog.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUserLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUserLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logLayout = new javax.swing.GroupLayout(log);
        log.setLayout(logLayout);
        logLayout.setHorizontalGroup(
            logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logLayout.createSequentialGroup()
                .addComponent(SubPainelLog, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogoUser, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSenhaLog)
                    .addComponent(txtUserLog))
                .addGap(47, 47, 47))
        );
        logLayout.setVerticalGroup(
            logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubPainelLog, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
            .addGroup(logLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblLogoUser, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(txtUserLog, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(txtSenhaLog, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        root.add(log, "card2");

        Redefinir.setBackground(new java.awt.Color(255, 255, 255));

        SubPainelRedefinir.setBackground(new java.awt.Color(0, 8, 90));
        SubPainelRedefinir.setPreferredSize(new java.awt.Dimension(377, 465));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MercoCenter");

        btnVoltarAdmAutenticacao1.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltarAdmAutenticacao1.setForeground(new java.awt.Color(0, 8, 90));
        btnVoltarAdmAutenticacao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/voltar.png"))); // NOI18N
        btnVoltarAdmAutenticacao1.setText("Voltar");
        btnVoltarAdmAutenticacao1.setBorder(null);
        btnVoltarAdmAutenticacao1.setBorderPainted(false);
        btnVoltarAdmAutenticacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarAdmAutenticacao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubPainelRedefinirLayout = new javax.swing.GroupLayout(SubPainelRedefinir);
        SubPainelRedefinir.setLayout(SubPainelRedefinirLayout);
        SubPainelRedefinirLayout.setHorizontalGroup(
            SubPainelRedefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelRedefinirLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(63, 63, 63))
            .addGroup(SubPainelRedefinirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarAdmAutenticacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SubPainelRedefinirLayout.setVerticalGroup(
            SubPainelRedefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelRedefinirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarAdmAutenticacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(226, 226, 226))
        );

        txtRedefinirid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRedefinirid.setForeground(new java.awt.Color(0, 8, 90));
        txtRedefinirid.setText("Cod do funcionario");
        txtRedefinirid.setBorder(null);
        txtRedefinirid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRedefiniridMouseClicked(evt);
            }
        });
        txtRedefinirid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedefiniridActionPerformed(evt);
            }
        });

        btnRedefinir.setBackground(new java.awt.Color(0, 8, 90));
        btnRedefinir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRedefinir.setForeground(new java.awt.Color(255, 255, 255));
        btnRedefinir.setText("Redefinir");
        btnRedefinir.setMaximumSize(new java.awt.Dimension(93, 10));
        btnRedefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedefinirActionPerformed(evt);
            }
        });

        lblLogoRedefinir.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLogoRedefinir.setForeground(new java.awt.Color(0, 8, 90));
        lblLogoRedefinir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoRedefinir.setText("Redefinir");

        txtRedefinirSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRedefinirSenha.setForeground(new java.awt.Color(0, 8, 90));
        txtRedefinirSenha.setText("passwrd");
        txtRedefinirSenha.setBorder(null);
        txtRedefinirSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRedefinirSenhaMouseClicked(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 8, 90));

        jSeparator5.setForeground(new java.awt.Color(0, 8, 90));

        jSeparator8.setForeground(new java.awt.Color(0, 8, 90));

        txtRedefinirUser.setBorder(null);
        txtRedefinirUser.setForeground(new java.awt.Color(0, 8, 90));
        try {
            txtRedefinirUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRedefinirUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout RedefinirLayout = new javax.swing.GroupLayout(Redefinir);
        Redefinir.setLayout(RedefinirLayout);
        RedefinirLayout.setHorizontalGroup(
            RedefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedefinirLayout.createSequentialGroup()
                .addComponent(SubPainelRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(RedefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRedefinir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogoRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(txtRedefinirSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRedefinirid)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRedefinirUser))
                .addGap(47, 47, 47))
        );
        RedefinirLayout.setVerticalGroup(
            RedefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubPainelRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
            .addGroup(RedefinirLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblLogoRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRedefinirid, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(txtRedefinirUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(txtRedefinirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(btnRedefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        root.add(Redefinir, "Redefinir");

        AdmLog.setBackground(new java.awt.Color(255, 255, 255));

        SubPainelAdmLog.setBackground(new java.awt.Color(0, 8, 90));
        SubPainelAdmLog.setPreferredSize(new java.awt.Dimension(377, 465));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MercoCenter");

        btnVoltarAdmAutenticacao.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltarAdmAutenticacao.setForeground(new java.awt.Color(0, 8, 90));
        btnVoltarAdmAutenticacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/voltar.png"))); // NOI18N
        btnVoltarAdmAutenticacao.setText("Voltar");
        btnVoltarAdmAutenticacao.setBorder(null);
        btnVoltarAdmAutenticacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarAdmAutenticacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubPainelAdmLogLayout = new javax.swing.GroupLayout(SubPainelAdmLog);
        SubPainelAdmLog.setLayout(SubPainelAdmLogLayout);
        SubPainelAdmLogLayout.setHorizontalGroup(
            SubPainelAdmLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelAdmLogLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77))
            .addGroup(SubPainelAdmLogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarAdmAutenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SubPainelAdmLogLayout.setVerticalGroup(
            SubPainelAdmLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelAdmLogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarAdmAutenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(233, 233, 233))
        );

        txtAdmSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAdmSenha.setForeground(new java.awt.Color(0, 8, 90));
        txtAdmSenha.setText("password");
        txtAdmSenha.setBorder(null);
        txtAdmSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAdmSenhaMouseClicked(evt);
            }
        });
        txtAdmSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmSenhaActionPerformed(evt);
            }
        });

        btnAutenticar.setBackground(new java.awt.Color(0, 8, 90));
        btnAutenticar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAutenticar.setForeground(new java.awt.Color(255, 255, 255));
        btnAutenticar.setText("Autenticar");
        btnAutenticar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutenticarActionPerformed(evt);
            }
        });

        lblLogoAdm.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLogoAdm.setForeground(new java.awt.Color(0, 8, 90));
        lblLogoAdm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoAdm.setText("Altenticação ADM ");

        jSeparator6.setForeground(new java.awt.Color(0, 8, 90));

        jSeparator7.setForeground(new java.awt.Color(0, 8, 90));

        txtAdmUser.setBorder(null);
        txtAdmUser.setForeground(new java.awt.Color(0, 8, 90));
        try {
            txtAdmUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAdmUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout AdmLogLayout = new javax.swing.GroupLayout(AdmLog);
        AdmLog.setLayout(AdmLogLayout);
        AdmLogLayout.setHorizontalGroup(
            AdmLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdmLogLayout.createSequentialGroup()
                .addComponent(SubPainelAdmLog, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(AdmLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAutenticar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAdmSenha)
                    .addComponent(jSeparator6)
                    .addComponent(lblLogoAdm, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addComponent(txtAdmUser)
                    .addComponent(jSeparator7))
                .addGap(47, 47, 47))
        );
        AdmLogLayout.setVerticalGroup(
            AdmLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubPainelAdmLog, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
            .addGroup(AdmLogLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblLogoAdm, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdmUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(txtAdmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAutenticar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        root.add(AdmLog, "AdmLog");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//FUNCIONALIDADE DE LOGIN DO SISTEMA
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
//DENTRO DESSE TRATAMENTO DE ECEÇÃO E REALIZADO UMA REQUISIÇÃO AO BANCO OS DADOS SÃO AUTENTICADOS
//E SE FOR CONDIZENTE COM OS DADOS DO BANCO O ACESSO E DADO DE ACORDO COM O NIVEL DE PERMIÇÃO DOS 
//DADOS DE LOGIN INSERIDOS
        try {
            Usuario_Modelo modelo_user_para_login = new Usuario_controle().efetuarLogin(Integer.parseInt(txtUserLog.getText()), txtSenhaLog.getText());
            String tipo = modelo_user_para_login.getPermissao();
            TelaPrincipal TelaPrincipal = new TelaPrincipal(modelo_user_para_login.getFuncionario_cod_funcionario());
            System.out.println("status"+modelo_user_para_login.getAtivo());
            switch (tipo) {
                case "adm":
                    if (modelo_user_para_login.getAtivo() == 1) {
                        this.dispose();
                        TelaPrincipal.setVisible(true);
                        TelaPrincipal.menCaixa.setEnabled(true);
                        TelaPrincipal.menEstoque.setEnabled(true);
                        TelaPrincipal.menRh.setEnabled(true);
                        TelaPrincipal.menRelatorio.setEnabled(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario esta inativo");
                    }
                    break;

                case "caixa":
                    if (modelo_user_para_login.getAtivo() == 1) {
                        this.dispose();
                        TelaPrincipal.setVisible(true);
                        TelaPrincipal.menCaixa.setEnabled(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario esta inativo");
                    }
                    break;

                case "almoxarife":
                    if (modelo_user_para_login.getAtivo() == 1) {
                        this.dispose();
                        TelaPrincipal.setVisible(true);
                        TelaPrincipal.menEstoque.setEnabled(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario esta inativo");
                    }
                    break;

                case "gerente":
                    if (modelo_user_para_login.getAtivo() == 1) {
                        this.dispose();
                        TelaPrincipal.setVisible(true);
                        TelaPrincipal.menCaixa.setEnabled(true);
                        TelaPrincipal.menEstoque.setEnabled(true);
                        TelaPrincipal.menRh.setEnabled(true);
                        TelaPrincipal.menRelatorio.setEnabled(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario esta inativo");
                    }
                    break;
                case "sql":

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Usuário e/ou Senha inválidos(s). Tente Novamente! loaaaa");
                    break;

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Usuário e/ou Senha inválidos(s). Tente Novamente! em tela log" + e);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Usuário deve ser um valor numerico e não dever ter campos vazios" + e);

        }

    }//GEN-LAST:event_btnLoginActionPerformed


    private void txtRedefiniridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedefiniridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedefiniridActionPerformed

//    O METODO ABAIXO REALIZA A REDEFINIÇÃO DE SENHA ATIVADO PELO LABEL LBLREDEFINIR
//    NO QUAL SOLICITA DADOS DE LOGIN DO ADM E CASO SEJAM COERENTES DA ACESSO A FUNCIONALIDADE
//    DE REDEFINIÇÃO QUE SOLICITA O CODIGO DO FUNCIONARIO E O NOVO USUARIO E SENHA
    private void btnRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedefinirActionPerformed
         // ESSE TRY FAZ O TRATAMENTO DOS DADOS QUE VEM DO CARD DE REDEFINIÇÃO DE SENHA:

        try {
            int id = Integer.parseInt(txtRedefinirid.getText());
            int user = Integer.parseInt(txtRedefinirUser.getText());
            String senha = txtRedefinirSenha.getText();
            boolean result = new Usuario_controle().RedefinirUsuario(user, senha, id);
            if (result == true) {
                JOptionPane.showMessageDialog(null, "Dados de usuario e senha alterados com sucesso");
                new TelaLogin().setVisible(true);
                this.dispose();
            } else if (result == false) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O codigo do usuário e seu id inseridos devem ser numerico. Tente Novamente!");
        }


    }//GEN-LAST:event_btnRedefinirActionPerformed

    private void btnAutenticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutenticarActionPerformed
        // ESSE TRY FAZ A AUTENTICAÇÃO DOS DADOS DO ADM E CASO SEJAM VERIDICOS E DADO O ACESSO
//        PARA TELA DE REDEFINIÇÃO:
        try {

            int user = Integer.parseInt(txtAdmUser.getText());
            if (new Usuario_controle().efetuarLoginAdm(user, txtAdmSenha.getText()) == true) {
                CardLayout card = (CardLayout) root.getLayout();
                card.show(root, "Redefinir");
            } else if (new Usuario_controle().efetuarLoginAdm(user, txtAdmSenha.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Usuário e/ou Senha inválidos(s). Tente Novamente!");

            } else {
            }
//           ESSE CATCH FAZ A CAPTURA EM CASO DE ERRO NA CONVERÇÃO DOS DADOS QUE VEM DO VIW PARA 
//          FORMATO CORRETO
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O codigo do usuário inseridodeve ser numerico e não devem ter campos vazios. Tente Novamente!");
        }


    }//GEN-LAST:event_btnAutenticarActionPerformed

    private void lblRedefinirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRedefinirMouseClicked
        // FUNÇÃO DISPARADA PEO CLICK DO MOUSE SOBRE REDEFINIR SENHA QUE REDIRECIONA PARA A 
//        TELA DE AUTENTICAÇÃO DOS DADOS DO ADM:
        CardLayout card = (CardLayout) root.getLayout();
        card.show(root, "AdmLog");
    }//GEN-LAST:event_lblRedefinirMouseClicked

    private void txtSenhaLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaLogActionPerformed

    private void txtAdmSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmSenhaActionPerformed

    private void txtSenhaLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaLogMouseClicked
        // FUNCIONALIDADE USADA PARA LIMPAR O CAPO QUANDO FOR CLICADO SOBRE ELE:
        txtSenhaLog.setText("");

    }//GEN-LAST:event_txtSenhaLogMouseClicked

    private void txtRedefiniridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRedefiniridMouseClicked
        // FUNCIONALIDADE USADA PARA LIMPAR O CAPO QUANDO FOR CLICADO SOBRE ELE:
        txtRedefinirid.setText("");

    }//GEN-LAST:event_txtRedefiniridMouseClicked

    private void txtRedefinirSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRedefinirSenhaMouseClicked
        // FUNCIONALIDADE USADA PARA LIMPAR O CAPO QUANDO FOR CLICADO SOBRE ELE:
        txtRedefinirSenha.setText("");

    }//GEN-LAST:event_txtRedefinirSenhaMouseClicked

    private void txtAdmSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAdmSenhaMouseClicked
        // FUNCIONALIDADE USADA PARA LIMPAR O CAPO QUANDO FOR CLICADO SOBRE ELE:
        txtAdmSenha.setText("");

    }//GEN-LAST:event_txtAdmSenhaMouseClicked

    private void btnVoltarAdmAutenticacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarAdmAutenticacaoActionPerformed
        // TODO add your handling code here:
        TelaLogin lo = new TelaLogin();
        lo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarAdmAutenticacaoActionPerformed

    private void btnVoltarAdmAutenticacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarAdmAutenticacao1ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout) root.getLayout();
        card.show(root, "AdmLog");
    }//GEN-LAST:event_btnVoltarAdmAutenticacao1ActionPerformed

    private void txtUserLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserLogActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdmLog;
    private javax.swing.JPanel Redefinir;
    private javax.swing.JPanel SubPainelAdmLog;
    private javax.swing.JPanel SubPainelLog;
    private javax.swing.JPanel SubPainelRedefinir;
    private javax.swing.JToggleButton btnAutenticar;
    private javax.swing.JToggleButton btnLogin;
    private javax.swing.JToggleButton btnRedefinir;
    private javax.swing.JButton btnVoltarAdmAutenticacao;
    private javax.swing.JButton btnVoltarAdmAutenticacao1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblLogoAdm;
    private javax.swing.JLabel lblLogoRedefinir;
    private javax.swing.JLabel lblLogoUser;
    private javax.swing.JLabel lblRedefinir;
    private javax.swing.JPanel log;
    private javax.swing.JPanel root;
    private javax.swing.JPasswordField txtAdmSenha;
    private javax.swing.JFormattedTextField txtAdmUser;
    private javax.swing.JPasswordField txtRedefinirSenha;
    private javax.swing.JFormattedTextField txtRedefinirUser;
    private javax.swing.JTextField txtRedefinirid;
    private javax.swing.JPasswordField txtSenhaLog;
    private javax.swing.JFormattedTextField txtUserLog;
    // End of variables declaration//GEN-END:variables

}
