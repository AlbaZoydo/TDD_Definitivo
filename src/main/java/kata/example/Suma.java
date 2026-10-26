package kata.example;

public class Suma {
    private int total=0;
    private String cadena="";
    private String simbolo=",";

    public Suma(String cad){
        cadena=cad;
    }
    //metodo para cambiar la cadena a sumar
    public void set(String cad){
        cadena=cad;
    }
    public String suma(){
        //Reiniciar los valores por si se vuelve a llamar al metodo suma
        total=0;
        simbolo=",";
        //Si la cadena no esta vacia, se procede a sumar
        if(!cadena.isEmpty()){
            //Si la cadena empieza con //, el simbolo delimitador cambia
            if(cadena.startsWith("//")){
                simbolo=cadena.substring(2,3);
                cadena=cadena.substring(4);
            }
            //Si el simbolo es un numero, devuelve un error
            if(simbolo.matches("[0-9]+")){
                return "Error: simbolo no valido";
            }
            //Si la cadena termina con el simbolo, devuelve un error
            else if (cadena.endsWith(simbolo)){
                return "Error: cadena no valida";
            }
            //Detectar la cadena dividida por el simbolo y sumar los numeros
            else{
                String cachito[]=cadena.split(simbolo);
                for(int i=0; i<cachito.length; i++){
                    //Si hay dos simbolos juntos, devuelve un error
                    if(cachito[i].isEmpty()){
                        return "Error: cadena no valida";
                    }
                    total+=Integer.parseInt(cachito[i]);
                }
            }   
        }
        return String.valueOf(total);
    }
}
