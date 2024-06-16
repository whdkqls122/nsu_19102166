package hw10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

class Shape {
    private String type;
    private String color;
    private double area;

    public Shape(String type, String color, double area) {
        this.type = type;
        this.color = color;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return type + "(" + color + ", " + area + ")";
    }

  
    // 정적 ArrayList<Shape> 정의 및 초기화
    public static List<Shape> shapes = Arrays.asList(
        new Shape("삼각형", "빨간색", 10.5),
        new Shape("사각형", "파란색", 11.2),
        new Shape("원", "파란색", 16.5),
        new Shape("원", "빨간색", 5.3),
        new Shape("원", "노란색", 8.1),
        new Shape("사각형", "파란색", 20.7),
        new Shape("삼각형", "파란색", 3.4),
        new Shape("사각형", "빨간색", 12.6));
}

class ShapeTest{

    public static List<Shape> findShapesByType(List<Shape> shapes, String type) {
        return shapes.stream()
                .filter(shape -> shape.getType().equals(type))
                .collect(Collectors.toList());
    }

    public static List<Shape> findShapesByColorNArea(List<Shape> shapes, String color, double area) {
        return shapes.stream()
                .filter(shape -> shape.getColor().equals(color) && shape.getArea() >= area)
                .collect(Collectors.toList());
    }
    

    //Challenge02
	  public static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area) {
	        return shapes.stream()
	                .filter(shape -> (type == null || shape.getType().equals(type)) &&
	                                 (color == null || shape.getColor().equals(color)) &&
	                                 (area == null || shape.getArea() <= area))
	                .collect(Collectors.toList());
	    }
      //Challenge03
	  public static List<Shape> findShapes(List<Shape> shapes, Predicate<Shape> p) {
	        return shapes.stream()
	                .filter(p)
	                .collect(Collectors.toList());
	    }
}
public class Challenge01 {

    public static void main(String[] args) {
        // 사각형 찾기
        List<Shape> rectangles = ShapeTest.findShapesByType(Shape.shapes, "사각형");
        System.out.println("사각형: " + rectangles);

        // 빨간 도형 중 면적이 12.0 이하인 도형 찾기
        List<Shape> redShapesWithAreaLessOrEqual12 = ShapeTest.findShapesByColorNArea(Shape.shapes, "빨간색", 12.0);
        System.out.println("빨간도형(면적<=12.0): " + redShapesWithAreaLessOrEqual12);
    }

}
