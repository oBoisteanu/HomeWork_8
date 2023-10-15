import exercise1.Person;
import exercise1.Staff;
import exercise1.Student;
import exercise2.Parallelogram;
import exercise3.Circle;
import exercise3.Cube;
import exercise3.Sphere;
import exercise3.Square;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//    // exercise 1
//        Student student1 = new Student("Petru Ivanov", "mun.Chisinau", "Front-End Development", 1, 4500.00);
//        System.out.println(student1);
//
//        Staff staff1 = new Staff("Maria Petrova", "mun. Balti", "Scoala nr. 35", 8500.00);
//        System.out.println(staff1);
//    }
//
//        // exercise 2
//        Parallelogram parallelogram = new Parallelogram ();
//        System.out.println("The perimeter 1 is:" + parallelogram.calculatePerimeter(12, 24));
//        System.out.println("The perimeter 2 is:" + parallelogram.calculatePerimeter(35));
//        System.out.println("The area 1 is:" + parallelogram.calculateArea(12, 24));
//        System.out.println("The area 2 is:" + parallelogram.calculateArea(35));
//    }

        //exercise 3
        Circle circle = new Circle();
        circle.calculateAreaTwoDimensionalShape();

        Square square = new Square();
        square.calculateAreaTwoDimensionalShape();

        Cube cube = new Cube();
        cube.calculateAreaThreeDimensionalShape();
        cube.calculateVolumeThreeDimensionalShape();

        Sphere sphere = new Sphere();
        sphere.calculateAreaThreeDimensionalShape();
        sphere.calculateVolumeThreeDimensionalShape();

    }
}