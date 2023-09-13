import first.*;
import second.PerfectClass;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        //first.Fruit myFruit = new first.Fruit();

/*
        Apple apple = new Apple("Bob");
        Banana banana = new Banana("Alfred");
*/

        //lambda
        Generator adder = (a, b) ->
        {
            System.out.println("my result: " + (a));
        }; //defining the method. adder is anon classs with only one method i think
        Generator subtractor = (a, b) ->
        {
            System.out.println("my result subtracting: " + (a-b));
        };
        //usually cant create instance of interface but here almost
        adder.DoMath(3, 6);
        adder.DoMath(6, 9);
        subtractor.DoMath(10, 6);


        Runnable doStuff = () ->
        {
            System.out.println("i did stuff YEEY");
        };
        doStuff.run();//. run nemae of the methd in runnable interfsce




        //two other ways to create anonymus classes:

        Generator anonymClass = new Generator()
        {
            public void MyOwnMethod()
            {

            }
            @Override
            public void DoMath(int a, int b) //here we are implementing the interface
            {

            }
        };


        Generator anonym2 = new PerfectClass() //anon implements interface and extends class
            //here we dont have to because our class that the anon extends already implements the intreface
        {
            public void AAh()
            {
                System.out.println("AAH");
            }

            public boolean YESYESYES()
            {
                AAh();
                return true;
            }

        };
        
        //this is not allowed, you cannot see this method from outside the anon class
        //anonymClass.MyOwnMethod

        //you can do this cause you know that your anon class implements this interface so it has to have an implementation of this method
        anonymClass.DoMath(3, 5);







        /*{

        ;creating threads:
        1- extending class threads
        2- using runnable interface

        does class thread implement runnable? YES


        anon classes: when crete a class inside a method

        annotation: override and obsolete (tells programer method has neen replaced by newer version)
         */

        //apple.numOfFruits = 10;

        //apple.Count();
        /*
        accessibility keywords - more readebe, expandleble, maintanable for big projects
        public: anyone can access it
        protected: only child classes can access it
        private: only you can access it, so child no
        nothing: package private

        package basvally just a folder where u put the classes u want -->

        locks: if i have two threads and they run at same time and we put wait t1 loses its key lock and waits for t2 to finish and then
        t2 notifies t1 it can procede

         */
    }
}