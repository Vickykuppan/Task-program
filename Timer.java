import java.util.Scanner;
public class Timer
{
public static void main(String args[])
{
String a,b;
long totalTime;
Scanner sc=new Scanner(System.in);
System.out.println("START TIME");
a=sc.next();
if(a=="1")
System.out.println("TIMER IS STARTED");
long startTime=System.currentTimeMillis();
System.out.println("END TIME");
b=sc.next();
if(b=="0")
System.out.println("TIMER IS ENDED");
long endTime=System.currentTimeMillis();
totalTime=(endTime-startTime);
System.out.println("TOTAL TIME "+totalTime +" MS");
sc.close();
}
}
