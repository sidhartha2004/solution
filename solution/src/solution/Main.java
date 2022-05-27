package solution;
import java.util.*;
public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s =new Solution();
        String max= s.toHex(n);
        System.out.println(max);
    }
}