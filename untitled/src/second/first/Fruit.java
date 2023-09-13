package first;

public abstract class Fruit implements MyInterfaceI
{
    public int numOfFruits = 0;

    protected String name;

    private int myExpireDate = 2;

    public int GetExpireDate()
    {
        return myExpireDate;
    }

    public void SetExpireDate(int newDate)
    {
        myExpireDate = newDate;
    }

    public Fruit(String name)
    {
        this.name = name;
        System.out.println("myName is : " + name);
        System.out.println("I: " + name + " am so happy :) YEEY");
    }

    public Fruit()
    {

    }

    public void Count()
    {
        numOfFruits++;
        System.out.println("first.Fruit count -> " + this.numOfFruits);
        DefinedMethod();
    }

    @Override
    public void Something(int apples)
    {

    }

    @Override
    public void DefinedMethod()
    {
        MyInterfaceI.super.DefinedMethod();

    }

    public abstract void MyMethodWhichIsAbstract();
    // can only have in abstract class, but can have normal methods in an abstract class
    //cant instantiate an abstract class
    //abstract class- cant instantiate. why contructor? cause in children classes we can call contructor in their constructor
    //if they share the same code
    // one would use an interface instead of abstract because u can implement multiple --> readabuility
    //

    public abstract void MakeSound();

    private void Say()
    {

    }

}
