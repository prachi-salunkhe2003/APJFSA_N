package firstproject;

public class perimeter {

	

	    // Method to calculate the perimeter of a square
	    public double calculatePerimeter(double side) {
	        return 4 * side;
	    }

	    // Method to calculate the perimeter of a rectangle
	    public double calculatePerimeter(double length, double breadth) {
	        return 2 * (length + breadth);
	    }

	    // Method to calculate the perimeter of a circle
	    public double calculatePerimeter(double radius, boolean isCircle) {
	        return 2 * (28.0 / 3.0) * radius;
	    }

	    public static void main(String[] args) {
	        perimeter perimeter = new perimeter();

	        // Calculate and display the perimeter of a square
	        double squarePerimeter = perimeter.calculatePerimeter(5.0);
	        System.out.println("Perimeter of Square: " + squarePerimeter);

	        // Calculate and display the perimeter of a rectangle
	        double rectanglePerimeter = perimeter.calculatePerimeter(5.0, 3.0);
	        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);

	        // Calculate and display the perimeter of a circle
	        double circlePerimeter = perimeter.calculatePerimeter(7.0, true);
	        System.out.println("Perimeter of Circle: " + circlePerimeter);
	    }
	}


/*Perimeter of Square: 20.0
Perimeter of Rectangle: 16.0
Perimeter of Circle: 130.66666666666669*/