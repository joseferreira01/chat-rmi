package br.edu.ifpb.pos.charcliente;

import br.edu.ifpb.pos.chat.shared.Client;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author jose
 */
public class ClientImpl extends UnicastRemoteObject implements Client {

    private String nickName;

    public ClientImpl(String nickName) throws RemoteException {
        this.nickName = nickName;
    }

    @Override
    public void atualizar(String mensagem) throws RemoteException {
        System.out.println(mensagem);
    }

    @Override
    public String getNickName() throws RemoteException {
        return this.nickName;
    }

}
