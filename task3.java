
//Принимает от пользователя и запоминает строки
//Если введено print, выводит строки так, чтобы последняя введённая была первой в списке, а первая - последней.
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String str = "";
        Integer count=0;
        while (!str.equals("print")) {
            System.out.println("Введите строку для ввода в стэк");
            str=scan.nextLine();
            if (!str.equals("print")) {
                stack.push(str);
                count++;
        }
    }
    for (int i=0;i<count;i++){
        System.out.println(stack.pop());
    }
    scan.close();
}
}
