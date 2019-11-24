package Other;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
/**
 *
 * @author Estébane
 */
public class ScanFile extends functions {
    private File fichier=null;
    private Path chemin=null;//= Paths.get(p.getAbsolutePath());
    BasicFileAttributes details =null;// Files.readAttributes(file, BasicFileAttributes.class);
    //private BasicFileAttributes detailsView=null;//=Files.getFileAttributeView(p, BasicFileAttributeView.class).readAttributes();
    public ScanFile(String inputPath){
        try{
            this.fichier=new File(inputPath);
            this.chemin=this.fichier.toPath();
            //this.detailsView=Files.getFileAttributeView(this.chemin, BasicFileAttributeView.class).readAttributes();
            this.details=Files.readAttributes(this.chemin, BasicFileAttributes.class);
            System.out.println("Chargement du fichier Effectué");
        }catch(IOException e){
             System.err.println("*******Oups**********\nErreur de Chargement du fichier!");
             System.out.println(e.getMessage());
        } 
    }
    public String getName(){
        return this.fichier.getName();
    }
    public String getPath(){
        return this.fichier.getAbsolutePath();
    }
    public String getCreatedDate(){
        return dateToReadableValue( this.details.creationTime() );
    }
    public String getLastModifiedDate(){
        return dateToReadableValue( this.details.lastModifiedTime() );
    }
    public String getLastAccesDate(){
        return dateToReadableValue( this.details.lastAccessTime() );
    }
    public long getSize(){
        return this.details.size();
    }
    public String getPermission(){
        String output="";
        if( this.fichier.canRead() ){
            output = output.concat("r");
        }else{
            output = output.concat("-");
        }
        if( this.fichier.canWrite() ){
            output = output.concat("w");
        }else{
           output = output.concat("-");
        }
        if( this.fichier.canWrite() ){
           output = output.concat("x");
        }else{
            output = output.concat("-");
        }
    return output+output+output;
    }
    public String getOwner() throws IOException{
        return Files.getOwner(this.chemin).toString();
    }
    public String getType(){
        String output = "";
        int separatorPosition = this.chemin.toString().lastIndexOf(".");
        if( separatorPosition == -1){
            output = "###";
        }else{
            output = this.chemin.toString().substring( separatorPosition ); 
        }
    return output;
    }

    public String getLastAccessDate() {
        return functions.dateToReadableValue( this.details.lastAccessTime() );
    }

    public String LastModifiedDate() {
        return functions.dateToReadableValue( this.details.lastModifiedTime() );
    }
}
