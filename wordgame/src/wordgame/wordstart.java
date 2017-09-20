 
package wordgame;
 import java. io.*;
import javax.swing.JOptionPane;

 public class wordstart implements Runnable {
     int scores=0;
     int x =0;
     public void score(){
         scores +=10;
         System.out.println(scores);
     }
     public int scor(){
     return scores;
     }
    
    Thread myt;
        public void run() {
        for (;;) {
           System.out.println("sss");
            try {
                Thread.sleep(5000);
                System.out.println("ooo");
                x=5;
                Wordgame wg = new Wordgame();
                wg.set();
                myt.stop();
                
            } catch (InterruptedException ie) {
            }
        }
    }
    void Train(){
          myt = new Thread(this);
          myt.start();
          
     }
    int num(){
       return x;
    }

 public static void main(String[] args) {
       wordstart t = new wordstart();
        t.Train(); 
}
    
 }
