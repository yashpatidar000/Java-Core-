class Person
{   String name;
    int age;
    double weight;
Person(String name,int age,double weight)
{
    this.name=name;
    this.age=age;
    this.weight=weight;
}

public String toString()
{return "name="+name+"\n"+"age="+age+"\n"+"weight="+weight;}

public boolean equals(Object obj)
{return (obj instanceof Person) && 
        (name==((Person)obj).name) &&
        (age==((Person)obj).age) &&
        (weight==((Person)obj).weight);}

public int hashcode()
{
    String s1=Integer.toString(age);
    String s2=Double.toString(weight);
    int hash=name.hashCode();
    hash=s1.hashCode();
    hash=s1.hashCode();
    return hash;
    
}
}
public class M22 {
    public static void main(String[] args) {
        Person a1=new Person("abc",10,55.6);
        Person a2=new Person("abc",10,55.6);
      
        System.out.println(a1);
        System.out.println(a2);
        
        System.out.println(a1.equals(a2));
        
        System.out.println(a1.hashCode());
        System.err.println(a2.hashCode());
        
    }
    
}