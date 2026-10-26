package kata.example;

public class FizzBuzz{
    private int num;
    private String f="Fizz";
    private String b="Buzz";
    public FizzBuzz(int num){
        this.num=num;
    }
    public String mult3(){
        
        if(num%3==0){
            return f;
        }
        else{
            return Integer.toString(num);
        }

    }
    public String mult5(){
        
        if(num%5==0){
            return b;
        }
        else{
            return Integer.toString(num);
        }

    }
    public String mult3y5(){
        
        if(num%5==0 && num%3==0){
            return f+b;
        }
        else{
            return Integer.toString(num);
        }

    }
}