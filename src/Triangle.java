
public class Triangle extends GeometricObject {

	double side1=1f,
			   side2=1f,
			   side3=1f;
		
		public Triangle() {
			
		}
		
		public Triangle(double _side1,double _side2,double _side3) {
			side1 = _side1;
			side2 = _side2;
			side3 = _side3; 
			
		}
		
		public double getArea() {
			double s = (side1+side2+side3)/2;
			double area = Math.sqrt((s*(s-side1)*(s*(s-side2)*(s*(s-side3)))));
			return area;
		}
		
		public double getPerimeter() {
			double p = side1 + side2 + side3;
			return p;
		}
		
		public String toString() {
			return "Triangle: "+ "side1= " + side1 + " side2= "+ side2 + " side3= "+side3;
		}
		
		public double getSide1() {
			return side1;
		}

		public double getSide2() {
			return side2;
		}

		public double getSide3() {
			return side3;
		}

}