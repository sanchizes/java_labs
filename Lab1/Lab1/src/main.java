import java.util.Arrays;
import java.util.Scanner;
/*
Author: Oleksandr Pavlyk
Number in list: 61
Variant: 1
Task:Визначити ті рядки, довжина яких менша (більша) середньої.
На вхід поступає масив String. На виході – масив String.
Now hush little baby, don't you cry
Everything's gonna be alright


algorithm:
    ввід тексту
    розбити текст на рядки
    визначення довжини рядків
    знаходження середньої довжини рядків
    порівнюємо довжини всіх рядків з середнім значенням
    виводимо масив рядків довжина яких менша за середнє значення
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordCount = sc.nextInt();
        String[] text = new String[wordCount];
        for (int i = 0; i < text.length; i++) {
            text[i] = sc.next();
        }
        System.out.println(Arrays.toString(text));
    }
}
