public class ThreeOfAKind extends HandValue {

  public ThreeOfAKind(Card[] hand){
    super(THREE_OF_A_KIND);
    
  }
  @Override
  public int compareHands(HandValue other) {
    ThreeOfAKind otherRoyal = (ThreeOfAKind) other;
    return 0;
  } 
}
