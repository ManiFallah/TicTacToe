import java.io.IOException;
import java.util.Scanner;
import java.lang.Object.*;
import java.net.URI;
import java.net.URISyntaxException;
public class tictactoe {
    public static String winnerChecker(String[] Num){                                 //checking Winner
        String WinnerCheck=null;
        for(int i=0 ; i<8 ; i++ ){
            switch (i){
                case 0:
                    WinnerCheck = Num[0] + Num[1] + Num[2];                           //Winnig Conditions
                    break;
                case 1:
                    WinnerCheck = Num[3] + Num[4] + Num[5];                           //Winnig Conditions
                    break;
                case 2:
                    WinnerCheck = Num[6] + Num[7] + Num[8];                           //Winnig Conditions
                    break;
                case 3:
                    WinnerCheck = Num[0] + Num[3] + Num[6];                           //Winnig Conditions
                    break;
                case 4:
                    WinnerCheck = Num[1] + Num[4] + Num[7];                           //Winnig Conditions
                    break;
                case 5:
                    WinnerCheck = Num[2] + Num[5] + Num[8];                           //Winnig Conditions
                    break;
                case 6:
                    WinnerCheck = Num[0] + Num[4] + Num[8];                           //Winnig Conditions
                    break;
                case 7:
                    WinnerCheck = Num[2] + Num[4] + Num[6];                          //Winnig Conditions
                    break;
            }
            if(WinnerCheck.equals("XXX")){
                return "X";
            } else if (WinnerCheck.equals("OOO")) {
                return "O";
            }
        }
        int helper =0 ;
        for(int i=0 ; i<9 ; i++){
            if(!(Num[i].equals("X")||Num[i].equals("O"))){                           //Tie Condition
                helper++;
            }
        }
        if(helper==0){
            return "Tie";                                                            //Tie Condition
        }
        return "0";
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        int Xturn=0;
        int Oturn=0;
        loop:for(;;){
            String operatingSystem = System.getProperty("os.name").toLowerCase();           //Clear Terminal
            if (operatingSystem.contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (operatingSystem.contains("mac") || operatingSystem.contains("linux")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
                System.out.println("1.Play");                                            //Menu
            System.out.println("2.Exit");
            String[] Nums = {"1","2","3","4","5","6","7","8","9"};                   //tictactoe Table Numbers
            int PlayNum = scanner.nextInt();
            if (operatingSystem.contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (operatingSystem.contains("mac") || operatingSystem.contains("linux")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
                Switch:switch (PlayNum){                                                 //Users Data
                case 1:
                    System.out.println("enter First Player Name");
                    String Player_1 = scanner.next();
                    System.out.println("You Are X");
                    System.out.println("enter Second Player Name");
                    String Player_2 = scanner.next();
                    System.out.println("You Are O");
                    System.out.println("Ready Check Player 1:");                     //Ready
                    scanner.nextLine();
                    String Start = scanner.nextLine();
                    while(!(Start.equals(""))){
                        System.out.println("Ready?:\\");
                        Start = scanner.nextLine();
                    }
                    System.out.println("Player " + Player_1 + " is Ready");
                    System.out.println("Ready Check Player 2:");
                    Start = scanner.nextLine();
                    while(!(Start.equals(""))){
                        System.out.println("Ready?:\\");
                        Start = scanner.nextLine();
                    }
                    System.out.println("Player " + Player_2 + " is Ready");
                    Thread.sleep(1000);
                    if(operatingSystem.contains("windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }else if (operatingSystem.contains("mac") || operatingSystem.contains("linux")) {
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                    }
                    System.out.println("        |---|---|---|");
                    System.out.println("        | "+Nums[0]+" | "+Nums[1]+" | "+Nums[2]+" |");
                    System.out.println("        |---|---|---|");
                    System.out.println("        | "+Nums[3]+" | "+Nums[4]+" | "+Nums[5]+" |");
                    System.out.println("        |---|---|---|");
                    System.out.println("        | "+Nums[6]+" | "+Nums[7]+" | "+Nums[8]+" |");
                    System.out.println("        |---|---|---|\n");
                    while(true) {
                        Xturn = scanner.nextInt();
                        Nums[Xturn - 1]="X";
                        if (operatingSystem.contains("windows")) {
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        } else if (operatingSystem.contains("mac") || operatingSystem.contains("linux")) {
                            new ProcessBuilder("clear").inheritIO().start().waitFor();
                        }
                        System.out.println("        |---|---|---|");
                        System.out.println("        | " + Nums[0] + " | " + Nums[1] + " | " + Nums[2] + " |");
                        System.out.println("        |---|---|---|");
                        System.out.println("        | " + Nums[3] + " | " + Nums[4] + " | " + Nums[5] + " |");
                        System.out.println("        |---|---|---|");
                        System.out.println("        | " + Nums[6] + " | " + Nums[7] + " | " + Nums[8] + " |");
                        System.out.println("        |---|---|---|\n");
                        if (winnerChecker(Nums).equals("X")) {
                            System.out.println("Player " + Player_1 + " Won The Game!!!");
                            Thread.sleep(2000);
                            if (operatingSystem.contains("windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            } else if (operatingSystem.contains("mac") || operatingSystem.contains("linux")) {
                                new ProcessBuilder("clear").inheritIO().start().waitFor();
                            }
                            break;
                        } else if (winnerChecker(Nums).equals("Tie")) {
                            System.out.println("Tie!!!");
                            Thread.sleep(2000);
                            if (operatingSystem.contains("windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            } else if (operatingSystem.contains("mac") || operatingSystem.contains("linux")) {
                                new ProcessBuilder("clear").inheritIO().start().waitFor();
                            }
                            break Switch;
                        }
                        Oturn = scanner.nextInt();
                        Nums[Oturn - 1]="O";
                        if (operatingSystem.contains("windows")) {
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        } else if (operatingSystem.contains("mac") || operatingSystem.contains("linux")) {
                            new ProcessBuilder("clear").inheritIO().start().waitFor();
                        }
                        System.out.println("        |---|---|---|");
                        System.out.println("        | " + Nums[0] + " | " + Nums[1] + " | " + Nums[2] + " |");
                        System.out.println("        |---|---|---|");
                        System.out.println("        | " + Nums[3] + " | " + Nums[4] + " | " + Nums[5] + " |");
                        System.out.println("        |---|---|---|");
                        System.out.println("        | " + Nums[6] + " | " + Nums[7] + " | " + Nums[8] + " |");
                        System.out.println("        |---|---|---|\n");
                        if (winnerChecker(Nums).equals("O")) {
                            System.out.println("Player " + Player_2 + " Won The Game!!!");
                            Thread.sleep(1000);
                            break Switch;
                        }
                        else if (winnerChecker(Nums).equals("Tie")) {
                            System.out.println("Tie!!!");
                            Thread.sleep(2000);
                            if (operatingSystem.contains("windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            } else if (operatingSystem.contains("mac") || operatingSystem.contains("linux")) {
                                new ProcessBuilder("clear").inheritIO().start().waitFor();
                            }
                            break Switch;
                        }
                    }
                case 2:
                    break loop;//Exit App
                default:
                    System.out.println("Choose Between Two!!!");
            }
        }
    }
}
