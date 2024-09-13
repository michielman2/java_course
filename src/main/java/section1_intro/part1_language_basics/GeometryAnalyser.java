package section1_intro.part1_language_basics;

public class GeometryAnalyser {
    public  main(String[] args) {
        if (args[4].contains("dist")){
            Point point1 = new Point();
            Point point2 = new Point();

            point1.x = Integer.parseInt(args[0]);
            point1.y = Integer.parseInt(args[1]);
            point2.x = Integer.parseInt(args[2]);
            point2.y = Integer.parseInt(args[3]);

            double distance = Math.sqrt(Math.pow(point1.x - point2.x ,2) + Math.pow(point1.y-point2.y, 2));
            return distance;
        }

    }
}
