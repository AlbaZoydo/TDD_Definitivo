package kata.example;

public class Suma {
    private float total=0;
    private String cadena="";
    private String simbolo=",";
    private String simbolo2="\n";

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
                //Si el simbolo es de mas de un caracter
                int pos=cadena.indexOf(simbolo2);
                
                simbolo=cadena.substring(2,pos);
                cadena=cadena.substring(pos+1);
            }
            //Si el simbolo es un numero, devuelve un error
            if(simbolo.matches("[0-9]+")){
                return "Error: simbolo no valido";
            }
            //Si la cadena termina con el simbolo, devuelve un error
            else if (cadena.endsWith(simbolo)||cadena.endsWith(simbolo2)){
                return "Error: cadena no valida";
            }
            //Detectar la cadena dividida por el simbolo y sumar los numeros
            else{
                String cachito[]=cadena.split(simbolo + "|" + simbolo2 + "|"+",");
                for(int i=0; i<cachito.length; i++){
                    //Si hay dos simbolos juntos, devuelve un error
                    if(cachito[i].isEmpty()){
                        char s=cadena.substring(i+2).charAt(0);
                        if(simbolo.equals(",")){
                            return "Error: Number expected but " + cadena.substring(i+1).charAt(0) + " found at position " + i*(simbolo.length()+1);
                        }
                        else if (s=='\n'){
                        
                            return "Error: '" + simbolo + "' expected but '\\n' found at position " + i*(simbolo.length()+1);
                        }
                        else{
                            return "Error: '" + simbolo + "' expected but '" + cadena.substring(i+3).charAt(0) + "' found at position " + i*(simbolo.length()+1);
                        }
                    }
                    total+=Float.parseFloat(cachito[i]);
                }
            }   
        }
        if (total == (int) total) {
            return String.valueOf((int) total);
        }
        return String.valueOf(total);
    }
}
