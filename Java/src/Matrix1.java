import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args){
        int arr[][]
                = { { 2, 7, 9, 20 }, { 30, 6, 1, 50 }, { 70, 45, 22, 67 } };
        // printing 2D array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
}

