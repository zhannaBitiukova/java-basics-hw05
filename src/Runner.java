import java.util.List;

public class Runner {

  /**
   * Prints parametrized list of flying bird subtypes.
   * @param list parametrized flying birds list
   */
  public static void showList(List<? extends FlyingBird> list) {
    System.out.println("Showing flying birds list");
    // TODO print flying birds in the cycle.
  }

  /**
   * Adds non flying bird to the list.
   * @param list parametrized list of non-flying birds.
   * @param bird non flying bird.
   */
  public static void addToList(List<? super NonFlyingBird> list, NonFlyingBird bird) {
    System.out.println("Adding bird to the non flying list");
    // TODO add bird to the list
  }

  /**
   * Adds bird to the list.
   * @param list list of birds
   * @param newBird bird to add
   */
  public static void addBirdList(List<Bird> list, Bird newBird) {
    System.out.println("Adding bird to the birds list");
    // TODO add bird to list
    // TODO print birds in the cycle
  }
}