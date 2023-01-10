import java.util.Scanner;
class StringData
{
public static void main(String args[])
{
int rollno;
float percentage;
String name,city,state,country;
Scanner s1=new Scanner(System.in);
System.out.println("Enter Student rollno");
rollno=s1.nextInt();
System.out.println("Enter Student Name");
name=s1.next();
System.out.println("Enter Student city");
city=s1.next();
System.out.println("Enter Student state");
state=s1.next();
System.out.println("Enter Student Country");
country=s1.next();
System.out.println("Enter Student percentage");
percentage=s1.nextFloat();

System.out.println("Student roll no  is " +rollno);
System.out.println("Student Name is " +name);
System.out.println("Student city is " +city);
System.out.println("Student state is " +state);
System.out.println("Student Country is " +country);
System.out.println("Student percentage is " +percentage);
}



}