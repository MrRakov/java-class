public class TestTriangle {
    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle(8, 13, 22);
        System.out.println("Right Triangle");
        System.out.println("Longest side: " + rt.getLongestSideLength());
        System.out.println("Largest angle: " + rt.getLargestAngle() + " degrees");
        System.out.println("Perimeter: " + rt.getPerimeter());

        EquilateralTriangle et = new EquilateralTriangle(67);
        System.out.println("Equilateral Triangle");
        System.out.println("Longest side: " + et.getLongestSideLength());
        System.out.println("Largest angle: " + et.getLargestAngle() + " degrees");
        System.out.println("Perimeter: " + et.getPerimeter());
    }
}