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

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    removeDuplicates(a);
    SuperArray both=new SuperArray();
    for(int i=0;i<a.size();i++){
      if(b.contains(a.get(i))) both.add(a.get(i));
    }
    return both;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    SuperArray words1 = new SuperArray();
    words1.add("una"); words1.add("una"); words1.add("bruh"); words1.add("una");
    words1.add("una"); words1.add("una"); words1.add("toro"); words1.add("toro");
    words1.add("una"); words1.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
/*
    System.out.println(words1);
    removeDuplicates(words1);
    System.out.println(words1);
*/

  SuperArray nums0 = new SuperArray();
  nums0.add("9"); nums0.add("1"); nums0.add("2"); nums0.add("2"); nums0.add("3");
  nums0.add("4");

  SuperArray nums1 = new SuperArray();
  nums1.add("0"); nums1.add("4"); nums1.add("2"); nums1.add("2"); nums1.add("9");

  System.out.println(findOverlap(nums0,nums1));
  System.out.println(findOverlap(words,words1));
  }
}
