public class ClubTest {
    public static void main(String[] args) {
        SportsClub SC = new SportsClub("sportclub", 17);
        MarketingClub MC = new MarketingClub("marketingClub", 20, 3000);


        System.out.println(SC.determineBudget());
        System.out.println(MC.determineBudget());
        SC.changeName("weqewe");
        MC.changeName("rerqewq");
        System.out.println(MC.useBudget(4000)); //false
        System.out.println(MC.useBudget(2000)); //true
        System.out.println(MC.getName());
        System.out.println(SC.getName()); //nothing changes

        
    }
}
