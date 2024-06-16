package hw10;

import java.util.List;


public class Challenge02 {

	public static void main(String[] args) {
        // 사각형 찾기
        List<Shape> rectangles = ShapeTest.findShapes(Shape.shapes, "사각형", null, null);
        System.out.println("사각형: " + rectangles);

        // 빨간 도형 중 면적이 12.0 이하인 도형 찾기
        List<Shape> redShapesWithAreaLessOrEqual12 = ShapeTest.findShapes(Shape.shapes, null, "빨간색", 12.0);
        System.out.println("빨간도형(면적<=12.0): " + redShapesWithAreaLessOrEqual12);
    }

}