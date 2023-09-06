public class Math {
    public static void main(String[] args) {
        int candyCho = 5;
        int candycho2 = 10;

        long candy = 3500000000L;
        long candyinspace = 1000000000000L;

        double testscore = 6.7;
        double bonusMark = 2.5;
        
      //+  
        System.out.println("Shivam collected " + (candyCho + candycho2) + " candy");
        System.out.println(testscore + bonusMark);
        System.out.println(candy + candyinspace);

      //- 
        System.out.println("Shivam collected " + (candyCho - candycho2) + " candy");
        System.out.println(testscore - bonusMark);
        System.out.println(candy - candyinspace);

        //* 
        System.out.println("Shivam collected " + (candyCho * candycho2) + " candy");
        System.out.println(testscore * bonusMark);
        System.out.println(candy * candyinspace);
        //(/)
        System.out.println("Shivam collected " + (candyCho / candycho2) + " candy");
        System.out.println(testscore / bonusMark);
        System.out.println(candy / candyinspace);

        //%
      System.out.println(10%2);
        System.out.println(5%2);

        //++
       int count = 0; 
       count++;
       count++;
       count++; 
       System.out.println("I cound: " + count);
       //-- 
       count--;
       count--; 
       count--;
       count--;
       System.out.println(count);

       //+= , -= 
       int people = 4; 
       System.out.println(people);
       people += 4;
System.out.println(people);  
people -= 4; 
System.out.println(people);     
    }

    public static double sin(double d) {
        return 0;
    }

    public static int random() {
        return 0;
    }
}
