/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
   String[] ranks=new String[2];
   String[] suits=new String[2];
   int[] values=new int[2];
   ranks[0]="jack";
   ranks[1]="queen";
   suits[0]="hearts";
   suits[1]="spades";
   values[0]=10;
   values[1]=11;
   Deck one=new Deck(ranks, suits, values);
   System.out.println(one.isEmpty());
   System.out.println(one.size());
 }
}
