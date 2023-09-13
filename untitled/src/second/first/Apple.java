package first;

import java.lang.annotation.Annotation;

public class Apple extends Fruit
{

    public int numOfFruits = 5;



    public Apple(String name)
    {
        super(name);

    }



    @Override
    public void Count()
    {
        super.Count();
        //System.out.println("first.Apple count -> " + numOfFruits);
    }

    @Override
    public void MyMethodWhichIsAbstract() {

    }

    @Override
    public void MakeSound() {

    }

}
