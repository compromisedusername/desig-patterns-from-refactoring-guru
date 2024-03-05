package WzorceKreacyjne.Prototyp;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes,shapesCopy);


        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if ( !shape1.equals(shape2)){
            System.out.println("Big green circle !+ Medium blue rectangle");
        }else {
            System.out.println("Big green circle == Medium blue rectangle");
        }

        if (shape2 != shape3){
            System.out.println("Medium blue rectangles are two different objects");
            if(shape2.equals(shape3)){
                System.out.println("And they are identical");
            }else
                System.out.println("But they are not identical");

        }else {
            System.out.println("Retangle objets are the same");
        }
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy){
        for(Shape shape : shapes){
            shapesCopy.add(shape.clone());
        }

        for(int i = 0; i < shapes.size(); i++){
            if(shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i + " " +shapes.get(i)+ ": Shapes are different obejcts!!!XDDD");
            if(shapes.get(i).equals(shapesCopy.get(i))){
                System.out.println(i + " " +shapes.get(i)+ ": And they are identical!");
            }else {
                System.out.println(i + " " +shapes.get(i)+" : But they are not identical ");
            }
            }else {
                System.out.println(i + " " +shapes.get(i) +"Shape objects are the same! (BOOO)");
            }
        }
    }
}
