public class Point{
  private double x,y;

  //1.
  public String toString(){
    return "("+x+","+y+")";
  }

  //Initialize this Point to have the same values as the other Point.
  public Point(Point other){
    //2. COMPLETE THIS SECOND
    //Then write test cases.
    this.x=other.getX();
    this.y=other.getY();
  }

  //Initialize this Point to have the provided values
  public Point(double x, double y){
    this.x=x;
    this.y=y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  /*
  Write this method FOURTH, go to the main and do that one first.
  */
  public double distanceTo(Point other){
    return Math.sqrt((this.getX()-other.getX())*(this.getX()-other.getX())+(this.getY()-other.getY())*(this.getY()-other.getY()));
  }

  /*
  Write this method last. Re-use (NOT COPY/PASTE) prior work and
  do not write redundant code. Do not try to use your main's version.
  */
  public static double distance(Point a, Point b){


  }


}
