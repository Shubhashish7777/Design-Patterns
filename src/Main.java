import Behavioral.Object.State.Metro_Gate.Gate.Gate;
import Behavioral.Object.State.Metro_Gate.User;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(BigDecimal.valueOf(200));
        Gate gate1 = new Gate(BigDecimal.valueOf(100));
        gate1.open(user1);
        gate1.close(user1);
        gate1.processing(user1);
        gate1.open(user1);
        gate1.close(user1);
        User user2 = new User(BigDecimal.valueOf(10));
        gate1.open(user2);
        gate1.close(user2);
        gate1.open(user1);
        Gate gate2 = new Gate(BigDecimal.valueOf(50));
        gate2.open(user1);
        gate2.close(user1);
        gate2.processing(user1);
        gate2.open(user1);


    }
}