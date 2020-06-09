import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello,  patterns!");

        // 1st method of object creation

        Rectangle rectangle1 = new Rectangle(1, 3, 4);

        // 2nd method creation

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setId(2);;
        rectangle2.setLength(4);
        rectangle2.setWidth(7);

        //3rd method

        Rectangle rectangle3 = RectangleFactory.create(3,4,5);



        //-----------------------------------------------------------


    }





}
