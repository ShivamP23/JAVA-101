import java.lang.Math;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rol1 =rollDice();
        int rol2 = rollDice();
        int rol3 =rollDice(); 
        System.out.println("enter three numbers from 1 to 6");



        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt(); 

         if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Can't less than one");
            System.exit(0);
        }
        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Can't it has to be less than 6");
            System.exit(0);
        
        }
        int sumOfNumber = num1+num2+num3;
        int sumDiceRolls = rol1+rol2+rol3;
        System.out.println("dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNumber);

        if(checkWin(sumDiceRolls, sumOfNumber)){
            System.out.println("Win");
        }else{
            System.out.println("sorry");
        }

        checkWin(sumDiceRolls, sumOfNumber);

        scan.close();

    } 
    public static boolean checkWin(int dicesum, int numberSum){
        return (dicesum < numberSum && dicesum - numberSum < 3);
           
    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber; 
         
    }
}
