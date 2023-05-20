public class Main
{
    public static void main(String[] args)
    {
        double rectangleWidth = 5.0;
        double rectangleHeight = 10.0;

        double circleRadius = 3.0;

        Shape rectangle = ShapeFactory.createShape("rectangle", rectangleWidth, rectangleHeight);
        Shape circle = ShapeFactory.createShape("circle", circleRadius);

        double rectangleArea = rectangle.getArea();
        double circleArea = circle.getArea();

        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Circle area: " + circleArea);
    }
}

