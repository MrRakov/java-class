public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club[] c = new Club[4];

        c[0] = new Club("Student", 10);
        c[0].addMember(190);
        c[1] = new SportsClub("Football", 22);
        c[1].addMember(18);
        c[2] = new EsportsClub("RoV", 1);
        c[2].addMember(4);
        c[3] = new MarketingClub("Advertising", 2, 100);
        c[3].addMember(8);

        ClubManagingSystem qq = new ClubManagingSystem(c);

        System.out.println(qq.determineAllBudget());
        System.out.println(qq.getAllMembers());
        System.out.println(qq.getHighestMemberClub());
        

    }
}
