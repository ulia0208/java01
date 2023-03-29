import java.util.Scanner;

// import java.util.Scanner;

 public class hw03 {

    public static void main(String[] args) {
        int a1;
        int a2;
        double answer;
        char sign;
        Scanner sca = new Scanner(System.in);
        System.out.print("Введите 2 числа (через ENTER) ");
        a1 = sca.nextInt();
        a2 = sca.nextInt();
        System.out.print("Введите оператор: ");
        sign = sca.next().charAt(0);
        switch(sign) {
           case '+': answer = a1 + a2;
              break;
           case '-': answer = a1 - a2;
              break;
           case '*': answer = a1 * a2;
              break;
           case '/': answer = a1 / a2;
              break;
           default:  System.out.printf("Что-то не то с оператором ");
              return;
        }
        System.out.printf(a1 + " " + sign + " " + a2 + " = " + answer);
     }
        
       
    }
   
