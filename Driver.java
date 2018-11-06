public class Driver{
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    System.out.println(a);
    System.out.println(a.toStringDebug());
    a.add("one");
    a.add("two");
    a.add("three");
    a.add(1,"four");
    System.out.println(a);
    for(int i = 0; i < 10; i++) {
      a.add(""+i);
    }
    System.out.println(a);
    System.out.println(a.toStringDebug());
    System.out.println(a.remove(0));
    System.out.println(a);
    System.out.println(a.remove("four"));
    System.out.println(a);
    System.out.println(a.toStringDebug());
    System.out.println(a.remove("yes"));
  }
}
