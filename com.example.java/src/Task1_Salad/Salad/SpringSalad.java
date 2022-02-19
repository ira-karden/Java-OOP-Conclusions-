package Task1_Salad.Salad;

import Task1_Salad.Vegetable.Vegetable;
import Task1_Salad.Vegetable.type.*;

public class SpringSalad extends Salad {
    public SpringSalad(Vegetable[] vegetables) {
        super(vegetables);
    }
    public SpringSalad(){

    }

    public void createSalad (){
        SpringSalad SpringSaladNew = new SpringSalad(new Vegetable[]{new Tomato(350),new Cucumber(220),new Redis(270),new Bell_pepper(180),new Spinach(10)});
        System.out.println(SpringSaladNew);

    }
}
