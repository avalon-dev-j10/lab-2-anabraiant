/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.factories.RandomShapes;

import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

/**
 *
 * 
 */
public class CircleRandom implements ShapeFactory{
   
    
    @Override
    public Shape getInstance() {
        return new Circle (anyNumber.mathRandomMethod());
    }
    
}
