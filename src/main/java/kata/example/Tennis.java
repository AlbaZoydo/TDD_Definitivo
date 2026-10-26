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
    public Tennis(int p1, int p2){
        this.p1=p1;
        this.p2=p2;
    }
    
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
    
    public String puntos(){
        punto= puntaje(p1);
        punto2=puntaje(p2);

        if(p1==p2){
            if(p1==40){
                return "Deuce | All";
            }
            else{
                return punto+" | All";
            }
        }
        
        else{
            return "";
        }
    }

}