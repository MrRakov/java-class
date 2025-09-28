public class BasketballPlayer extends Player{
    public BasketballPlayer(String N, int j){
        super(N, j);
    }
    @Override
    public void playGame() {
        minutesPlayed = minutesPlayed+ 48;
    }
     public void changeJerseyNumber(int newNumber) {
        jerseyNumber= newNumber;
        System.out.println(name+" changes number to "+jerseyNumber);
 }
}