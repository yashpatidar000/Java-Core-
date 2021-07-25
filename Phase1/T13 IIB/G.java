class G
{
int i;
}
class H
{
void print()
{
G g1=new G();
g1.i=10;
System.out.println(g1.i);
}
}
class Manager
{
public static void main(String args[])
{
H h1=new H();
h1.print();
System.out.println("done");
}
}