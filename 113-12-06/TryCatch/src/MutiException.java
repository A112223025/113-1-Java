import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MutiException {
    public static void main(String[]args){
        int[] numbers = {1, 2, 3};
        try{
            File file = new File(pathname)
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("處理未檢例外:" + e.getMessage());
        }
    }
}
