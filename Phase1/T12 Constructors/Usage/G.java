class G
{
int i;
G()
{

System.out.println("G()");
}
G(int m)
{
this();
System.out.println("G(int)");

i=m;
}
public static void main(String args[])
{
G g1=new G(100);
G g2=new G();
System.out.println(g1.i);
System.out.println(g2.i);
}
}
//G(int)  G(int) G()  100 10