package kata.example;

public class Suma {
    private float total=0;
    private String cadena="";
    private String simbolo=",";
    private String simbolo2="\n";
    private boolean error=false;
    private String msg="";
    public Suma(String cad){
        cadena=cad;
    }
    //metodo para cambiar la cadena a sumar
    public void set(String cad){
        cadena=cad;
    }
    //Detectar el multiple error
    public void error(){
        error=true;
    }
    //Negativos
    public String Negativos(String[] cachito){
        error();
        String negativos="";
        for(int j=0; j<cachito.length; j++){
            if(cachito[j].matches("-[0-9]+")){
                negativos+=cachito[j]+", ";
            }
        }
        return "Error: Negatives not allowed: " + negativos.substring(0,negativos.length()-2);
    }
    
    //El simbolo no se puede dar
    public String simboloError(){
        error();
        return "Error: simbolo no valido";
        
    }
    //La cadena no es valida
    public String cadenaError(){
        error();
        return "Error: cadena no valida";
        
    }     
    //Para multiple error hay que separarlo
    public void multiple(){
        if(!msg.isEmpty()){
        msg+='\n';}

    }
    public String suma(){
        //Reiniciar los valores por si se vuelve a llamar al metodo suma
        error=false;
        msg="";
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
                msg+=cadenaError();
            }
            
            //Si la cadena termina con el simbolo, devuelve un error
            if(simbolo.matches("[0-9]+")){
                multiple();
                msg+= simboloError();
            }
            //Detectar la cadena dividida por el simbolo y sumar los numeros
            else{
                String cachito[]=cadena.split(simbolo + "|" + simbolo2 + "|"+",");
                for (int i = 0; i < cachito.length; i++) {

                    // Detectar elementos vacíos antes de convertirlos
                    if (cachito[i].isEmpty()) {
                        error();

                        int pos = i * (simbolo.length() + 1);
                        
                        if (simbolo.equals(",")) {                           
                            multiple();
                            msg += "Error: Number expected but "+cadena.charAt(pos)+ " found at position "+ pos;
                        } 
                        else if (cadena.charAt(pos)=='\n') {
                            multiple();
                            msg += "Error: '" + simbolo+"' expected but '\\n' found at position "+ pos;
                        }
                        else {
                            multiple();
                            msg += "Error: '" + simbolo+"' expected but '"+cadena.charAt(pos)+"' found at position "+ pos;
                        }

                        continue;
                    }
                    
                    // Detectar negativos
                    if (!error && Float.parseFloat(cachito[i]) < 0) {
                        multiple();
                        msg += Negativos(cachito);
                    }

                    // Sumar solo si el elemento es válido
                    total += Float.parseFloat(cachito[i]);
                }

            }   
        }
        if(error){
            return msg;
        }
        else{
        if (total == (int) total) {
            return String.valueOf((int) total);
        }
        return String.valueOf(total);
        }
    }

public String multiplica(){
        //Reiniciar los valores por si se vuelve a llamar al metodo suma
        error=false;
        msg="";
        total=1;
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
                msg+=cadenaError();
            }
            
            //Si la cadena termina con el simbolo, devuelve un error
            if(simbolo.matches("[0-9]+")){
                multiple();
                msg+= simboloError();
            }
            //Detectar la cadena dividida por el simbolo y sumar los numeros
            else{
                String cachito[]=cadena.split(simbolo + "|" + simbolo2 + "|"+",");
                for (int i = 0; i < cachito.length; i++) {

                    // Detectar elementos vacíos antes de convertirlos
                    if (cachito[i].isEmpty()) {
                        error();

                        int pos = i * (simbolo.length() + 1);
                        
                        if (simbolo.equals(",")) {                           
                            multiple();
                            msg += "Error: Number expected but "+cadena.charAt(pos)+ " found at position "+ pos;
                        } 
                        else if (cadena.charAt(pos)=='\n') {
                            multiple();
                            msg += "Error: '" + simbolo+"' expected but '\\n' found at position "+ pos;
                        }
                        else {
                            multiple();
                            msg += "Error: '" + simbolo+"' expected but '"+cadena.charAt(pos)+"' found at position "+ pos;
                        }

                        continue;
                    }
                    
                    // Detectar negativos
                    if (!error && Float.parseFloat(cachito[i]) < 0) {
                        multiple();
                        msg += Negativos(cachito);
                    }

                    // Sumar solo si el elemento es válido
                    total *= Float.parseFloat(cachito[i]);
                }

            }   
        }
        if(error){
            return msg;
        }
        else{
        if (total == (int) total) {
            return String.valueOf((int) total);
        }
        return String.format("%.1f", total);
        }
    }
}
