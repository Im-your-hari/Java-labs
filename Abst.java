abstract class shape
{
    public abstract void numberOfSides();
}
class Rectangle extends shape
{
    public void numberOfSides()
    {
        System.out.println("No of sides =4");
    }
}
class Triangle extends shape
{
    public void numberOfSides()
    {
        System.out.println("No of sides =3");
    }
}
class Hexagon extends shape
{
    public void numberOfSides()
    {
        System.out.println("No of sides =6");
    }
}
class Abst
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}