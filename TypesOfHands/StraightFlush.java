public class StraightFlush extends HandValue {

  public StraightFlush(Card[] hand){
    super(STRAIGHT_FLUSH);
    
  }
  @Override
  public int compareHands(HandValue other) {
    StraightFlush otherRoyal = (StraightFlush) other;
    return 0;
  } 
}
