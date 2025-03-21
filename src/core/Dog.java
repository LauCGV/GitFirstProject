/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Laura
 */
public class Dog {
    private int paws;
    private String race;
    private String color;
    private String name;

    public Dog(int paws, String race, String color, String name) {
        this.paws = paws;
        this.race = race;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" + "paws=" + paws + ", race=" + race + ", color=" + color + ", name=" + name + '}';
    }    
    
}
