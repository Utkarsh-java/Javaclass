class MyClass
{
int x;
static int i=0;
}
class Demo1
{
public static void main(String []args)
{
MyClass m1= new MyClass();
m1.i=1;
m1.x=5;
MyClass m2= new MyClass();
m2.i=2;
m2.x=8;
MyClass m3= new MyClass();
m3.i=99;
m3.x=23;
System.out.println("Value of i="+m1.i);
System.out.println("Value of x="+m1.x);
}
}