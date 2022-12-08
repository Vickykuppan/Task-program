import java.util.Scanner;
public class Billing
{
public static void main(String[] args)
{
double Injection,Glucose,Mask,Sanitizer,totalAmount;
double InjectionPrice=10.0,GlucosePrice=150.0,MaskPrice=10.0,SanitizerPrice=50.0;
double Injection1=0,Glucose1=0,Mask1=0,Sanitizer1=0;
Scanner sc = new Scanner(System.in);
System.out.println("*******PHARMACY PRODECTS*******");
System.out.println("choose 1 for Injection");            
System.out.println(" choose 2 for Glucose");  
System.out.println( " choose 3 for Mask");
System.out.println(" choose 4 for Sanitizer");     
System.out.println("choose 5 for totalcost");
int n=0;
while(n!=5)
{
System.out.println("ENTER YOUR DESIRED PRODUCT ID");
n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("ENTER THE QUANTITY FOR YOUR PRODUCT");
Injection=sc.nextDouble();
Injection1=Injection*InjectionPrice;
break;
case 2:
System.out.println("ENTER THE QUANTITY FOR YOUR PRODUCT");
Glucose=sc.nextDouble();
Glucose1=Glucose*GlucosePrice;
break;
case 3 :
System.out.println("ENTER THE QUANTITY FOR YOUR PRODUCT");
Mask=sc.nextDouble();
Mask1=Mask*MaskPrice;
break;
case 4 :
System.out.println("ENTER THE QUANTITY FOR YOUR PRODUCT");
Sanitizer=sc.nextDouble();
Sanitizer1=Sanitizer*SanitizerPrice;
break;
case 5:
System.out.println("            TRAP Pharmacy        ");
System.out.println("                Medical bill recepit        ");
System.out.println("********************************************* ");
System.out.println("*********************************************");
System.out.println("product          price          quantity          total");
System.out.println(" ");
if(Injection1>0)
System.out.println("Injection          "+InjectionPrice+"          "+ Injection1/InjectionPrice+"              "+(Injection1));
if(Glucose1>0)
System.out.println( "Glucose           "+GlucosePrice+"          "+ Glucose1/GlucosePrice+"               "+(Glucose1));
if(Mask1>0) 
System.out.println( "Mask             "+MaskPrice+"            "+ Mask1/MaskPrice+"               "+(Mask1));
if(Sanitizer1>0)
System.out.println( "Sanitizer         "+SanitizerPrice+"   3
.

        "+ Sanitizer1/SanitizerPrice+"                "+(Sanitizer1));

totalAmount=Injection1+Glucose1+Mask1+Sanitizer1;
System.out.println("*********************************************** ");
System.out.println("***********************************************");
System.out.println("Sub total:  "+totalAmount);
System.out.println("************************************************");
System.out.println(" ");
System.out.println("நோய்நாடி நோய்முதல் நாடி அதுதணிக்கும் ");   
  System.out.println ("வாய்நாடி வாய்ப்பச் செயல்.");
 System.out.println ("  ");
 System.out.println ("!!**********THANKYOU************PLEASE COME AGAIN***********!!");
break;
default: 
System.out.println("invalid entry");
}
}
}
}
