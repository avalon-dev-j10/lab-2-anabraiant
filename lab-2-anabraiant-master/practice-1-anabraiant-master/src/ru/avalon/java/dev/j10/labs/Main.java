package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.factories.RandomShapeFactory;
import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new RandomShapeFactory();

        Shape[] shapes = new Shape[20];
        
        for (int i = 0; i < shapes.length; i++){
            shapes[i] = factory.getInstance();
        }
        
        for (Shape shape: shapes)
            System.out.println(shape.getClass() + "  =  " + shape.getArea());

        float maxAreaShape = shapes[0].getArea(); // 1 способ без CompareTo но без определеняи класса тк сравниваем тип флоат 
        for (int j = 1; j < shapes.length; j++){
            if (shapes[j].getArea() > maxAreaShape ) 
                maxAreaShape = shapes[j].getArea();
        }
        System.out.println("Max area shape of is " + maxAreaShape);
        
        Shape maxAreaShape2 = shapes[0];            // 2й способо с CompareTo
        for (int y = 1; y < shapes.length; y++){
            if(maxAreaShape2.compareTo(shapes[y])==-1)
                    maxAreaShape2 = shapes[y];      
        }

        System.out.println("Max Area of fugure " + 
                maxAreaShape2.getClass().getSimpleName() 
                + " is " + maxAreaShape2.getArea());
                
    }

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать элементы массива 'shapes'
         *    20-ю случайными фигурами.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью.
         */
    
}
