package Behavioral.Object.State.Metro_Gate.utils;

import Behavioral.Object.State.Metro_Gate.User;

import java.math.BigDecimal;

public class PaymentProcessor {

    public static  Boolean processPayment (User user , BigDecimal fee){
        if (user.getCurrBalance().compareTo(fee) > 0){
            user.setCurrBalance(user.getCurrBalance().subtract(fee));
            return true;
        }
        return false;

    }
}
