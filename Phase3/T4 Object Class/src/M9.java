
class H {
    int x;
    public String toString()
    {return "x="+x;}
}

class I extends H
{
int y;
public String toString()
{
return super.toString()+",y="+y;
}
}

public class M9 {
    public static void main(String[] args) {
        H f1=new H();
        f1.x=10;
        System.out.println(f1);
        
        I g1=new I();
        g1.x=10;
        g1.y=20;
        System.out.println(g1);
     }
    
}
