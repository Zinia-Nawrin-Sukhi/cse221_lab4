public class Edge
{
    public int from;
    public int to;
    public int dis;
    public int parent;
    public Edge(int f, int t, int d, int p)
    {
        from=f;
        to=t;
        dis=d;
        parent=p;
    }
}