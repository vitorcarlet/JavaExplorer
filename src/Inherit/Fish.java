package Inherit;

public class Fish extends Animals{

    public Fish(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void breath() {
        //super.breath();
        System.out.println("I'm breathing like a fish");
    }
}
