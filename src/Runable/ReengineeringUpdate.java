/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runable;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Estébane
 */
public class ReengineeringUpdate {
    File rapport = null;
    String[] content=null;
    public ReengineeringUpdate( String chemin) throws IOException{
        this.rapport = new File(chemin);
        this.content=Other.UtilsFunctions.getFileContent(this.rapport).split( System.lineSeparator() );
    }
    public int getNumber(){
        return this.content.length;
    }
    public String getlog(){
        Pattern  updateCode = Pattern.compile( "#(.*?)#");
        Matcher mat = null;
        String lineTmp=null;
        String output = new String("");
        for( String line:this.content ){
           lineTmp = line.replace("{","#").replace("}","#");
           mat = updateCode.matcher(lineTmp);
            if( 
                    mat.find() 
                    && line.lastIndexOf("x") != -1
                    && line.lastIndexOf(":") != -1
                    && line.lastIndexOf("(") != -1
                    && line.lastIndexOf(")") != -1
                ){
                output += ""
                        + line.subSequence(line.lastIndexOf("(")+1, line.lastIndexOf(")")) 
                        + "\t"
                        + mat.group(1)
                        +"\t"
                        + line.subSequence(line.lastIndexOf("x")-1, line.length()) 
                        +"\t"
                        + line.subSequence(line.indexOf("+")-24, line.lastIndexOf("+")+5 )
                        +"\n"
                        +"";
            }
        }
    return output;
    }
    
}
