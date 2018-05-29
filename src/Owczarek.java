public class Owczarek extends Zegar {
    Owczarek(){
        about = "Owczarek";
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
        System.out.println("Dodaje kontur owczarka");
    }
    public void okleina(){
        System.out.println("Dodaje okleine owczarka");
    }
    public void wskazowki(){
        System.out.println("Dodaje wskazowki owczarka");
    }

}
