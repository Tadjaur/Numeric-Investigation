/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.min;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

/**
 *
 * @author Estébane
 */
public class UtilsFunctions {
      //fonction qui converti un timestamp en une chaine de caractère lisible et comprehensible
    public static String dateToReadableValue( FileTime creationDate){
        String readableValue=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(creationDate.toMillis());
        return readableValue;
    }
    public static String getFileContent(File f) throws FileNotFoundException, IOException{
         String everything = new String();
         try ( BufferedReader br = new BufferedReader( new FileReader(f)) ){
             StringBuilder sb = new StringBuilder();
             String line = br.readLine();
             while(line != null){
                 sb.append(line);
                 sb.append(System.lineSeparator());
                 line=br.readLine();
             }
             everything = sb.toString();
         }
        String output="";
        for( String line:everything.split(System.lineSeparator()) ){
            if( line.length()>5 ){
                output += line + System.lineSeparator();
            }
        }
    return output;
    }
    
}

