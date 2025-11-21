package org.bancoma;

public class GigaMusicXLConcreteDecorator extends SimCardDecorator
{
    public GigaMusicXLConcreteDecorator(SimCardComponent simCard)
    {
        super(simCard);
    }

    @Override
    public String getOfferDescription()
    {
        return simCard.getOfferDescription() + "\n GIGA MUSIC XL ATTIVA. Questa offerta prevede 200GB in 5G e Apple Music al costo di 6.99 euro al mese.";
    }

    @Override
    public double getPrice()
    {
        return simCard.getPrice() + 2.00;
    }
}
