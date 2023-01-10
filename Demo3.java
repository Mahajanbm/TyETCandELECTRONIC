class Demo3
{
static int m=80;
}
class Demo4
{
int n=33;
}
class Demo5
{ static int y=50;
int x=100;
static Demo3 d3=new Demo3();


/*System.out.println("Demo 3 class");*/

public static void main(String args[])
{ int a=40;
Demo4 d4=new Demo4();

//System.out.println(d3.x);

System.out.println(Demo3.m);

System.out.println(d4.n);

}



}