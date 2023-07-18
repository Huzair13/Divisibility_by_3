import java.util.Scanner;

public class Divisibility{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array !!! ");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements !!!");
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        int result=divisiblity(array,size);
        System.out.println(result);
    }

    private static int divisiblity(int[] array, int size) {
        int sum=0;
        for(int i:array){
            sum+=i;
        }
        if(sum%3==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}