import java.util.Scanner;

public class Assignment7_5 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers separated by spaces");
        String input = scan.nextLine();
        
        double distinct[] = new double[10];
        int arraySpot = 0;
        String number = "";
        
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i) != ' ' && i+1 != input.length()){
                number += input.charAt(i);
            }
            else if(!number.equals(" ") || i+1 == input.length()){
                if(i+1 == input.length()){
                    number += input.charAt(i);
                }
                double num = Double.parseDouble(number);
                boolean unique = true;
                for(int n = 0;n<10;n++){
                    if(num == distinct[n]){
                        unique = false;
                    }
                }
                if(unique){
                    distinct[arraySpot] = num;
                    arraySpot++;
                }
                if(arraySpot == 0 && num == 0){
                    arraySpot++;
                }
                else if(arraySpot == 1){
                    for(int p = 1;p<10;p++){
                        distinct[p] = distinct[0];
                    }
                }
                number = " ";
            }
        }
        
        System.out.print("\nThe " + arraySpot + " unique numbers in that group are\n");
        
        for(int i = 0;i<arraySpot;i++){
            System.out.print(distinct[i] + " ");
        }
    }
}