import java.util.*;
class  Demo
{
public static void main(String args[])
{
int rollno;
String name;
String dept;
float  percentage;
Scanner s1=new Scanner(System.in);
System.out.println("Enter Student roll no");
rollno=s1.nextInt();
System.out.println("Enter Student name");
name=s1.next();
System.out.println("Enter Student dept");
dept=s1.next();
System.out.println("Enter Student percentage");
percentage=s1.nextFloat();
System.out.println(" Student rollno is "+rollno);
System.out.println(" Student name is "+name);
System.out.println(" Student dept is "+dept);
System.out.println(" Student percentage is "+percentage);

}

}