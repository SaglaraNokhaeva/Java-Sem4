
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
        while (!str.equals("print")) {
            System.out.println("Введите строку для ввода в стэк");
            str=scan.nextLine();
            if (!str.equals("print")) {
                stack.push(str);
        }
    }
    while (!stack.empty()){
    System.out.println(stack.pop());
}
    scan.close();
}
}
