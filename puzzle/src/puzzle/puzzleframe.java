 package puzzle;

public class puzzleframe extends javax.swing.JFrame{
    public puzzleframe() {
         component();
    }
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn1b;
    private javax.swing.JButton btn2b;
    private javax.swing.JButton btn3b;
    private javax.swing.JButton btn4b;
    private javax.swing.JButton btn5b;
    private javax.swing.JButton btn6b;
    private javax.swing.JButton btn7b;
    private javax.swing.JButton btn8b;
    private javax.swing.JButton btn9b;
    private javax.swing.JButton btn10b;
    private javax.swing.JButton btn11b;
    private javax.swing.JButton btn12b;
    private javax.swing.JButton btn13b;
    private javax.swing.JButton btn14b;
    private javax.swing.JButton btn15b;
    private javax.swing.JButton btn16b;
    private javax.swing.JButton btn1c;
    private javax.swing.JButton btn2c;
    private javax.swing.JButton btn3c;
    private javax.swing.JButton btn4c;
    private javax.swing.JButton btn5c;
    private javax.swing.JButton btn6c;
    private javax.swing.JButton btn7c;
    private javax.swing.JButton btn8c;
    private javax.swing.JButton btn9c;
    private javax.swing.JButton btn10c;
    private javax.swing.JButton btn11c;
    private javax.swing.JButton btn12c;
    private javax.swing.JButton btn13c;
    private javax.swing.JButton btn14c;
    private javax.swing.JButton btn15c;
    private javax.swing.JButton btn16c;
    private javax.swing.JButton btn17c;
    private javax.swing.JButton btn18c;
    private javax.swing.JButton btn19c;
    private javax.swing.JButton btn20c;
    private javax.swing.JButton btn21c;
    private javax.swing.JButton btn22c;
    private javax.swing.JButton btn23c;
    private javax.swing.JButton btn24c;
    private javax.swing.JButton btn25c;
    private javax.swing.JLabel newgame;
    private javax.swing.JLabel girl;
    private javax.swing.JLabel about;
    private javax.swing.JLabel help;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel easy;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel jungle;
    private javax.swing.JLabel level;
     
    private void component(){
        panel = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        panel4 = new javax.swing.JPanel();
        panel5 = new javax.swing.JPanel();
        panel6 = new javax.swing.JPanel();
        panel7 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn1b = new javax.swing.JButton();
        btn2b = new javax.swing.JButton();
        btn3b = new javax.swing.JButton();
        btn4b = new javax.swing.JButton();
        btn5b = new javax.swing.JButton();
        btn6b = new javax.swing.JButton();
        btn7b = new javax.swing.JButton();
        btn8b = new javax.swing.JButton();
        btn9b = new javax.swing.JButton();
        btn10b = new javax.swing.JButton();
        btn11b = new javax.swing.JButton();
        btn12b = new javax.swing.JButton();
        btn13b = new javax.swing.JButton();
        btn14b = new javax.swing.JButton();
        btn15b = new javax.swing.JButton();
        btn16b = new javax.swing.JButton();
        btn1c = new javax.swing.JButton();
        btn2c = new javax.swing.JButton();
        btn3c = new javax.swing.JButton();
        btn4c = new javax.swing.JButton();
        btn5c= new javax.swing.JButton();
        btn6c = new javax.swing.JButton();
        btn7c = new javax.swing.JButton();
        btn8c = new javax.swing.JButton();
        btn9c = new javax.swing.JButton();
        btn10c = new javax.swing.JButton();
        btn11c = new javax.swing.JButton();
        btn12c= new javax.swing.JButton();
        btn13c = new javax.swing.JButton();
        btn14c = new javax.swing.JButton();
        btn15c = new javax.swing.JButton();
        btn16c = new javax.swing.JButton();
        btn17c= new javax.swing.JButton();
        btn18c= new javax.swing.JButton();
        btn19c = new javax.swing.JButton();
        btn20c = new javax.swing.JButton();
        btn21c = new javax.swing.JButton();
        btn22c = new javax.swing.JButton();
        btn23c = new javax.swing.JButton();
        btn24c = new javax.swing.JButton();
        btn25c = new javax.swing.JButton();
        newgame = new javax.swing.JLabel();
        girl = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        easy = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        jungle = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
         
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("puzzle");
        btn1.setEnabled(false);
        btn1b.setEnabled(false);
        btn1c.setEnabled(false);
        panel.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
        panel7.setVisible(false);
        
        addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               bKeypressed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn1Keypressed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn2Keypressed(evt);
            }
        });
        btn3.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn3Keypressed(evt);
            }
        });
        btn4.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn4Keypressed(evt);
            }
        });
        btn5.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn5Keypressed(evt);
            }
        });
        btn6.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn6Keypressed(evt);
            }
        });
        btn7.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn7Keypressed(evt);
            }
        });
        btn8.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn8Keypressed(evt);
            }
        });
        btn9.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn9Keypressed(evt);
            }
        });
        btn1b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn1bKeypressed(evt);
            }
        });
        btn2b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn2bKeypressed(evt);
            }
        });
        btn3b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn3bKeypressed(evt);
            }
        });
        btn4b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn4bKeypressed(evt);
            }
        });
        btn5b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn5bKeypressed(evt);
            }
        });
        btn6b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn6bKeypressed(evt);
            }
        });
        btn7b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn7bKeypressed(evt);
            }
        });
        btn8b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn8bKeypressed(evt);
            }
        });
        btn9b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn9bKeypressed(evt);
            }
        });
        btn10b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn10bKeypressed(evt);
            }
        });
        btn11b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn11bKeypressed(evt);
            }
        });
        btn12b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn12bKeypressed(evt);
            }
        });
        btn13b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn13bKeypressed(evt);
            }
        });
        btn14b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn14bKeypressed(evt);
            }
        });
        btn15b.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn15bKeypressed(evt);
            }
        });
        btn1c.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
               btn16bKeypressed(evt);
            }
        });
         newgame.setFont(new java.awt.Font("Tahoma",1,30));
         newgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new2.jpg")));
         newgame.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 newgameMouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 newgameMouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 newgameMouseexited(evt);
             }
         });
         girl.setFont(new java.awt.Font("Tahoma",1,30));
         girl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medium.jpg")));
         girl.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 girlMouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 girlMouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 girlMouseexited(evt);
             }
         });
         about.setFont(new java.awt.Font("Tahoma",1,30));
         about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/about2.jpg")));
         about.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 aboutMouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 aboutMouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 aboutMouseexited(evt);
             }
         });
         help.setFont(new java.awt.Font("Tahoma",1,30));
         help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/help2.jpg")));
         help.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 helpMouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 helpMouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 helpMouseexited(evt);
             }
         });
         level.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/level2.jpg")));
         level.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 levelMouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 levelMouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 levelMouseexited(evt);
             }
         });
         easy.setFont(new java.awt.Font("Tahoma",1,30));
         easy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/easy.jpg")));
         easy.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 easyMouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 easyMouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 easyMouseexited(evt);
             }
         });
         jungle.setFont(new java.awt.Font("Tahoma",1,30));
         jungle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hard.jpg")));
         jungle.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 jungleMouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 jungleMouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 jungleMouseexited(evt);
             }
         });
        label5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/vvv.jpg")));
        label7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/vvv.jpg")));
        label8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ss.jpg")));
        label8.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 label8MouseClicked(evt); 
             }
         });
        label9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ss4.jpg")));
        label9.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 label9MouseClicked(evt); 
             }
         });
        image();
        
        javax.swing.GroupLayout layout2 = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(layout2);
        layout2.setHorizontalGroup(
           layout2.createParallelGroup()
              .addGroup(layout2.createSequentialGroup() 
                      .addGap(0)
                 .addGroup(layout2.createParallelGroup()
                   .addComponent(label5) 
                   .addComponent(newgame)
                   .addComponent(about)
                   .addComponent(help)
                   
                )) 
        );
        layout2.setVerticalGroup(
           layout2.createParallelGroup()
                .addGroup(layout2.createSequentialGroup()
                    .addComponent(label5)
                    .addComponent(newgame)
                    .addComponent(about)
                    .addComponent(help)
                ) 
        );
        javax.swing.GroupLayout layout3 = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(layout3);
        layout3.setHorizontalGroup(
           layout3.createParallelGroup()
              .addGroup(layout3.createSequentialGroup() 
                      .addGap(0)
                 .addGroup(layout3.createParallelGroup()
                   .addComponent(label7)
                   .addComponent(easy)
                   .addComponent(girl)
                   .addComponent(jungle)
                ))
        );
        layout3.setVerticalGroup(
           layout3.createParallelGroup()
                .addGroup(layout3.createSequentialGroup()
                    .addComponent(label7)      
                   .addComponent(easy)
                   .addComponent(girl)
                    .addComponent(jungle))
        );
        javax.swing.GroupLayout layout4 = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(layout4);
        layout4.setHorizontalGroup(
           layout4.createParallelGroup()
              .addGroup(layout4.createSequentialGroup()
                   .addComponent(label8) 
                ) 
        );
        layout4.setVerticalGroup(
           layout4.createParallelGroup()
                .addGroup(layout4.createSequentialGroup()
                    .addComponent(label8)
                )
        );
        javax.swing.GroupLayout layout5 = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(layout5);
        layout5.setHorizontalGroup(
           layout5.createParallelGroup()
              .addGroup(layout5.createSequentialGroup() 
                      .addGap(0)
                 .addGroup(layout5.createParallelGroup()
                   .addComponent(label9) 
                )) 
        );
        layout5.setVerticalGroup(
           layout5.createParallelGroup()
                .addGroup(layout5.createSequentialGroup()
                  .addComponent(label9)
                )
        );
         
        javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(panel);
        panel.setLayout(layout1);
        layout1.setHorizontalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout1.createParallelGroup()
                     .addGroup(layout1.createSequentialGroup()
                            .addComponent(btn1,100,160,160)
                            .addComponent(btn2,100,160,160)
                            .addComponent(btn3,100,160,160)
                     )
                     .addGroup(layout1.createSequentialGroup()
                            .addComponent(btn4,100,160,160)
                            .addComponent(btn5,100,160,160)
                            .addComponent(btn6,100,160,160)
                     )
                     .addGroup(layout1.createSequentialGroup()
                            .addComponent(btn7,100,160,160)
                            .addComponent(btn8,100,160,160)
                            .addComponent(btn9,100,160,160)
                            
                     )
                )
               
        );
        layout1.setVerticalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout1.createParallelGroup()
                    .addGroup(layout1.createSequentialGroup()
                            .addComponent(btn1,100,160,160)
                            .addComponent(btn4,100,160,160)
                            .addComponent(btn7,100,160,160)
                     )
                     .addGroup(layout1.createSequentialGroup()
                            .addComponent(btn2,100,160,160)
                            .addComponent(btn5,100,160,160)
                            .addComponent(btn8,100,160,160)
                     )
                     .addGroup(layout1.createSequentialGroup()
                            .addComponent(btn3,100,160,160)
                            .addComponent(btn6,100,160,160)
                            .addComponent(btn9,100,160,160)
                            
                     )
                )
                
        );
        javax.swing.GroupLayout layout6 = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(layout6);
        layout6.setHorizontalGroup(
            layout6.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout6.createParallelGroup()
                     .addGroup(layout6.createSequentialGroup()
                            .addComponent(btn1b,120,120,120)
                            .addComponent(btn2b,120,120,120)
                            .addComponent(btn3b,120,120,120)
                            .addComponent(btn4b,120,120,120)
                     )
                     .addGroup(layout6.createSequentialGroup()
                            .addComponent(btn5b,120,120,120)
                            .addComponent(btn6b,120,120,120)
                            .addComponent(btn7b,120,120,120)
                            .addComponent(btn8b,120,120,120)
                     )
                     .addGroup(layout6.createSequentialGroup()
                            .addComponent(btn9b,120,120,120)
                            .addComponent(btn10b,120,120,120)
                            .addComponent(btn11b,120,120,120)
                            .addComponent(btn12b,120,120,120)
                            
                     )
                     .addGroup(layout6.createSequentialGroup()
                            .addComponent(btn13b,120,120,120)
                            .addComponent(btn14b,120,120,120)
                            .addComponent(btn15b,120,120,120)
                            .addComponent(btn16b,120,120,120)
                            
                     )
                )
               
        );
        layout6.setVerticalGroup(
            layout6.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout6.createParallelGroup()
                    .addGroup(layout6.createSequentialGroup()
                            .addComponent(btn1b,120,120,120)
                            .addComponent(btn5b,120,120,120)
                            .addComponent(btn9b,120,120,120)
                            .addComponent(btn13b,120,120,120)
                     )
                     .addGroup(layout6.createSequentialGroup()
                            .addComponent(btn2b,120,120,120)
                            .addComponent(btn6b,120,120,120)
                            .addComponent(btn10b,120,120,120)
                            .addComponent(btn14b,120,120,120)
                     )
                     .addGroup(layout6.createSequentialGroup()
                            .addComponent(btn3b,120,120,120)
                            .addComponent(btn7b,120,120,120)
                            .addComponent(btn11b,120,120,120)
                            .addComponent(btn15b,120,120,120)
                            
                     )
                     .addGroup(layout6.createSequentialGroup()
                            .addComponent(btn4b,120,120,120)
                            .addComponent(btn8b,120,120,120)
                            .addComponent(btn12b,120,120,120)
                            .addComponent(btn16b,120,120,120)
                            
                     )
                )
                
        );
        javax.swing.GroupLayout layout7 = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(layout7);
        layout7.setHorizontalGroup(
            layout7.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout7.createParallelGroup()
                     .addGroup(layout7.createSequentialGroup()
                            .addComponent(btn1c,96,96,96)
                            .addComponent(btn2c,96,96,96)
                            .addComponent(btn3c,96,96,96)
                            .addComponent(btn4c,96,96,96)
                            .addComponent(btn5c,96,96,96)
                     )
                     .addGroup(layout7.createSequentialGroup()
                            .addComponent(btn6c,96,96,96)
                            .addComponent(btn7c,96,96,96)
                            .addComponent(btn8c,96,96,96)
                            .addComponent(btn9c,96,96,96)
                            .addComponent(btn10c,96,96,96)
                     )
                     .addGroup(layout7.createSequentialGroup()
                            .addComponent(btn11c,96,96,96)
                            .addComponent(btn12c,96,96,96)
                            .addComponent(btn13c,96,96,96)
                            .addComponent(btn14c,96,96,96)
                            .addComponent(btn15c,96,96,96)
                            
                     )
                     .addGroup(layout7.createSequentialGroup()
                            .addComponent(btn16c,96,96,96)
                            .addComponent(btn17c,96,96,96)
                            .addComponent(btn18c,96,96,96)
                            .addComponent(btn19c,96,96,96)
                            .addComponent(btn20c,96,96,96)
                            
                     )
                     .addGroup(layout7.createSequentialGroup()
                            .addComponent(btn21c,96,96,96)
                            .addComponent(btn22c,96,96,96)
                            .addComponent(btn23c,96,96,96)
                            .addComponent(btn24c,96,96,96)
                            .addComponent(btn25c,96,96,96)
                     )
                )
               
        );
        layout7.setVerticalGroup(
            layout7.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout7.createParallelGroup()
                    .addGroup(layout7.createSequentialGroup()
                            .addComponent(btn1c,96,96,96)
                            .addComponent(btn6c,96,96,96)
                            .addComponent(btn11c,96,96,96)
                            .addComponent(btn16c,96,96,96)
                            .addComponent(btn21c,96,96,96)
                     )
                     .addGroup(layout7.createSequentialGroup()
                            .addComponent(btn2c,96,96,96)
                            .addComponent(btn7c,96,96,96)
                            .addComponent(btn12c,96,96,96)
                            .addComponent(btn17c,96,96,96)
                            .addComponent(btn22c,96,96,96)
                     )
                     .addGroup(layout7.createSequentialGroup()
                            .addComponent(btn3c,96,96,96)
                            .addComponent(btn8c,96,96,96)
                            .addComponent(btn13c,96,96,96)
                            .addComponent(btn18c,96,96,96)
                            .addComponent(btn23c,96,96,96)
                            
                     )
                     .addGroup(layout7.createSequentialGroup()
                            .addComponent(btn4c,96,96,96)
                            .addComponent(btn9c,96,96,96)
                            .addComponent(btn14c,96,96,96)
                            .addComponent(btn19c,96,96,96)
                            .addComponent(btn24c,96,96,96)
                     )
                     .addGroup(layout7.createSequentialGroup()
                            .addComponent(btn5c,96,96,96)
                            .addComponent(btn10c,96,96,96)
                            .addComponent(btn15c,96,96,96)
                            .addComponent(btn20c,96,96,96)
                            .addComponent(btn25c,96,96,96)
                     )
                )
                
        );
       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
          layout.createParallelGroup()
             .addComponent(panel)
             .addComponent(panel2,480,480,480)
            .addComponent(panel3)
             .addComponent(panel4)
             .addComponent(panel5)
             .addComponent(panel6)
             .addComponent(panel7)
       );
       layout.setVerticalGroup(
          layout.createParallelGroup()
             .addComponent(panel)
             .addComponent(panel2,480,480,480)
             .addComponent(panel3)
             .addComponent(panel4)
             .addComponent(panel5)
             .addComponent(panel6)
             .addComponent(panel7)
       );
    pack();
    }
  public void image(){
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a1.jpg"))); 
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a2.jpg")));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a3.jpg")));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a4.jpg")));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a5.jpg")));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a6.jpg")));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a7.jpg")));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a8.jpg")));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a9.jpg")));
  }
   public void image2(){
        btn1b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s1.jpg"))); 
        btn7b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s2.jpg")));
        btn14b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s3.jpg")));
        btn16b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s4.jpg")));
        btn2b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s5.jpg")));
        btn8b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s6.jpg")));
        btn10b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s7b.jpg")));
        btn15b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s8.jpg")));
        btn12b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s9.jpg")));
        btn5b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s10.jpg")));
        btn4b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s11.jpg")));
        btn9b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s12.jpg")));
        btn13b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s13.jpg")));
        btn11b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s14.jpg")));
        btn6b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s15.jpg")));
        btn3b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s16.jpg")));
  }
  public void image3(){
       btn1c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c1.jpg")));
       btn7c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c2.jpg"))); 
       btn3c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c3.jpg"))); 
       btn19c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c4.jpg"))); 
       btn18c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c5.jpg"))); 
       btn14c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c6.jpg"))); 
       btn17c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c7.jpg"))); 
       btn13c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c8.jpg"))); 
       btn16c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c9.jpg"))); 
       btn5c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c10.jpg"))); 
       btn6c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c11.jpg"))); 
       btn12c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c12.jpg"))); 
       btn22c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c13.jpg"))); 
       btn23c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c14.jpg"))); 
       btn9c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c15.jpg"))); 
       btn8c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c16.jpg"))); 
       btn15c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c17.jpg"))); 
       btn4c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c18.jpg"))); 
       btn20c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c19.jpg"))); 
       btn24c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c20.jpg"))); 
       btn11c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c21.jpg"))); 
       btn21c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c22.jpg"))); 
       btn2c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c23.jpg"))); 
       btn25c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c24.jpg"))); 
       btn10c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c25.jpg"))); 
  } 
   
   int a2,a3,a4,a5,a6,a7,a8,a9=0,a1=1;
    int b9,b2,b3,b4,b5,b6,b7,b8,b10,b11,b12,b13,b14,b15,b16=0,b1=1;
    int c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25=0,c1=1;
  public void newgameMouseClicked(java.awt.event.MouseEvent evt){
            panel2.setVisible(false); panel3.setVisible(true);
  }
  public void newgameMouseentered(java.awt.event.MouseEvent evt){
       newgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new1.jpg")));
  }
  public void newgameMouseexited(java.awt.event.MouseEvent evt){
       newgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new2.jpg")));
  }
  public void girlMouseClicked(java.awt.event.MouseEvent evt){
        image2();
        panel3.setVisible(false); panel6.setVisible(true);
  }
  public void girlMouseentered(java.awt.event.MouseEvent evt){
       girl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medium2.jpg")));
  }
  public void girlMouseexited(java.awt.event.MouseEvent evt){
       girl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medium.jpg")));
  }
  public void aboutMouseClicked(java.awt.event.MouseEvent evt){
       panel2.setVisible(false); panel4.setVisible(true);
  }
  public void aboutMouseentered(java.awt.event.MouseEvent evt){
       about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/about1.jpg")));
  }
  public void aboutMouseexited(java.awt.event.MouseEvent evt){
       about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/about2.jpg")));
  }
  public void helpMouseClicked(java.awt.event.MouseEvent evt){
       panel2.setVisible(false); panel5.setVisible(true);
  }
  public void helpMouseentered(java.awt.event.MouseEvent evt){
       help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/help1.jpg")));
  }
  public void helpMouseexited(java.awt.event.MouseEvent evt){
       help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/help2.jpg")));
  }
  public void levelMouseClicked(java.awt.event.MouseEvent evt){
       panel2.setVisible(false); panel3.setVisible(true);
  }
  public void levelMouseentered(java.awt.event.MouseEvent evt){
       level.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/level1.jpg")));
  }
  public void levelMouseexited(java.awt.event.MouseEvent evt){
       level.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/level2.jpg")));
  }
  public void easyMouseClicked(java.awt.event.MouseEvent evt){
       panel3.setVisible(false); panel.setVisible(true);
  }
  public void easyMouseentered(java.awt.event.MouseEvent evt){
       easy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/easy2.jpg")));
  }
  public void easyMouseexited(java.awt.event.MouseEvent evt){
       easy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/easy.jpg")));
  }
  public void jungleMouseClicked(java.awt.event.MouseEvent evt){
      image3();
       panel3.setVisible(false); panel7.setVisible(true);
  }
  public void jungleMouseentered(java.awt.event.MouseEvent evt){
       jungle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hard2.jpg")));
  }
  public void jungleMouseexited(java.awt.event.MouseEvent evt){
       jungle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hard.jpg")));
  }
  public void label9MouseClicked(java.awt.event.MouseEvent evt){
       panel5.setVisible(false); panel2.setVisible(true);
  }
  public void label8MouseClicked(java.awt.event.MouseEvent evt){
       panel4.setVisible(false); panel2.setVisible(true);
  }
  
  public void bKeypressed(java.awt.event.KeyEvent evt){
    key(evt.getKeyCode());
    key2(evt.getKeyCode());
    key3(evt.getKeyCode());
  }
  public void btn1Keypressed(java.awt.event.KeyEvent evt){
    key(evt.getKeyCode());
  }
  public void btn2Keypressed(java.awt.event.KeyEvent evt){
     key(evt.getKeyCode());
  } 
  public void btn3Keypressed(java.awt.event.KeyEvent evt){
     key(evt.getKeyCode());
  } 
  public void btn4Keypressed(java.awt.event.KeyEvent evt){
     key(evt.getKeyCode());
  } 
  public void btn5Keypressed(java.awt.event.KeyEvent evt){
     key(evt.getKeyCode());
  } 
  public void btn6Keypressed(java.awt.event.KeyEvent evt){
     key(evt.getKeyCode());
  } 
  public void btn7Keypressed(java.awt.event.KeyEvent evt){
     key(evt.getKeyCode());
  } 
  public void btn8Keypressed(java.awt.event.KeyEvent evt){
     key(evt.getKeyCode());
  } 
  public void btn9Keypressed(java.awt.event.KeyEvent evt){
     key(evt.getKeyCode());
  }
  public void btn1bKeypressed(java.awt.event.KeyEvent evt){
    key2(evt.getKeyCode());
  }
  public void btn2bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn3bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn4bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn5bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn6bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn7bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn8bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn9bKeypressed(java.awt.event.KeyEvent evt){
    key2(evt.getKeyCode());
  }
  public void btn10bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn11bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn12bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn13bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn14bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn15bKeypressed(java.awt.event.KeyEvent evt){
     key2(evt.getKeyCode());
  } 
  public void btn16bKeypressed(java.awt.event.KeyEvent evt){
     key3(evt.getKeyCode());
  } 
  public void key(int key){ 
     if(key==37){
             if(a1==1){btn1.setEnabled(true);btn2.setEnabled(false); btn1.setIcon(btn2.getIcon());a1=0; a2=1;}
        else if(a2==1){btn2.setEnabled(true);btn3.setEnabled(false); btn2.setIcon(btn3.getIcon());a2=0; a3=1;}
        else if(a3==1){}
        else if(a4==1){btn4.setEnabled(true);btn5.setEnabled(false); btn4.setIcon(btn5.getIcon());a4=0; a5=1;}
        else if(a5==1){btn5.setEnabled(true);btn6.setEnabled(false); btn5.setIcon(btn6.getIcon());a5=0; a6=1;}
        else if(a6==1){}
        else if(a7==1){btn7.setEnabled(true);btn8.setEnabled(false); btn7.setIcon(btn8.getIcon());a7=0; a8=1;}
        else if(a8==1){btn8.setEnabled(true);btn9.setEnabled(false); btn8.setIcon(btn9.getIcon());a8=0; a9=1;}
        else if(a9==1){}
     }else if(key==38){
             if(a1==1){btn1.setEnabled(true);btn4.setEnabled(false); btn1.setIcon(btn4.getIcon());a1=0; a4=1;}
        else if(a2==1){btn2.setEnabled(true);btn5.setEnabled(false); btn2.setIcon(btn5.getIcon());a2=0; a5=1;}
        else if(a3==1){btn3.setEnabled(true);btn6.setEnabled(false); btn3.setIcon(btn6.getIcon());a3=0; a6=1;}
        else if(a4==1){btn4.setEnabled(true);btn7.setEnabled(false); btn4.setIcon(btn7.getIcon());a4=0; a7=1;}
        else if(a5==1){btn5.setEnabled(true);btn8.setEnabled(false); btn5.setIcon(btn8.getIcon());a5=0; a8=1;}
        else if(a6==1){btn6.setEnabled(true);btn9.setEnabled(false); btn6.setIcon(btn9.getIcon());a6=0; a9=1;}
        else if(a7==1){}
        else if(a8==1){}
        else if(a9==1){}
     }else if(key==39){
             if(a1==1){}
        else if(a2==1){btn2.setEnabled(true);btn1.setEnabled(false); btn2.setIcon(btn1.getIcon());a2=0; a1=1;}
        else if(a3==1){btn3.setEnabled(true);btn2.setEnabled(false); btn3.setIcon(btn2.getIcon());a3=0; a2=1;}
        else if(a4==1){}
        else if(a5==1){btn5.setEnabled(true);btn4.setEnabled(false); btn5.setIcon(btn4.getIcon());a5=0; a4=1;}
        else if(a6==1){btn6.setEnabled(true);btn5.setEnabled(false); btn6.setIcon(btn5.getIcon());a6=0; a5=1;}
        else if(a7==1){}
        else if(a8==1){btn8.setEnabled(true);btn7.setEnabled(false); btn8.setIcon(btn7.getIcon());a8=0; a7=1;}
        else if(a9==1){btn9.setEnabled(true);btn8.setEnabled(false); btn9.setIcon(btn8.getIcon());a9=0; a8=1;}
     }else if(key==40){
             if(a1==1){}
        else if(a2==1){}
        else if(a3==1){}
        else if(a4==1){btn4.setEnabled(true);btn1.setEnabled(false); btn4.setIcon(btn1.getIcon());a4=0; a1=1;}
        else if(a5==1){btn5.setEnabled(true);btn2.setEnabled(false); btn5.setIcon(btn2.getIcon());a5=0; a2=1;}
        else if(a6==1){btn6.setEnabled(true);btn3.setEnabled(false); btn6.setIcon(btn3.getIcon());a6=0; a3=1;}
        else if(a7==1){btn7.setEnabled(true);btn4.setEnabled(false); btn7.setIcon(btn4.getIcon());a7=0; a4=1;}
        else if(a8==1){btn8.setEnabled(true);btn5.setEnabled(false); btn8.setIcon(btn5.getIcon());a8=0; a5=1;}
        else if(a9==1){btn9.setEnabled(true);btn6.setEnabled(false); btn9.setIcon(btn6.getIcon());a9=0; a6=1;}
     }else{System.out.println("m");}
  }
  public void key2(int key){
     
     if(key==37){
             if(b1==1){btn1b.setEnabled(true);btn2b.setEnabled(false); btn1b.setIcon(btn2b.getIcon());b1=0; b2=1;}
        else if(b2==1){btn2b.setEnabled(true);btn3b.setEnabled(false); btn2b.setIcon(btn3b.getIcon());b2=0; b3=1;}
        else if(b3==1){btn3b.setEnabled(true);btn4b.setEnabled(false); btn3b.setIcon(btn4b.getIcon());b3=0; b4=1;}
        else if(b4==1){}
        else if(b5==1){btn5b.setEnabled(true);btn6b.setEnabled(false); btn5b.setIcon(btn6b.getIcon());b5=0; b6=1;}
        else if(b6==1){btn6b.setEnabled(true);btn7b.setEnabled(false); btn6b.setIcon(btn7b.getIcon());b6=0; b7=1;}
        else if(b7==1){btn7b.setEnabled(true);btn8b.setEnabled(false); btn7b.setIcon(btn8b.getIcon());b7=0; b8=1;}
        else if(b8==1){}
        else if(b9==1){btn9b.setEnabled(true);btn10b.setEnabled(false); btn9b.setIcon(btn10b.getIcon());b9=0; b10=1;}
        else if(b10==1){btn10b.setEnabled(true);btn11b.setEnabled(false); btn10b.setIcon(btn11b.getIcon());b10=0; b11=1;}
        else if(b11==1){btn11b.setEnabled(true);btn12b.setEnabled(false); btn11b.setIcon(btn12b.getIcon());b11=0; b12=1;}
        else if(b12==1){}
        else if(b13==1){btn13b.setEnabled(true);btn14b.setEnabled(false); btn13b.setIcon(btn14b.getIcon());b13=0; b14=1;}
        else if(b14==1){btn14b.setEnabled(true);btn15b.setEnabled(false); btn14b.setIcon(btn15b.getIcon());b14=0; b15=1;}
        else if(b15==1){btn15b.setEnabled(true);btn16b.setEnabled(false); btn15b.setIcon(btn16b.getIcon());b15=0; b16=1;}
        else if(b16==1){}
     }else if(key==38){
             if(b1==1){btn1b.setEnabled(true);btn5b.setEnabled(false); btn1b.setIcon(btn5b.getIcon());b1=0; b5=1;}
        else if(b2==1){btn2b.setEnabled(true);btn6b.setEnabled(false); btn2b.setIcon(btn6b.getIcon());b2=0; b6=1;}
        else if(b3==1){btn3b.setEnabled(true);btn7b.setEnabled(false); btn3b.setIcon(btn7b.getIcon());b3=0; b7=1;}
        else if(b4==1){btn4b.setEnabled(true);btn8b.setEnabled(false); btn4b.setIcon(btn8b.getIcon());b4=0; b8=1;}
        else if(b5==1){btn5b.setEnabled(true);btn9b.setEnabled(false); btn5b.setIcon(btn9b.getIcon());b5=0; b9=1;}
        else if(b6==1){btn6b.setEnabled(true);btn10b.setEnabled(false); btn6b.setIcon(btn10b.getIcon());b6=0; b10=1;}
        else if(b7==1){btn7b.setEnabled(true);btn11b.setEnabled(false); btn7b.setIcon(btn11b.getIcon());b7=0; b11=1;}
        else if(b8==1){btn8b.setEnabled(true);btn12b.setEnabled(false); btn8b.setIcon(btn12b.getIcon());b8=0; b12=1;}
        else if(b9==1){btn9b.setEnabled(true);btn13b.setEnabled(false); btn9b.setIcon(btn13b.getIcon());b9=0; b13=1;}
        else if(b10==1){btn10b.setEnabled(true);btn14b.setEnabled(false); btn10b.setIcon(btn14b.getIcon());b10=0; b14=1;}
        else if(b11==1){btn11b.setEnabled(true);btn15b.setEnabled(false); btn11b.setIcon(btn15b.getIcon());b11=0; b15=1;}
        else if(b12==1){btn12b.setEnabled(true);btn16b.setEnabled(false); btn12b.setIcon(btn16b.getIcon());b12=0; b16=1;}
        else if(b13==1){}
        else if(b14==1){}
        else if(b15==1){}
        else if(b16==1){}
     }else if(key==39){
             if(b1==1){}
        else if(b2==1){btn2b.setEnabled(true);btn1b.setEnabled(false); btn2b.setIcon(btn1b.getIcon());b2=0; b1=1;}
        else if(b3==1){btn3b.setEnabled(true);btn2b.setEnabled(false); btn3b.setIcon(btn2b.getIcon());b3=0; b2=1;}
        else if(b4==1){btn4b.setEnabled(true);btn3b.setEnabled(false); btn4b.setIcon(btn3b.getIcon());b4=0; b3=1;}
        else if(b5==1){}
        else if(b6==1){btn6b.setEnabled(true);btn5b.setEnabled(false); btn6b.setIcon(btn5b.getIcon());b6=0; b5=1;}
        else if(b7==1){btn7b.setEnabled(true);btn6b.setEnabled(false); btn7b.setIcon(btn6b.getIcon());b7=0; b6=1;}
        else if(b8==1){btn8b.setEnabled(true);btn7b.setEnabled(false); btn8b.setIcon(btn7b.getIcon());b8=0; b7=1;}
        else if(b9==1){}
        else if(b10==1){btn10b.setEnabled(true);btn9b.setEnabled(false); btn10b.setIcon(btn9b.getIcon());b10=0; b9=1;}
        else if(b11==1){btn11b.setEnabled(true);btn10b.setEnabled(false); btn11b.setIcon(btn10b.getIcon());b11=0; b10=1;}
        else if(b12==1){btn12b.setEnabled(true);btn11b.setEnabled(false); btn12b.setIcon(btn11b.getIcon());b12=0; b11=1;}
        else if(b13==1){}
        else if(b14==1){btn14b.setEnabled(true);btn13b.setEnabled(false); btn14b.setIcon(btn13b.getIcon());b14=0; b13=1;}
        else if(b15==1){btn15b.setEnabled(true);btn14b.setEnabled(false); btn15b.setIcon(btn14b.getIcon());b15=0; b14=1;}
        else if(b16==1){btn16b.setEnabled(true);btn15b.setEnabled(false); btn16b.setIcon(btn15b.getIcon());b16=0; b15=1;}
     }else if(key==40){
             if(b1==1){}
        else if(b2==1){}
        else if(b3==1){}
        else if(b4==1){}
        else if(b5==1){btn5b.setEnabled(true);btn1b.setEnabled(false); btn5b.setIcon(btn1b.getIcon());b5=0; b1=1;}
        else if(b6==1){btn6b.setEnabled(true);btn2b.setEnabled(false); btn6b.setIcon(btn2b.getIcon());b6=0; b2=1;}
        else if(b7==1){btn7b.setEnabled(true);btn3b.setEnabled(false); btn7b.setIcon(btn3b.getIcon());b7=0; b3=1;}
        else if(b8==1){btn8b.setEnabled(true);btn4b.setEnabled(false); btn8b.setIcon(btn4b.getIcon());b8=0; b4=1;}
        else if(b9==1){btn9b.setEnabled(true);btn5b.setEnabled(false); btn9b.setIcon(btn5b.getIcon());b9=0; b5=1;}
        else if(b10==1){btn10b.setEnabled(true);btn6b.setEnabled(false); btn10b.setIcon(btn6b.getIcon());b10=0; b6=1;}
        else if(b11==1){btn11b.setEnabled(true);btn7b.setEnabled(false); btn11b.setIcon(btn7b.getIcon());b11=0; b7=1;}
        else if(b12==1){btn12b.setEnabled(true);btn8b.setEnabled(false); btn12b.setIcon(btn8b.getIcon());b12=0; b8=1;}
        else if(b13==1){btn13b.setEnabled(true);btn9b.setEnabled(false); btn13b.setIcon(btn9b.getIcon());b13=0; b9=1;}
        else if(b14==1){btn14b.setEnabled(true);btn10b.setEnabled(false); btn14b.setIcon(btn10b.getIcon());b14=0; b10=1;}
        else if(b15==1){btn15b.setEnabled(true);btn11b.setEnabled(false); btn15b.setIcon(btn11b.getIcon());b15=0; b11=1;}
        else if(b16==1){btn16b.setEnabled(true);btn12b.setEnabled(false); btn16b.setIcon(btn12b.getIcon());b16=0; b12=1;}
     }else{System.out.println("m");}
  }
  public void key3(int key){
      
      if(key==37){
               if(c1==1){btn1c.setEnabled(true);btn2c.setEnabled(false); btn1c.setIcon(btn2c.getIcon());c1=0; c2=1;}
          else if(c2==1){btn2c.setEnabled(true);btn3c.setEnabled(false); btn2c.setIcon(btn3c.getIcon());c2=0; c3=1;}
          else if(c3==1){btn3c.setEnabled(true);btn4c.setEnabled(false); btn3c.setIcon(btn4c.getIcon());c3=0; c4=1;}
          else if(c4==1){btn4c.setEnabled(true);btn5c.setEnabled(false); btn4c.setIcon(btn5c.getIcon());c4=0; c5=1;}
          else if(c5==1){}
          else if(c6==1){btn6c.setEnabled(true);btn7c.setEnabled(false); btn6c.setIcon(btn7c.getIcon());c6=0; c7=1;}
          else if(c7==1){btn7c.setEnabled(true);btn8c.setEnabled(false); btn7c.setIcon(btn8c.getIcon());c7=0; c8=1;}
          else if(c8==1){btn8c.setEnabled(true);btn9c.setEnabled(false); btn8c.setIcon(btn9c.getIcon());c8=0; c9=1;}
          else if(c9==1){btn9c.setEnabled(true);btn10c.setEnabled(false); btn9c.setIcon(btn10c.getIcon());c9=0; c10=1;}
          else if(c10==1){}
          else if(c11==1){btn11c.setEnabled(true);btn12c.setEnabled(false); btn11c.setIcon(btn12c.getIcon());c11=0; c12=1;}
          else if(c12==1){btn12c.setEnabled(true);btn13c.setEnabled(false); btn12c.setIcon(btn13c.getIcon());c12=0; c13=1;}
          else if(c13==1){btn13c.setEnabled(true);btn14c.setEnabled(false); btn13c.setIcon(btn14c.getIcon());c13=0; c14=1;}
          else if(c14==1){btn14c.setEnabled(true);btn15c.setEnabled(false); btn14c.setIcon(btn15c.getIcon());c14=0; c15=1;}
          else if(c15==1){}
          else if(c16==1){btn16c.setEnabled(true);btn17c.setEnabled(false); btn16c.setIcon(btn17c.getIcon());c16=0; c17=1;}
          else if(c17==1){btn17c.setEnabled(true);btn18c.setEnabled(false); btn17c.setIcon(btn18c.getIcon());c17=0; c18=1;}
          else if(c18==1){btn18c.setEnabled(true);btn19c.setEnabled(false); btn18c.setIcon(btn19c.getIcon());c18=0; c19=1;}
          else if(c19==1){btn19c.setEnabled(true);btn20c.setEnabled(false); btn19c.setIcon(btn20c.getIcon());c19=0; c20=1;}
          else if(c20==1){}
          else if(c21==1){btn21c.setEnabled(true);btn22c.setEnabled(false); btn21c.setIcon(btn22c.getIcon());c21=0; c22=1;}
          else if(c22==1){btn22c.setEnabled(true);btn23c.setEnabled(false); btn22c.setIcon(btn23c.getIcon());c22=0; c23=1;}
          else if(c23==1){btn23c.setEnabled(true);btn24c.setEnabled(false); btn23c.setIcon(btn24c.getIcon());c23=0; c24=1;}
          else if(c24==1){btn24c.setEnabled(true);btn25c.setEnabled(false); btn24c.setIcon(btn25c.getIcon());c24=0; c25=1;}
          else if(c25==1){}
          else{}
       }else if(key==38){
               if(c1==1){btn1c.setEnabled(true);btn6c.setEnabled(false); btn1c.setIcon(btn6c.getIcon());c1=0; c6=1;}
          else if(c2==1){btn2c.setEnabled(true);btn7c.setEnabled(false); btn2c.setIcon(btn7c.getIcon());c2=0; c7=1;}
          else if(c3==1){btn3c.setEnabled(true);btn8c.setEnabled(false); btn3c.setIcon(btn8c.getIcon());c3=0; c8=1;}
          else if(c4==1){btn4c.setEnabled(true);btn9c.setEnabled(false); btn4c.setIcon(btn9c.getIcon());c4=0; c9=1;}
          else if(c5==1){btn5c.setEnabled(true);btn10c.setEnabled(false); btn5c.setIcon(btn10c.getIcon());c5=0; c10=1;}
          else if(c6==1){btn6c.setEnabled(true);btn11c.setEnabled(false); btn6c.setIcon(btn11c.getIcon());c6=0; c11=1;}
          else if(c7==1){btn7c.setEnabled(true);btn12c.setEnabled(false); btn7c.setIcon(btn12c.getIcon());c7=0; c12=1;}
          else if(c8==1){btn8c.setEnabled(true);btn13c.setEnabled(false); btn8c.setIcon(btn13c.getIcon());c8=0; c13=1;}
          else if(c9==1){btn9c.setEnabled(true);btn14c.setEnabled(false); btn9c.setIcon(btn14c.getIcon());c9=0; c14=1;}
          else if(c10==1){btn10c.setEnabled(true);btn15c.setEnabled(false); btn10c.setIcon(btn15c.getIcon());c10=0; c15=1;}
          else if(c11==1){btn11c.setEnabled(true);btn16c.setEnabled(false); btn11c.setIcon(btn16c.getIcon());c11=0; c16=1;}
          else if(c12==1){btn12c.setEnabled(true);btn17c.setEnabled(false); btn12c.setIcon(btn17c.getIcon());c12=0; c17=1;}
          else if(c13==1){btn13c.setEnabled(true);btn18c.setEnabled(false); btn13c.setIcon(btn18c.getIcon());c13=0; c18=1;}
          else if(c14==1){btn14c.setEnabled(true);btn19c.setEnabled(false); btn14c.setIcon(btn19c.getIcon());c14=0; c19=1;}
          else if(c15==1){btn15c.setEnabled(true);btn20c.setEnabled(false); btn15c.setIcon(btn20c.getIcon());c15=0; c20=1;}
          else if(c16==1){btn16c.setEnabled(true);btn21c.setEnabled(false); btn16c.setIcon(btn21c.getIcon());c16=0; c21=1;}
          else if(c17==1){btn17c.setEnabled(true);btn22c.setEnabled(false); btn17c.setIcon(btn22c.getIcon());c17=0; c22=1;}
          else if(c18==1){btn18c.setEnabled(true);btn23c.setEnabled(false); btn18c.setIcon(btn23c.getIcon());c18=0; c23=1;}
          else if(c19==1){btn19c.setEnabled(true);btn24c.setEnabled(false); btn19c.setIcon(btn24c.getIcon());c19=0; c24=1;}
          else if(c20==1){btn20c.setEnabled(true);btn25c.setEnabled(false); btn20c.setIcon(btn25c.getIcon());c20=0; c25=1;}
          else if(c21==1){}
          else if(c22==1){}
          else if(c23==1){}
          else if(c24==1){}
          else if(c25==1){}
          else{}
       }else if(key==39){
               if(c1==1){}
          else if(c2==1){btn2c.setEnabled(true);btn1c.setEnabled(false); btn2c.setIcon(btn1c.getIcon());c2=0; c1=1;}
          else if(c3==1){btn3c.setEnabled(true);btn2c.setEnabled(false); btn3c.setIcon(btn2c.getIcon());c3=0; c2=1;}
          else if(c4==1){btn4c.setEnabled(true);btn3c.setEnabled(false); btn4c.setIcon(btn3c.getIcon());c4=0; c3=1;}
          else if(c5==1){btn5c.setEnabled(true);btn4c.setEnabled(false); btn5c.setIcon(btn4c.getIcon());c5=0; c4=1;}
          else if(c6==1){}
          else if(c7==1){btn7c.setEnabled(true);btn6c.setEnabled(false); btn7c.setIcon(btn6c.getIcon());c7=0; c6=1;}
          else if(c8==1){btn8c.setEnabled(true);btn7c.setEnabled(false); btn8c.setIcon(btn7c.getIcon());c8=0; c7=1;}
          else if(c9==1){btn9c.setEnabled(true);btn8c.setEnabled(false); btn9c.setIcon(btn8c.getIcon());c9=0; c8=1;}
          else if(c10==1){btn10c.setEnabled(true);btn9c.setEnabled(false); btn10c.setIcon(btn9c.getIcon());c10=0; c9=1;}
          else if(c11==1){}
          else if(c12==1){btn12c.setEnabled(true);btn11c.setEnabled(false); btn12c.setIcon(btn11c.getIcon());c12=0; c11=1;}
          else if(c13==1){btn13c.setEnabled(true);btn12c.setEnabled(false); btn13c.setIcon(btn12c.getIcon());c13=0; c12=1;}
          else if(c14==1){btn14c.setEnabled(true);btn13c.setEnabled(false); btn14c.setIcon(btn13c.getIcon());c14=0; c13=1;}
          else if(c15==1){btn15c.setEnabled(true);btn14c.setEnabled(false); btn15c.setIcon(btn14c.getIcon());c15=0; c14=1;}
          else if(c16==1){}
          else if(c17==1){btn17c.setEnabled(true);btn16c.setEnabled(false); btn17c.setIcon(btn16c.getIcon());c17=0; c16=1;}
          else if(c18==1){btn18c.setEnabled(true);btn17c.setEnabled(false); btn18c.setIcon(btn17c.getIcon());c18=0; c17=1;}
          else if(c19==1){btn19c.setEnabled(true);btn18c.setEnabled(false); btn19c.setIcon(btn18c.getIcon());c19=0; c18=1;}
          else if(c20==1){btn20c.setEnabled(true);btn19c.setEnabled(false); btn20c.setIcon(btn19c.getIcon());c20=0; c19=1;}
          else if(c21==1){}
          else if(c22==1){btn22c.setEnabled(true);btn21c.setEnabled(false); btn22c.setIcon(btn21c.getIcon());c22=0; c21=1;}
          else if(c23==1){btn23c.setEnabled(true);btn22c.setEnabled(false); btn23c.setIcon(btn22c.getIcon());c23=0; c22=1;}
          else if(c24==1){btn24c.setEnabled(true);btn23c.setEnabled(false); btn24c.setIcon(btn23c.getIcon());c24=0; c23=1;}
          else if(c25==1){btn25c.setEnabled(true);btn24c.setEnabled(false); btn25c.setIcon(btn24c.getIcon());c25=0; c24=1;}
          else{}
       }else if(key==40){
               if(c1==1){}
          else if(c2==1){}
          else if(c3==1){}
          else if(c4==1){}
          else if(c5==1){}
          else if(c6==1){btn6c.setEnabled(true);btn1c.setEnabled(false); btn6c.setIcon(btn1c.getIcon());c6=0; c1=1;}
          else if(c7==1){btn7c.setEnabled(true);btn2c.setEnabled(false); btn7c.setIcon(btn2c.getIcon());c7=0; c2=1;}
          else if(c8==1){btn8c.setEnabled(true);btn3c.setEnabled(false); btn8c.setIcon(btn3c.getIcon());c8=0; c3=1;}
          else if(c9==1){btn9c.setEnabled(true);btn4c.setEnabled(false); btn9c.setIcon(btn4c.getIcon());c9=0; c4=1;}
          else if(c10==1){btn10c.setEnabled(true);btn5c.setEnabled(false); btn10c.setIcon(btn5c.getIcon());c10=0; c5=1;}
          else if(c11==1){btn11c.setEnabled(true);btn6c.setEnabled(false); btn11c.setIcon(btn6c.getIcon());c11=0; c6=1;}
          else if(c12==1){btn12c.setEnabled(true);btn7c.setEnabled(false); btn12c.setIcon(btn7c.getIcon());c12=0; c7=1;}
          else if(c13==1){btn13c.setEnabled(true);btn8c.setEnabled(false); btn13c.setIcon(btn8c.getIcon());c13=0; c8=1;}
          else if(c14==1){btn14c.setEnabled(true);btn9c.setEnabled(false); btn14c.setIcon(btn9c.getIcon());c14=0; c9=1;}
          else if(c15==1){btn15c.setEnabled(true);btn10c.setEnabled(false); btn15c.setIcon(btn10c.getIcon());c15=0; c10=1;}
          else if(c16==1){btn16c.setEnabled(true);btn11c.setEnabled(false); btn16c.setIcon(btn11c.getIcon());c16=0; c11=1;}
          else if(c17==1){btn17c.setEnabled(true);btn12c.setEnabled(false); btn17c.setIcon(btn12c.getIcon());c17=0; c12=1;}
          else if(c18==1){btn18c.setEnabled(true);btn13c.setEnabled(false); btn18c.setIcon(btn13c.getIcon());c18=0; c13=1;}
          else if(c19==1){btn19c.setEnabled(true);btn14c.setEnabled(false); btn19c.setIcon(btn14c.getIcon());c19=0; c14=1;}
          else if(c20==1){btn20c.setEnabled(true);btn15c.setEnabled(false); btn20c.setIcon(btn15c.getIcon());c20=0; c15=1;}
          else if(c21==1){btn21c.setEnabled(true);btn16c.setEnabled(false); btn21c.setIcon(btn16c.getIcon());c21=0; c16=1;}
          else if(c22==1){btn22c.setEnabled(true);btn17c.setEnabled(false); btn22c.setIcon(btn17c.getIcon());c22=0; c17=1;}
          else if(c23==1){btn23c.setEnabled(true);btn18c.setEnabled(false); btn23c.setIcon(btn18c.getIcon());c23=0; c18=1;}
          else if(c24==1){btn24c.setEnabled(true);btn19c.setEnabled(false); btn24c.setIcon(btn19c.getIcon());c24=0; c19=1;}
          else if(c25==1){btn25c.setEnabled(true);btn20c.setEnabled(false); btn25c.setIcon(btn20c.getIcon());c25=0; c20=1;}
          else{}
       }else{}
     }
  
  public static void main(String[] args) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(puzzleframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puzzleframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puzzleframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puzzleframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable(){
             public void run(){
               new puzzleframe().setVisible(true);
             }
         });
  } 
}
