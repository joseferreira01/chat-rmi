package br.edu.ifpb.pos.man;

import br.edu.ifpb.pos.chat.shared.Client;
import br.edu.ifpb.pos.chat.shared.Sever;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu nickName: ");
        String nickName = scanner.nextLine();

        try {
            Sever servidor = (Sever) Naming.lookup("//localhost:1099/Sever");
//            Sever servidor = (Sever) Naming.lookup("//host-rmi:1099/Sever");
            Client client = new ClientImpl(nickName);

            String retorno = servidor.inscrever(client);
            if (!retorno.equalsIgnoreCase("ok")) {
                do {
                    System.out.print("Esse nickName Já esta em uso: ");
                    System.out.print("Por favor infome outro :) ");
                    nickName = scanner.nextLine();
                      client = new ClientImpl(nickName);

                    retorno = servidor.inscrever(client);
                } while (!retorno.equalsIgnoreCase("ok"));
            }

            String msg;
System.err.println("Pode escrever! :)");
            while (true) {
                
                msg = scanner.nextLine();
                servidor.comentar(nickName, msg);
                if (msg.equals("sair")) {
                    servidor.sairDoChat(client);
                    System.out.println(nickName + " saiu.");
                    System.exit(0);
                }
            }

        } catch (RemoteException | NotBoundException | MalformedURLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
