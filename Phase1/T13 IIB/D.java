class D
{
int i;
void print()
{
System.out.println(i);
}
}
class Manager
{
public static void main(String args[])
{
D d1=new D();
d1.print();
d1.i=10;
d1.print();
d1.i=20;
d1.print();

System.out.println(d1.i);

}
}