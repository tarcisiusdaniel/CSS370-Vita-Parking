    carvpackage Customer;

import java.util.*;

public abstract class PaymentImpl implements PaymentInfo
{
    private long cardNumber;

    PaymentImpl(long cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public long getCardNumber()
    {
        return cardNumber;
    }

    public void setCardNumber(long newCardNumber)
    {
        this.cardNumber = newCardNumber;
    }
    
    public String toString()
    {
        return "Credit Card Number: " + cardNumber;
    }
}
