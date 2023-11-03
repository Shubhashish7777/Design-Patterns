package Behavioral.Object.State.Metro_Gate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class User {

    private UUID UserId;

    private BigDecimal currBalance;

    public User(BigDecimal currBalance) {
        this.currBalance = currBalance;
    }

    public BigDecimal getCurrBalance() {
        return currBalance;
    }

    public void setCurrBalance(BigDecimal currBalance) {
        this.currBalance = currBalance;
    }



}
