package interview.programs.basic;

public class Shape {
	public double length;
	public double breadth;
	public double height;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Shape(double length, double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public double volume() {
		return length * breadth * height;
	}

	public double totalArea() {
		return 2 * (length * breadth + breadth * height + height * length);
	}

	public static void main(String[] args) {
		Shape myShape = new Shape(2, 3, 4);
		System.out.println("volume of the myShape is :" + myShape.volume());
		System.out.println("Total Area of the myShape is :" + myShape.totalArea());
		
		myShape.setLength(6.0);
		myShape.setBreadth(5.0);
		myShape.setHeight(4.0);

		System.out.println("volume of the myShape is :" + myShape.volume());

	}

}
