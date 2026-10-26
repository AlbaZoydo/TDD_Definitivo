package kata.example;

public class Suma {
    private int total=0;
    private String cadena="";
    private String simbolo=",";
    public Suma(String cad){
        cadena=cad;
    }
    public void set(String cad){
        cadena=cad;
    }
    public String suma(){
        total=0;
        simbolo=",";
        if(!cadena.isEmpty()){
            if(cadena.startsWith("//")){
                simbolo=cadena.substring(2,3);
                cadena=cadena.substring(4);
            }
            if(simbolo.matches("[0-9]+")){
                return "Error: simbolo no valido";
            }
            else if (cadena.endsWith(simbolo)){
                return "Error: cadena no valida";
            }
            else{
                String cachito[]=cadena.split(simbolo);
                for(int i=0; i<cachito.length; i++){
                    total+=Integer.parseInt(cachito[i]);
                }
            }   
        }
        return String.valueOf(total);
    }
}
