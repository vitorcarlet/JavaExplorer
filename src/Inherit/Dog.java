package Inherit;

public class Dog extends Animals{

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void breath() {
        //super.breath();
        System.out.println("Estou respirando como um cachorro");
    }
}
