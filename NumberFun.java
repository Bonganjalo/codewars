import java.util.*;

public class NumberFun {
  public static long findNextSquare(long sq) {

      double sqrt = Math.sqrt(sq);
      long convertedSqrt = (long) sqrt;
    
      if(sqrt != (long) convertedSqrt){
        return -1;
      }
    
      convertedSqrt++; 
      return convertedSqrt * convertedSqrt; 
  }
}
