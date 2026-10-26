package kata.example;

public class Suma {
    private int total=0;
    private String cadena="";

    public Suma(String cad){
        cadena=cad;
    }

    public int suma(){
        if(!cadena.isEmpty()){
            String cachito[]=cadena.split(",");
            for(int i=0; i<cachito.length; i++){
                total+=Integer.parseInt(cachito[i]);
            }

        }
        return total;
    }
}
