import java.awt.*;
import java.awt.geom.Point2D;

public class Point2DTest {
    public static void main(String[] args) {
        int N = StdIn.readInt();

        for(int i=0;i<N;i++){
            int x = StdRandom.uniform(0,10);
            int y = StdRandom.uniform(0,10);
            Point2D p = new Point(x, y);

            StdDraw.point(x,y);

        }
    }
}
