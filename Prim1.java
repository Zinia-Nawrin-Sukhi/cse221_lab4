import java.util.*; 
import java.lang.*; 
import java.io.*; 
public class Prim1{
  static int min_key;
  static int V;
  static int r =0;
  public static void main(String[] args) {
    BufferedReader obj= null;
    try {
      String str;
      FileReader fr = new FileReader("E:\\cse221\\lab\\lab4\\primGraph.txt");
      obj = new BufferedReader(fr);
      str = obj.readLine();
      V = Integer.parseInt(str);
      System.out.println(V);
       int graph[][]= new int[V][V];
      int weight=0;
      while ((str = obj.readLine()) != null) {
        StringTokenizer st = new StringTokenizer(str," ");
        int token1 = Integer.parseInt(st.nextToken());
        int token2 = Integer.parseInt(st.nextToken());
        int token3=Integer.parseInt(st.nextToken());
    graph[token1][token2]=token3;
      weight=token3;
        // MstPrim(graph,weight,r);
          }
        for(int k=0;k<V;k++)
      {
        for(int j=0;j<V;j++)
        {
          System.out.print(graph[k][j]+" "); 
        }
        //System.out.println(); 
    
    }
       static  Queue<Integer> q = new LinkedList<Integer>();
  static int key[]=new int[V];
  static  int parents[]=new int[V];
  
  for(int u=0;u<V;u++){
    key[u]=100000; 
    parents[u]=-1; 
  }
  key[r]=0;
  for(int v=0;v<V;v++){
    q.add(v);
  }
  if(q.size()!=0){

    min_key=100000;

      for(int v=0;v<graph.length;v++){ 
        if(key[v]<min_key){
          min_key=v;
          q.remove(v);
                System.out.println(min_key+" ");
          System.out.println();
        }
      }
          for(int u=0;u<V;u++){
      for(int v=0;v<V;v++){
        if(  graph[u][v]<key[v]){
          key[v]=weight;
          parents[v]=u;
          
        }
      }
    }
    }
  }
}
    // MstPrim(graph,weight,r);
   }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
//  static  Queue<Integer> q = new LinkedList<Integer>();
//  static int key[]=new int[V];
//  static  int parents[]=new int[V];
//  static void MstPrim(int graph[][],int weight,int r){
//  for(int u=0;u<V;u++){
//    key[u]=100000; 
//    parents[u]=-1; 
//  }
//  key[r]=0;
//  for(int v=0;v<V;v++){
//    q.add(v);
//  }
//  if(q.size()!=0){
////    for(int u=0;u<graph.length;u++){
////      for(int v=0;v<=u;v++){
////        if(  graph[u][v]<key[v]){
////          key[v]=weight;
////          parents[v]=u;
////          
////        }
////      }
////    }
//    min_key=100000;
////    for(int u=0;u<graph.length;u++){
//      for(int v=0;v<graph.length;v++){ 
//        if(key[v]<min_key){
//          min_key=v;
//          q.remove(v);
//                System.out.println(min_key+" ");
//          System.out.println();
//        }
//      }
//          for(int u=0;u<V;u++){
//      for(int v=0;v<V;v++){
//        if(  graph[u][v]<key[v]){
//          key[v]=weight;
//          parents[v]=u;
//          
//        }
//      }
//    }
//    }
//  }
//}
////} 