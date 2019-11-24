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
public class ProofFiles {
        //chemin d'acces aux preuves d'activité des periphériques USB
    public final static String usbActivityLog= new String( System.getenv("windir")+"\\debug\\WIA\\wiatrace.log" );
         //chemin d'acces aux preuves d'installation des applications tierces
    public final static String thirdInstallationFold= new String( System.getenv("windir")+"\\appcompat\\Programs\\Install" );
         //chemin d'acces aux preuves de securité windows defender
    public final static String maliciousActivityLog= new String( System.getenv("windir")+"\\debug\\mrt.log" );
    
}
