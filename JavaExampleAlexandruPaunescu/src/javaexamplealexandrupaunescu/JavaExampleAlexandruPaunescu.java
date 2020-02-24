/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamplealexandrupaunescu;

/**
 *
 * @author GAP
 */
public class JavaExampleAlexandruPaunescu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a car object
        Car m11B210 = new Car();
        m11B210.setName("MERCEDES");
        m11B210.setColor(Car.Color.RED);
        //short tempSpeed = 230;
        m11B210.setSpeed((short)230);
        // display price
        System.out.println("Price of car is: " + m11B210.getSalePrice());
        // create a new Salami
        Salami primulSalam = new Salami();
        System.out.println("Price of salami is: " + primulSalam.getSalePrice());
    }
    
}
