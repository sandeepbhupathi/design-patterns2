package decorator;

import sun.security.provider.SHA;
import sun.security.provider.SHA;

public class ShapeDecorator implements Shape {
    private Shape shape;
    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
