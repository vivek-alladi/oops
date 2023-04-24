package Polymorphism.MethodOverloading;

//Type of polymorphism where mutliple methods can have same name but different parameters. It can handle multiple types of input

public class MathUtils {
    public int add(int x, int y){
        return x+y;
    }

    public double add(double x, double y){
        return x+y;
    }

    public int add(int x, int y, int z){
        return x+y+z;
    }
}
