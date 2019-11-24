
package Other;

import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

/**
 *
 * @author Estébane
 */

public abstract class functions {
 
    public static String dateToReadableValue( FileTime creationDate){
        String readableValue=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(creationDate.toMillis());
        return readableValue;
    }
    public static String getOsName(){
        return System.getProperty("os.name");
    }
    public static String getPcName(){
        return System.getenv().get("COMPUTERNAME");
    }
    public static String getUserName(){
        return System.getProperty("user.name");
    }
}   /*
    public String osName = new String();
        public String pcName = new String();
        public String userName = new String();
            this.osName = System.getProperty("os.name");
            this.pcName = System.getenv().get("COMPUTERNAME");
            this.userName = System.getProperty("user.name");
    */