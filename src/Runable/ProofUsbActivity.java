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
public class ProofUsbActivity {
    String[] content = null;
    public ProofUsbActivity( String chemin) throws IOException{
        File f = new File(chemin);
        this.content=Other.UtilsFunctions.getFileContent( f ).split( System.lineSeparator() );
    }
    public String getProof(){
        String output = new String("***");
        /*for( String str : this.content ){
            output += str + "\n";
        }*/
    return output;
    }
}
