public class EsportClubTest{
    public static void main(String[] args) {
        EsportsClub e = new EsportsClub("esportclub1", 100);
        Club c = new EsportsClub("Esport", 100); 
        e.advertise();
        System.out.println(e.determineBudget());
        System.out.println(e.getName());
        c.advertise();
        System.out.println(c.determineBudget());
        System.out.println(c.getName());
    }
}