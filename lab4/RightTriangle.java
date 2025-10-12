public class RightTriangle implements Triangle {
    private double side1;
    private double side2;
    private double side3;

    public RightTriangle(double z, double x, double c){
        side1 = z;
        side2 = x;
        side3 = c;
    }

    @Override
    public double getLongestSideLength(){
        if(side1>=side2 && side1>=side3){
            return side1;
        }
        else if(side2>=side1 && side2>=side3){
            return side2;
        }
        else if(side3>=side1 && side3>=side2){
            return side3;
        }
        else{
            return side1;
        }
    }
    @Override
    public double getLargestAngle(){
        return 90.0;
    }
    @Override
    public double getPerimeter(){
        return (side1+side2+side3);
    }
}
