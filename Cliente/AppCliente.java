package Cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import Comum.Calculadora;
import Comum.MsgReq;
import Comum.MsgResp;

public class AppCliente {
    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o primeiro Número: ");
        float op1 = in.nextFloat();
        
        System.out.println("Digite o segundo Número: ");
        float op2 =  in.nextFloat();

        System.out.println("Digite uma Operação (+,-,/,*): ");
        char operacao = in.next().charAt(0);


        MsgReq requisicao = new MsgReq(op1,op2);

        Calculadora calculadora = (Calculadora) Naming.lookup("rmi://localhost:1099/Calculadora");

        
        MsgResp resposta =  new MsgResp();
        switch(operacao){
            case '+':
                resposta =  calculadora.soma(requisicao);
                break;
            case '-':
                resposta =  calculadora.sub(requisicao);
                break;
            case '*':
                resposta =  calculadora.mult(requisicao);
                break;
            case '/':
                resposta =  calculadora.div(requisicao);
                break;
        }
        if(resposta.getStatus() !=2){
            System.out.println("O resultado é: " + resposta.getResultado());
        }
        else{
            System.out.println("Não faça divisão por 0");
        }
        

    }
    
}
