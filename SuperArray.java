public class SuperArray{
  private String [] data;
  private int size; //The current size
  public SuperArray(){
    data=new String[0];
    size=0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(size==10) return false;
    size++;
    String[] oldData=data;
    data=new String[size];
    for(int i=0;i<size-1;i++){
      data[i]=oldData[i];
    }
    data[size-1]=element;
    return true;
  }

  public String get(int index){
    if(index>size-1) return "Index "+index+" out of bounds";
    return data[index];
  }

}
/*
  f)
  public String set(int index, String element)

  g)
  private void resize()

  Modify part d)
  public boolean add(String element)

  ___________________________________________________
  Example usage:
  SuperArray words = new SuperArray();
  words.add("kani");
  words.add("uni");
  words.add("ebi");
  for(int i = 0; i < words.size(); i++){
    System.out.println( words.get(i) );
*/
