public class APLine
{
  /* your code here */
  private double slope;
  private int a, b, c;
  APLine(int j, int k, int l){
    a = j;
    b = k;
    c = l;
    slope = (double)-a/b;
  }
  public double getSlope(){
    return slope;
  }
  public boolean isOnLine(int x, int y){
    if(a*x+b*y+c == 0)
      return true;
    return false;
  }
}
