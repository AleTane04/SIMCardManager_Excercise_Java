package org.bancoma;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PlainSimCardConcreteComponent implements SimCardComponent
{
    @Override
    public String getOfferDescription()
    {
        return "Questa è una scheda SIM";
    }

    @Override
    public double getPrice()
    {
        return 4.99;
    }
}