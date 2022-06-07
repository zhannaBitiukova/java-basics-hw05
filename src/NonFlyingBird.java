public abstract class NonFlyingBird extends Bird {
  public NonFlyingBird(){
      setSection("NonFlyingBird");
  };
  @Override
  public String toString() {
      return getSection();
  }
}
