package Behavioral.Object.State.Metro_Gate;

import java.math.BigDecimal;
import java.util.UUID;

public class Ticket {

    private UUID ticketID;
    private BigDecimal ticketCost;

    public Ticket(BigDecimal ticketCost) {
        this.ticketID = UUID.randomUUID();
        this.ticketCost = ticketCost;
    }



}
