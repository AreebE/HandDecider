import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HandDecider {
  public static final int ROYAL_FLUSH = 10;
  public static final int STRAIGHT_FLUSH = 9;
  public static final int FOUR_OF_A_KIND = 8;
  public static final int FULL_HOUSE = 7;
  public static final int FLUSH = 6;
  public static final int STRAIGHT = 5;
  public static final int THREE_OF_A_KIND = 4;
  public static final int TWO_PAIR = 3;
  public static final int ONE_PAIR = 2;
  public static final int HIGHEST_CARD = 1;

  public static int findTypeOfHand(HashSet<Suit> suits, HashSet<Integer> values, HashMap<Integer, Integer> occurances){
      int handType = -1;
      
      // IF there's only one suit, then it must be a flush
      if (suits.size() == 1){
        if (values.size() != 5) // Royal Flush is only possible with five different values
            return FLUSH;
        int lowestValue = 1;
        while (!values.contains(lowestValue)){
          lowestValue++;
        }

        switch(lowestValue){
          case 1: // meaning Ace
            int i = 10;
            while (i < 14 && values.contains(i))
              i++;
            if (i == 14)
              return ROYAL_FLUSH;
          
          default:
            i = lowestValue;
            int highestPossibleValue = i + 4;
            while (i < highestPossibleValue && values.contains(i)){
              i++;
              if (i == highestPossibleValue)
                return STRAIGHT_FLUSH;
              else 
                return FLUSH;
            }
        
        }
      }
      // Either four of a kind or Full house
      if (values.size() == 2){
        if (occurances.get(4) == 1)
          return FOUR_OF_A_KIND;    
        else 
          return FULL_HOUSE;
      }

      // Either straight or highestValue 
      else if (values.size() == 5){
        int lowestValue = 1;
        while (!values.contains(lowestValue)){
          lowestValue++;
        }
        for (int i = lowestValue; i < lowestValue + 5; i++){
          if (!values.contains(i)){
            return HIGHEST_CARD;
          }
        }
        return STRAIGHT;
      }

      // Must be three of a kind, two pair, or one pair
      if (occurances.get(3) == 1){
        return THREE_OF_A_KIND;
      }
      else if (occurances.get(2) == 2){
        return TWO_PAIR;
      }
      else {
        return ONE_PAIR;
      }
  }

  
  
}