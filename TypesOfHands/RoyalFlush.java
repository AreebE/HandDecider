public class RoyalFlush extends HandValue {

  public RoyalFlush(Card[] hand){
    super(ROYAL_FLUSH);
    
  }
  @Override
  public int compareHands(HandValue other) {
    RoyalFlush otherRoyal = (RoyalFlush) other;
    return 0;
  }
  
}