package org.bancoma;

public class Main
{
    public static void main(String[] args)
    {
        SimCardComponent mySimCard = new PlainSimCardConcreteComponent();

        System.out.print("Instanzio una sim base: ");
        System.out.println(mySimCard.getOfferDescription());

        System.out.print("Il costo della sim vuota è: ");
        System.out.println(mySimCard.getPrice());

        /* ENTRO IN UN CENTRO TIM E ATTIVO LA GIGA MUSIC */

        SimCardComponent myActivatedSimCard = new GigaMusicXLConcreteDecorator(new PlainSimCardConcreteComponent());
        System.out.println(myActivatedSimCard.getOfferDescription());
        System.out.println(myActivatedSimCard.getPrice());
    }
}
