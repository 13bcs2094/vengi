import java.util.Scanner;
public class num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=0)
{
   int s=n%100;
   System.out.println(s);
}
   else
   {
       System.out.println(0);
   }
}
}
