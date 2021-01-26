
package hello;


public class Point {
    int x;
    int y;
    Point(int px,int py){
        x=px;
         y=py;
        
    }
    double getDistance(Point q ){
        
        Point p =this;
       int dx=p.x-q.y;
       int dy =p.y-q.y;
       return Math.sqrt(dx*dx-dy*dy);
    }
}
