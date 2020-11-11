/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.editor;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author UCS
 */
public class EditorUI extends javax.swing.JFrame {

    private Image newimg1 = null;
    private Image newimg2 = null;
    private Image newimg3 = null;
    
    public EditorUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        db = new javax.swing.JFileChooser();
        novaJanela = new javax.swing.JFrame();
        imagemArit2 = new javax.swing.JButton();
        imagemArit1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        retornaArit = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        and = new javax.swing.JButton();
        orArit = new javax.swing.JButton();
        xorArit = new javax.swing.JButton();
        levaTelaArit = new javax.swing.JButton();
        imagemArit3 = new javax.swing.JLabel();
        novaJanela2 = new javax.swing.JFrame();
        imgPass = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        aplicarBanda = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        vermelho = new javax.swing.JSlider();
        verde = new javax.swing.JSlider();
        azul = new javax.swing.JSlider();
        jPanel6 = new javax.swing.JPanel();
        vermelhoL = new javax.swing.JLabel();
        verdeL = new javax.swing.JLabel();
        azulL = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        retornaBanda = new javax.swing.JButton();
        levaTelaBanda = new javax.swing.JButton();
        histoGrafRed2 = new javax.swing.JPanel();
        histoGrafGreen2 = new javax.swing.JPanel();
        histoGrafBlue2 = new javax.swing.JPanel();
        imagemFrame = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        histograma = new javax.swing.JButton();
        passaBaixa = new javax.swing.JButton();
        baixaMedia = new javax.swing.JRadioButton();
        baixaPonderada = new javax.swing.JRadioButton();
        passaAlta = new javax.swing.JButton();
        desfazer = new javax.swing.JButton();
        laplace = new javax.swing.JButton();
        histoGrafRed = new javax.swing.JPanel();
        histoGrafGreen = new javax.swing.JPanel();
        histoGrafBlue = new javax.swing.JPanel();
        passaBanda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        roberts = new javax.swing.JButton();
        prewitt = new javax.swing.JButton();
        sobel = new javax.swing.JButton();
        moda = new javax.swing.JButton();
        mediana = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        aritimetica = new javax.swing.JButton();

        novaJanela.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        novaJanela.setMinimumSize(new java.awt.Dimension(1100, 812));

        imagemArit2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        imagemArit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/carregar2.jpg"))); // NOI18N
        imagemArit2.setMaximumSize(new java.awt.Dimension(380, 264));
        imagemArit2.setMinimumSize(new java.awt.Dimension(380, 264));
        imagemArit2.setPreferredSize(new java.awt.Dimension(380, 264));
        imagemArit2.setVerifyInputWhenFocusTarget(false);
        imagemArit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagemArit2ActionPerformed(evt);
            }
        });

        imagemArit1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        imagemArit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/carregar2.jpg"))); // NOI18N
        imagemArit1.setMaximumSize(new java.awt.Dimension(380, 264));
        imagemArit1.setMinimumSize(new java.awt.Dimension(380, 264));
        imagemArit1.setPreferredSize(new java.awt.Dimension(380, 264));
        imagemArit1.setVerifyInputWhenFocusTarget(false);
        imagemArit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagemArit1ActionPerformed(evt);
            }
        });

        retornaArit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/retorna.png"))); // NOI18N
        retornaArit.setText("Retornar");
        retornaArit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornaAritActionPerformed(evt);
            }
        });

        soma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/soma.png"))); // NOI18N
        soma.setText("Soma");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        subtracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/sub.png"))); // NOI18N
        subtracao.setText("Subtração");
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        and.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        and.setText("AND");
        and.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andActionPerformed(evt);
            }
        });

        orArit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        orArit.setText("OR");
        orArit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orAritActionPerformed(evt);
            }
        });

        xorArit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        xorArit.setText("XOR");
        xorArit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xorAritActionPerformed(evt);
            }
        });

        levaTelaArit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/back.png"))); // NOI18N
        levaTelaArit.setText("Leva para a Tela");
        levaTelaArit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levaTelaAritActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(levaTelaArit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(orArit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(and, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subtracao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retornaArit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xorArit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subtracao)
                .addGap(16, 16, 16)
                .addComponent(and)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orArit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(xorArit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(retornaArit, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(levaTelaArit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        imagemArit3.setBackground(new java.awt.Color(255, 255, 255));
        imagemArit3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imagemArit3.setMaximumSize(new java.awt.Dimension(380, 264));
        imagemArit3.setMinimumSize(new java.awt.Dimension(380, 264));
        imagemArit3.setPreferredSize(new java.awt.Dimension(380, 264));

        javax.swing.GroupLayout novaJanelaLayout = new javax.swing.GroupLayout(novaJanela.getContentPane());
        novaJanela.getContentPane().setLayout(novaJanelaLayout);
        novaJanelaLayout.setHorizontalGroup(
            novaJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(novaJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(novaJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(novaJanelaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagemArit1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imagemArit2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(novaJanelaLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(imagemArit3, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        novaJanelaLayout.setVerticalGroup(
            novaJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(novaJanelaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(novaJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(novaJanelaLayout.createSequentialGroup()
                        .addGroup(novaJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemArit1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagemArit2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(imagemArit3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        novaJanela2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        novaJanela2.setLocation(new java.awt.Point(400, 200));
        novaJanela2.setMinimumSize(new java.awt.Dimension(750, 577));
        novaJanela2.setResizable(false);

        imgPass.setBackground(new java.awt.Color(255, 255, 255));
        imgPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imgPass.setMaximumSize(new java.awt.Dimension(464, 352));
        imgPass.setMinimumSize(new java.awt.Dimension(464, 352));
        imgPass.setPreferredSize(new java.awt.Dimension(464, 352));

        aplicarBanda.setText("Aplicar");
        aplicarBanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarBandaActionPerformed(evt);
            }
        });

        vermelho.setMaximum(255);
        vermelho.setMinimum(-255);
        vermelho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                vermelhoStateChanged(evt);
            }
        });

        verde.setMaximum(255);
        verde.setMinimum(-255);
        verde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                verdeStateChanged(evt);
            }
        });

        azul.setMaximum(255);
        azul.setMinimum(-255);
        azul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                azulStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vermelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(vermelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        vermelhoL.setText("0");

        verdeL.setText("0");

        azulL.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(vermelhoL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verdeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(azulL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vermelhoL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verdeL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(azulL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Vermelho");

        jLabel3.setText("Verde");

        jLabel4.setText("Azul");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aplicarBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(aplicarBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        retornaBanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/retorna.png"))); // NOI18N
        retornaBanda.setText("Cancela");
        retornaBanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornaBandaActionPerformed(evt);
            }
        });

        levaTelaBanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/back.png"))); // NOI18N
        levaTelaBanda.setText("Leva para tela");
        levaTelaBanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levaTelaBandaActionPerformed(evt);
            }
        });

        histoGrafRed2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        histoGrafRed2.setMaximumSize(new java.awt.Dimension(250, 111));
        histoGrafRed2.setMinimumSize(new java.awt.Dimension(250, 111));
        histoGrafRed2.setPreferredSize(new java.awt.Dimension(250, 111));

        javax.swing.GroupLayout histoGrafRed2Layout = new javax.swing.GroupLayout(histoGrafRed2);
        histoGrafRed2.setLayout(histoGrafRed2Layout);
        histoGrafRed2Layout.setHorizontalGroup(
            histoGrafRed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        histoGrafRed2Layout.setVerticalGroup(
            histoGrafRed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        histoGrafGreen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        histoGrafGreen2.setMaximumSize(new java.awt.Dimension(250, 111));
        histoGrafGreen2.setMinimumSize(new java.awt.Dimension(250, 111));
        histoGrafGreen2.setPreferredSize(new java.awt.Dimension(250, 111));

        javax.swing.GroupLayout histoGrafGreen2Layout = new javax.swing.GroupLayout(histoGrafGreen2);
        histoGrafGreen2.setLayout(histoGrafGreen2Layout);
        histoGrafGreen2Layout.setHorizontalGroup(
            histoGrafGreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        histoGrafGreen2Layout.setVerticalGroup(
            histoGrafGreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        histoGrafBlue2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        histoGrafBlue2.setMaximumSize(new java.awt.Dimension(250, 111));
        histoGrafBlue2.setMinimumSize(new java.awt.Dimension(250, 111));
        histoGrafBlue2.setPreferredSize(new java.awt.Dimension(250, 111));

        javax.swing.GroupLayout histoGrafBlue2Layout = new javax.swing.GroupLayout(histoGrafBlue2);
        histoGrafBlue2.setLayout(histoGrafBlue2Layout);
        histoGrafBlue2Layout.setHorizontalGroup(
            histoGrafBlue2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        histoGrafBlue2Layout.setVerticalGroup(
            histoGrafBlue2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout novaJanela2Layout = new javax.swing.GroupLayout(novaJanela2.getContentPane());
        novaJanela2.getContentPane().setLayout(novaJanela2Layout);
        novaJanela2Layout.setHorizontalGroup(
            novaJanela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(novaJanela2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(novaJanela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgPass, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(novaJanela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(levaTelaBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retornaBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histoGrafGreen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(histoGrafBlue2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(histoGrafRed2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        novaJanela2Layout.setVerticalGroup(
            novaJanela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(novaJanela2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(novaJanela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(novaJanela2Layout.createSequentialGroup()
                        .addComponent(histoGrafRed2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(histoGrafGreen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(histoGrafBlue2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgPass, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(novaJanela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(novaJanela2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(novaJanela2Layout.createSequentialGroup()
                        .addComponent(retornaBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(levaTelaBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 620));
        setMinimumSize(new java.awt.Dimension(1100, 620));
        setResizable(false);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        imagemFrame.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        imagemFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/carregar2.jpg"))); // NOI18N
        imagemFrame.setMaximumSize(new java.awt.Dimension(913, 673));
        imagemFrame.setMinimumSize(new java.awt.Dimension(913, 673));
        imagemFrame.setPreferredSize(new java.awt.Dimension(813, 673));
        imagemFrame.setVerifyInputWhenFocusTarget(false);
        imagemFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagemFrameActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros Lineares"));

        histograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/histo.png"))); // NOI18N
        histograma.setText("Histograma");
        histograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogramaActionPerformed(evt);
            }
        });

        passaBaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/loss.png"))); // NOI18N
        passaBaixa.setText("Passa Baixa");
        passaBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passaBaixaActionPerformed(evt);
            }
        });

        baixaMedia.setSelected(true);
        baixaMedia.setText("Média");
        baixaMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixaMediaActionPerformed(evt);
            }
        });

        baixaPonderada.setText("Ponderada");
        baixaPonderada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixaPonderadaActionPerformed(evt);
            }
        });

        passaAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/gain.png"))); // NOI18N
        passaAlta.setText("Passa-Alta");
        passaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passaAltaActionPerformed(evt);
            }
        });

        desfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/retorna.png"))); // NOI18N
        desfazer.setText("Desfazer");
        desfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desfazerActionPerformed(evt);
            }
        });

        laplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/comparative.png"))); // NOI18N
        laplace.setText("Laplaceano");
        laplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laplaceActionPerformed(evt);
            }
        });

        histoGrafRed.setBackground(new java.awt.Color(255, 255, 255));
        histoGrafRed.setMaximumSize(new java.awt.Dimension(100, 100));
        histoGrafRed.setPreferredSize(new java.awt.Dimension(100, 100));
        histoGrafRed.setLayout(new java.awt.BorderLayout());

        histoGrafGreen.setBackground(new java.awt.Color(255, 255, 255));
        histoGrafGreen.setMaximumSize(new java.awt.Dimension(100, 100));
        histoGrafGreen.setPreferredSize(new java.awt.Dimension(100, 100));
        histoGrafGreen.setLayout(new java.awt.BorderLayout());

        histoGrafBlue.setBackground(new java.awt.Color(255, 255, 255));
        histoGrafBlue.setMaximumSize(new java.awt.Dimension(100, 100));
        histoGrafBlue.setPreferredSize(new java.awt.Dimension(100, 100));
        histoGrafBlue.setLayout(new java.awt.BorderLayout());

        passaBanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/pass.png"))); // NOI18N
        passaBanda.setText("Passa-Banda");
        passaBanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passaBandaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(histoGrafRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(histoGrafGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(histoGrafBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passaBanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laplace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desfazer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(baixaMedia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(baixaPonderada))
                    .addComponent(passaBaixa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(histograma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(desfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(histograma)
                .addGap(18, 18, 18)
                .addComponent(passaBaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baixaMedia)
                    .addComponent(baixaPonderada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(laplace, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passaBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(histoGrafRed, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(histoGrafGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(histoGrafBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros Não Lineares"));

        roberts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/analysis-chart.png"))); // NOI18N
        roberts.setText("Roberts");
        roberts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robertsActionPerformed(evt);
            }
        });

        prewitt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/line-chart.png"))); // NOI18N
        prewitt.setText("Prewitt");
        prewitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prewittActionPerformed(evt);
            }
        });

        sobel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/linedots.png"))); // NOI18N
        sobel.setText("Sobel");
        sobel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobelActionPerformed(evt);
            }
        });

        moda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/moda.png"))); // NOI18N
        moda.setText("Moda");
        moda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modaActionPerformed(evt);
            }
        });

        mediana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/percentage.png"))); // NOI18N
        mediana.setText("Mediana");
        mediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medianaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mediana, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(moda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roberts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(prewitt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sobel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roberts, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prewitt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sobel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(moda, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mediana, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/save-icon.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        aritimetica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/editor/img/calculator.png"))); // NOI18N
        aritimetica.setText(" Aritiméticas");
        aritimetica.setMaximumSize(new java.awt.Dimension(141, 57));
        aritimetica.setMinimumSize(new java.awt.Dimension(141, 57));
        aritimetica.setPreferredSize(new java.awt.Dimension(141, 57));
        aritimetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aritimeticaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aritimetica, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(aritimetica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(salvar))
                    .addComponent(imagemFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        
        //this.setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formPropertyChange

    private void imagemFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagemFrameActionPerformed
        javax.swing.filechooser.FileFilter ft = new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "gif");
        db.addChoosableFileFilter(ft);
       int returnVal = db.showOpenDialog( this );
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION){
            java.io.File file = db.getSelectedFile();
            String file_name = file.toString( );
            
            ImageIcon imageIcon = new ImageIcon(file_name);
            Image image = imageIcon.getImage();
            Dimension imgSize = new Dimension(image.getWidth(db),image.getHeight(db) );
            Dimension boundary = new Dimension(imagemFrame.getWidth(), imagemFrame.getHeight());
            Dimension limit = getScaledDimension(imgSize, boundary);
            setNewimg1 (image.getScaledInstance(limit.width , limit.height,  java.awt.Image.SCALE_SMOOTH));
            imageIcon = new ImageIcon(getNewimg1());  
           
            imagemFrame.setIcon(imageIcon);
            
            
            Analise toMatrizG = new Analise(imageToBufferedImage(getNewimg1()));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();      
            
            
            
        }
    }//GEN-LAST:event_imagemFrameActionPerformed
    
    private void histogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogramaActionPerformed
       
        Histograma histoG = new Histograma(imageToBufferedImage(getNewimg1()));
        ImageIcon imageIcon = new ImageIcon(histoG.histo());
            Image image = imageIcon.getImage();
            imageIcon = new ImageIcon(image);
            imagemFrame.setIcon(imageIcon);
            
            
            
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for(int i = 0; i < 256; i++){
                Integer intObjRed = new Integer(histoG.getRed(i));
                Number numObjRed = (Number)intObjRed;
                dataset.addValue(numObjRed,"1", i);
            }
            DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
            for(int i = 0; i < 256; i++){
                Integer intObjGreen = new Integer(histoG.getGreen(i));
                Number numObjGreen = (Number)intObjGreen;
                dataset2.addValue(numObjGreen,"1", i);
            }
            DefaultCategoryDataset dataset3 = new DefaultCategoryDataset();
            for(int i = 0; i < 256; i++){
                Integer intObjBlue = new Integer(histoG.getBlue(i));
                Number numObjBlue = (Number)intObjBlue;
                dataset3.addValue(numObjBlue,"1", i);
            }
            
       
            JFreeChart chart = ChartFactory.createBarChart(
            "", // chart title
            "", // domain axis label
            "", // range axis label
            dataset, // data
            PlotOrientation.VERTICAL, // orientation
            false, // include legend
            false, // tooltips
            false // urls
            );
            JFreeChart chart2 = ChartFactory.createBarChart(
            "", // chart title
            "", // domain axis label
            "", // range axis label
            dataset2, // data
            PlotOrientation.VERTICAL, // orientation
            false, // include legend
            false, // tooltips
            false // urls
            );
            JFreeChart chart3 = ChartFactory.createBarChart(
            "", // chart title
            "", // domain axis label
            "", // range axis label
            dataset3, // data
            PlotOrientation.VERTICAL, // orientation
            false, // include legend
            false, // tooltips
            false // urls
            );
            chart.setBackgroundPaint(Color.white);
            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.lightGray);
            plot.setRangeGridlinePaint(Color.white);
            BarRenderer renderer = (BarRenderer) plot.getRenderer();
            renderer.setSeriesPaint(0, Color.red);
            renderer.setItemMargin(0.0);
            renderer.setDrawBarOutline(false);
            renderer.setMaximumBarWidth(0.1);
            
            chart2.setBackgroundPaint(Color.white);
            CategoryPlot plot2 = (CategoryPlot) chart2.getPlot();
            plot2.setBackgroundPaint(Color.lightGray);
            plot2.setRangeGridlinePaint(Color.white);
            BarRenderer renderer2 = (BarRenderer) plot2.getRenderer();
            renderer2.setSeriesPaint(0, Color.green);
            renderer2.setItemMargin(0.0);
            renderer2.setDrawBarOutline(false);
            renderer2.setMaximumBarWidth(0.1);
            
            chart3.setBackgroundPaint(Color.white);
            CategoryPlot plot3 = (CategoryPlot) chart3.getPlot();
            plot3.setBackgroundPaint(Color.lightGray);
            plot3.setRangeGridlinePaint(Color.white);
            BarRenderer renderer3 = (BarRenderer) plot3.getRenderer();
            renderer3.setSeriesPaint(0, Color.blue);
            renderer3.setItemMargin(0.0);
            renderer3.setDrawBarOutline(false);
            renderer3.setMaximumBarWidth(0.1);
            
            histoGrafRed.removeAll();
            ChartPanel CP = new ChartPanel(chart);
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2 = new ChartPanel(chart2);
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3 = new ChartPanel(chart3);
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
    }//GEN-LAST:event_histogramaActionPerformed

    private void passaBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passaBaixaActionPerformed
        
        if (baixaMedia.isSelected()){
            PassaBaixasMedia passaG = new PassaBaixasMedia(imageToBufferedImage(getNewimg1()));
            ImageIcon imageIcon = new ImageIcon(passaG.passa());
            Image image = imageIcon.getImage();
            imageIcon = new ImageIcon(image);
            imagemFrame.setIcon(imageIcon);
            
            Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
            
            
            
        }else{
            PassaBaixasPonderada passaG = new PassaBaixasPonderada(imageToBufferedImage(getNewimg1()));
            ImageIcon imageIcon = new ImageIcon(passaG.passa());
            Image image = imageIcon.getImage();
            imageIcon = new ImageIcon(image);
            imagemFrame.setIcon(imageIcon);
            
            Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
        }
    }//GEN-LAST:event_passaBaixaActionPerformed

    private void aritimeticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aritimeticaActionPerformed
        this.setVisible(false);
        novaJanela.setVisible(true);
            
        Image image2 = iconToImage(imagemFrame.getIcon());
        setNewimg2 (image2.getScaledInstance(imagemArit1.getWidth(), imagemArit1.getHeight(),  java.awt.Image.SCALE_SMOOTH));
        ImageIcon imageIcon2 = new ImageIcon(getNewimg2());  
        imagemArit1.setIcon(imageIcon2);
        
        
    }//GEN-LAST:event_aritimeticaActionPerformed

    private void baixaMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixaMediaActionPerformed
        if(baixaMedia.isSelected()){
            baixaPonderada.setSelected(false);
        }   
    }//GEN-LAST:event_baixaMediaActionPerformed

    private void baixaPonderadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixaPonderadaActionPerformed
        if(baixaPonderada.isSelected()){
            baixaMedia.setSelected(false);
        }   
    }//GEN-LAST:event_baixaPonderadaActionPerformed

    private void retornaAritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornaAritActionPerformed
        this.setVisible(true);
        novaJanela.setVisible(false);
            }//GEN-LAST:event_retornaAritActionPerformed

    private void imagemArit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagemArit2ActionPerformed
        
        javax.swing.filechooser.FileFilter ft = new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "gif");
        db.addChoosableFileFilter(ft);
        int returnVal = db.showOpenDialog( this );
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION){
            java.io.File file = db.getSelectedFile();
            String file_name = file.toString( );
            
            ImageIcon imageIcon = new ImageIcon(file_name);
            Image image = imageIcon.getImage();
            setNewimg3 (image.getScaledInstance(imagemArit2.getWidth(), imagemArit2.getHeight(),  java.awt.Image.SCALE_SMOOTH));
            imageIcon = new ImageIcon(getNewimg3());  
           
            imagemArit2.setIcon(imageIcon);  
        }
    }//GEN-LAST:event_imagemArit2ActionPerformed

    private void imagemArit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagemArit1ActionPerformed
    
               
        
        javax.swing.filechooser.FileFilter ft = new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "gif");
        db.addChoosableFileFilter(ft);
        int returnVal = db.showOpenDialog( this );
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION){
            java.io.File file = db.getSelectedFile();
            String file_name = file.toString( );
            
            ImageIcon imageIcon = new ImageIcon(file_name);
            Image image = imageIcon.getImage();
            setNewimg2 (image.getScaledInstance(imagemArit1.getWidth(), imagemArit1.getHeight(),  java.awt.Image.SCALE_SMOOTH));
            imageIcon = new ImageIcon(getNewimg2());  
           
            imagemArit1.setIcon(imageIcon);  
        }
    }//GEN-LAST:event_imagemArit1ActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        
        Soma somaG = new Soma(imageToBufferedImage(getNewimg2()),imageToBufferedImage(getNewimg3()));
            ImageIcon imageIcon = new ImageIcon(somaG.somaDuas());
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(imagemArit3.getWidth(), imagemArit3.getHeight(),  java.awt.Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(newimg);
            imagemArit3.setIcon(imageIcon);
        
    }//GEN-LAST:event_somaActionPerformed

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        Subtracao subtraG = new Subtracao(imageToBufferedImage(getNewimg2()),imageToBufferedImage(getNewimg3()));
            ImageIcon imageIcon = new ImageIcon(subtraG.subDuas());
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(imagemArit3.getWidth(), imagemArit3.getHeight(),  java.awt.Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(newimg);
            imagemArit3.setIcon(imageIcon);
    }//GEN-LAST:event_subtracaoActionPerformed

    private void andActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andActionPerformed
         AndArit andG = new AndArit (imageToBufferedImage(getNewimg2()),imageToBufferedImage(getNewimg3()));
            ImageIcon imageIcon = new ImageIcon(andG.andDuas());
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(imagemArit3.getWidth(), imagemArit3.getHeight(),  java.awt.Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(newimg);
            imagemArit3.setIcon(imageIcon);
    }//GEN-LAST:event_andActionPerformed

    private void orAritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orAritActionPerformed
        OrArit orG = new OrArit (imageToBufferedImage(getNewimg2()),imageToBufferedImage(getNewimg3()));
            ImageIcon imageIcon = new ImageIcon(orG.orDuas());
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(imagemArit3.getWidth(), imagemArit3.getHeight(),  java.awt.Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(newimg);
            imagemArit3.setIcon(imageIcon);
    }//GEN-LAST:event_orAritActionPerformed

    private void xorAritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xorAritActionPerformed
        XorArit xorG = new XorArit (imageToBufferedImage(getNewimg2()),imageToBufferedImage(getNewimg3()));
            ImageIcon imageIcon = new ImageIcon(xorG.xorDuas());
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(imagemArit3.getWidth(), imagemArit3.getHeight(),  java.awt.Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(newimg);
            imagemArit3.setIcon(imageIcon);
    }//GEN-LAST:event_xorAritActionPerformed

    private void levaTelaAritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levaTelaAritActionPerformed
       
                Image image = iconToImage(imagemArit3.getIcon());
        Dimension imgSize = new Dimension(imagemArit3.getWidth(),imagemArit3.getHeight() );
        Dimension boundary = new Dimension(imagemFrame.getWidth(), imagemFrame.getHeight());
        Dimension limit = getScaledDimension(imgSize, boundary);
        setNewimg1 (image.getScaledInstance(limit.width , limit.height,  java.awt.Image.SCALE_SMOOTH));
        ImageIcon imageIcon = new ImageIcon(getNewimg1());
        imagemFrame.setIcon(imageIcon);
        this.setVisible(true);
        novaJanela.setVisible(false);
    }//GEN-LAST:event_levaTelaAritActionPerformed

    private void passaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passaAltaActionPerformed
    PassaAlta passaAltaG = new PassaAlta(imageToBufferedImage(getNewimg1()));
            ImageIcon imageIcon = new ImageIcon(passaAltaG.passaAltaFiltro());
            Image image = imageIcon.getImage();
            imageIcon = new ImageIcon(image);
            imagemFrame.setIcon(imageIcon);
            
            Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
            
    }//GEN-LAST:event_passaAltaActionPerformed

    private void sobelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobelActionPerformed
        Sobel sobelG = new Sobel(imageToBufferedImage(getNewimg1()));
            ImageIcon imageIcon = new ImageIcon(sobelG.sobelArit());
            Image image = imageIcon.getImage();
            imageIcon = new ImageIcon(image);
            imagemFrame.setIcon(imageIcon);
            
            Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
            
    }//GEN-LAST:event_sobelActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        javax.swing.filechooser.FileFilter ft = new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "gif");
        db.addChoosableFileFilter(ft);
       int returnVal = db.showSaveDialog( this );
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION){
            java.io.File file = db.getSelectedFile();
            String file_name = file.toString( );
            BufferedImage bi = new BufferedImage(imagemFrame.getSize().width, imagemFrame.getSize().height, BufferedImage.TYPE_INT_ARGB); 
            Graphics g = bi.createGraphics();
            imagemFrame.paint(g);  //this == JComponent
            g.dispose();
            try{ImageIO.write(bi,"png",new File(file_name));}catch (Exception e) {}
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void robertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robertsActionPerformed
        Roberts robertsG = new Roberts(imageToBufferedImage(getNewimg1()));
            ImageIcon imageIcon = new ImageIcon(robertsG.robertsArit());
            Image image = imageIcon.getImage();
            imageIcon = new ImageIcon(image);
            imagemFrame.setIcon(imageIcon);
            
            Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
    }//GEN-LAST:event_robertsActionPerformed

    private void prewittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prewittActionPerformed
        Prewitt prewittG = new Prewitt(imageToBufferedImage(getNewimg1()));
            ImageIcon imageIcon = new ImageIcon(prewittG.prewittArit());
            Image image = imageIcon.getImage();
            imageIcon = new ImageIcon(image);
            imagemFrame.setIcon(imageIcon);
            
            Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
    }//GEN-LAST:event_prewittActionPerformed

    private void modaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modaActionPerformed
        Moda modaG = new Moda(imageToBufferedImage(getNewimg1()));
            ImageIcon imageIcon = new ImageIcon(modaG.modaFiltro());
            Image image = imageIcon.getImage();
            imageIcon = new ImageIcon(image);
            imagemFrame.setIcon(imageIcon);
            
            Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
    }//GEN-LAST:event_modaActionPerformed

    private void medianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medianaActionPerformed
        Mediana medianaG = new Mediana(imageToBufferedImage(getNewimg1()));
            ImageIcon imageIcon = new ImageIcon(medianaG.medianaFiltro());
            Image image = imageIcon.getImage();
            imageIcon = new ImageIcon(image);
            imagemFrame.setIcon(imageIcon);
            
            Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
    }//GEN-LAST:event_medianaActionPerformed

    private void desfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desfazerActionPerformed
        
        ImageIcon imageIcon = new ImageIcon();
        imageIcon = new ImageIcon(getNewimg1());  
           
            imagemFrame.setIcon(imageIcon);
            Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
    }//GEN-LAST:event_desfazerActionPerformed

    private void laplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laplaceActionPerformed
        Laplace laplaceG = new Laplace(imageToBufferedImage(getNewimg1()));
            ImageIcon imageIcon = new ImageIcon(laplaceG.laplaceFiltro());
            Image image = imageIcon.getImage();
            imageIcon = new ImageIcon(image);
            imagemFrame.setIcon(imageIcon);
            
            Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed.setLayout(new java.awt.BorderLayout());
            histoGrafRed.add(CP,BorderLayout.CENTER);
            histoGrafRed.validate();
            
            histoGrafGreen.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen.setLayout(new java.awt.BorderLayout());
            histoGrafGreen.add(CP2,BorderLayout.CENTER);
            histoGrafGreen.validate();
            
            histoGrafBlue.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue.setLayout(new java.awt.BorderLayout());
            histoGrafBlue.add(CP3,BorderLayout.CENTER);
            histoGrafBlue.validate();
    }//GEN-LAST:event_laplaceActionPerformed

    private void passaBandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passaBandaActionPerformed
        this.setVisible(false);
        novaJanela2.setVisible(true);
        
        Image image = iconToImage(imagemFrame.getIcon());
        Image img = image.getScaledInstance(imgPass.getWidth(), imgPass.getHeight(),  java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(img);  
        imgPass.setIcon(imageIcon);
        
        Image image2 = iconToImage(imagemFrame.getIcon());
            Analise toMatrizG = new Analise(imageToBufferedImage(image2));
            
            toMatrizG.toMatrix();
            
            histoGrafRed2.removeAll();
            ChartPanel CP = toMatrizG.CP;
            histoGrafRed2.setLayout(new java.awt.BorderLayout());
            histoGrafRed2.add(CP,BorderLayout.CENTER);
            histoGrafRed2.validate();
            
            histoGrafGreen2.removeAll();
            ChartPanel CP2= toMatrizG.CP2;
            histoGrafGreen2.setLayout(new java.awt.BorderLayout());
            histoGrafGreen2.add(CP2,BorderLayout.CENTER);
            histoGrafGreen2.validate();
            
            histoGrafBlue2.removeAll();
            ChartPanel CP3= toMatrizG.CP3;
            histoGrafBlue2.setLayout(new java.awt.BorderLayout());
            histoGrafBlue2.add(CP3,BorderLayout.CENTER);
            histoGrafBlue2.validate();
        
    }//GEN-LAST:event_passaBandaActionPerformed

    private void levaTelaBandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levaTelaBandaActionPerformed
        Image image = iconToImage(imgPass.getIcon());
        Dimension imgSize = new Dimension(imgPass.getWidth(),imgPass.getHeight() );
        Dimension boundary = new Dimension(imagemFrame.getWidth(), imagemFrame.getHeight());
        Dimension limit = getScaledDimension(imgSize, boundary);
        setNewimg1 (image.getScaledInstance(limit.width , limit.height,  java.awt.Image.SCALE_SMOOTH));
        ImageIcon imageIcon = new ImageIcon(getNewimg1());
        imagemFrame.setIcon(imageIcon);
        this.setVisible(true);
        novaJanela2.setVisible(false);
                    
    }//GEN-LAST:event_levaTelaBandaActionPerformed

    private void retornaBandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornaBandaActionPerformed
        novaJanela2.setVisible(false);
        this.setVisible(true);
        
    }//GEN-LAST:event_retornaBandaActionPerformed

    private void vermelhoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_vermelhoStateChanged
        vermelhoL.setText(Integer.toString(vermelho.getValue()));
        
    }//GEN-LAST:event_vermelhoStateChanged

    private void verdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_verdeStateChanged
        verdeL.setText(Integer.toString(verde.getValue()));
        
    }//GEN-LAST:event_verdeStateChanged

    private void azulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_azulStateChanged
        azulL.setText(Integer.toString(azul.getValue()));
        
    }//GEN-LAST:event_azulStateChanged

    private void aplicarBandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarBandaActionPerformed
        int red = vermelho.getValue();
        int green = verde.getValue();
        int blue = azul.getValue();
        Image image2 = iconToImage(imagemFrame.getIcon());
        PassaBanda passaBandaG = new PassaBanda(imageToBufferedImage(image2), red, green, blue);
        ImageIcon imageIcon = new ImageIcon(passaBandaG.passaBandaFiltro());
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(imgPass.getWidth(), imgPass.getHeight(),  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        imgPass.setIcon(imageIcon);
        
        Image image3 = iconToImage(imgPass.getIcon());
        Analise toMatrizG = new Analise(imageToBufferedImage(image3));

        toMatrizG.toMatrix();

        histoGrafRed2.removeAll();
        ChartPanel CP = toMatrizG.CP;
        histoGrafRed2.setLayout(new java.awt.BorderLayout());
        histoGrafRed2.add(CP,BorderLayout.CENTER);
        histoGrafRed2.validate();

        histoGrafGreen2.removeAll();
        ChartPanel CP2= toMatrizG.CP2;
        histoGrafGreen2.setLayout(new java.awt.BorderLayout());
        histoGrafGreen2.add(CP2,BorderLayout.CENTER);
        histoGrafGreen2.validate();

        histoGrafBlue2.removeAll();
        ChartPanel CP3= toMatrizG.CP3;
        histoGrafBlue2.setLayout(new java.awt.BorderLayout());
        histoGrafBlue2.add(CP3,BorderLayout.CENTER);
        histoGrafBlue2.validate();
        
    }//GEN-LAST:event_aplicarBandaActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new EditorUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton and;
    private javax.swing.JButton aplicarBanda;
    private javax.swing.JButton aritimetica;
    private javax.swing.JSlider azul;
    private javax.swing.JLabel azulL;
    private javax.swing.JRadioButton baixaMedia;
    private javax.swing.JRadioButton baixaPonderada;
    private javax.swing.JFileChooser db;
    private javax.swing.JButton desfazer;
    private javax.swing.JPanel histoGrafBlue;
    private javax.swing.JPanel histoGrafBlue2;
    private javax.swing.JPanel histoGrafGreen;
    private javax.swing.JPanel histoGrafGreen2;
    private javax.swing.JPanel histoGrafRed;
    private javax.swing.JPanel histoGrafRed2;
    private javax.swing.JButton histograma;
    private javax.swing.JButton imagemArit1;
    private javax.swing.JButton imagemArit2;
    private javax.swing.JLabel imagemArit3;
    private javax.swing.JButton imagemFrame;
    private javax.swing.JLabel imgPass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton laplace;
    private javax.swing.JButton levaTelaArit;
    private javax.swing.JButton levaTelaBanda;
    private javax.swing.JButton mediana;
    private javax.swing.JButton moda;
    private javax.swing.JFrame novaJanela;
    private javax.swing.JFrame novaJanela2;
    private javax.swing.JButton orArit;
    private javax.swing.JButton passaAlta;
    private javax.swing.JButton passaBaixa;
    private javax.swing.JButton passaBanda;
    private javax.swing.JButton prewitt;
    private javax.swing.JButton retornaArit;
    private javax.swing.JButton retornaBanda;
    private javax.swing.JButton roberts;
    private javax.swing.JButton salvar;
    private javax.swing.JButton sobel;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtracao;
    private javax.swing.JSlider verde;
    private javax.swing.JLabel verdeL;
    private javax.swing.JSlider vermelho;
    private javax.swing.JLabel vermelhoL;
    private javax.swing.JButton xorArit;
    // End of variables declaration//GEN-END:variables

   
    public Image getNewimg1() {
        return newimg1;
    }

  
    public void setNewimg1(Image newimg1) {
        this.newimg1 = newimg1;
    }
    
    public Image getNewimg2() {
        return newimg2;
    }

  
    public void setNewimg2(Image newimg2) {
        this.newimg2 = newimg2;
    }
    
    public Image getNewimg3() {
        return newimg3;
    }
    public void setNewimg4(Image newimg2) {
        this.newimg2 = newimg2;
    }
    
    public Image getNewimg4() {
        return newimg3;
    }

 
    public void setNewimg3(Image newimg3) {
        this.newimg3 = newimg3;
    }
    
    static Image iconToImage(Icon icon) {
          if (icon instanceof ImageIcon) {
              return ((ImageIcon)icon).getImage();
          } else {
              int w = icon.getIconWidth();
              int h = icon.getIconHeight();
              GraphicsEnvironment ge = 
                GraphicsEnvironment.getLocalGraphicsEnvironment();
              GraphicsDevice gd = ge.getDefaultScreenDevice();
              GraphicsConfiguration gc = gd.getDefaultConfiguration();
              BufferedImage image = gc.createCompatibleImage(w, h);
              Graphics2D g = image.createGraphics();
              icon.paintIcon(null, g, 0, 0);
              g.dispose();
              return image;
          }
      }
    
     public BufferedImage imageToBufferedImage(Image im) {
     BufferedImage bi = new BufferedImage
    (im.getWidth(null),im.getHeight(null),BufferedImage.TYPE_INT_RGB);
     Graphics bg = bi.getGraphics();
     bg.drawImage(im, 0, 0, null);
     bg.dispose();
     return bi;
  }
   
 public static Dimension getScaledDimension(Dimension imgSize, Dimension boundary) {

    int original_width = imgSize.width;
    int original_height = imgSize.height;
    int bound_width = boundary.width;
    int bound_height = boundary.height;
    int new_width = original_width;
    int new_height = original_height;

    // first check if we need to scale width
    if (original_width > bound_width) {
        //scale width to fit
        new_width = bound_width;
        //scale height to maintain aspect ratio
        new_height = (new_width * original_height) / original_width;
    }

    // then check if we need to scale even with the new height
    if (new_height > bound_height) {
        //scale height to fit instead
        new_height = bound_height;
        //scale width to maintain aspect ratio
        new_width = (new_height * original_width) / original_height;
    }

    return new Dimension(new_width, new_height);
}

   
 
}
