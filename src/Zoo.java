import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List<? extends Bird> list) {
    System.out.print("Feeding birds: ");
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
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    System.out.print("Accepting a bird to a section. ");
    bird.checkWings();
    list.add(bird);
    System.out.print("Bird list now:");
    for (Object eachBird : list) {
      System.out.print(" " + eachBird.toString() + ",");
    }
    System.out.println();
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List<? super Bird> list, Bird newBird) {
    System.out.print("Adding a bird to the birds list");
    System.out.println(" - " + newBird.toString());
    list.add(newBird);
    System.out.print("Bird list now:");
    for (Object eachBird : list) {
      System.out.print(" "+ eachBird.toString() + ",");
    }
    System.out.println();
  }
}