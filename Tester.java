public class Tester{
  public static void main(String[] args){
    SuperArray words = new SuperArray();
    words = new SuperArray(9);
    System.out.println(words);
    System.out.println(words.size());
    System.out.println(words.isEmpty());
    System.out.println(words.add("jan"));
    System.out.println(words.size());
    System.out.println(words.add("feb"));
    System.out.println(words.size());
    System.out.println(words.isEmpty());
    System.out.println(words.get(0));
    System.out.println(words.get(1));
    System.out.println(words.get(2));
    System.out.println(words.set(0,"pea"));
    System.out.println(words.set(5,"pea"));
    System.out.println(words);
    System.out.println(words.get(0));
    System.out.println(words.add("mar"));
    System.out.println(words);
    System.out.println(words.add("apr"));
    System.out.println(words);
    System.out.println(words.add("may"));
    System.out.println(words);
    System.out.println(words.add("jun"));
    System.out.println(words);
    System.out.println(words.add("jul"));
    System.out.println(words);
    System.out.println(words.add("aug"));
    System.out.println(words);
    System.out.println(words.add("sep"));
    System.out.println(words);
    System.out.println(words.add("oct"));
    System.out.println(words);
    System.out.println(words.add("nov"));
    System.out.println(words);
    System.out.println(words.add("dec"));
    System.out.println(words);
    System.out.println(words.toString());
    System.out.println(words.contains("jul"));
    System.out.println(words.contains("wow"));
    words.add(1,"cow");
    System.out.println(words);
    words.add(0,"cow");
    System.out.println(words);
    words.add(words.size(),"cow");
    System.out.println(words);
    System.out.println(words.add("cow"));
    System.out.println(words);
  }
}
