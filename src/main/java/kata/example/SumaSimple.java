package kata.example;

public class SumaSimple {
    private float total=0;
    private String cadena="";
    private String simbolo=",";
    private String simbolo2="\n";
    public SumaSimple(String cad){
        cadena=cad;
    }
    //metodo para cambiar la cadena a sumar
    public void set(String cad){
        cadena=cad;
    }
    //El simbolo no se puede dar
    public String simboloError(){
        return "Error: simbolo no valido";
        
    }
    //La cadena no es valida
    public String cadenaError(){
        return "Error: cadena no valida";
        
    } 
    public String suma(){
        //Reiniciar los valores por si se vuelve a llamar al metodo suma
        total=0;
        simbolo=",";
        
        //Si la cadena no esta vacia, se procede a sumar
        if(!cadena.isEmpty()){
            //Si la cadena empieza con //, el simbolo delimitador cambia
            if(cadena.startsWith("//")){
                //Si el simbolo es de mas de un caracter
                int pos=cadena.indexOf(simbolo2);
                
                simbolo=cadena.substring(2,pos);
                cadena=cadena.substring(pos+1);
            }
            //Si el simbolo es un numero, devuelve un error
            
            if(cadena.endsWith(simbolo)||cadena.endsWith(simbolo2)){
                return cadenaError();
            }
            
            //Si la cadena termina con el simbolo, devuelve un error
            if(simbolo.matches("[0-9]+")){
                return simboloError();
            }
            //Detectar la cadena dividida por el simbolo y sumar los numeros
            else{
                String cachito[]=cadena.split(simbolo + "|" + simbolo2 + "|"+",");
                for (int i = 0; i < cachito.length; i++) {

                    // Detectar elementos vacíos antes de convertirlos
                    if (cachito[i].isEmpty()) {
                        return "Dos delimitadores juntos";
                    }

                    // Sumar solo si el elemento es válido
                    total += Float.parseFloat(cachito[i]);
                }

            }   
        }
        if (total == (int) total) {
            return String.valueOf((int) total);
        }
        return String.valueOf(total);
        
    }
}
