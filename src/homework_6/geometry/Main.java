package homework_6.geometry;

public class Main {
    public static void main(String[] args) {
        // Массив различных фигур
        Figure[] figures = new Figure[5];

        figures[0] = new Circle(5);            // круг радиусом 5
        figures[1] = new Rectangle(4, 6);      // прямоугольник размером 4x6
        figures[2] = new Triangle(3, 4, 5);    // треугольник со сторонами 3, 4, 5
        figures[3] = new Circle(7);            // круг радиусом 7
        figures[4] = new Rectangle(8, 2);      // прямоугольник размером 8x2

        // Подсчет суммы периметров всех фигур массива
        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.perimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}
