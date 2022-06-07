public abstract class Bird {
  public Bird() {};
  public String section = "Unknown";
  public static void eat() {System.out.println("The bird is eating");}

  public void setSection(String section){
    this.section = section;
  }

  public String getSection() { return section;}
}
