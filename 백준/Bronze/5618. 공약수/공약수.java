import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String input = sc.nextLine();
        int min = 100000000;


        String[] arr = input.split(" ");
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if(Integer.parseInt(arr[i]) < min){
                min = Integer.parseInt(arr[i]);
            }
        }

        switch (len){
            case 2:
                for(int i=1; i<=min; i++){
                    if(Integer.parseInt(arr[0]) % i == 0 && Integer.parseInt(arr[1]) % i == 0 ){
                        System.out.println(i);
                    }
                }
                break;
            case 3:
                for(int i=1; i<=min; i++){
                    if(Integer.parseInt(arr[0]) % i == 0 && Integer.parseInt(arr[1]) % i == 0 && Integer.parseInt(arr[2]) % i == 0 ){
                        System.out.println(i);
                    }
                }
                break;
        }
        sc.close();

    }
}