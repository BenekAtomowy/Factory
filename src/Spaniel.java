public class Spaniel extends Zegar{

    public Spaniel(){
        about = "Zegar Spaniel";
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
    private void kontur(){
        System.out.println("Dodaje kontur spaniela");
    }
    private void okleina(){
        System.out.println("Dodaje okleine spaniela");
    }
    private void wskazowki(){
        System.out.println("Dodaje wskazowki spaniela");
    }

}
