public class Driver{
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    System.out.println(a);
    System.out.println("is empty?: " + a.isEmpty());
    System.out.println("size: " + a.size());
    a.add("fifteen");
    System.out.println(a);
    System.out.println("size: " + a.size());
    System.out.println("is empty?: " + a.isEmpty());
    System.out.println(a.toStringDebug());
    int i = 15;
    while (i > 0) {
      a.add("haha");
      i -= 1;
    }
    System.out.println(a);
    System.out.println("size: " + a.size());
    System.out.println(a.toStringDebug());
    a.set(5, "5 hahas");
    a.set(18, "18 hahas");
    System.out.println(a);
    System.out.println("size: " + a.size());
    System.out.println(a.toStringDebug());
    System.out.println("at index 0 " + a.get(0));
    System.out.println("at index 5 " + a.get(5));
    System.out.println("at index 10 " + a.get(10));
    a.clear();
    System.out.println(a);
  }
}
