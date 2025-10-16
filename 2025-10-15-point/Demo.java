public class Demo{

  /*3.
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println(new Point(p1,p2)
    System.out.println(new Point(p2,p3))
    System.out.println(new Point(p1,p3))
    System.out.println(p3);
    System.out.println( distance(p1));
    System.out.println( Point.distance(p2));
    System.out.println( p1.distanceTo(p3));
  }
}

