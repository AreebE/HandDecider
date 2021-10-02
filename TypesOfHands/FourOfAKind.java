public class FourOfAKind extends HandValue {

  public FourOfAKind(Card[] hand){
    super(FOUR_OF_A_KIND);
    
  }
  @Override
  public int compareHands(HandValue other) {
    FourOfAKind otherRoyal = (FourOfAKind) other;
    return 0;
  }
  
}