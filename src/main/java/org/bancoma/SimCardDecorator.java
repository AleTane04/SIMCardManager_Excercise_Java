package org.bancoma;

public abstract class SimCardDecorator implements SimCardComponent
{
    protected SimCardDecorator simcard;

    public SimCardDecorator(SimCard simcard)
    {
        this.simcard = simcard;
    }

    @Override
    public String getOfferDescription()
    {
        return simcard.getOfferDescription();
    }

    @Override
    public int getCost()
    {
        return simcard.getCost();
    }

}
