/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.factories.RandomShapes;

import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

/**
 *
 * @author admin
 */
public class RectangleRandom implements ShapeFactory {

    @Override
    public Shape getInstance() {
       return new Rectangle(anyNumber.mathRandomMethod(), anyNumber.mathRandomMethod());
    }
    
}
