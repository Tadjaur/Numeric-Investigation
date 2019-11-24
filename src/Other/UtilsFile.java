package Other;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import Other.UtilsFunctions;
/**
 *
 * @author Estébane
 */


public class UtilsFile {
    private File fichier=null;
    private Path chemin=null;//= Paths.get(p.getAbsolutePath());
    BasicFileAttributes details =null;// Files.readAttributes(file, BasicFileAttributes.class);
    //private BasicFileAttributes detailsView=null;//=Files.getFileAttributeView(p, BasicFileAttributeView.class).readAttributes();
    public UtilsFile(String inputPath){
        try{
            this.fichier=new File(inputPath);
            this.chemin=this.fichier.toPath();
            //this.detailsView=Files.getFileAttributeView(this.chemin, BasicFileAttributeView.class).readAttributes();
            this.details=Files.readAttributes(this.chemin, BasicFileAttributes.class);
            //System.out.println("Chargement du fichier Effectué");
        }catch(IOException e){
             System.err.println("*******Oups**********\nErreur de Chargement du fichier!");
        } 
    }
     public UtilsFile(File inputFile){
        try{
            this.fichier=inputFile;
            this.chemin=this.fichier.toPath();
            //this.detailsView=Files.getFileAttributeView(this.chemin, BasicFileAttributeView.class).readAttributes();
            this.details=Files.readAttributes(this.chemin, BasicFileAttributes.class);
            //System.out.println("Chargement du fichier Effectué");
        }catch(IOException e){
             System.err.println("*******Oups**********\nErreur de Chargement du fichier!");
        } 
    }
     public String getName(){
        return this.fichier.getName();
    }
    public String getPath(){
        return this.fichier.getAbsolutePath();
    }
    public String getCreatedDate(){
        return Other.UtilsFunctions.dateToReadableValue( this.details.creationTime() );
    }
    public String getLastModifiedDate(){
        return  Other.UtilsFunctions.dateToReadableValue( this.details.lastModifiedTime() );
    }
    public String getLastAccesDate(){
        return  Other.UtilsFunctions.dateToReadableValue( this.details.lastAccessTime() );
    }
}
