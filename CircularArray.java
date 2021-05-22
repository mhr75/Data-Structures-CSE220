/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararray;

/**
 *
 * @author user
 */
public class CircularArray {
    private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
  start  = st;
  size = sz;
  cir = new Object[lin.length];
  for(int i=0;i<lin.length;i++)
  {
    cir[start] = lin[i];
    start = (start+1)%cir.length;
  }
  }
  public void printFullLinear(){
    for(int i=0;i<cir.length;i++){if(i==cir.length-1) System.out.print(cir[i]+".");else System.out.print(cir[i]+", ");}
    System.out.println();
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    int st= start;
    for(int i=0;i<size;i++)
    {
      {if(i==size-1) System.out.print(cir[st%cir.length]+".");else System.out.print(cir[st%cir.length]+", ");}
    
      st++;
    }
    System.out.println();
  }
  
  
  public void printBackward(){
    //TO DO
    int st =start+size-1;
    for(int i=0;i<size;i++)
    {
    {if(i==size-1) System.out.print(cir[st%cir.length]+".");else System.out.print(cir[st%cir.length]+", ");}
    
      st--;
    }
    System.out.println();
  }
  
  // With no null cells
  public void linearize(){
    //TO DO
    Object a [] =new Object [size];
    int st =start;
    for(int i=0;i<size;i++)
    {
      a[i]= cir[st%cir.length];
      st++;
    }
    cir=a;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    //TO DO
    int st =start;
    Object a []=new Object [newcapacity];
    for(int i=0;i<newcapacity;i++)
    {
      if(i>=start&&i<=size+1){a[i]=cir[st%cir.length];st++;}
      else a[i]= null;
    }
    cir=a;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    //TO DO
    
    int st =start;
    Object a []=new Object [newcapacity];
    for(int i=0;i<newcapacity;i++)
    {
      if(i<size){a[i]=cir[st%cir.length];st++;}
      else a[i]= null;
    }
    cir=a;
  }
  
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
   if(cir.length==size)
   {
     resizeStartUnchanged(size+3);
   }
   for(int i=start+size;i>=start+pos;i--)
   {
     cir[(i+1)%cir.length]=cir[i%cir.length];
   }
   cir[start+pos]=elem;
   size++;
  }
  public void insertByLeftShift(Object elem, int pos){
    //TO DO
    if(cir.length==size)
   {
     resizeStartUnchanged(size+3);
   }
   for(int i=start;i<=start+pos;i++)
   {
     
     cir[(i-1)%cir.length]=cir[i%cir.length];
   }
   cir[start+pos]=elem;
   start--;
   size++;
  }
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos){
      //TO DO
      
      for(int i=start+pos;i<start+size;i++)
      {
        cir[i%cir.length]=cir[(i+1)%cir.length];
      }
      cir[(start+size)%cir.length]=null;
      size--;
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos){
      //TO DO
      
      for(int i=start+pos;i>start;i--)
      {
        cir[i%cir.length]=cir[(i-1)%cir.length];
      }
      cir[(start)%cir.length]=null;
      start++;
      size--;
    }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
    //TO DO
    boolean adi =true;
    for(int i=start,j=start+size-1;i<j;i++,j--)
    {
     
    if(cir[i%cir.length]!=cir[j%cir.length]) {adi=false;break;}
    }
    if(adi) System.out.println("This is a palindrome Array");
    else System.out.println("it is not a palindrome Array");
  }
  
  
  //This method will sort the values by keeping the start unchanged
  public void sort(){
    //TO DO
    for(int i=0;i<size;i++)
    {
        
        for(int j=start;j<start+size-1;j++)
        {
            int a = (int) cir[j%cir.length];
            int b= (int) cir[(j+1)%cir.length];
            if(a>b)
            {
                Object temp = cir[j%cir.length];
                cir[j%cir.length]=cir[(j+1)%cir.length];
                cir[(j+1)%cir.length]=temp;
            }
        }
    }
  }
  
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k){
    //TO DO
    boolean adi=true;
    if(size==k.size)
    {
        for(int i=start,j=k.start;i<start+size;i++,j++)
        {
            int a = (int) cir [i%cir.length];
            int b= (int)k.cir [j%k.cir.length];
            if(a!=b){adi=false;break;}
        }
    }
    else adi=false;
         return adi;
  }
    
}
