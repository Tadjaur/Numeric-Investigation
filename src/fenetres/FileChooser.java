/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetres;

import java.io.File;
import java.io.IOException;
import java.lang.Exception;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Estébane
 */
public class FileChooser {
   private final JFileChooser fen;
   private final int returnValue;
   public FileChooser(){
       this.fen = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
       this.returnValue=this.fen.showOpenDialog(fen);
   }
   public String getSelectedPath(){
       String err="Error\n";
       try{
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                 File selectedFile = this.fen.getSelectedFile();
                 return selectedFile.getAbsolutePath();
             }
            else{
                return "Uknown "+err;
            }
       }catch(Exception e){
           return err+e.getMessage();
       }
   }
		
}
