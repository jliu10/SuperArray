public class Tester{
  public static void main(String[] args){
    SuperArray words = new SuperArray();
    System.out.println(words);
    System.out.println(words.size());
//    System.out.println(words.get(0));
    System.out.println(words.add("first"));
    System.out.println(words.size());
    System.out.println(words.get(0));
    System.out.println(words.get(1));
    System.out.println(words.set(1,"pea"));
    System.out.println(words.set(0,"pea"));
    System.out.println(words.size());
    System.out.println(words.get(0));
  }
}
