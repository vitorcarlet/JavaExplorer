import Inherit.Animals;
import Inherit.Dog;
import Inherit.Fish;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Oswaldo",15);
        Fish fish = new Fish("Rubbens",2);
        List<Animals> animais = new ArrayList<>();
        animais.add(dog);
        animais.add(fish);

        for(Animals animal: animais){
            animal.breath();
        }



        Employee e = new Employee();
        e.setNamePlus1("Vitor");

        System.out.println(e.getName());
        System.out.println("Hello world!");
    }
}