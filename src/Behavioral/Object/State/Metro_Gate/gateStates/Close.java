package Behavioral.Object.State.Metro_Gate.gateStates;

import Behavioral.Object.State.Metro_Gate.Gate;
import Behavioral.Object.State.Metro_Gate.State;

public class Open extends State {


    public Open() {

    }

    @override
    public State Open(){

        return this;
    }

    public State Close(){

        return this;
    }

    public State Processing(){

        return this;
    }


}
