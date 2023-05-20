class ShapeFactory {
    public static Shape createShape(String shapeType, double... params)
    {
        if (shapeType.equalsIgnoreCase("rectangle") && params.length == 2)
        {
            double width = params[0];
            double height = params[1];
            return new Rectangle(width, height);
        } else if (shapeType.equalsIgnoreCase("circle") && params.length == 1)
        {
            double radius = params[0];
            return new Circle(radius);
        } else {
            throw new IllegalArgumentException("Invalid shape type or parameters");
        }
    }
}
