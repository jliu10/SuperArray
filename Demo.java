public class Demo{
  public static void removeDuplicates(SuperArray s){
    //System.out.println("\nRemoving duplicates...");
    if(s.size()>1){
      for(int i=0;i<s.size();i++){
        //System.out.println(s);
        //System.out.println("i is "+i);
        for(int j=s.size()-1;j>i;j--){
          //System.out.println("j is "+j);
          if(s.get(j).equals(s.get(i))) s.remove(j);
          //System.out.println("size is "+s.size());
          //System.out.println(s);
        }
      }
    }
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
/*
    SuperArray words1 = new SuperArray();
    words1.add("una"); words1.add("una"); words1.add("bruh"); words1.add("una");
    words1.add("una"); words1.add("una"); words1.add("toro"); words1.add("toro");
    words1.add("una"); words1.add("toro");
*/
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
/*
    System.out.println(words1);
    removeDuplicates(words1);
    System.out.println(words1);
*/
  }
}
