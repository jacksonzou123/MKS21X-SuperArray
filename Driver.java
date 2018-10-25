public class Driver{
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    System.out.println(a);
    a.add("fifteen");
    System.out.println(a);
    System.out.println(a.toStringDebug());
  }
}
