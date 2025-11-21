package org.bancoma;

public class GigaMusicXLConcreteDecorator extends SimCardDecorator
{
    public GigaMusicXLConcreteDecorator(SimCard simcard)
    {
        super(simcard);
    }

    @Override
    public String getOfferDescription()
    {
        return simcard.getOfferDescription() + "\nQuesta offerta prevede 200GB in 5G e Apple Music al costo di 6.99 euro al mese.";
    }

    @Override
    public int getCost()
    {
        return simcard.getCost() + 2.00;
    }
}
