package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    
    public float recLength, recWidth, recPerimetr, recArea;
    
    

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    public Rectangle(float recLength, float recWidth) {
        this.recLength = recLength;
        this.recWidth = recWidth;
        recPerimetr = 2*(recLength + recWidth);
        recArea = recLength * recWidth;
    }

    @Override
    public float getPerimeter() {
       return recPerimetr;
    }

    @Override
    public float getArea() {
        return recArea;
    }
}
