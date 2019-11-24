/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runable;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Estébane
 */
public class ProofInstallation {
    private final File preuve;
    private final String[] content;
    public ProofInstallation(File f) throws IOException{
        this.preuve=f;
        this.content=Other.UtilsFunctions.getFileContent(this.preuve).split( System.lineSeparator() );
    
    }
    public String getName(){
        String output=null;
        for( String line:this.content ){
            if( line.contains("N") ){
                output=line;
                break;
            }
        }
    return output.split("=")[1];
    }
    public String getSetupPath(){
       String output=null;
        for( String line:this.content ){
            if( line.contains("P") && line.contains("a") && line.contains("t") && line.contains("h") ){
                output=line;
                break;
            }
        }
    return output.split("=")[1];
    }
    public String getStartInstallationDate(){
        String output=null;
          for( String line:this.content ){
              if( line.contains("C") && line.contains("r") 
                  && line.contains("e") && line.contains("a") 
                  && line.contains("/") ){
                  output=line;
                  break;
              }
          }
    return output.split("=")[1];
    }
    public String getStopInstallationDate(){
        String output=null;
          for( String line:this.content ){
              if( line.contains("S") && line.contains("t") 
                  && line.contains("o") && line.contains("p") 
                  && line.contains("/") && line.contains(":") ){
                  output=line;
                  break;
              }
          }
    return output.split("=")[1];
    }
    public String getFirstLuchedDate(){
        String output=null;
          for( String line:this.content ){
              if( line.contains("S") && line.contains("t") 
                  && line.contains("a") && line.contains("r")
                  && line.contains("i") && line.contains("m") 
                  && line.contains("/") && line.contains(":") ){
                  output=line;
                  break;
              }
          }
    return output.split("=")[1];
    }
      public String getLastLuchedDate(){
       String output=null;
          for( String line:this.content ){
              if( line.contains("L") && line.contains("a") 
                  && line.contains("s") && line.contains("t") 
                  &&line.contains("c") && line.contains("d")
                  && line.contains("/")){
                  output=line;
                  break;
              }
          }
    return output.split("=")[1];
    }
}
