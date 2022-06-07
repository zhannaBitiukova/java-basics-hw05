import java.util.ArrayList;
import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List<? extends Bird> list) {
    System.out.println("Feeding birds");
    for (Object bird : list) {
      System.out.print(bird.toString() + " - " );
      Bird.eat();
    }
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(ArrayList<? super FlyingBird> list, FlyingBird bird) {
    // TODO fix method declaration
    System.out.println("Accepting a bird to a section");
    // TODO check flying bird wings
    bird.checkWings();
    // TODO add a bird to the list and print it
    list.add(bird);
    for (Object eachBird : list) {
      System.out.println(eachBird.toString());
    }

  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List list, Bird newBird) {
    // TODO fix method declaration
    System.out.println("Adding a bird to the birds list");
    // TODO add a bird to list
    // TODO print birds in the cycle
  }
}