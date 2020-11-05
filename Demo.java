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

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray result=new SuperArray();
    int min=Math.min(a.size(),b.size());
    for(int i=0;i<min;i++){
      result.add(a.get(i));
      result.add(b.get(i));
    }
    if(a.size()!=b.size()){
      SuperArray longer=new SuperArray();
      if(a.size()>b.size()) longer=a;
      else longer=b;

      for(int i=min;i<longer.size();i++){
        result.add(longer.get(i));
      }
    }
    return result;
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

  SuperArray empty = new SuperArray();

  SuperArray alpha = new SuperArray(5);
  alpha.add("a"); alpha.add("b"); alpha.add("c"); alpha.add("d"); alpha.add("e");

  SuperArray nums = new SuperArray(5);
  nums.add("1"); nums.add("2"); nums.add("3"); nums.add("4"); nums.add("5");

  System.out.println(findOverlap(nums0,nums1));
  System.out.println(findOverlap(words,words1));

  System.out.println(zip(alpha,nums));
  System.out.println(zip(alpha,alpha));
  System.out.println(zip(nums,alpha));
  alpha.remove(4);
  System.out.println(zip(alpha,nums));
  alpha.add("e"); alpha.add("f"); alpha.add("g"); alpha.add("h");
  System.out.println(zip(alpha,nums));
  System.out.println(zip(empty,nums));
  System.out.println(zip(nums,empty));
  }
}
