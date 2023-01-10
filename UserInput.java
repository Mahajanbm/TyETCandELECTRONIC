import java.util.*;
class UserInput
{
static  void getData()
{

int a,b;
int Result;
Scanner s1=new Scanner(System.in);
System.out.println("Enter 1st number");
a=s1.nextInt();
System.out.println("Enter 2nd number");
b=s1.nextInt();

Result=a+b;

System.out.println("Addition is "+Result);

}


 public static void  main(String args[])
{
UserInput u1=new UserInput();
UserInput.getData();
//getData();



}



}