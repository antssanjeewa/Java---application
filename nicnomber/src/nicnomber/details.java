package nicnomber;
 
import java.awt.Color;
import javax.swing.JOptionPane;

public class details extends javax.swing.JFrame {
    public details(){
        componant();
        
    }
    private javax.swing.JPanel panel;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JButton btn;
    public void componant(){
        
        panel = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        btn =new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YOUR DETAILS");
        panel.setBackground(Color.PINK);
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("YOUR DETAILS"));
        label1.setFont(new java.awt.Font("Tahoma", 1, 24));
        btn.setText("ok");
     btn.addActionListener(new java.awt.event.ActionListener(){
        public void actionPerformed(java.awt.event.ActionEvent evt){
             btnActionperformed(evt);
        }

        });    
    javax.swing.GroupLayout PLayout = new javax.swing.GroupLayout(panel);
    panel.setLayout(PLayout);
    PLayout.setHorizontalGroup(
       PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(30)       
       .addGroup(PLayout.createParallelGroup()
       .addComponent(label1)
       .addComponent(label2)
       .addComponent(label3)
       .addComponent(label4)
       .addComponent(label5))
       .addGroup(PLayout.createSequentialGroup()        
       .addGap(200)
       .addComponent(btn))
    );
    PLayout.setVerticalGroup(
       PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(PLayout.createSequentialGroup()
                .addGap(10)
                .addComponent(label1).addGap(20)
                .addComponent(label2).addGap(10)
                .addComponent(label3).addGap(10)
                .addComponent(label4).addGap(10) 
                .addComponent(label5).addGap(0) .addComponent(btn)
               .addGap(0))
    );    
    javax.swing.GroupLayout Layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(Layout);
    Layout.setHorizontalGroup(
       Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(panel,javax.swing.GroupLayout.PREFERRED_SIZE,300,javax.swing.GroupLayout.PREFERRED_SIZE)
       .addGap(0)
    );
    Layout.setVerticalGroup(
       Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(panel,javax.swing.GroupLayout.PREFERRED_SIZE,200,javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(0)
    );
   pack(); 
    }
    public void btnActionperformed(java.awt.event.ActionEvent evt){
        int option = JOptionPane.showConfirmDialog(this,"you want to continue","THANK YOU",JOptionPane.YES_NO_OPTION);
        if(option==(JOptionPane.YES_OPTION)){
             Nicjfram n = new Nicjfram();
             n.setVisible(true);
        }else{
        System.exit(0);
    }}

    void nan(String name, int age, String gender, int year, String month, int day,String id) {
         Nicjfram nj = new Nicjfram();
        
        label1.setText("          "+name);
        label2.setText("        age       :  "+age);
        label3.setText("        id number :  "+id);
        label5.setText("        gender    :  "+gender);
        label4.setText("        birth day :  "+"19"+year+"-"+month+"-"+day);
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
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            new details().setVisible(true);
        }
    });
    } 

     
    
    
}
    

