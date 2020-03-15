package Duck;

import Fly.FlyBehavior;
import Quack.QuackBehavior;

public abstract class Duck {
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }
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
}
