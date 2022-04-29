package Comum;

import java.io.Serializable;

public class MsgResp implements Serializable {

    private float resultado;
    private int status;

    public MsgResp(){}

    public MsgResp(float resultado, int status){

        this.resultado = resultado;
        this.status = status;

    }

    public float getResultado() {
        return this.resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
