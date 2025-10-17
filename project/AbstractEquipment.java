public class AbstractEquipment implements EquipmentInterface {
    protected String equipmentName;
    protected Status status;
    protected int id;

    public AbstractEquipment(int z, String x){
        equipmentName = x;
        id = z;
        status = Status.Active;
    }

    @Override
    public void activate(){
        status = Status.Active;
    }

    @Override
    public void deactivate(){
        status = Status.Inactive;
    }

    @Override
    public void maintain(){
        status = Status.Maintains;
    }

    public Status getStatus(){
        return status;
    }
    
    public String getEqupimentName(){
        return equipmentName;
    }

    public int getId(){
        return id;
    }
}
