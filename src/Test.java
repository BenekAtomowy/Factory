import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Autor : Emilian Ossowski
 *
 *
 * Testy jednostkowe dla implementacji wzorca Factory
 * wszystkie testy sprawdzają czy utworzone obiekty są nullami
 * **/

public class Test {
    Producent producent = new Producent();
    Zegar[] tab = new Zegar[3];
    @Before
    public void setUp(){
        tab[0] = producent.produkcjaZegaru("Spaniel");
        tab[1] = producent.produkcjaZegaru("Owczarek");
        tab[2] = producent.produkcjaZegaru("Pudel");
    }

    @org.junit.Test
    public void test1(){
        assertTrue(tab[0] == null);
    }

    @org.junit.Test
    public void test2(){
        assertNull(tab[1] );
    }

    @org.junit.Test
    public void test3(){
        assertTrue(tab[2] ==tab[1] && tab[2] == tab[0] );
    }

}