package Other; 

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

//import com.developpez.adiguba.shell.Shell;
import static java.util.concurrent.TimeUnit.SECONDS;

public class UtilsCmd {
//    private Shell sh=new Shell();
    private String output;
    public UtilsCmd(String commandeDos) throws IOException{
//        this.sh.setCharset("utf-8");
//        this.output = this.sh.command(commandeDos).consumeAsString();
    }
    public String getWirelessActivity(){
        return this.output;
    }

}
