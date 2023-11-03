package Behavioral.Object.State.Metro_Gate.gateStates;

import Behavioral.Object.State.Metro_Gate.Gate.Gate;
import Behavioral.Object.State.Metro_Gate.User;

public abstract class State {


    public static final State OPEN = new Open();
    public static final State CLOSE = new Close();
    public static final State PROCESSING = new Processing();

    public abstract State open(User user, Gate gate);
    public abstract State close(User user, Gate gate);
    public abstract State processing(User user, Gate gate);


}
