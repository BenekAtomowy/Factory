
/**
 * Autor : Emilian Ossowski
 * Abstrakcyjna klasa ze którą dziedziczą podklasy Spaniel, Owczarek i Pudel
 *
 * Do kazdego zegaru dodawan są baterie i napis
 * **/

abstract public class Zegar {
    protected String about;
    public abstract Zegar dawajZegar();

    protected void baterie(){
        System.out.println("Dodaje baterie");
    }
    protected void napis(){ System.out.println("Dodaje napis"); }
}
