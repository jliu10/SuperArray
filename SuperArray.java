public class SuperArray{
  private String [] data;
  private int size; //The current size
  public SuperArray(){
    data=new String[10];
    size=0;
  }

  public SuperArray(int initialCapacity){
    if(initialCapacity<0){
      throw new IllegalArgumentException("Capacity "+initialCapacity+
      " cannot be negative");
    }
    data=new String[initialCapacity];
    size=0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(size==data.length) resize();
    String[] oldData=data;
    data=new String[data.length];
    for(int i=0;i<size;i++){
      data[i]=oldData[i];
    }
    data[size]=element;
    size++;
    return true;
  }

  public void add(int index, String element){
    if(index<0 || index>size){
      throw new IndexOutOfBoundsException("Index "+index+
      " is out of bounds");
    }
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

  public String remove(int index){
    if(index<0 || index>=size){
      throw new IndexOutOfBoundsException("Index "+index+
      " is out of bounds");
    }
    String old=data[index];
    String[] oldData=data;
    data=new String[oldData.length];
    for(int i=0;i<index;i++){
      data[i]=oldData[i];
    }
    for(int i=index;i<size-1;i++){
      data[i]=oldData[i+1];
    }
    size--;
    return old;
  }

  public String get(int index){
    if(index<0 || index>=size){
      throw new IndexOutOfBoundsException("Index "+index+
      " is out of bounds");
    }
    return data[index];
  }

  public String set(int index, String element){
    if(index<0 || index>=size){
      throw new IndexOutOfBoundsException("Index "+index+
      " is out of bounds");
    }
    String old=get(index);
    data[index]=element;
    return old;
  }

  private void resize(){
    String[] newData=new String[size*2+1]; //+1 in case size is 0
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
    return (indexOf(s)!=-1);
  }

  public int indexOf(String s){
    if(size==0) return -1;
    for(int i=0;i<size;i++){
      if(data[i].equals(s)) return i;
    }
    return -1;
  }

  public int lastIndexOf(String value){
    if(contains(value)){
      for(int i=size-1;i>=0;i--){
        if(data[i].equals(value)) return i;
      }
    }
    return -1;
  }

  public String[] toArray(){
    String[] copy=new String[size];
    if(size==0) return copy;
    for(int i=0;i<size;i++){
      copy[i]=data[i];
    }
    return copy;
  }

  public boolean equals(SuperArray other){
    if(size!=other.size) return false;
    if(size==0) return true;
    for(int i=0;i<size;i++){
      if(data[i].equals(other.data[i])==false) return false;
    }
    return true;
  }

}
