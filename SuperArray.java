public class SuperArray{
  private String [] data;
  private int size; //The current size
  public SuperArray(){
    data=new String[10];
    size=0;
  }

  public int size(){
    return size;
  }
}
/*
  d)
  public boolean add(String element)
  -Appends the specified element to the end of this list.

  e)
  public String get(int index)
  -Returns the element at the specified position in this list. [For Now Assume the index is 0 to size-1]

  f)
  public String set(int index, String element)
  -Replaces the element at the specified position in this list with the specified element. Return the value you replaced. [Assume the index is 0 to size-1] note: This is not to add new values, it is only to replace old ones.
  __________________________________________________

  g)
  private void resize()
  -Increase the capacity by :
  creating a larger array
  copy the values from the original array to the new one.
  assign the new one to the instance variable.

  Modify part d)
  public boolean add(String element)
  -Appends the specified element to the end of this list.
  -When the capacity is full, resize before adding.

  ___________________________________________________
  Example usage:
  SuperArray words = new SuperArray();
  words.add("kani");
  words.add("uni");
  words.add("ebi");
  for(int i = 0; i < words.size(); i++){
    System.out.println( words.get(i) );
*/
