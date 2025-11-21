package org.bancoma;

public abstract class SimCardDecorator implements SimCardComponent
{
    protected SimCardComponent simCard;

    public SimCardDecorator(SimCardComponent simCard)
    {
        this.simCard = simCard;
    }

    @Override
    public String getOfferDescription()
    {
        return simCard.getOfferDescription();
    }

    @Override
    public double getPrice()
    {
        return simCard.getPrice();
    }

}
