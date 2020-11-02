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

  public boolean add(String element){
    if(size==10) resize();
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
    if(index>=size) return "Index "+index+" is out of bounds";
    return data[index];
  }

  public String set(int index, String element){
    if(index>=size) return "Index "+index+" is out of bounds";
    String old=get(index);
    data[index]=element;
    return old;
  }

  private void resize(){
    String[] newData=new String[size+10];
    for(int i=0;i<size;i++){
      newData[i]=data[i];
    }
    data=newData;
  }
/*
  ___________________________________________________
  Example usage:
  SuperArray words = new SuperArray();
  words.add("kani");
  words.add("uni");
  words.add("ebi");
  for(int i = 0; i < words.size(); i++){
    System.out.println( words.get(i) );
*/
}
