public class Highest extends HandValue {

  public Highest(Card[] hand){
    super(HIGHEST_CARD);
    
  }
  @Override
  public int compareHands(HandValue other) {
    Highest otherRoyal = (Highest) other;
    return 0;
  } 
}
