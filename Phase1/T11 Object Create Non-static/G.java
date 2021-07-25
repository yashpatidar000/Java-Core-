class G
{int x,y=3;
public static void main(String args[])
{
G obj1=new G();

G obj2=obj1;

obj1.y=5;
obj2.y=55;



System.out.println(obj1.y);
System.out.println(obj2.y);
System.out.println(obj2.x);
System.out.println(obj1.x);


}
}//5 55 0 0