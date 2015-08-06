import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundAmount{

  private RoundAmount(){

  }

  public static double roundAmountToTwoDigits(double tipAmount){
      BigDecimal bigDecimal = new BigDecimal(Double.toString(tipAmount));
      bigDecimal = bigDecimal.setScale(2,RoundingMode.HALF_EVEN);
      return bigDecimal.doubleValue();
  }
}
