public class OnePair extends HandValue {

  public OnePair(Card[] hand){
    super(ONE_PAIR);
    
  }
  @Override
  public int compareHands(HandValue other) {
    OnePair otherRoyal = (OnePair) other;
    return 0;
  } 
}
