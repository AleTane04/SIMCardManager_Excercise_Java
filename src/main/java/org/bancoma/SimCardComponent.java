package org.bancoma;

/*
    Questa è la funzionalità "core" di una scheda SIM.
 */


public interface SimCardComponent
{
    String getOfferDescription();
    double getPrice();
}
