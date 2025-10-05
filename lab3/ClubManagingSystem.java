public class ClubManagingSystem {
    protected Club[] clublist;

    public ClubManagingSystem(Club[] clublist){
        this.clublist = clublist;
    }

    public int determineAllBudget(){
        int total = 0;
        for (Club c: clublist){
            total = total + c.determineBudget();  
        }
        return total;
    }

    public int getAllMembers(){
        int total = 0;
    for (Club c : clublist) {
        if (c instanceof SportsClub) { // question doesnt say to add more methods to classes and getnumMembers only available to sportsclub
            total = total + ((SportsClub) c).getNumMembers();
        }
    }
    return total;
    }

    public Club getHighestMemberClub() {
    Club highestClub = null;
    int maxMembers = -1;

    for (Club c: clublist) {
        if (c instanceof SportsClub) { 
            SportsClub e = (SportsClub) c;
            int members = e.getNumMembers();

            if (members > maxMembers) {
                maxMembers = members;
                highestClub = e;
            }
        }
    }

    return highestClub;
}
}
