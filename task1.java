import java.util.ArrayList;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {

        ArrayList<Integer> arList = new ArrayList<>();
        LinkedList<Integer> linList = new LinkedList<>();
        System.out.println(System.currentTimeMillis());
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arList.add(i);
        }
        long timeFinish = System.currentTimeMillis();

        System.out.println(timeFinish - timeStart);
        System.out.println("--------------------");

        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linList.add(i);
        }
        timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}