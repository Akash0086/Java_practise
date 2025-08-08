package practise.Array;


public class addind {
  public static void main(String[] args) {
      char[] a={'a','b','c'};
      char[] b={'d','e','f','g'};

      int maxlen=Math.max(a.length, b.length);
      String[] res=new String[maxlen]; 
    
      for(int i=0;i<maxlen;i++){
        StringBuilder sb=new StringBuilder();
        if(i<a.length) sb.append(a[i]);
        if(i<b.length) sb.append(b[i]);
        res[i]=sb.toString();
      }


      System.out.print("{");
      for(int i=0;i<maxlen;i++){
        System.out.print(res[i]);
        if(i != res.length-1) System.out.print(",");
      }
      System.out.println("}");
  }
  
}
