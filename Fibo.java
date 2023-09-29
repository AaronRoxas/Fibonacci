import java.util.Scanner;
public class Fibo 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        
        int f1 = 0;
        int f2 = 1;
        int f3;
        String display = "";
        
        for(int i= 0; i < n; ++i)
        {
            f3 = f1+f2;
            
            display+=f3 + ", ";
            f1=f2;
            f2=f3;
        }
        System.out.println(display);
    }
    
}
