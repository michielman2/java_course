package section1_intro.part1_language_basics;

public class GeometryAnalyser {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();

        point1.x = Integer.parseInt(args[0]);
        point1.y = Integer.parseInt(args[1]);
        point2.x = Integer.parseInt(args[2]);
        point2.y = Integer.parseInt(args[3]);

        if (args[4].contains("dist")){
            double distance = point1.euclideanDistanceTo(point2);
            System.out.printf("%.1f%n", distance);
        } else if (args[4].contains("surf")){
            Rectangle rectangle = new Rectangle();
            rectangle.upperLeft = point1;
            rectangle.lowerRight = point2;

            int surface = rectangle.getSurface();
            System.out.println(surface);

        }

    }
}
