/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dfz6
 */
public class CreateTools {
    
    public static void msgBox(String massage){
     
        JOptionPane.showMessageDialog(null, massage);
    }
    
    public static void createFolder(String folderName , String path){ // creaate folder in given path
    
        File folder=new File(path+"/"+folderName);
        folder.mkdir();
    }
    
     public static void createFolder(String folderName ){// create folder in java project
    
        File folder=new File(folderName);
        folder.mkdir();
    }
     
     public static void openForm(JFrame form){ // open any form in the project ,just send the name of form
         
        try {
            form.setLocationRelativeTo(null);
            Image img=ImageIO.read(CreateTools.class.getResource("avatar2.png"));
            form.setIconImage(img);
            form.setVisible(true);
            
        } catch (IOException ex) {
            Logger.getLogger(CreateTools.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public static void clearText(Container form){// بياخد اى كونتينر
      
         for(Component c :form.getComponents()){ //بيلف على كل كومنت
         
             if( c instanceof JTextField){// لو لا قيت اى تكست فيلد
             
                JTextField txt =(JTextField) c;//حطه فى تكست فيلد
                txt.setText("");
             
             } else if (c instanceof Container){ // لو لاقيته من نوع كونتينر جوه كونتير لف و اغمل الداله تانى
               clearText((Container) c);
             }
         
         }
    
     }
     
     public static void createEmptyFile(String fileName){
     
         File f= new File(fileName);
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(CreateTools.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
     
      public static void createEmptyFiles(String[] filesName) {
        for (String fileName : filesName) {

            File f = new File(fileName);
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(CreateTools.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public static void createFile(String fileName, Object data[]){// نحلق فيل ةنكتب
        try {
            PrintWriter p = new PrintWriter(fileName);
            for (Object obj : data) {

                p.println(obj);
            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateTools.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
        public static void createFiles(String [] fileName, Object data[][]){// نحلق فيل ةنكتب
     
            for( int x=0 ; x< fileName.length ;x++){
                createFile(fileName[x] , data[x]);
                
            }
           

    }

     
     public static String  inputBox(String txt){
         String obj=JOptionPane.showInputDialog(txt);
         return obj;
}
     
     public static String getNumberFromString(String text){
         
         String value="";
        for(char c : text.toCharArray()){
            if(c=='0' ||c=='1' || c=='2' || c=='3' ||c=='4' ||c=='5' || c=='6' || c=='7' || c=='8' ||c=='9' ){
                value+=c;
            }
        }
         return value;
     }
     
      public static String removeNumberFromString(String text){
         
         String value="";
        for(char c : text.toCharArray()){
            if(!(c=='0' ||c=='1' || c=='2' || c=='3' ||c=='4' ||c=='5' || c=='6' || c=='7' || c=='8' ||c=='9' )){
                value+=c;
            }
        }
         return value;
     }
      
      
     
}
