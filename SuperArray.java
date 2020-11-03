public class SuperArray{
  private String [] data;
  private int size; //The current size
  public SuperArray(){
    data=new String[10];
    size=0;
  }

  public SuperArray(int initialCapacity){
    data=new String[initialCapacity];
    size=0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(size==data.length) resize();
    size++;
    String[] oldData=data;
    data=new String[data.length];
    for(int i=0;i<size-1;i++){
      data[i]=oldData[i];
    }
    data[size-1]=element;
    return true;
  }

  public void add(int index, String element){
    if(size==data.length) resize();
    String[] oldData=data;
    data=new String[data.length];
    for(int i=0;i<index;i++){
      data[i]=oldData[i];
    }
    data[index]=element;
    for(int i=index;i<size;i++){
      data[i+1]=oldData[i];
    }
    size++;
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
    String[] newData=new String[size*2];
    for(int i=0;i<size;i++){
      newData[i]=data[i];
    }
    data=newData;
  }

  public boolean isEmpty(){
    return size==0;
  }

  public void clear(){
    data=new String[data.length];
    size=0;
  }

  public String toString(){
    if(size==0) return "[]";
    String result="[";
    for(int i=0;i<size-1;i++){
      result+=data[i]+", ";
    }
    result+=data[size-1]+"]";
    return result;
  }

  public boolean contains(String s){
    if(size==0) return false;
    for(int i=0;i<size;i++){
      if(data[i]==s) return true;
    }
    return false;
  }

}
