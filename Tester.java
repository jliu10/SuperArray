public class Tester{
  public static void main(String[] args){
    SuperArray words = new SuperArray();
    System.out.println(words);
    System.out.println(words.size());
//    System.out.println(words.get(0));
    System.out.println(words.add("jan"));
    System.out.println(words.size());
    System.out.println(words.add("feb"));
    System.out.println(words.size());
    System.out.println(words.get(0));
    System.out.println(words.get(1));
    System.out.println(words.get(2));
    System.out.println(words.set(0,"pea"));
    System.out.println(words.set(5,"pea"));
    System.out.println(words.size());
    System.out.println(words.get(0));
    System.out.println(words.add("mar"));
    System.out.println(words.size());
    System.out.println(words.add("apr"));
    System.out.println(words.size());
    System.out.println(words.add("may"));
    System.out.println(words.size());
    System.out.println(words.add("jun"));
    System.out.println(words.size());
    System.out.println(words.add("jul"));
    System.out.println(words.size());
    System.out.println(words.add("aug"));
    System.out.println(words.size());
    System.out.println(words.add("sep"));
    System.out.println(words.size());
    System.out.println(words.add("oct"));
    System.out.println(words.size());
    System.out.println(words.add("nov"));
    System.out.println(words.size());
    System.out.println(words.add("dec"));
    System.out.println(words.size());
  }
}
