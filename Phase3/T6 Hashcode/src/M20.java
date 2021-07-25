class B
{int i;
B(int i)
{this.i=i;}
}
public class M20 {
    public static void main(String[] args) {
        B a1=new B(10);
        
        B a2=new B(10);
      
        
        System.out.println(a1.hashCode());
        System.err.println(a2.hashCode());
        
    }
    
}