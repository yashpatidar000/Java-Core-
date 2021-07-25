class T
{
int i,j;
static T test1()
{
return new T();
}
static T test2()
{
T t1=new T();
t1.i=10;
return t1;
}
static T test3(T obj)
{
obj=test2();
System.out.println(obj.i+"from test3");
obj.i=100;
return obj;
}
public static void main(String args[])
{
T t1=test1();
System.out.println(t1.i);

T t2=test3(test1());
System.out.println(t2.i);

T t3=test3(test2());
System.out.println(t3.i);

T t4=test3(t3);
System.out.println(t4.i);
T t5=test2();
System.out.println(t5.i);
}
}