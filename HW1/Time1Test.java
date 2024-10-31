import java.util.Scanner;

public class Time1Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Time1 time = new Time1(10, 30, 45);

        System.out.println("24小時制時間：");
        time.printUniversal();

        System.out.println("12小時制時間：");
        time.printStandard();

        System.out.print("輸入過了幾秒: ");
        int secondsPassed = input.nextInt();

        for (int i = 0; i < secondsPassed; i++) {
            time.tick();
        }

        System.out.println("經過" + secondsPassed + "秒後的24小時制時間：");
        time.printUniversal();

        System.out.println("經過" + secondsPassed + "秒後的12小時制時間：");
        time.printStandard();

        input.close();
    }
}
