class Test1
{
int a ,b,c,d,e,Result;

 void getData(int a,int b,int c,int d,int e)
{
this.a=a;
this.b=b;
this.c=c;
this.d=d;
this.e=e;

}

void display()
{
Result =a+b+c+d+e;
System.out.println(Result);

}


public static void main(String args[])
{
Test1 t1=new Test1();
getData(10,20,50,60,50);
t1.display();
}


}