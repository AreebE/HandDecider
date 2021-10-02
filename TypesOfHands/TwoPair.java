public class TwoPair extends HandValue {

  public TwoPair(Card[] hand){
    super(TwoPair);
    
  }
  @Override
  public int compareHands(HandValue other) {
    TwoPair otherRoyal = (TwoPair) other;
    return 0;
  } 
}
