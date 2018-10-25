public class Driver{
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    System.out.println(a);
    a.add("fifteen");
    System.out.println(a);
    System.out.println(a.toStringDebug());
    int i = 15;
    while (i > 0) {
      a.add("haha");
      i -= 1;
    }
    System.out.println(a);
    System.out.println(a.toStringDebug());
  }
}
