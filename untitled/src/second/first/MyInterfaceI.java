package first;

public interface MyInterfaceI
{

    public final String customvar = "someVar";

    /*
    abstract method: u define it but dont implement it, define it exists

     */

    void Something(int apples);
    //kind of like an abstract method cause we arent defining anything

    //you are not defining this method here, but rather in each of the classes individually who implement this interface thus this method


    default void DefinedMethod()
    {
        System.out.println("defined here in myint");
    }
}
