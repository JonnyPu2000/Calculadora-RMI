package Comum;

import java.io.Serializable;

public class MsgReq implements Serializable {
    private float op1;
    private float op2;

    public MsgReq(){}

    public MsgReq(float op1, float op2){

        this.op1 = op1;
        this.op2 = op2;

    }

    public float getOp1() {
        return this.op1;
    }

    public void setOp1(float op1) {
        this.op1 = op1;
    }

    public float getOp2() {
        return this.op2;
    }

    public void setOp2(float op2) {
        this.op2 = op2;
    }

    

    


}
