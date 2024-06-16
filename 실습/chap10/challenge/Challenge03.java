package hw10;
import java.util.function.Predicate;
import java.util.*;
public class Challenge03 {

	  public static void main(String[] args) {
	        // 사각형 찾기
	        Predicate<Shape> rectanglePredicate = shape -> "사각형".equals(shape.getType());
	        List<Shape> rectangles = ShapeTest.findShapes(Shape.shapes, rectanglePredicate);
	        System.out.println("사각형: " + rectangles);

	        // 빨간 도형 중 면적이 12.0 이하인 도형 찾기
	        Predicate<Shape> redAndAreaLessOrEqual12Predicate = shape -> "빨간색".equals(shape.getColor()) && shape.getArea() <= 12.0;
	        List<Shape> redShapesWithAreaLessOrEqual12 = ShapeTest.findShapes(Shape.shapes, redAndAreaLessOrEqual12Predicate);
	        System.out.println("빨간도형(면적<=12.0): " + redShapesWithAreaLessOrEqual12);
	    }

}
