package Servidor;
import Comum.*;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class CalcImplementacao extends UnicastRemoteObject implements Calculadora{

    public CalcImplementacao() throws RemoteException{
        super();
    };

    public MsgResp soma(MsgReq requisicao) throws RemoteException{
        
        MsgResp resp = new MsgResp();
        resp.setResultado(requisicao.getOp1() + requisicao.getOp2());
        resp.setStatus(0);
        return resp;

    };
    public MsgResp sub(MsgReq requisicao) throws RemoteException{

        MsgResp resp = new MsgResp();
        resp.setResultado(requisicao.getOp1() - requisicao.getOp2());
        resp.setStatus(0);
        return resp;

    };
    public MsgResp mult(MsgReq requisicao) throws RemoteException{

        MsgResp resp = new MsgResp();
        resp.setResultado(requisicao.getOp1() * requisicao.getOp2());
        resp.setStatus(0);
        return resp;

    };
    public MsgResp div(MsgReq requisicao) throws RemoteException{

        MsgResp resp = new MsgResp();
        if(requisicao.getOp2() != 0){
            resp.setResultado(requisicao.getOp1() / requisicao.getOp2());
            resp.setStatus(0);
        }
        else{
            resp.setStatus(2);
        }
        return resp;

    };
    
}
