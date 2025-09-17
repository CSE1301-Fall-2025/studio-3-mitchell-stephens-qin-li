
import java.util.Scanner;
public class Sieve {

  
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the maximum value?");
        int answer = scan.nextInt();
        boolean[] booleanArray = new boolean [answer];
        for(int u = 0; u<answer; u++)
        {
            booleanArray[u]= true;
        }

        for(int i = 2; i<Math.sqrt(answer); i++) {
            if (booleanArray[i] == true){
                for (int j = i*i; j<answer; j = j + i ){
                    booleanArray[j] = false;
                }
            }

        }

        for(int i = 2; i< answer; i++)
        {
            if(booleanArray[i] == true)
            {
                System.out.println(i);
            }
        }

        

    }
    
}