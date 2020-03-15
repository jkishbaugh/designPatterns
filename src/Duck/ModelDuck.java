package Duck;

import Duck.Duck;
import Fly.FlyNoWay;
import Quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("Im a model duck!");
    }
}
