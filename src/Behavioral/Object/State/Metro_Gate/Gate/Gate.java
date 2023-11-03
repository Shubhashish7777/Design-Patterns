package Behavioral.Object.State.Metro_Gate.Gate;

import Behavioral.Object.State.Metro_Gate.gateStates.State;
import Behavioral.Object.State.Metro_Gate.User;

import java.math.BigDecimal;

public class Gate {


    private  State currState = State.CLOSE;

    private BigDecimal gateFee ;

    public Gate(BigDecimal gateFee){
        this.gateFee= gateFee;
    }


    public void open (User user){
        currState=currState.open(user, this);
    }
    public void processing (User user){
        currState=currState.processing(user, this);
    }

    public void close (User user){
        currState= currState.close(user, this);
    }

    public BigDecimal getGateFee() {
        return gateFee;
    }

    public void setGateFee(BigDecimal gateFee) {
        this.gateFee = gateFee;
    }
}
