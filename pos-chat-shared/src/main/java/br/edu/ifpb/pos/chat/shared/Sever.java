package br.edu.ifpb.pos.chat.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author jose
 */
public interface Sever extends Remote {

    void comentar(String nick, String mensagem) throws RemoteException;

    String inscrever(Client clint) throws RemoteException;

    void sairDoChat(Client clint) throws RemoteException;
}
