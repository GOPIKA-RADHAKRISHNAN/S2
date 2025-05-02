import Graphics.Area;
public class test_package {
         public static void main(String[] args)
         {
            Area A = new Area();
            System.out.println("**COMPUTATION OF AREA OF DIFFERENT FIGURES**");
            System.out.println("\n_______RECTANGLE_______");
            A.rectangle();
            System.out.println("\n________TRIANGLE________");
            A.triangle();
            System.out.println("\n________SQUARE__________");
            A.square();
            System.out.println("\n________CIRCLE_________");
            A.circle();
    }
}