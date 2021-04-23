import java.io.*;
import java.util.*;
public class BellmanFord
{
    static int []from;
    static int [] to;
    static int n;
    public static void main(String [] args)
    {
        String str;
        int graph[][];
        BufferedReader br=null;
        try
        {
            FileReader fr=new FileReader("F:\\221 labs\\FINAL SUBMISSION\\weighted graphs\\BellmanFord\\bellmanFord.txt");
            br=new BufferedReader (fr);
            n=Integer.parseInt(br.readLine());
            System.out.print(n);
            System.out.println();
            graph=new int [n+1][n+1];
            from=new int [n+1];
            to=new int [n+1];
            int i=0;
            while((str=br.readLine())!=null)
            {
                StringTokenizer st=new StringTokenizer(str," ");
                int t1=Integer.parseInt(st.nextToken());
                int t2=Integer.parseInt(st.nextToken());
                int t3=Integer.parseInt(st.nextToken());
                graph[t1][t2]=t3;
                from[i]=t1;
                to[i]=t2;
                i++;
            }
            Edge []edge=new Edge[graph.length];
            
            for(int j=0; j<graph.length; j++)
            {
                edge[j]=new Edge(from[j], to[j], 999999, -1);
            }
            
            int source=1;
            edge[from[source-1]].dis=0;
            for(int u=0; u<n-1; u++)
            {
                for(int x=0; x<i; x++)
                {
                    if(edge[from[x]].dis < edge[to[x]].dis)
                    {
                        edge[to[x]].dis=edge[from[x]].dis + graph[edge[x].from][edge[x].to];
                        edge[to[x]].parent=from[x];
                    }
                }
            }
            for(int u=n-1; u<=n; u++)
            {
                for(int x=0; x<i; x++)
                {
                    if(edge[from[x]].dis < edge[to[x]].dis)
                    {
                        System.out.println("Negatively weighted cycle");
                    }
                    break;
                }
            }
            int x=n;
            System.out.print("Total cost "+edge[x].dis+"\nShortest path "+x);
            while(x!=source)
            {
                x=edge[x].parent;
                System.out.print("<--"+x);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
            
        }
    }
}