package org.bancoma;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PlainSimCard implements SimCard
{
    @Override
    public String getOfferDescription()
    {
        return "Questa è una scheda SIM";
    }

    @Override
    public double getPrice()
    {
        return 9.99;
    }
}