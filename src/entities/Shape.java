package entities;

import entitiesEnums.Color;

/*Como a classe possui um método abstrato, também é abstrata  */
public abstract class Shape {
    
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Criação da declaração do método abstrato área 

    public abstract double area();
}
