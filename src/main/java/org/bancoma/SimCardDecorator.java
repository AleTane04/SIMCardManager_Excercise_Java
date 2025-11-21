package org.bancoma;

public abstract class SimCardDecorator implements SimCardComponent
{
    protected SimCardComponent simcard;

    public SimCardDecorator(SimCardComponent simcard)
    {
        this.simcard = simcard;
    }

    @Override
    public String getOfferDescription()
    {
        return simcard.getOfferDescription();
    }

    @Override
    public double getPrice()
    {
        return simcard.getPrice();
    }

}
