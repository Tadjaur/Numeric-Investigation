/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Path;
/**
 *
 * @author Estébane
 */
public class ReengineeringFiles {
        //chemin vers les rapports d'activité lors de l'installation
    public final static String installActivityLog = new String( System.getenv("windir")+"\\Panther\\UnattendGC\\setupact.log");
        //chemin vers les rapports d'erreur lors de l'installation
    public final static String installActivityErr = new String( System.getenv("windir")+"\\Panther\\UnattendGC\\setuperr.txt");
        //chemin vers le rapport d'execution des processus windows par les utilisateurs
    public final static String setupInstalledFold = new String( System.getenv("windir")+"\\prefetch");
        //chemin vers le rapport de mises à jour
    public final static String updateLog = new String( System.getenv("windir")+"\\SoftwareDistribution\\ReportingEvents.log");
    
}
