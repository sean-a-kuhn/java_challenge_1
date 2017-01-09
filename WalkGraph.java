// This class implements a method that passes in a node from a tree, and returns an arraylist containing
// a list of the given node and all of its children nodes
// This program assumes an acyclic, directed graph of type GNode

import java.util.ArrayList;

public class WalkGraph{
   public static void main(String[] args){
   
      public ArrayList<GNode> walkGraph(GNode passme){
      
            ArrayList<GNode> returnList = new ArrayList<GNode>();  
            returnList = addNodes(returnList, passme);           
            return returnList;
      }  
   }
   
   public ArrayList<GNode> addNodes(ArrayList al, GNode node){
   
      if (!al.contains(node)){          
         al.add(node);                       
         if (node.getChildren().length > 0){         
            GNode[] array = node.getChildren();            
            for (int i = 0; i < array.length; i++){
               al = addNodes(al, array[i]);
            }
         }  
      }          
      return al;
   }    
}