import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String nameTournament = scanner.nextLine();
        //int noGames = Integer.parseInt(scanner.nextLine());
        int pointsCounterDarcy = 0;
        int pointsCounterOppositeTeam = 0;
        int gamesTournament = 0;

        double gamesWon = 0;
        double gamesLose = 0;
        int gamesCounter = 0;
        int totalCounter = 0;



        while (true){
            String nameTournament = scanner.nextLine();


            if (nameTournament.equals("End of tournaments")){
                // gamesCounter++;
                //System.out.println(totalCounter);
                double precentWin = (gamesWon/(gamesWon+gamesLose))*100;
                double precentLose = (gamesLose/(gamesWon+gamesLose))*100;
                System.out.printf("%.2f%% matches win\n",precentWin);
                System.out.printf("%.2f%% matches lost\n", precentLose);
                break;
            }


            int gamesPlayed = Integer.parseInt(scanner.nextLine());
            gamesCounter=0;


            for (int i =0; i < gamesPlayed;i++) {
                gamesTournament++;

                int pointsDarcy = Integer.parseInt(scanner.nextLine());
                int pointsOppositeTeam = Integer.parseInt(scanner.nextLine());
                gamesCounter++;

                if (pointsDarcy > pointsOppositeTeam) {

                    gamesWon++;
                    //gamesCounter++;
                    int difference = pointsDarcy - pointsOppositeTeam;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", gamesCounter, nameTournament, difference);
                }

                //gamesCounter++;
                else {

                    gamesLose++;
                    //gamesCounter++;
                    int difference = pointsOppositeTeam - pointsDarcy;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", gamesCounter, nameTournament, difference);

                }

                //totalCounter = totalCounter + (gamesWon+gamesLose);
            }
        }

    }

}
