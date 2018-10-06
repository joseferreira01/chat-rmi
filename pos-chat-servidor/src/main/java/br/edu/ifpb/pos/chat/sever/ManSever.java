package br.edu.ifpb.pos.chat.sever;



import br.edu.ifpb.pos.chat.shared.Sever;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class ManSever {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sever sever;
        try {
            sever = new SeverImpl();
            LocateRegistry.createRegistry(1099);
//            Naming.rebind("//localhost:1099/Sever", sever);
            Naming.rebind("//host-rmi:1099/Sever", sever);
            System.out.println("serviço ativo.");
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(ManSever.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
