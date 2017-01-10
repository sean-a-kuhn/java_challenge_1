// This class implements a method that passes in a node from a tree, and returns an arraylist containing
// a list of the given node and all of its children nodes.  Each node in the list is unique--there are no duplicates.
// This program assumes an acyclic, directed graph of type GNode

import java.util.ArrayList;

public class WalkGraph{
   public static void main(String[] args){
   
        /* Create a graph of GNodes */
      
        // Allocate memory to hold list of GNodes in graph
        ArrayList<GNode> vertices = new ArrayList<GNode>();
        
        // Call function to generate GNode list from graph
        vertices = walkGraph(/* insert root GNode */);
        
        // Print names of GNodes in graph
        System.out.println("Directed Graph starting at given root contains the following GNodes:");
        int counter = 10;
        for (int i = 0; i < vertices.size(); i++){
           
           // Counter used to print GNode names at 10 names per line
           if (counter == 10){
              counter = 0;
              System.out.print("\n\t");
           }
           //  Prints the last GNode's name without a comma
           if (i == vertices.size()-1){
              System.out.print(vertices.get(i).getName());
              break;
           }             
           System.out.print(vertices.get(i).getName() + ", ");
           counter++;
        }    
   }
   
   // Method call to return an arraylist of GNodes contained in an acyclic, directed graph starting at passed in root *node
   public ArrayList<GNode> walkGraph(GNode node){
      
         // Create arraylist to contain list of all GNodes in a given directed graph with passed in node as the root
         ArrayList<GNode> returnList = new ArrayList<GNode>();  
         
         // Call function *addNodes* passing in the arraylist and root node
         returnList = addNodes(returnList, node);           
         
         return returnList;
   }
   
   // This function takes an arraylist and a node
   // It recursively walks a directed graph and adds passed in nodes to the arraylist
   public ArrayList<GNode> addNodes(ArrayList al, GNode node){
   
      // Check that the arraylist does not contain the current node
      // If the node is not already in the list, add the node and call *addNodes* on all children nodes
      if (!al.contains(node)){          
         al.add(node);                       
         if (node.getChildren().length > 0){         
            GNode[] children = node.getChildren();            
            for (int i = 0; i < children.length; i++){
               al = addNodes(al, children[i]);
            }
         }  
      }
      return al;
   }    
}
