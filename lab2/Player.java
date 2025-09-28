public class Player{
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;
    public Player(String n, int j) {
        name = n;
        jerseyNumber= j;
        minutesPlayed= 0;
    }
    public void print() {
        System.out.println(name+":"+jerseyNumber);
    }
    public void playGame() {
        minutesPlayed= minutesPlayed+ 90;
    }
    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public class PlayerTest{
        public static void main(String[] args){
        FootballPlayer f = new FootballPlayer("Ronaldo", 7);
        BasketballPlayer b = new BasketballPlayer("James", 23);
        f.print();
        b.print();
        f.playGame();
        b.playGame();
        System.out.println(f.getMinutesPlayed());
        System.out.println(b.getMinutesPlayed());
        b.changeJerseyNumber(6);
}
}
}