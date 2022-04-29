package Servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import Comum.*;

public class AppServidor {
    public static void main(String[] args) throws RemoteException, MalformedURLException {

        Calculadora calculadora = new CalcImplementacao();

        LocateRegistry.createRegistry(1099);

        Naming.rebind("rmi://localhost:1099/Calculadora", calculadora);
        
    }
    
}
