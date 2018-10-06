package br.edu.ifpb.pos.chat.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author jose
 */
public interface Client extends Remote {

    void atualizar(String mensagem) throws RemoteException;
    
    String getNickName() throws RemoteException;
}
