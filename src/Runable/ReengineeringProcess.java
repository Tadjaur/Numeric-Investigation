/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runable;
import java.io.File;
/**
 *
 * @author Estébane
 */
public class ReengineeringProcess {
    private Other.UtilsFile metaData=null;
    public ReengineeringProcess( File f ){
        this.metaData = new Other.UtilsFile( f );
    }
    public String getName(){
        return this.metaData.getName().split(("-"))[0];
    }
    public String getLastRunning(){
        return this.metaData.getLastAccesDate();
    }
    public String getLogPath(){
        return this.metaData.getPath();
    }
}
