/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portscanner;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vistas.MainFrame;

/**
 *
 * @author rjbr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
              new PantallaCargandoMain();
         MainFrame mf = new MainFrame();
        mf.setVisible(true);
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
       
    }
    
}
