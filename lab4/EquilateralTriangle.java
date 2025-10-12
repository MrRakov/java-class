public class EquilateralTriangle implements Triangle {
    private double side;

    public EquilateralTriangle(double z){
        side = z;
    }
    
    @Override
    public double getLongestSideLength(){
        return side;
    }
    @Override
    public double getLargestAngle(){
        return 60.0;
    }
    @Override
    public double getPerimeter(){
        return side*3;
    }
}
