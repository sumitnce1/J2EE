package studentresultsystem;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class StudentResultSystem {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
       splash Splash=new splash();
       Splash.setVisible(true);
       try{
              for(int i=0; i<=100; i++){
                  Thread.sleep(30);
                  Splash.loadingno.setText(Integer.toString(i)+"%");
                  splash.bar.setValue(i);
                  if(i==100){
                      Splash.setVisible(false);
                      new Login().setVisible(true);
                  }
          } 
       } catch (InterruptedException e){
              
          }
          
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(StudentResultSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
