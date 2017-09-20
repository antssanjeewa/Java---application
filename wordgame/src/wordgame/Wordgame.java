 
package wordgame;

import java.awt.Color;
import javax.swing.JOptionPane;

 public class Wordgame extends javax.swing.JFrame {
     public Wordgame(){
       component();
     }
     private javax.swing.JPanel panel;
     private javax.swing.JPanel panel1;
     private javax.swing.JPanel panel2;
     private javax.swing.JPanel panel3;
     private javax.swing.JTextField text;
     private javax.swing.JButton btn;
     private javax.swing.JButton btn2;
     private javax.swing.JButton btn3;
     private javax.swing.JLabel label4;
     private javax.swing.JLabel label5;
     private javax.swing.JLabel label6;
     private javax.swing.JLabel label7;
     private javax.swing.JLabel label;
     private javax.swing.JLabel label2;
     private javax.swing.JLabel label3;
     private javax.swing.JLabel easy;
     private javax.swing.JLabel medium;
     private javax.swing.JLabel hard;
     private javax.swing.JLabel load;
     
     private void component(){
         panel = new javax.swing.JPanel();
         panel1 = new javax.swing.JPanel();
         panel2 = new javax.swing.JPanel();
         panel3 = new javax.swing.JPanel();
         text = new javax.swing.JTextField();
         btn = new javax.swing.JButton();
         btn2 = new javax.swing.JButton();
         btn3 = new javax.swing.JButton();
         label4 = new javax.swing.JLabel();
         label5 = new javax.swing.JLabel();
         label6 = new javax.swing.JLabel();
         label7 = new javax.swing.JLabel();
         label = new javax.swing.JLabel();
         label2 = new javax.swing.JLabel();
         label3 = new javax.swing.JLabel();
         easy = new javax.swing.JLabel();
         medium= new javax.swing.JLabel();
         hard = new javax.swing.JLabel();
         load = new javax.swing.JLabel();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setTitle("WORD GAME");
         btn.setText("ok");
         btn2.setText("help");
         btn3.setText("menu");
         label.setFont(new java.awt.Font("Tahoma",1,30));
         label2.setFont(new java.awt.Font("Tahoma",1,20));
         text.setFont(new java.awt.Font("Tahoma",1,20));
         label.setText(b[i]);
         label2.setText("score = 00");
         label3.setText(c[i]); label3.setVisible(false);
         label3.setBorder(javax.swing.BorderFactory.createTitledBorder("HINT"));
         panel.setVisible(false);
         panel2.setVisible(false);
         panel3.setVisible(true);
         panel1.setVisible(false);
         
         load.setIcon(new javax.swing.ImageIcon(getClass().getResource("wg.jpg")));
         btn.addActionListener(new java.awt.event.ActionListener(){
             public void actionPerformed(java.awt.event.ActionEvent evt){
                 btnActionPerformed(evt);
             }
         });
         btn2.addActionListener(new java.awt.event.ActionListener(){
             public void actionPerformed(java.awt.event.ActionEvent evt){
                 btn2ActionPerformed(evt);
             }
         });
         btn3.addActionListener(new java.awt.event.ActionListener(){
             public void actionPerformed(java.awt.event.ActionEvent evt){
                 btn3ActionPerformed(evt);
             }
         });
         label4.setFont(new java.awt.Font("Tahoma",1,30));
         label4.setText("continue");
         label4.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 label4MouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 label4Mouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 label4Mouseexited(evt);
             }
         });
         label5.setFont(new java.awt.Font("Tahoma",1,30));
         label5.setText("exit");
         label5.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 label5MouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 label5Mouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 label5Mouseexited(evt);
             }
         });
         label6.setFont(new java.awt.Font("Tahoma",1,30));
         label6.setText("level");
         label6.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 label6MouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 label6Mouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 label6Mouseexited(evt);
             }
         });
         label7.setFont(new java.awt.Font("Tahoma",1,30));
         label7.setText("new game");
         label7.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 label7MouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 label7Mouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 label7Mouseexited(evt);
             }
         });
          easy.setFont(new java.awt.Font("Tahoma",1,30));
         easy.setText("easy");
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
          medium.setFont(new java.awt.Font("Tahoma",1,30));
         medium.setText("medium");
         medium.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 mediumMouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 mediumMouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 mediumMouseexited(evt);
             }
         });
          hard.setFont(new java.awt.Font("Tahoma",1,30));
         hard.setText("hard");
         hard.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(java.awt.event.MouseEvent evt){
                 hardMouseClicked(evt); 
             }
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 hardMouseentered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt){
                 hardMouseexited(evt);
             }
         });
         load.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseEntered(java.awt.event.MouseEvent evt){
                 loadMouseentered(evt);
             }
         });
         
         javax.swing.GroupLayout p2layout = new javax.swing.GroupLayout(panel2);
         panel2.setLayout(p2layout);
            p2layout.setHorizontalGroup(
               p2layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(p2layout.createSequentialGroup()
                  .addGap(100)
                  .addGroup(p2layout.createParallelGroup()
                    .addGap(100)
                  .addComponent(easy)
                  .addComponent(medium)
                  .addComponent(hard)
                   )
               )
            );
            p2layout.setVerticalGroup(
               p2layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(p2layout.createSequentialGroup()
                  .addGap(60)
                  .addComponent(easy)
                    .addGap(20)
                  .addComponent(medium)
                  .addGap(20)
                  .addComponent(hard)
                  .addGap(20)
                   )
            );
         javax.swing.GroupLayout p3layout = new javax.swing.GroupLayout(panel3);
         panel3.setLayout(p3layout);
            p3layout.setHorizontalGroup(
               p3layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(p3layout.createSequentialGroup()
                  .addGroup(p3layout.createParallelGroup()
                  .addComponent(load,400,400,400)
                   )
               )
            );
            p3layout.setVerticalGroup(
               p3layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(p3layout.createSequentialGroup()
                  .addComponent(load,300,300,300)
                   )
            );
          javax.swing.GroupLayout p1layout = new javax.swing.GroupLayout(panel1);
         panel1.setLayout(p1layout);
            p1layout.setHorizontalGroup(
               p1layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(p1layout.createSequentialGroup()
                  .addGap(100)
                  .addGroup(p1layout.createParallelGroup()
                    .addGap(100)
                  .addComponent(label4)
                  .addComponent(label5)
                  .addComponent(label6)
                  .addComponent(label7))
               )
            );
            p1layout.setVerticalGroup(
               p1layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(p1layout.createSequentialGroup()
                  .addGap(60)
                  .addComponent(label4)
                    .addGap(10)
                  .addComponent(label7)
                  .addGap(10)
                  .addComponent(label6)
                  .addGap(10)
                  .addComponent(label5))
            );
  //----------------------------------------------------------------------------------------------------------------------------------------------
        javax.swing.GroupLayout playout = new javax.swing.GroupLayout(panel);
         panel.setLayout(playout);
            playout.setHorizontalGroup(
            playout.createSequentialGroup()
                          .addGap(20)
           .addGroup(playout.createParallelGroup()
            .addComponent(label2)
            .addComponent(btn2)
            )
             .addGap(0)
           .addGroup(playout.createSequentialGroup()
             .addGroup(playout.createParallelGroup()
               .addGap(80)
               .addComponent(label3,50,200,200)
               .addComponent(label,50,200,200)
               .addComponent(text,80,200,200)
             .addComponent(btn3))
               .addGap(10))
           .addGroup(playout.createSequentialGroup()
               
               .addComponent(btn)
            )
         
         );
         playout.setVerticalGroup(
           playout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
             //.addGap(0)
             .addGroup(playout.createSequentialGroup()
             .addComponent(label2)
              .addGap(10)
             .addComponent(label3,50,80,80)
             .addGap(10)
             .addComponent(label,50,50,50)
              .addGap(30)
             .addComponent(text,10,30,30)
             .addGap(20)
             .addGroup(playout.createParallelGroup()        
             .addComponent(btn2)
             .addComponent(btn3)
             .addComponent(btn))
             ).addGap(0)
         );
         javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout1);
         layout1.setHorizontalGroup(
           layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout1.createSequentialGroup()
            .addComponent(panel,100,400,400)
             .addComponent(panel2,100,400,400)
             .addComponent(panel3,100,400,400)
             .addComponent(panel1,100,400,400))
         );
         
         layout1.setVerticalGroup(
           layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout1.createSequentialGroup()
            .addComponent(panel,100,300,300)
            .addComponent(panel2,100,300,300)
            .addComponent(panel3,100,300,300)
            .addComponent(panel1,100,300,300))
         );
         pack();
     }int i =0;
     wordstart w = new wordstart();
     int score =00;
     String level ="easy";
     String c[] = {"this is food","animal in house","pet animal","this is colour"};
     String []a = {"apple","dog","cat","white"};
     String b[] = {"a l p e p","g d o","a c t","e t w i h"};
     String d[] = {"green"};
     String e[] = {"g e n e r"};
     String f[] = {"color"};
     String g[] = {"drink"};
     String h[] = {"r i n d k"};
     String p[] = {"verb"};
    private void btnActionPerformed(java.awt.event.ActionEvent evt){
     if(level.equals("easy")){
          if(text.getText().equals(a[i])){
            i++; score+=10;
            w.score();
            if(i==a.length){i=0;}
            label.setText(b[i]);
            label2.setText("score = "+score);
            label3.setText(c[i]);
            label3.setVisible(false);
             }else{
            JOptionPane.showMessageDialog(this,"try again","wrong",JOptionPane.ERROR_MESSAGE);
           }text.setText("");
    }else if(level.equals("medium")){
            if(text.getText().equals(d[i])){
            i++; score+=10;
            w.score();
            if(i==d.length){i=0;}
            label.setText(e[i]);
            label2.setText("score = "+score);
            label3.setText(f[i]);
            label3.setVisible(false);
             }else{
            JOptionPane.showMessageDialog(this,"try again","wrong",JOptionPane.ERROR_MESSAGE);
           }text.setText("");
    }
    else{
           if(text.getText().equals(g[i])){
            i++; score+=10;
            w.score();
            if(i==g.length){i=0;}
            label.setText(h[i]);
            label2.setText("score = "+score);
            label3.setText(p[i]);
            label3.setVisible(false);
             }else{
            JOptionPane.showMessageDialog(this,"try again","wrong",JOptionPane.ERROR_MESSAGE);
           }text.setText("");
    }
       
    }
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt){
        label3.setVisible(true);
    }
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt){
         panel1.setVisible(true);
         panel.setVisible(false);
    }
    private void label4MouseClicked(java.awt.event.MouseEvent evt){
        panel.setVisible(true);
        panel1.setVisible(false);
       
    }
    private void label4Mouseentered(java.awt.event.MouseEvent evt){
        label4.setForeground(new java.awt.Color(255,0,0));
    }
    private void label4Mouseexited(java.awt.event.MouseEvent evt){
        label4.setForeground(new java.awt.Color(0,0,0));
    }
    private void label5MouseClicked(java.awt.event.MouseEvent evt){
       System.exit(0);
       
    }
    private void label5Mouseentered(java.awt.event.MouseEvent evt){
        label5.setForeground(new java.awt.Color(255,0,0));
    }
    private void label5Mouseexited(java.awt.event.MouseEvent evt){
        label5.setForeground(new java.awt.Color(0,0,0));
    }
     private void label6MouseClicked(java.awt.event.MouseEvent evt){
       panel2.setVisible(true);
       panel1.setVisible(false);
       
    }
    private void label6Mouseentered(java.awt.event.MouseEvent evt){
        label6.setForeground(new java.awt.Color(255,0,0));
    }
    private void label6Mouseexited(java.awt.event.MouseEvent evt){
        label6.setForeground(new java.awt.Color(0,0,0));
    }
    private void label7MouseClicked(java.awt.event.MouseEvent evt){
      i=0; score=00;
       label.setText(b[i]);
         label2.setText("score = 00");
         label3.setText(c[i]); label3.setVisible(false);
       panel.setVisible(true);
       panel1.setVisible(false);   
        // JOptionPane.showMessageDialog(this,w.scor());
       
    }
    private void label7Mouseentered(java.awt.event.MouseEvent evt){
        label7.setForeground(new java.awt.Color(255,0,0));
    }
    private void label7Mouseexited(java.awt.event.MouseEvent evt){
        label7.setForeground(new java.awt.Color(0,0,0));
    }
    private void easyMouseClicked(java.awt.event.MouseEvent evt){
        level = "easy";
       panel1.setVisible(true);
       panel2.setVisible(false);
    }
    private void easyMouseentered(java.awt.event.MouseEvent evt){
        easy.setForeground(new java.awt.Color(255,0,0));
    }
    private void easyMouseexited(java.awt.event.MouseEvent evt){
        easy.setForeground(new java.awt.Color(0,0,0));
    }
    private void mediumMouseClicked(java.awt.event.MouseEvent evt){
         level = "medium";
         label.setText(e[i]);
         label3.setText(f[i]);
         panel1.setVisible(true);
         panel2.setVisible(false);
    }
    private void mediumMouseentered(java.awt.event.MouseEvent evt){
        medium.setForeground(new java.awt.Color(255,0,0));
    }
    private void mediumMouseexited(java.awt.event.MouseEvent evt){
        medium.setForeground(new java.awt.Color(0,0,0));
    }
    private void hardMouseClicked(java.awt.event.MouseEvent evt){
          level = "hard";
          label.setText(h[i]);
          label3.setText(p[i]);
       panel1.setVisible(true);
       panel2.setVisible(false);
    }
    private void hardMouseentered(java.awt.event.MouseEvent evt){
        hard.setForeground(new java.awt.Color(255,0,0));
    }
    private void hardMouseexited(java.awt.event.MouseEvent evt){
        hard.setForeground(new java.awt.Color(0,0,0));
    }
    wordstart t = new wordstart();
    
    private void loadMouseentered(java.awt.event.MouseEvent evt){
       panel1.setVisible(true);
       panel3.setVisible(false); 
    }
    public void set(){
    }
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Wordgame().setVisible(true);
            }
        });
    }
    
}
