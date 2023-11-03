package Behavioral.Object.State.Metro_Gate.gateStates;

import Behavioral.Object.State.Metro_Gate.Gate.Gate;
import Behavioral.Object.State.Metro_Gate.User;
import Behavioral.Object.State.Metro_Gate.utils.PaymentProcessor;

import java.math.BigDecimal;

public class Processing extends State {


     public Processing() {

    }
    @Override
    public State open(User user, Gate gate) {

        if (PaymentProcessor.processPayment(user, gate.getGateFee())){
            System.out.println("PAYMENT SUCCESFUL. THE GATE IS OPEN. PLEASE PROCEED");
            return super.OPEN;
        }
        else {
            System.out.println("PAYMENT FAILED. PLEASE RECHARGE");
            return super.CLOSE;
        }
    }

    @Override
    public State close(User user, Gate gate){
        System.out.println("DID NOT PROCEED WITH PAYMENT. GATE CLOSED");
         return super.CLOSE;
    }

    @Override
    public State processing(User user, Gate gate){
        System.out.println("YOU have already processed. Try to open the gate. ");
         return this;
    }
}
