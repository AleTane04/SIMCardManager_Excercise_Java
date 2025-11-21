package org.bancoma;

public class GigaMusicXLConcreteDecorator extends SimCardDecorator
{
    protected SimCardComponent simcard;

    public GigaMusicXLConcreteDecorator(SimCardComponent simcard)
    {
        super(simcard);
    }

    @Override
    public String getOfferDescription()
    {
        return simcard.getOfferDescription() + "\nQuesta offerta prevede 200GB in 5G e Apple Music al costo di 6.99 euro al mese.";
    }

    @Override
    public double getPrice()
    {
        return simcard.getPrice() + 2.00;
    }
}
