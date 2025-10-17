public class Firefighter extends AbstractPerson {   
    private String rank;

    public Firefighter(int z, String x, String r){
        super(z, x);
        rank = r;
    }

    public String getRank(){
        return rank;
    }
    
}
