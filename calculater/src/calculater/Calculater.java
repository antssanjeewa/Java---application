 
package calculater;
 
import java.awt.Frame;
import java.util.Arrays;
import java.util.Locale;
import javax.swing.GroupLayout;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public class Calculater extends javax.swing.JFrame{
    public Calculater(){initcomponents();}
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       // JFrame j = new JFrame();
       // j.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Calculater().setVisible(true);
            }
        });
        
    }

    private void initcomponents() {
      jp1 = new javax.swing.JPanel();
      j1 = new javax.swing.JButton();
      j2 = new javax.swing.JButton();
      j3 = new javax.swing.JButton();
      j4 = new javax.swing.JButton();
      j5 = new javax.swing.JButton();
      j6 = new javax.swing.JButton();
      jt1 = new javax.swing.JTextField();
      j7 = new javax.swing.JButton();
      j8 = new javax.swing.JButton();
      j9 = new javax.swing.JButton();
      j10 = new javax.swing.JButton();
      j11= new javax.swing.JButton();
      j12= new javax.swing.JButton();
      j13= new javax.swing.JButton();
      j14= new javax.swing.JButton();
      j15= new javax.swing.JButton();
      j16 = new javax.swing.JButton();
      jm = new javax.swing.JMenuBar();
      jm1 = new javax.swing.JMenu();
      jm2 = new javax.swing.JMenu();
       
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculater");
    j1.setText("+");
    j2.setText("=");
    j3.setText("-");
    j4.setText("*");
    j5.setText("/");
    j7.setText("1");
    j8.setText("2");
    j9.setText("3");
    j10.setText("4");
    j11.setText("5");
    j12.setText("6");
    j13.setText("7");
    j14.setText("8");
    j15.setText("9");
    j16.setText("0");
    j6.setText("clr");
   // jt1.setText("0");
        jt1.setFont(new java.awt.Font("Tahoma",1,30));
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
        j10.setFont(new java.awt.Font("Tahoma",1,30));
        j10.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j10ActionPerformed(evt);
            }
        });
        j11.setFont(new java.awt.Font("Tahoma",1,30));
        j11.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j11ActionPerformed(evt);
            }
        });
        j12.setFont(new java.awt.Font("Tahoma",1,30));
        j12.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j12ActionPerformed(evt);
            }
        });
        j13.setFont(new java.awt.Font("Tahoma",1,30));
        j13.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j13ActionPerformed(evt);
            }
        });
        j14.setFont(new java.awt.Font("Tahoma",1,30));
        j14.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j14ActionPerformed(evt);
            }
        });
        j15.setFont(new java.awt.Font("Tahoma",1,30));
        j15.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j15ActionPerformed(evt);
            }
        });
        j16.setFont(new java.awt.Font("Tahoma",1,30));
        j16.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                j16ActionPerformed(evt);
            }
        });
        
        jm1.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                jm1ActionPerformed(evt);
            }
        });
        
    javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
    jp1.setLayout(jp1Layout);
    jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                           .addContainerGap()
                            .addComponent(jt1,javax.swing.GroupLayout.PREFERRED_SIZE,200,javax.swing.GroupLayout.PREFERRED_SIZE)
                           // .addContainerGap()
                            //.addComponent(jt3,javax.swing.GroupLayout.PREFERRED_SIZE,40,javax.swing.GroupLayout.PREFERRED_SIZE)
                            //.addContainerGap()
                            //.addComponent(jt2,javax.swing.GroupLayout.PREFERRED_SIZE,80,javax.swing.GroupLayout.PREFERRED_SIZE)
                    )       
                    .addGroup(jp1Layout.createSequentialGroup()  
                            .addContainerGap()
                            .addComponent(j2,javax.swing.GroupLayout.PREFERRED_SIZE,200,200)
                    )
                    .addGroup(jp1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(j1,10,100,100)
                            .addContainerGap()
                            .addComponent(j3,10,100,100)
                            .addContainerGap()
                    )
                    .addGroup(jp1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(j4,10,100,100)
                            .addContainerGap()
                            .addComponent(j5,10,100,100)
                            .addContainerGap()
                    )
                    .addGroup(jp1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(j7,10,60,100)
                            .addContainerGap()
                            .addComponent(j8,10,60,100)
                            .addContainerGap()
                            .addComponent(j9,10,60,100)
                            .addContainerGap()
                    )
                    .addGroup(jp1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(j10,10,60,100)
                            .addContainerGap()
                            .addComponent(j11,10,60,100)
                            .addContainerGap()
                            .addComponent(j12,10,60,100)
                            .addContainerGap()
                    )
                    .addGroup(jp1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(j13,10,60,100)
                            .addContainerGap()
                            .addComponent(j14,10,60,100)
                            .addContainerGap()
                            .addComponent(j15,10,60,100)
                            .addContainerGap()
                    )
                     .addGroup(jp1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(j6,60,100,100)
                            .addComponent(j16,60,60,100)
                            .addContainerGap()
                             
                    )
                            
                );
   jp1Layout.setVerticalGroup(
           jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jp1Layout.createSequentialGroup()
                             .addContainerGap()
                                .addGroup(jp1Layout.createParallelGroup()
                                .addComponent(jt1,javax.swing.GroupLayout.PREFERRED_SIZE,50,javax.swing.GroupLayout.PREFERRED_SIZE)
                               // .addComponent(jt3,javax.swing.GroupLayout.PREFERRED_SIZE,50,javax.swing.GroupLayout.PREFERRED_SIZE)
                               // .addComponent(jt2,javax.swing.GroupLayout.PREFERRED_SIZE,50,javax.swing.GroupLayout.PREFERRED_SIZE)   
                                )
                                .addContainerGap(50,Short.MAX_VALUE)
                             .addGroup(jp1Layout.createParallelGroup()   
                                .addComponent(j7,javax.swing.GroupLayout.PREFERRED_SIZE,40,javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j8,10,40,50)
                                .addComponent(j9,0,40,50))
                              .addGroup(jp1Layout.createParallelGroup()   
                                .addComponent(j10,javax.swing.GroupLayout.PREFERRED_SIZE,40,javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j11,10,40,50)
                                .addComponent(j12,0,40,50))
                              .addGroup(jp1Layout.createParallelGroup()   
                                .addComponent(j13,javax.swing.GroupLayout.PREFERRED_SIZE,40,javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j14,10,40,50)
                                .addComponent(j15,0,40,50))
                             .addGroup(jp1Layout.createParallelGroup()   
                                 .addComponent(j6,50,50,80)
                                .addComponent(j16,50,50,80)
                                .addGap(5,5,5))
                             .addGroup(jp1Layout.createParallelGroup()   
                                .addComponent(j1,javax.swing.GroupLayout.PREFERRED_SIZE,50,javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j3,0,50,50))
                             .addGroup(jp1Layout.createParallelGroup()   
                                .addComponent(j4,javax.swing.GroupLayout.PREFERRED_SIZE,50,javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j5,0,50,50))
                                .addContainerGap(30,Short.MAX_VALUE)
                                .addComponent(j2,javax.swing.GroupLayout.PREFERRED_SIZE,50,javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50,Short.MAX_VALUE) 
                                
                ));  
           jm.add(jm1);
           jm1.setText("new");
           jm2.setText("help");
           jm.add(jm2);
            setJMenuBar(jm);
   
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                           .addComponent(jp1,javax.swing.GroupLayout.PREFERRED_SIZE,230,javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(0,0,Short.MAX_VALUE)
                ));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                           .addComponent(jp1,javax.swing.GroupLayout.PREFERRED_SIZE,400,javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(0,0,Short.MAX_VALUE)
                ));
    pack();
    } int a1=0;  double s1,s2=0;
    void j1ActionPerformed(java.awt.event.ActionEvent evt){
        s1 = Double.parseDouble(jt1.getText());
        jt1.setText("");
      a1=1; 
       
  }
   void j2ActionPerformed (java.awt.event.ActionEvent evt){
      
        s2 = Double.parseDouble(jt1.getText());
      if(a1==1){
         
          
          jt1.setText(Double.toString(s1+s2));
    }else if(a1==2){
        
       
      jt1.setText(Double.toString(s1-s2));  
      }else if(a1==3){
     
           
          jt1.setText(Double.toString(s1*s2)); 
      }else if(a1==4){
        
           
          jt1.setText(Double.toString(s1/s2)); 
      }
   }
  private void j3ActionPerformed(java.awt.event.ActionEvent evt){ 
     s1 = Double.parseDouble(jt1.getText());
        jt1.setText("");
      a1=2;
      }
  private void j4ActionPerformed(java.awt.event.ActionEvent evt){ 
      s1 = Double.parseDouble(jt1.getText());
        jt1.setText("");
      a1=3;
      }
  private void j5ActionPerformed(java.awt.event.ActionEvent evt){ 
      s1 = Double.parseDouble(jt1.getText());
        jt1.setText("");
      a1=4;
  }
  void j6ActionPerformed(java.awt.event.ActionEvent evt){
      jt1.setText("");
   }
  void j7ActionPerformed(java.awt.event.ActionEvent evt){
      
      jt1.setText(jt1.getText()+"1"); 
   }
  void j8ActionPerformed(java.awt.event.ActionEvent evt){
      jt1.setText(jt1.getText()+"2");
   }
  void j9ActionPerformed(java.awt.event.ActionEvent evt){
      jt1.setText(jt1.getText()+"3");
   }
  void j10ActionPerformed(java.awt.event.ActionEvent evt){
     jt1.setText(jt1.getText()+"4");
   }
  void j11ActionPerformed(java.awt.event.ActionEvent evt){
     jt1.setText(jt1.getText()+"5");
   }
  void j12ActionPerformed(java.awt.event.ActionEvent evt){
      jt1.setText(jt1.getText()+"6");
   }
  void j13ActionPerformed(java.awt.event.ActionEvent evt){
      jt1.setText(jt1.getText()+"7");
   }
  void j14ActionPerformed(java.awt.event.ActionEvent evt){
     jt1.setText(jt1.getText()+"8");
   }
  void j15ActionPerformed(java.awt.event.ActionEvent evt){
      jt1.setText(jt1.getText()+"9");
   }
  void j16ActionPerformed(java.awt.event.ActionEvent evt){
     jt1.setText(jt1.getText()+"0");
   }
  void jm1ActionPerformed(java.awt.event.ActionEvent evt){
      JOptionPane.showConfirmDialog(this,"stop","i can't help you", WIDTH);
   }
    
  private javax.swing.JPanel jp1;
  private javax.swing.JButton j1;
  private javax.swing.JButton j2;
  private javax.swing.JButton j3;
  private javax.swing.JButton j4;
  private javax.swing.JButton j5;
  private javax.swing.JButton j6;
  private javax.swing.JTextField jt1;
  private javax.swing.JButton j7;
  private javax.swing.JButton j8;
  private javax.swing.JButton j9;
  private javax.swing.JButton j10;
  private javax.swing.JButton j11;
  private javax.swing.JButton j12;
  private javax.swing.JButton j13;
  private javax.swing.JButton j14;
  private javax.swing.JButton j15;
  private javax.swing.JButton j16;
  private javax.swing.JMenuBar jm;
  private javax.swing.JMenu jm1;
  private javax.swing.JMenu jm2;
}
