public class Pet {

    private String name;
   
    private int age;
    
    public Pet(String name, int age) {
      super();
      this.name = name;
      this.age = age;
    }
    
    public String getName() {
      return name;
    }
    
    public void setName(String name) {
      this.name = name;
    }
    
    public int getAge() {
      return age;
    }
    
    public void setAge(int age) {
      this.age = age;
    }
    
    
    @Override
    public String toString() {
      String s = "";
      s = String.format("%5s%10s%10s%5d%5s\n", "|", name, "|", age, "|");
      return s;
    }
}
