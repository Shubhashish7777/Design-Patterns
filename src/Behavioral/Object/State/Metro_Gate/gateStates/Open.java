package Behavioral.Object.State.Metro_Gate.gateStates;

import Behavioral.Object.State.Metro_Gate.Gate.Gate;
import Behavioral.Object.State.Metro_Gate.User;

public class Open extends State {


    public Open() {

    }
    @Override
    public State open(User user, Gate gate) {
        System.out.println("THE GATE IS ALREADY OPEN");
        return this;
    }

    @Override
    public State close(User user, Gate gate){
        System.out.println("CLOSING THE GATE");
         return super.CLOSE;
    }

    @Override
    public State processing(User user, Gate gate){
        System.out.println("NO NEED TO PAY . GATE IS ALREADY OPEN");

         return this;
    }
}
