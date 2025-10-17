public class Firetruck extends AbstractEquipment {
    private int plateNum;

    public Firetruck(int z, String x, int c){
        super(z, x);
        plateNum = c;
        status = Status.Active;
    }

    public int getPlateNum(){
        return plateNum;
    }
    
}
