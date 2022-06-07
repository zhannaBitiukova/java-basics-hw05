public abstract class FlyingBird extends Bird {
  public FlyingBird() {
    setSection("Unknown");
  };
  @Override
  public String toString() {
    return getSection();
  }
  public void checkWings() {System.out.println("Bird wings are checked.");}
}
