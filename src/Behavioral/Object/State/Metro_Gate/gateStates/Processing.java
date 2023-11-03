package Behavioral.Object.State.Metro_Gate.gateStates;

import Behavioral.Object.State.Metro_Gate.Gate;
import Behavioral.Object.State.Metro_Gate.State;

public class Open extends State {


     public Open() {

    }
    @Override
    public State open() {
        return this;
    }

    @Override
    public State close(){
         return super.CLOSE;
    }

    @Override
    public State processing(){
         return super.PROCESSING;
    }
}
