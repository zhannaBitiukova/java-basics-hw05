import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class BirdTest {
//
//  @Test()
//  public void testBird() {
//    assertTrue(Modifier.isAbstract(Bird.class.getModifiers()), "Bird class is not abstract");
//  }
//
//  @Test()
//  public void testFlyingBird() {
//    assertTrue(Modifier.isAbstract(FlyingBird.class.getModifiers()),
//        "Bird class is not abstract");
//
//    assertTrue(Bird.class.isAssignableFrom(FlyingBird.class),
//        "FlyingBird class does not extend Bird class");
//  }
//
//  @Test()
//  public void testNonFlyingBird() {
//    assertTrue(Modifier.isAbstract(NonFlyingBird.class.getModifiers()),
//        "Bird class is not abstract");
//
//    assertTrue(Bird.class.isAssignableFrom(NonFlyingBird.class),
//        "NonFlyingBird class does not extend Bird class");
//  }
//
//  @Test
//  public void testShowList() {
//    List<Eagle> eagles = new ArrayList<>();
//    eagles.add(new Eagle());
//    Runner.showList(eagles);
//
//    assertEquals(eagles.get(0).toString(), "Eagle", "Eagle toString() method is incorrect");
//
//    List<Swallow> swallows = new ArrayList<>();
//    swallows.add(new Swallow());
//    Runner.showList(swallows);
//
//    assertEquals(swallows.get(0).toString(), "Swallow", "Swallow toString() method is incorrect");
//  }
//
//  @Test
//  public void testAddToList() {
//    List<? super NonFlyingBird> nonFlyingBirds = new ArrayList<>();
//    Runner.addToList(nonFlyingBirds, new Penguin());
//    Runner.addToList(nonFlyingBirds, new Kiwi());
//
//    assertEquals(nonFlyingBirds.get(0).toString(), "Penguin",
//        "Penguin toString() method is incorrect");
//
//    assertEquals(nonFlyingBirds.get(1).toString(), "Kiwi",
//        "Kiwi toString() method is incorrect");
//  }
//
//  @Test
//  public void testAddShowList() {
//    List<Bird> birds = new ArrayList<>();
//    Runner.addBirdList(birds, new Eagle());
//    Runner.addBirdList(birds, new Swallow());
//    Runner.addBirdList(birds, new Penguin());
//    Runner.addBirdList(birds, new Kiwi());
//
//    assertEquals(birds.get(0).toString(), "Eagle", "Eagle toString() method is incorrect");
//
//    assertEquals(birds.get(1).toString(), "Swallow", "Swallow toString() method is incorrect");
//
//    assertEquals(birds.get(2).toString(), "Penguin", "Penguin toString() method is incorrect");
//
//    assertEquals(birds.get(3).toString(), "Kiwi", "Kiwi toString() method is incorrect");
//  }
}
