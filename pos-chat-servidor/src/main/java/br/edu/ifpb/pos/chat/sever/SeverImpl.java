package br.edu.ifpb.pos.chat.sever;
import br.edu.ifpb.pos.chat.shared.Client;
import br.edu.ifpb.pos.chat.shared.Sever;
import static java.awt.Toolkit.getDefaultToolkit;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class SeverImpl extends UnicastRemoteObject implements Sever {

    private List<Client> clients;

    public SeverImpl() throws RemoteException {
        this.clients = new ArrayList<>();
    }

    @Override
    public void comentar(String nickName, String mensagem) throws RemoteException {
        for (Client client : clients) {
            if(!nickName.equalsIgnoreCase(client.getNickName()))
            client.atualizar(nickName + " Escreveu: " + mensagem);
            getDefaultToolkit().beep();
        }
    }

    @Override
    public String inscrever(Client cliente) throws RemoteException {

        for (Client c : clients) {
            if (c.getNickName().equals(cliente.getNickName())) {
                return "erro";
            }
        }

        clients.add(cliente);
        System.out.println(cliente.getNickName()+" omline");

        return "ok";
    }

    @Override
    public void sairDoChat(Client cliente) throws RemoteException {
        
        clients.remove(cliente);
        System.out.println(cliente.getNickName() + " saiu.");
    }

}
