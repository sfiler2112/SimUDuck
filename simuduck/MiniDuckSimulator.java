package simuduck;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        double a = Math.pow(2,2);
        System.out.println(a);
    }
}
