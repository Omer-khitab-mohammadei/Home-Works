package displaying prime numbers;
public class DisplayingPrimeNumbers {
    boolean primenumber (int x){
    if (x<2){
        return false;
    }else {
    for (int i = 2; i<x;i++){
     if((x%i==0)^(x==2)){
     return false;
     }   
     
    }
    return true;
    }
    
    }
    public static void main(String[] args) {
    DisplayingPrimeNumbers obj = new Displaying_Prime_Numbers();
    int x = 2;       
      for (int i = 1 ; i<=50;){     
           if (obj.primenumber(x)){
               System.out.print(x+" ");
           
           if(i%10==0){
               System.out.println("");
           } 
           i++;
    }
           x++;
    
    }
    
}}
