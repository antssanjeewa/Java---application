
package nicnomber;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;


public class Nicjfram extends javax.swing.JFrame {
    public Nicjfram(){
        component();
        
    }
String gender;
int year;
int day;
String month;
int age;
String name; 
String id;
private javax.swing.JPanel jpanel;
private javax.swing.JTextField jtext1;
private javax.swing.JTextField jtext2;
private javax.swing.JButton jbtn;
private javax.swing.JLabel jlable1;
private javax.swing.JLabel jlable2;
public void component(){
    jpanel = new javax.swing.JPanel();
    jtext1 = new javax.swing.JTextField();
    jtext2 = new javax.swing.JTextField();
    jbtn = new javax.swing.JButton();
    jlable1 = new javax.swing.JLabel();
    jlable2 = new javax.swing.JLabel();
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    jpanel.setBackground(Color.yellow);
    jlable1.setText("name");
    jlable2.setText("ID number");
    jbtn.setText("submit");
    setTitle("FIND YOUR BIRTHDAY");
    jpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("find birthday"));
    
    
    jbtn.addActionListener(new java.awt.event.ActionListener(){
        public void actionPerformed(java.awt.event.ActionEvent evt){
            jbtnActionperformed(evt);
        }

        });
    
    javax.swing.GroupLayout jpLayout = new javax.swing.GroupLayout(jpanel);
    jpanel.setLayout(jpLayout);
    jpLayout.setHorizontalGroup(
       jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
       .addGroup(jpLayout.createSequentialGroup()
       .addGap(40,40,40)
         .addGroup(jpLayout.createParallelGroup()
           .addGroup(jpLayout.createSequentialGroup()
             .addComponent(jlable1,javax.swing.GroupLayout.PREFERRED_SIZE,80,javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(jtext1,javax.swing.GroupLayout.PREFERRED_SIZE,150,javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(jbtn)   
           ).addGroup(jpLayout.createSequentialGroup()
             .addComponent(jlable2,javax.swing.GroupLayout.PREFERRED_SIZE,80,javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(jtext2,javax.swing.GroupLayout.PREFERRED_SIZE,150,javax.swing.GroupLayout.PREFERRED_SIZE))
           )
         ) 
    );
    jpLayout.setVerticalGroup(
       jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
       .addGroup(jpLayout.createSequentialGroup()
       .addGap(40,40,50)
          .addGroup(jpLayout.createParallelGroup()
             .addComponent(jlable1,javax.swing.GroupLayout.PREFERRED_SIZE,10,javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(jtext1,javax.swing.GroupLayout.PREFERRED_SIZE,25,javax.swing.GroupLayout.PREFERRED_SIZE)
          ).addGap(25)
          .addGroup(jpLayout.createParallelGroup()
             .addGap(50)
             .addComponent(jlable2,javax.swing.GroupLayout.PREFERRED_SIZE,10,javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(jtext2,javax.swing.GroupLayout.PREFERRED_SIZE,25,javax.swing.GroupLayout.PREFERRED_SIZE)
          )  
              .addComponent(jbtn) 
              .addContainerGap(100,Short.MAX_VALUE)
               
       )
       //.addGroup(jpLayout.createSequentialGroup()
       //.addGap(50,50,80)
       
      // .addContainerGap(20,Short.MAX_VALUE))
    );
    javax.swing.GroupLayout Layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(Layout);
    Layout.setHorizontalGroup(
       Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jpanel,javax.swing.GroupLayout.PREFERRED_SIZE,400,javax.swing.GroupLayout.PREFERRED_SIZE)
       .addGap(0)
    );
    Layout.setVerticalGroup(
       Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jpanel,javax.swing.GroupLayout.PREFERRED_SIZE,200,javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(0)
    );
   pack(); 
}

public void jbtnActionperformed(java.awt.event.ActionEvent evt){
    id = jtext2.getText();  
    if(id.length()==10 && "v".equals(id.substring(9))){
    birth();
    set();
    details dt = new details(); 
     name = jtext1.getText();
      dt.setVisible(true);
      dt.nan(name,age,gender,year,month,day,id);
    }else{
    JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(jbtn),"ID number not right","ERROR",JOptionPane.ERROR_MESSAGE);
    jtext2.setText("");
    }
}
public void birth(){
    GregorianCalendar da = new GregorianCalendar();
    year = Integer.parseInt(id.substring(0,2));
    age = da.get(Calendar.YEAR)-(1900+year);
    day = Integer.parseInt(id.substring(2,5));
    if(day<500){gender="male";}else{gender="female";day=day-500;}
    if(day<31){month="january";}else{day=day-31;
        if(day<29){month="february";}else{day=day-29;
            if(day<31){month="march";}else{day=day-31;
                if(day<30){month="april";}else{day=day-30;
                    if(day<31){month="may";}else{day=day-31;
                        if(day<30){month="june";}else{day=day-30;
                            if(day<31){month="july";}else{day=day-31;
                                if(day<31){month="august";}else{day=day-31;
                                    if(day<30){month="september";}else{day=day-30;
                                        if(day<31){month="octomber";}else{day=day-31;
                                            if(day<30){month="november";}else{day=day-30;
                                                if(day<31){month="december";}
                                                else{ JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(jbtn),"ID number not right","ERROR",JOptionPane.ERROR_MESSAGE);
                                                     jtext2.setText("");}
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
public void set(){
     String url = "jdbc:mysql://localhost:3306/nic nomber";
    String username ="root";
    String password ="";
    Connection con =null;
    PreparedStatement pat =null;
    try{
           con =(Connection)DriverManager.getConnection(url,username,password);
           String query ="INSERT INTO nic VALUES(?,?,?,?,?)";
           pat=(PreparedStatement)con.prepareStatement(query);
           pat.setInt(1,0);
           pat.setString(2,jtext1.getText());
           pat.setString(3,jtext2.getText());
           pat.setString(4,year+month+day);
           pat.setInt(5,age);
           pat.executeUpdate();
       }catch(Exception e){
           System.out.print(e);
       }
}
public static void main(String[] args){
     try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nicjfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nicjfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nicjfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nicjfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            new Nicjfram().setVisible(true);
        }
    });
   
} 
}