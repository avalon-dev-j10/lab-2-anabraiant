/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.factories;

/**
 *
 * @author admin
 */
public class MathRandomMethod {
    
    public int a; // Начальное значение диапазона - от
    public int b; // Конечное значение диапазона - до
    
    public MathRandomMethod (int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int mathRandomMethod(){
    
      return  (int) (a + (int) (Math.random() * b)); // ген случайное число 
    }
    
}
