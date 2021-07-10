package inheritance;

public class Main {
    public static void main(String[] args) {
      Parent parent = new Parent();
      parent.methodParent();
      parent.methodRelative();

      Child child = new Child();
      child.methodChild();
      child.methodRelative();
    }
}
