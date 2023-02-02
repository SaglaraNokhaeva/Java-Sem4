import java.util.LinkedList;
import java.util.Scanner;

//1. Нужно распилить строку по ~, но сохранить text в связанный список на позицию num
//2. Если введено print~num, выводит строку из позиции Num в связанном списке и удаляет её из списка.
//До тех пор, пока пользователь  не введёт "stop"

public class task2 {
    public static void main(String[] args) {

        LinkedList <String> text= new LinkedList<>();        
        Scanner scan=new Scanner(System.in);
       
        while(true){
            String input =scan.nextLine();
            if(input.equals("stop")) break;
            String [] str = input.split("~");
            if (str[0].equals("print")) System.out.println(text.remove(Integer.parseInt(str[1])));
            else text.add(Integer.parseInt(str[1]),str[0]);
        }
        scan.close();
    }    
    
}
