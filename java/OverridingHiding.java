class SuperClass
{
public static void testClass()
{
System.out.println(" The class method in super class");
}
public void testInstance()
{
System.out.println(" The instance method in super class");
}
}
class SubClass extends SuperClass
{
public void testClass()
{
System.out.println(" The class method in sub class");
}
public void testInstance()
{
System.out.println(" The instance method in sub class");
}
}
class OverridingHiding
{
public static void main(String[]args)
{
SuperClass s=new SubClass();
//SuperClass.testClass();
//SuperClass.testInstance();
s.testClass();
s.testInstance();
}
}