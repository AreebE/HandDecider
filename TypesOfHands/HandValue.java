import java.lang.Comparable;

abstract public class HandValue implements Comparable<HandValue>{
  public static final int ROYAL_FLUSH = 10;
  public static final int STRAIGHT_FLUSH = 9;
  public static final int FOUR_OF_A_KIND = 8;
  public static final int FULL_HOUSE = 7;
  public static final int FLUSH = 6;
  public static final int STRAIGHT = 5;
  public static final int THREE_OF_A_KIND = 4;
  public static final int TWO_PAIR = 3;
  public static final int ONE_PAIR = 2;
  public static final int HIGHEST_CARD = 1;

  protected int handType;

  public HandValue(int hT){
    handType = hT;
  }

  public int compareTo(HandValue other){
    if (handType == other.getHandType()){
      return compareHands(other);
    }
    return handType - other.getHandType();
  }

  public int getHandType(){
    return handType;
  }

  abstract public int compareHands(HandValue other);
}