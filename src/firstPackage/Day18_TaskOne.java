package firstPackage;

abstract class shape {
	abstract int rectangleArea(int length, int width);
	abstract int squareArea(int area);
	abstract double circleArea(int r);
}

class Area extends shape {

	int rectangleArea(int length, int width) {
	int recArea = length*width;
		return recArea;
	}

	int squareArea(int area) {
	int sqArea = area*area;
	return sqArea;
		
	}

	double circleArea(int r) {
		double pieValue = Math.PI;
		double cirArea = pieValue*r*r;
		return cirArea;
	}
	
}

public class Day18_TaskOne {

	public static void main(String[] args) {
	Area a = new Area();
	System.out.println(a.circleArea(3));
	System.out.println(a.squareArea(4));
	System.out.println(a.rectangleArea(5, 8));

	}

}
