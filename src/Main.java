import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        do{
            System.out.println("####################\n" +
                               "#                  #\n" +
                               "# Relic Expedition #\n" +
                               "#                  #\n" +
                               "#  1 - New Game    #\n" +
                               "#  2 - Exit        #\n" +
                               "#                  #\n" +
                               "####################");
            input = sc.next();

            if(!(input.equals("1") || input.equals("2"))){
                System.out.println("Enter A Valid Input!");
            }
        }while(!(input.equals("1") || input.equals("2")));
        switch (input){
            case "1":
                System.out.println("Begining of the game...");
                break;
            case "2":
                System.out.println("EXITED");
                System.exit(0);
                break;
        }
    }
}
