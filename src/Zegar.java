abstract public class Zegar {
    protected String about;
    public abstract Zegar dawajZegar();

    protected void baterie(){
        System.out.println("Dodaje baterie");
    }
    protected void napis(){ System.out.println("Dodaje napis"); }
}
