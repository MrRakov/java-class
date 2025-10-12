import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TriangleManager {
    private List<Triangle> triangles;
    public TriangleManager(boolean z) {
        if (z) {
            triangles = new ArrayList<>();
        } else {
            triangles = new LinkedList<>();
        }
}
    public void addTriangle(Triangle t) {
        if (t == null) {
            throw new IllegalArgumentException("Triangle cannot be null");
        }
        triangles.add(t);
}


    public Triangle findTriangleWithLargestPerimeter() {
        Triangle largest = triangles.get(0);
        for (Triangle t : triangles) {
            if (t.getPerimeter() > largest.getPerimeter()) {
                largest = t;
            }
        }
        return largest;
}
}
