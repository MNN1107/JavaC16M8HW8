public class ConsolShapePrinter implements ShapePrinter{
    @Override
    public void print (Shape shape){
        System.out.println (shape.getName());
    }
}
