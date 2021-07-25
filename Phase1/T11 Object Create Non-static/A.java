class A

{
int i,j=10;
static void print(A obj)
{
System.out.println(obj.i);
System.out.println(obj.j);
}
public static void main(String args[])
{
A a1=new A();
print(a1);
a1.i=100; 
a1.j=200; 
print(a1);
}
}//  0 10 100 200