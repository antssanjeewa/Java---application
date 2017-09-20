
package taktik;
     import java.awt.Frame;
     import javax.swing.GroupLayout;
import javax.swing.JOptionPane;

public class Taktik extends javax.swing.JFrame{
    public Taktik(){
        initComponents();
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
            java.util.logging.Logger.getLogger(Taktik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Taktik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Taktik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Taktik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }  
       
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Taktik().setVisible(true);
            }
        });
    }

    private void initComponents() {
        
        jp1 = new javax.swing.JPanel();
        j1 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j4 = new javax.swing.JButton ();
        j5 = new javax.swing.JButton ();
        j6 = new javax.swing.JButton ();
        j7 = new javax.swing.JButton ();
        j8 = new javax.swing.JButton ();
        j9 = new javax.swing.JButton ();
        jm1 = new javax.swing.JMenu();
        mi1 = new javax.swing.JMenuItem();
        mi2 = new javax.swing.JMenuItem();
        mi3 = new javax.swing.JMenuItem();
        mi4 = new javax.swing.JMenuItem();
        jm2 = new javax.swing.JMenu();
        jmb = new javax.swing.JMenuBar ();
       
        
        j1.setFont(new java.awt.Font("Tahoma",1,30));
        j1.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j1ActionPerformed(evt);
            }
        });
        j2.setFont(new java.awt.Font("Tahoma",1,30));
        j2.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j2ActionPerformed(evt);
            }
        });
        j3.setFont(new java.awt.Font("Tahoma",1,30));
        j3.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j3ActionPerformed(evt);
            }
        });
        j4.setFont(new java.awt.Font("Tahoma",1,30));
        j4.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j4ActionPerformed(evt);
            }
        });
        j5.setFont(new java.awt.Font("Tahoma",1,30));
        j5.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j5ActionPerformed(evt);
            }
        });
        j6.setFont(new java.awt.Font("Tahoma",1,30));
        j6.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j6ActionPerformed(evt);
            }
        });
        j7.setFont(new java.awt.Font("Tahoma",1,30));
        j7.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j7ActionPerformed(evt);
            }
        });
        j8.setFont(new java.awt.Font("Tahoma",1,30));
        j8.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j8ActionPerformed(evt);
            }
        });
        j9.setFont(new java.awt.Font("Tahoma",1,30));
        j9.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j9ActionPerformed(evt);
            }
        });
        mi1.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                mi1ActionPerformed(evt);
            }
        });
         mi2.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                mi2ActionPerformed(evt);
            }
        });
          mi3.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                mi3ActionPerformed(evt);
            }
        });
           mi4.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                mi4ActionPerformed(evt);
            }
        });
       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tak tik tuk");
       
       javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
       
      jp1.setLayout(jp1Layout);
      jp1Layout.setHorizontalGroup(
        jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jp1Layout.createSequentialGroup()
            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jp1Layout.createSequentialGroup()
                  .addComponent(j1,javax.swing.GroupLayout.PREFERRED_SIZE,100,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(j2,javax.swing.GroupLayout.PREFERRED_SIZE,100,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(j3,javax.swing.GroupLayout.PREFERRED_SIZE,100,javax.swing.GroupLayout.PREFERRED_SIZE)
                         )
               .addGroup(jp1Layout.createSequentialGroup()
                  .addComponent(j4,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(j5,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(j6,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE)
                        )
              .addGroup(jp1Layout.createSequentialGroup()
                  .addComponent(j7,javax.swing.GroupLayout.PREFERRED_SIZE,100,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(j8,javax.swing.GroupLayout.PREFERRED_SIZE,100,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(j9,javax.swing.GroupLayout.PREFERRED_SIZE,100,javax.swing.GroupLayout.PREFERRED_SIZE)
                         )
                )   .addContainerGap()
              )
              
       );
       jp1Layout.setVerticalGroup(
          jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(j2,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE )
                     .addComponent(j3,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE )
                     .addComponent(j1,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE)
                         .addGap(50,50,50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)    
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(j4,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE) 
                     .addComponent(j5,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE)        
                     .addComponent(j6,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE)
                         .addGap(50,50,50))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)    
               .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(j7,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE) 
                     .addComponent(j8,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE)        
                     .addComponent(j9,javax.swing.GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE) 
                ) .addContainerGap()  
             )
         );
                 jm1.setText("file");
                     mi1.setText("new");
                     jm1.add(mi1);
                      mi2.setText("close");
                     jm1.add(mi2);
                  jmb.add(jm1);
                  jm2.setText("other");
                    jmb.add(jm2);
                     mi3.setText("help");
                     jm2.add(mi3);
                      mi4.setText("about");
                     jm2.add(mi4);
                setJMenuBar(jmb);
       
       
       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
           getContentPane().setLayout(layout);
               layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                           .addComponent(jp1,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(0,0,Short.MAX_VALUE)
                )   
       );
                layout.setVerticalGroup(
                     layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGroup(layout.createSequentialGroup()
                          .addComponent(jp1,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addGap(0,0,Short.MAX_VALUE)
                )
       );
        pack();
    }
    private void mi4ActionPerformed(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(this,"Title : tak tik tuk\nName : SAMEERA\nTP.NO.:0714598177\nfb-name : sameera sanjeewa ants","ABOUT",JOptionPane.PLAIN_MESSAGE);
    }
    private void mi3ActionPerformed(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(this,"try to make thible X \ncontinusly any angle","HELP",JOptionPane.QUESTION_MESSAGE);
    }
    private void mi2ActionPerformed(java.awt.event.ActionEvent evt){
        System.exit(0);
    }
    private void mi1ActionPerformed(java.awt.event.ActionEvent evt){
                      j1.setText("");
                      j2.setText("");
                      j3.setText("");
                      j4.setText("");
                      j5.setText("");
                      j6.setText("");
                      j7.setText("");
                      j8.setText("");
                      j9.setText("");
                      count=0;
                      b1=0;b2=0;b3=0;b4=0;b5=0;b6=0;b7=0;b8=0;b9=0;   
    
    }
           int b1=0;int count=0;
    private void j1ActionPerformed(java.awt.event.ActionEvent evt){
       if(b1==0){
        j1.setText("x");b1=1;count++;
            if(j5.getText().equals("")){j5.setText("0");b5=1;}
            else if(j5.getText().equals("x")&&j9.getText().equals("")){
                    j9.setText("0");b9=1;}
            else if(j2.getText().equals("x")&&j3.getText().equals("")){
                     j3.setText("0");b3=1;}
            else if(j4.getText().equals("x")&&j9.getText().equals("")){
                    j7.setText("0");b7=1;}
            else if(j9.getText().equals("x")&&j5.getText().equals("")){
                    j5.setText("0");b5=1;}
            else if(j3.getText().equals("x")&&j2.getText().equals("")){
                    j2.setText("0");b2=1;}
            else if(j7.getText().equals("x")&&j4.getText().equals("")){
                    j4.setText("0");b4=1;}
            else if(j2.getText().equals("")){j2.setText("0");b2=1;}
            else if(j6.getText().equals("")){j6.setText("0");b6=1;}
            else if(j4.getText().equals("")){j4.setText("0");b4=1;}
            else if(j7.getText().equals("")){j7.setText("0");b7=1;}
            else if(j3.getText().equals("")){j3.setText("0");b3=1;}
            else if(j8.getText().equals("")){j8.setText("0");b8=1;}
            else if(j9.getText().equals("")){j9.setText("0");b9=1;}
            
        check(j1.getText(),j2.getText(),j3.getText());
        check(j1.getText(),j5.getText(),j9.getText());
        check(j7.getText(),j4.getText(),j1.getText());
        check(j2.getText(),j5.getText(),j8.getText());
        check(j3.getText(),j6.getText(),j9.getText());
        check(j9.getText(),j8.getText(),j7.getText());
        check(j3.getText(),j5.getText(),j7.getText());
        check(j4.getText(),j5.getText(),j6.getText());
       }   
    }       int b2=0;
    private void j2ActionPerformed(java.awt.event.ActionEvent evt){
        if(b2==0){
        j2.setText("x");b2=1;count++;
            if(j5.getText().equals("")){j5.setText("0");b5=1;}
            else if(j5.getText().equals("x")&&j8.getText().equals("")){
                    j8.setText("0");b8=1;}
            else if(j1.getText().equals("x")&&j3.getText().equals("")){
                    j3.setText("0");b3=1;}
            else if(j8.getText().equals("x")&&j5.getText().equals("")){
                    j5.setText("0");b5=1;}
            else if(j3.getText().equals("x")&&j1.getText().equals("")){
                    j1.setText("0");b1=1;}
            else if(j1.getText().equals("")){j1.setText("0");b1=1;}
            else if(j3.getText().equals("")){j3.setText("0");b3=1;}
            else if(j6.getText().equals("")){j6.setText("0");b6=1;}
            else if(j7.getText().equals("")){j7.setText("0");b7=1;}
            else if(j4.getText().equals("")){j4.setText("0");b4=1;}
            else if(j8.getText().equals("")){j8.setText("0");b8=1;}
            else if(j9.getText().equals("")){j9.setText("0");b9=1;}
            
        check(j1.getText(),j2.getText(),j3.getText());
        check(j2.getText(),j5.getText(),j8.getText());
        check(j3.getText(),j6.getText(),j9.getText());
        check(j9.getText(),j8.getText(),j7.getText());
        check(j7.getText(),j4.getText(),j1.getText());
        check(j1.getText(),j5.getText(),j9.getText());
        check(j3.getText(),j5.getText(),j7.getText());
        check(j4.getText(),j5.getText(),j6.getText());
      }
    }       int b3=0;
    private void j3ActionPerformed(java.awt.event.ActionEvent evt){
        if(b3==0){
        j3.setText("x");b3=1;count++;
            if(j5.getText().equals("")){j5.setText("0");}
            else if(j6.getText().equals("x")&&j9.getText().equals("")){
                    j9.setText("0");b9=1;}
            else if(j2.getText().equals("x")&&j1.getText().equals("")){
                    j1.setText("0");b1=1;}
            else if(j5.getText().equals("x")&&j7.getText().equals("")){
                    j7.setText("0");b7=1;}
            else if(j7.getText().equals("x")&&j5.getText().equals("")){
                    j5.setText("0");b5=1;}
            else if(j1.getText().equals("x")&&j2.getText().equals("")){
                    j2.setText("0");b2=1;}
            else if(j7.getText().equals("x")&&j5.getText().equals("")){
                    j5.setText("0");b5=1;}
            else if(j2.getText().equals("")){j2.setText("0");b2=1;}
            else if(j6.getText().equals("")){j6.setText("0");b6=1;}
            else if(j4.getText().equals("")){j4.setText("0");b4=1;}
            else if(j7.getText().equals("")){j7.setText("0");b7=1;}
            else if(j1.getText().equals("")){j1.setText("0");b1=1;}
            else if(j8.getText().equals("")){j8.setText("0");b8=1;}
            else if(j9.getText().equals("")){j9.setText("0");b9=1;}
            
        check(j1.getText(),j2.getText(),j3.getText());
        check(j3.getText(),j5.getText(),j7.getText());
        check(j3.getText(),j6.getText(),j9.getText());
        check(j9.getText(),j8.getText(),j7.getText());
        check(j7.getText(),j4.getText(),j1.getText());
        check(j1.getText(),j5.getText(),j9.getText());
        check(j2.getText(),j5.getText(),j8.getText());
        check(j4.getText(),j5.getText(),j6.getText()); 
        }
    }       int b4=0;
    private void j4ActionPerformed(java.awt.event.ActionEvent evt){
        if(b4==0){
        j4.setText("x");b4=1;count++;
            if(j5.getText().equals("")){j5.setText("0");b5=1;}
            else if(j5.getText().equals("x")&&j6.getText().equals("")){
                    j6.setText("0");b6=1;}
            else if(j1.getText().equals("x")&&j7.getText().equals("")){
                    j7.setText("0");b7=1;}
            else if(j6.getText().equals("x")&&j5.getText().equals("")){
                    j5.setText("0");b5=1;}
            else if(j7.getText().equals("x")&&j1.getText().equals("")){
                    j1.setText("0");b1=1;}
            else if(j2.getText().equals("")){j2.setText("0");b2=1;}
            else if(j1.getText().equals("")){j1.setText("0");b1=1;}
            else if(j7.getText().equals("")){j7.setText("0");b7=1;}
            else if(j3.getText().equals("")){j3.setText("0");b3=1;}
            else if(j8.getText().equals("")){j8.setText("0");b8=1;}
            else if(j9.getText().equals("")){j9.setText("0");b9=1;}
            else if(j6.getText().equals("")){j6.setText("0");b6=1;}
        check(j4.getText(),j5.getText(),j6.getText());
        check(j7.getText(),j4.getText(),j1.getText());
        check(j1.getText(),j2.getText(),j3.getText());
        check(j2.getText(),j5.getText(),j8.getText());
        check(j3.getText(),j6.getText(),j9.getText());
        check(j9.getText(),j8.getText(),j7.getText()); 
        check(j1.getText(),j5.getText(),j9.getText());
        check(j3.getText(),j5.getText(),j7.getText());
      }
    }       int b5=0;
    private void j5ActionPerformed(java.awt.event.ActionEvent evt){
        if(b5==0){
        j5.setText("x");b5=1;count++;
            if(j5.getText().equals("")){j5.setText("0");b5=1;}
            else if(j2.getText().equals("x")&&j8.getText().equals("")){
                    j8.setText("0");b8=1;}
            else if(j4.getText().equals("x")&&j6.getText().equals("")){
                    j6.setText("0");b6=1;}
            else if(j8.getText().equals("x")&&j2.getText().equals("")){
                    j2.setText("0");b2=1;}
            else if(j6.getText().equals("x")&&j4.getText().equals("")){
                    j4.setText("0");b4=1;}
            else if(j2.getText().equals("")){j2.setText("0");b2=1;}
            else if(j4.getText().equals("")){j4.setText("0");b4=1;}
            else if(j7.getText().equals("")){j7.setText("0");b7=1;}
            else if(j3.getText().equals("")){j3.setText("0");b3=1;}
            else if(j8.getText().equals("")){j8.setText("0");b8=1;}
            else if(j9.getText().equals("")){j9.setText("0");b9=1;}
            else if(j6.getText().equals("")){j6.setText("0");b6=1;}
        check(j1.getText(),j5.getText(),j9.getText());
        check(j3.getText(),j5.getText(),j7.getText());    
        check(j4.getText(),j5.getText(),j6.getText());
        check(j2.getText(),j5.getText(),j8.getText());
        check(j3.getText(),j6.getText(),j9.getText());
        check(j9.getText(),j8.getText(),j7.getText());
        check(j7.getText(),j4.getText(),j1.getText());
        check(j1.getText(),j2.getText(),j3.getText()); 
      }
    }       int b6=0;
    private void j6ActionPerformed(java.awt.event.ActionEvent evt){
        if(b6==0){
        j6.setText("x");b6=1;count++;
            if(j5.getText().equals("")){j5.setText("0");b5=1;}
            else if(j5.getText().equals("x")&&j4.getText().equals("")){
                    j4.setText("0");b4=1;}
            else if(j9.getText().equals("x")&&j3.getText().equals("")){
                    j3.setText("0");b3=1;}
            else if(j4.getText().equals("x")&&j5.getText().equals("")){
                    j5.setText("0");b5=1;}
            else if(j3.getText().equals("x")&&j9.getText().equals("")){
                    j9.setText("0");b9=1;}
            else if(j2.getText().equals("")){j2.setText("0");b2=1;}
            else if(j4.getText().equals("")){j4.setText("0");b4=1;}
            else if(j7.getText().equals("")){j7.setText("0");b7=1;}
            else if(j3.getText().equals("")){j3.setText("0");b3=1;}
            else if(j8.getText().equals("")){j8.setText("0");b8=1;}
            else if(j9.getText().equals("")){j9.setText("0");b9=1;}
            else if(j6.getText().equals("")){j6.setText("0");b6=1;}
        check(j3.getText(),j6.getText(),j9.getText());
        check(j4.getText(),j5.getText(),j6.getText());
        check(j1.getText(),j2.getText(),j3.getText());
        check(j2.getText(),j5.getText(),j8.getText());
        check(j9.getText(),j8.getText(),j7.getText());
        check(j7.getText(),j4.getText(),j1.getText());
        check(j1.getText(),j5.getText(),j9.getText());
        check(j3.getText(),j5.getText(),j7.getText()); 
      }
    }       int b7=0;
    private void j7ActionPerformed(java.awt.event.ActionEvent evt){
        if(b7==0){
        j7.setText("x");b7=1;count++;
            if(j5.getText().equals("")){j5.setText("0");b5=1;}
            else if(j8.getText().equals("x")&&j9.getText().equals("")){
                    j9.setText("0");b9=1;}
            else if(j5.getText().equals("x")&&j3.getText().equals("")){
                    j3.setText("0");b3=1;}
            else if(j4.getText().equals("x")&&j1.getText().equals("")){
                    j1.setText("0");b1=1;}
            else if(j3.getText().equals("x")&&j5.getText().equals("")){
                    j5.setText("0");b5=1;}
            else if(j9.getText().equals("x")&&j8.getText().equals("")){
                    j8.setText("0");b8=1;}
            else if(j1.getText().equals("x")&&j4.getText().equals("")){
                    j4.setText("0");b4=1;}
            else if(j2.getText().equals("")){j2.setText("0");b2=1;}
            else if(j4.getText().equals("")){j4.setText("0");b4=1;}
            else if(j1.getText().equals("")){j1.setText("0");b1=1;}
            else if(j3.getText().equals("")){j3.setText("0");b3=1;}
            else if(j8.getText().equals("")){j8.setText("0");b8=1;}
            else if(j9.getText().equals("")){j9.setText("0");b9=1;}
            else if(j6.getText().equals("")){j6.setText("0");b6=1;}
        check(j9.getText(),j8.getText(),j7.getText());
        check(j7.getText(),j4.getText(),j1.getText());
        check(j3.getText(),j5.getText(),j7.getText());
        check(j1.getText(),j2.getText(),j3.getText());
        check(j2.getText(),j5.getText(),j8.getText());
        check(j3.getText(),j6.getText(),j9.getText());
        check(j1.getText(),j5.getText(),j9.getText());
        check(j4.getText(),j5.getText(),j6.getText()); 
      }
    }       int b8=0;
    private void j8ActionPerformed(java.awt.event.ActionEvent evt){
        if(b8==0){
        j8.setText("x");b8=1;count++;
            if(j5.getText().equals("")){j5.setText("0");b5=1;}
            else if(j5.getText().equals("x")&&j2.getText().equals("")){
                    j2.setText("0");b2=1;}
            else if(j7.getText().equals("x")&&j9.getText().equals("")){
                    j9.setText("0");b9=1;}
            else if(j2.getText().equals("x")&&j5.getText().equals("")){
                    j5.setText("0");b5=1;}
            else if(j9.getText().equals("x")&&j7.getText().equals("")){
                    j7.setText("0");b7=1;}
            else if(j2.getText().equals("")){j2.setText("0");b2=1;}
            else if(j4.getText().equals("")){j4.setText("0");b4=1;}
            else if(j7.getText().equals("")){j7.setText("0");b7=1;}
            else if(j3.getText().equals("")){j3.setText("0");b3=1;}
            else if(j1.getText().equals("")){j1.setText("0");b1=1;}
            else if(j9.getText().equals("")){j9.setText("0");b9=1;}
            else if(j6.getText().equals("")){j6.setText("0");b6=1;}
        check(j9.getText(),j8.getText(),j7.getText());    
        check(j2.getText(),j5.getText(),j8.getText());
        check(j3.getText(),j6.getText(),j9.getText());
        check(j1.getText(),j2.getText(),j3.getText());
        check(j7.getText(),j4.getText(),j1.getText());
        check(j1.getText(),j5.getText(),j9.getText());
        check(j3.getText(),j5.getText(),j7.getText());
        check(j4.getText(),j5.getText(),j6.getText());
      }System.out.println(count);
    }       int b9=0;
    private void j9ActionPerformed(java.awt.event.ActionEvent evt){
        if(b9==0){
        j9.setText("x");b9=1;count++;
            if(j5.getText().equals("")){j5.setText("0");b5=1;}
            else if(j5.getText().equals("x")&&j1.getText().equals("")){
                    j1.setText("0");b1=1;}
            else if(j6.getText().equals("x")&&j3.getText().equals("")){
                    j3.setText("0");b3=1;}
            else if(j8.getText().equals("x")&&j7.getText().equals("")){
                    j7.setText("0");b7=1;}
            else if(j1.getText().equals("x")&&j5.getText().equals("")){
                    j5.setText("0");b5=1;}
            else if(j3.getText().equals("x")&&j6.getText().equals("")){
                    j6.setText("0");b6=1;}
            else if(j7.getText().equals("x")&&j8.getText().equals("")){
                    j8.setText("0");b8=1;}
            else if(j2.getText().equals("")){j2.setText("0");b2=1;}
            else if(j4.getText().equals("")){j4.setText("0");b4=1;}
            else if(j7.getText().equals("")){j7.setText("0");b7=1;}
            else if(j3.getText().equals("")){j3.setText("0");b3=1;}
            else if(j8.getText().equals("")){j8.setText("0");b8=1;}
            else if(j1.getText().equals("")){j1.setText("0");b1=1;}
            else if(j6.getText().equals("")){j6.setText("0");b6=1;}
        check(j1.getText(),j5.getText(),j9.getText());
        check(j3.getText(),j6.getText(),j9.getText());
        check(j9.getText(),j8.getText(),j7.getText());
        check(j1.getText(),j2.getText(),j3.getText());
        check(j2.getText(),j5.getText(),j8.getText());
        check(j7.getText(),j4.getText(),j1.getText());
        check(j3.getText(),j5.getText(),j7.getText());
        check(j4.getText(),j5.getText(),j6.getText());
      }
    }
    public void check( String c1, String c2, String c3){
       if(c1.equals("x")){ 
        if(c1.equals(c2)&& c1.equals(c3) ){
         int option = JOptionPane.showConfirmDialog(this,"congragulation","YOU WIN",JOptionPane.OK_CANCEL_OPTION);
                if(option==(JOptionPane.OK_OPTION)){
                      j1.setText("");
                      j2.setText("");
                      j3.setText("");
                      j4.setText("");
                      j5.setText("");
                      j6.setText("");
                      j7.setText("");
                      j8.setText("");
                      j9.setText("");
                      count=0;
                      b1=0;b2=0;b3=0;b4=0;b5=0;b6=0;b7=0;b8=0;b9=0;
                } 
        }
      }else if(c1.equals("0")){
         if(c1.equals(c2)&& c1.equals(c3) ){
          int option = JOptionPane.showConfirmDialog(this,"try again","YOU LOSS",JOptionPane.CANCEL_OPTION); 
               if(option==(JOptionPane.OK_OPTION)){
                      j1.setText("");
                      j2.setText("");
                      j3.setText("");
                      j4.setText("");
                      j5.setText("");
                      j6.setText("");
                      j7.setText("");
                      j8.setText("");
                      j9.setText("");
                      count=0;
                      b1=0;b2=0;b3=0;b4=0;b5=0;b6=0;b7=0;b8=0;b9=0;
                } 
         } else if(count ==5){int option = JOptionPane.showConfirmDialog(this,"GAME OVER","TRY AGAIN",JOptionPane.CANCEL_OPTION); 
               if(option==(JOptionPane.OK_OPTION)){
                      j1.setText("");
                      j2.setText("");
                      j3.setText("");
                      j4.setText("");
                      j5.setText("");
                      j6.setText("");
                      j7.setText("");
                      j8.setText("");
                      j9.setText("");
                      count=0;
                      b1=0;b2=0;b3=0;b4=0;b5=0;b6=0;b7=0;b8=0;b9=0;
                }else{System.exit(0);}
         }}
    }
    
     private javax.swing.JPanel jp1;
     private javax.swing.JButton j1;
     private javax.swing.JButton j2;
     private javax.swing.JButton j3;
     private javax.swing.JButton j4;
     private javax.swing.JButton j5;
     private javax.swing.JButton j6;
     private javax.swing.JButton j7;
     private javax.swing.JButton j8;
     private javax.swing.JButton j9;
     private javax.swing.JMenuBar jmb;
     private javax.swing.JMenu jm1;
     private javax.swing.JMenu jm2;
     private javax.swing.JMenuItem mi1;
     private javax.swing.JMenuItem mi2;
     private javax.swing.JMenuItem mi3;
     private javax.swing.JMenuItem mi4;
}
