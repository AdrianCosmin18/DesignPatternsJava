package Chapter1.exercises;

public class Exercises {

    //Which of the following are disadvantages of using inheritance to provide duck behavior ?

    //A.code is duplicated across subclasses
    //D.Hard to gain knowledge of all duck behaviors.


    //Reasons I have to change the code in my applications:
    //-if I don't mantain the code updated, the code will become useless
    //-constant maintenance on the code, it means to constantly new test data sets on the code, which means
    // that new cases can always appear


    //Using our design, what would you do if you needed to add rocket-powered flying to the SimUDuck app ?

    public interface FlyBehavior{

        void fly();
    }

//    public class FlyWithWings implements FlyBehavior{
//
//        @Override
//        public void fly(){
//            //implements duck flying
//        }
//    }

//    public class FlyNoWay implements FlyBehavior{
//
//        @Override
//        public void fly(){
//
//            //do nothing, can't fly
//        }
//    }

    public interface RocketPowered extends FlyBehavior {

        FlyBehavior flyBehavior = new FlyBehavior() {

            @Override
            public void fly(){
                System.out.println("I'm flying with rocket");
                //fly rocket power
            }
        };
    }



    public interface QuackBehavior{

        void quack();
    }

    public class Quack implements QuackBehavior{

        @Override
        public void quack() {
            //implements duck quack
            System.out.println("Quack");
        }
    }

    public class Squeak  implements QuackBehavior{

        @Override
        public void quack() {
            //nubber duckie squeak}
            System.out.println("Squeak");
        }
    }

    public class MuteQuack implements QuackBehavior{

        @Override
        public void quack(){
            //do nothing - can't quack!
            System.out.println("Mute");
        }
    }





    //Can you think of a class that might want to use the Quack behavior that isn't a duck ?
    //R:A class named "Sound" that can makes duck sounds.



    public abstract class Duck{

        FlyBehavior flyBehavior;
        QuackBehavior quackBehavior;

        public Duck(){}

        public abstract void display();

        public void performFly(){

            flyBehavior.fly();
        }

        public void performQuack(){

            quackBehavior.quack();
        }

        public void swim(){

            System.out.println("All ducks float, even decoys!");
        }

        public void setFlyBehavior(FlyBehavior fb){

            flyBehavior = fb;
        }

        public void setQuackBehavior(QuackBehavior qb){

            quackBehavior = qb;
        }
    }

    public class ModelDuck extends Duck{

        public ModelDuck(){

            flyBehavior = new FlyNoWay();
            quackBehavior = new Quack();
        }

        public void display(){

            System.out.println("I'm a model duck");
        }
    }

    public static class FlyWithWings implements FlyBehavior{

        @Override
        public void fly(){

            System.out.println("I'm FLying!");
        }
    }

    public class FlyNoWay implements FlyBehavior{

        @Override
        public void fly(){

            System.out.println("I can't fly");
        }
    }










    //Desgin Puzzle :

    //2)interface : WeaponBehavior
    //  abstract class : Character
    //  8 classes : the rest

    //3)
    //a)
    //WeaponBehavior -> AxeBehaviour
    //               -> SwordBehaviour
    //               -> KnifeBehaviour
    //               -> BowAndArrowBehaviour

    //b)
    //Character --> Qeen
    //          --> King
    //          --> Troll
    //          --> Knight


    //c)
    //Character HAS-A weapon

    //4)setWeapon will be part of Character class, beacuse it is abstract and the rest classes
    //will Override this methode
}
