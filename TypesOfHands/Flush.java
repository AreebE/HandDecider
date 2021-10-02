public class Flush extends HandValue {

  public Flush(Card[] hand){
    super(FLUSH);
    
  }
  @Override
  public int compareHands(HandValue other) {
    Flush otherRoyal = (Flush) other;
    return 0;
  }
  
}

