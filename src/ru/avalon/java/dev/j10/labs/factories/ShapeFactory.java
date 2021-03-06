package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Shape;

/**
 * Абстрактное представление о "Фабрике" фигур.
 * <p>
 * Абстрактная фабрика (англ. Abstract factory) —
 * порождающий шаблон проектирования, предоставляет
 * интерфейс для создания семейств взаимосвязанных или
 * взаимозависимых объектов, не специфицируя их конкретных
 * классов. Шаблон реализуется созданием абстрактного класса
 * Factory, который представляет собой интерфейс для
 * создания компонентов системы (например, для оконного
 * интерфейса он может создавать окна и кнопки). Затем
 * пишутся классы, реализующие этот интерфейс.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%90%D0%B1%D1%81%D1%82%D1%80%D0%B0%D0%BA%D1%82%D0%BD%D0%B0%D1%8F_%D1%84%D0%B0%D0%B1%D1%80%D0%B8%D0%BA%D0%B0_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)">Абстрактная фабрика (шаблон проектирования)</a>
 */
public interface ShapeFactory {

    /**
     * Возвращает новый экземпляр фигуры.
     *
     * @return экземпляр типа {@link Shape}
     */
    MathRandomMethod random_number = new MathRandomMethod(1,11); // ot 1 do 10

    Shape getInstance();

    static ShapeFactory random() {
        return new RandomShapeFactory();
    }
}
