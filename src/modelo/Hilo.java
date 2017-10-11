/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JTextArea;
import vistas.MainFrame;

/**
 *
 * @author rjbr
 */
public class Hilo implements Runnable {

   public  Thread j;
   public static String cmd, mtr;
     public String url,nombre,inputLine;
    public String pingRes, pingCmd = "";
    public String getUrl() {
        return url;
    }

    
    public void setUrl(String url) {
        this.url = url;
    }

    public Hilo(String nombre) {

        this.nombre = nombre;
//        this.mtr=mtr;
        j = new Thread(this, nombre);
//       this.print = new JTextArea();
//       this.print.setText(mtr);
    }

    
      public void start() {

        this.j.start();
    }

    public void stop() {

        this.j.stop();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void run() {

        try {
            while (true) {
                
                pingRes = "";
                pingCmd = "ping " + url + " -t";
                try {
                    Runtime r = Runtime.getRuntime();
                    Process p = r.exec(pingCmd);

                    BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
//                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        System.out.println(inputLine);
                        pingRes += inputLine;
                       mtr += inputLine + "\n";                 

cmd+=mtr;


                    }
                    in.close();

                } catch (IOException e) {
                    System.out.println(e);
                }
                j.sleep(1000);
            }

        } catch (java.lang.InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
//    
  

    @Override
    public String toString() {
        return cmd;
    }
    
}



