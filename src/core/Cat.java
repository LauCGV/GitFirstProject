/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Laura
 */
public class Cat {
    private String name;
    private String raza;
    private int patas;
    private int age;

    public Cat(String name, String raza, int patas, int age) {
        this.name = name;
        this.raza = raza;
        this.patas = patas;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", raza=" + raza + ", patas=" + patas + ", age=" + age + '}';
    }
    
    
}
