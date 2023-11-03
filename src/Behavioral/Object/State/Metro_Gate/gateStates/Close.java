package Behavioral.Object.State.Metro_Gate.gateStates;

import Behavioral.Object.State.Metro_Gate.Gate.Gate;
import Behavioral.Object.State.Metro_Gate.User;

public class Close extends State {


    public Close() {
    }
    @Override
    public State open(User user, Gate gate){

        System.out.println("PLEASE PAY FIRST");
        return this;
    }

    @Override
    public State close(User user, Gate gate){
        System.out.println("GATE IS ALREADY CLOSED");
        return this;
    }

    @Override
    public State processing(User user, Gate gate){

        System.out.println("PROCESSING INITIATED. PLEASE PAY NOW");
        return super.PROCESSING;
    }


}

