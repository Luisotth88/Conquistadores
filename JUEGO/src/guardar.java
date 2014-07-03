
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class guardar {
    
    
     public jugador leer(){
         
         File file = new File("save.txt");
         FileInputStream fis = null;
         BufferedInputStream bis = null;
         DataInputStream dis = null;
         String split=";";
         String[] linea=new String[10];
         jugador d=null;
         try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
         
                        
                
            while (dis.available() != 0) {
                linea = dis.readLine().split(split);}
                d=new jugador(linea[0],Long.parseLong(linea[1]),Boolean.parseBoolean(linea[2]),Boolean.parseBoolean(linea[3]),
                Boolean.parseBoolean(linea[4]),Boolean.parseBoolean(linea[5]),Boolean.parseBoolean(linea[6]),Boolean.parseBoolean(linea[7]),
                  Boolean.parseBoolean(linea[8]),Boolean.parseBoolean(linea[9]),Boolean.parseBoolean(linea[10]));
                        
                
                                              
           }catch (IOException e) {
			e.printStackTrace();
    
    
             }
           return d;
    }
    public void escribir(jugador d){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("dato.txt");
            pw = new PrintWriter(fichero);
 
            
                pw.println(""+d.getNombre()+";"+""+d.getPuntaje()+";"+""+d.isC1()+";"+""+d.isC2()+";"+""+d.isC3()+";"+""+d.isC4()+";"+""+d.isC5()
                +";"+""+d.isC6()+";"+""+d.isC7()+";"+""+d.isC8()+";"+""+d.isC9());
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
}
