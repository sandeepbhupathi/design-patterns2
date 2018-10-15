package decorator;

public class DecoratorDemo {
    public static void main(String args[]){
        ShapeDecorator shapeDecorator = new RedRectangleDecorator(new Rectangle());
        shapeDecorator.draw();
    }
}
