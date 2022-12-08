import java.util.Scanner;
public class Count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count=0;
int num;
System.out.println("ENTER THE NUMBER");
num=sc.nextInt();
while(num!=0)
{
count++;
num=sc.nextInt();
}
System.out.println("count is ---> " + count);


}
}
