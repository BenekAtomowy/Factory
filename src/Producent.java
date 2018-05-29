

public class Producent {


        public Zegar produkcjaZegaru(String about){
            Zegar zegar = null;


            if(about.equalsIgnoreCase("Spaniel")){
                zegar = new Spaniel();
            }
            else if(about.equalsIgnoreCase("Owczarek")){
                zegar = new Owczarek();
            }
            else if(about.equalsIgnoreCase("Pudel")){
                zegar = new Pudel();
            }
            return zegar.dawajZegar();
        }

}
