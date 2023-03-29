import java.util.Scanner;



public class hw01 {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        System.out.printf("Введите n ");

        int i = sca.nextInt();
        System.out.printf("Треугольное число: %d\n", main1(i));
        System.out.printf(" Произведение чисел от 1 до n: %d\n", main2(i));
        
        sca.close();
        }

    public static int main1(int a) {

        int i=1;
        int j=0;


        while (i<=a){
            j=j+i;
            i++;
 
        }
        return(j);

    }

    public static int main2(int a) {

        int i=1;
        int j=1;

        while (i<=a){
            j=j*i;
            i++;
 
        }
        return(j);
    }
}
