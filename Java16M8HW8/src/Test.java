public class Test {
    public static void main(String[] args){
        ShapePrinter sp = new ConsolShapePrinter();

        Circle circle = new Circle();
        sp.print(circle);

        Quad quad = new Quad();
        sp.print(quad);

        Triangle triangle = new Triangle();
        sp.print(triangle);

        Rectangle rectangle = new Rectangle();
        sp.print(rectangle);

        Diamond diamond = new Diamond();
        sp.print(diamond);

        Pyramid pyramid = new Pyramid();
        sp.print(pyramid);

        Сube сube = new Сube();
        sp.print(сube);
    }
}
