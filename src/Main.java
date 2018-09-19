
/**
 * Autor : Emilian Ossowski
 * Implementacja wzorca Factory
 *
 * Tworzone obiekty są null, wyświetlają tylko odpowiednie metody w odpowiednich miejsch
 * Producent produkuje zegar i zwraca go jako null
 * **/


public class Main {
    public static void main(String[]args){

        Producent producent = new Producent();
        Zegar[] tab = new Zegar[3];

        tab[0] = producent.produkcjaZegaru("Spaniel");
        System.out.println("--------------------------------------------------------------");
        tab[1] = producent.produkcjaZegaru("Owczarek");
        System.out.println("--------------------------------------------------------------");
        tab[2] = producent.produkcjaZegaru("Pudel");
    }
}
