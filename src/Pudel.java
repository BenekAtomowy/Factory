public class Pudel extends Zegar {
    Pudel(){
        about = "Pudel";
    }

    @Override
    public Zegar dawajZegar() {
        System.out.println(about);
        kontur();
        okleina();
        wskazowki();
        baterie();
        napis();

        return null;
    }
    public void kontur(){
        System.out.println("Dodaje kontur pudla");
    }
    public void okleina(){
        System.out.println("Dodaje okleine pudla");
    }
    public void wskazowki(){
        System.out.println("Dodaje wskazowki pudla");
    }
}
