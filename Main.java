package assignment8;

public class Main {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("Messi", 34, "Barcelona");
        footballPlayer.train();
        footballPlayer.compete();
        footballPlayer.cheer();

        BasketballPlayer basketballPlayer = new BasketballPlayer("LeBron", 36, "LA Lakers");
        basketballPlayer.train();
        basketballPlayer.compete();
        basketballPlayer.cheer();

        FootballCoach footballCoach = new FootballCoach("Klopp");
        footballCoach.coachTeam();

        BasketballCoach basketballCoach = new BasketballCoach("Vogel");
        basketballCoach.coachTeam();
    }
}
