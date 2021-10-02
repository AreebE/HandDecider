public class Straight extends HandValue {

  public Straight(Card[] hand){
    super(STRAIGHT);
    
  }
  @Override
  public int compareHands(HandValue other) {
    Straight otherRoyal = (Straight) other;
    return 0;
  } 
}
