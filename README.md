# java_challenge_1
returns all nodes as a list without duplicates from a given acyclic, directed graph

nodes are of type GNode:
  public interface GNode {
    public String getName();
    public GNode[] getChildren();
    // This function returns an array of nodes
    // If node has no children, returns empty array(length 0) instead of "NULL" 
  }

Initial definition:
  public ArrayList walkGraph(GNode);
  
In my implementation, I use the definition as a wrapper function for a recursive method requiring an arraylist to be passed
in as an argument as well as the node.

TO TEST: create a graph within the main method, and pass in a node from the graph into the walkGraph(____) method call.

OUTPUT: a list of names of GNodes contained in graph, organized as 10 names per line.
