package Behavioral.Object.State.Metro_Gate;

import Behavioral.Object.State.Metro_Gate.Gate.Gate;
import Behavioral.Object.State.Metro_Gate.gateStates.Close;
import Behavioral.Object.State.Metro_Gate.gateStates.Open;
import Behavioral.Object.State.Metro_Gate.gateStates.Processing;

public abstract class State {

    protected static final State OPEN = new Open();
    protected static final State CLOSE = new Close();
    protected static final State PROCESSING = new Processing();

    public abstract State open(User user);
    public abstract State close(User user);
    public abstract State processing(User user);


}
