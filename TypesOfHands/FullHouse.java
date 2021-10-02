public class FullHouse extends HandValue {

  public FullHouse(Card[] hand){
    super(FULL_HOUSE);
    
  }
  @Override
  public int compareHands(HandValue other) {
    FullHouse otherRoyal = (FullHouse) other;
    return 0;
  }
  
}

