import java.util.*; 

public class main { 
  public static int calculaMDC(int x, int y){
    if(x>y){
      return calculaMDC(x-y,y); 
    }else if(y>x){
      return calculaMDC(y,x); 
    }else{ return x; 
    } 
  } 

  public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in); 
    System.out.print("Digite o valor do x: "); 
    int x = sc.nextInt(); 
    System.out.print("Digite o valor do y: "); 
    int y = sc.nextInt(); 
    System.out.println(calculaMDC(x,y)); 
    sc.close(); 
  } 
}
