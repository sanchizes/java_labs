import java.util.Scanner;
/*
Author: Oleksandr Pavlyk
Number in list: 61
Variant: 1
Task:Визначити ті рядки, довжина яких менша середньої.
На вхід поступає масив String. На виході – масив String.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int wordCount = sc.nextInt();
        String[] text = new String[wordCount];
        for (int i = 1; i <= text.length; i++) {
            System.out.println("Enter line number " + i);
            text[i - 1] = sc.next();
        }
        for (String string : text) {
            if(string.length() < AverageLength(text)){
                System.out.println(string);
            }
        }
    }
    public static int AverageLength(String[] text){
        int sum = 0;
        for (int i = 0; i < text.length; i++) {
            sum += text[i].length();
        }
        return sum/ text.length;
    }
}
