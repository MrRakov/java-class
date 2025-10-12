public class TriangleManagerTest {
    public static void main(String[] args) {
        TriangleManager manager = new TriangleManager(true);
        manager.addTriangle(new RightTriangle(7, 9, 5));
        manager.addTriangle(new EquilateralTriangle(61));
        manager.addTriangle(new EquilateralTriangle(110));

        System.out.println(manager.findTriangleWithLargestPerimeter().getPerimeter());
        try {
            manager.addTriangle(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}