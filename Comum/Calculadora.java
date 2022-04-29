package Comum;
import java.rmi.*;

public interface Calculadora extends Remote{

    public MsgResp soma(MsgReq requisicao) throws RemoteException;
    public MsgResp sub(MsgReq requisicao) throws RemoteException;
    public MsgResp mult(MsgReq requisicao) throws RemoteException;
    public MsgResp div(MsgReq requisicao) throws RemoteException;

}