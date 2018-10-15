package decorator;

public class RedRectangleDecorator extends ShapeDecorator {

    public RedRectangleDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw Red Border");
    }
}
