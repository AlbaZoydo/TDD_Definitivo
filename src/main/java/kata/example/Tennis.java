package kata.example;

public class Tennis{
    private int p1;
    private int p2;
    private String cero="Love";
    private String quince="Fifteen";
    private String treinta="Thirty";
    private String cuarenta="Forty";
    private String punto="";
    private String punto2="";
    //Marca quien tiene la ventaja, 0=ninguno, 1=jugador1, 2=jugador2
    private int server=0;
    public Tennis(int p1, int p2){
        this.p1=p1;
        this.p2=p2;
    }
    //Que puntuacion tiene cada jugador en string
    public String puntaje(int persona){
        switch(persona){
            case 0:
                return cero;
            case 15:
                return quince;
            case 30:
                return treinta;
                
            case 40:
                return cuarenta;
            default:
                return "Error";
        }

    }

    //ventaja
    public void servir (int quien){
        server=quien;
    }
    public String advantage(int p){
        if(server==p){
            return "Gana "+p;
        }
        else if (p1==41){
            return "Ad-in";
        }
        else{
            return "Ad-out";
        }
    }


    //pone el puntaje de ambos jugadores
    public void set(int puntaje, int puntaje2){
        p1=puntaje;
        p2=puntaje2;
    }
    //Pone el puntaje de un jugador
    public void setp1(int puntaje, int player){
        if(player==1){
            p1=puntaje;
        }
        else{
            p2=puntaje;
        }
    }
    //Metodo principal
    public String puntos(){
        if(p1==41){
            return advantage(1);
        }
        else if (p2==41){
            return advantage(2);
        }
        
        punto= puntaje(p1);
        punto2=puntaje(p2);

        if(p1==p2){
            if(p1==40){
                return "Deuce";
            }
            else{
                return punto+" | All";
            }
        }
        else{
            return punto+" | "+punto2;
        }
    }

}