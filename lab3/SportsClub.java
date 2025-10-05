public final class SportsClub extends Club {
    public SportsClub(String c, int m){
        super(c, m);
    }

    public int getNumMembers(){
        return numMember;
    }

    @Override
     public int determineBudget() {
        return (numMember * 1000)+(numMember - minNumMember) * 100;
    }
    @Override
     public void changeName(String newName) {
        
        }
}
