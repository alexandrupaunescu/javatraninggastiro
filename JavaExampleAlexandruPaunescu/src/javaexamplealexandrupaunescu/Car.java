/*
 * Class car
 */
package javaexamplealexandrupaunescu;

/**
 *
 * @author GAP
 */
public class Car implements Saleable{
    private float salePrice = (float)500.99;
    private String name; // name of brand 

    @Override
    public float getSalePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return salePrice;
    }
    public enum Color {RED, BLUE, GREEN, BLACK};
    private Color color; // color of car
    private short speed; // max speed of car
    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }
    
    
}
