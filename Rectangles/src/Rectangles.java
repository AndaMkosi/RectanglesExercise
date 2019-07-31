
import java.util.Scanner;
public class Rectangles {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a width:");
        int width = s.nextInt();
        System.out.println("Please enter a height:");
        int height = s.nextInt();
        String square = "";



        for (int i = 0; i < height; i++) {
            for (int j = 0; j <width; j++) {

                if (width == height) {

                 square+="*";
                }
                else if(height>width)
                {
                 square+="#";
                }
                else if(width>height)
                {
                    square+="$";
                }

            } square+="\n";


        }
        System.out.print(square);













    }
}