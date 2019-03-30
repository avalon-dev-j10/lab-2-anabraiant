package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class PolygonRandom implements ShapeFactory {
    
    

    @Override
    public Shape getInstance() {
        MathRandomMethod rand = new MathRandomMethod(0,4); // ot 0 do 3

        switch (rand.mathRandomMethod()) {
            case 0:
                return new Rectangle(random_number.mathRandomMethod(), random_number.mathRandomMethod());
            case 1:
                return new Rhombus(random_number.mathRandomMethod(), random_number.mathRandomMethod(), 
        random_number.mathRandomMethod(), random_number.mathRandomMethod());
            case 2:
                return new Trapezium(random_number.mathRandomMethod(), random_number.mathRandomMethod(),
        random_number.mathRandomMethod(), random_number.mathRandomMethod(),
        random_number.mathRandomMethod());
            
            default:
                return new  Triangle(random_number.mathRandomMethod(), random_number.mathRandomMethod(),
                random_number.mathRandomMethod());
        }
        

    }
}
