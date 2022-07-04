// search tree node stucture for 8-puzzle problem. 
class PSTNode{
    int state[][]; 
    PSTNode parent; 
    String action; 
    int depth;
    int path_cost; 
    PSTNode up_child; 
    PSTNode down_child; 
    PSTNode left_child; 
    PSTNode right_child; 
    // Constructor: 
    // Create a node with the given element and next node. 
    PSTNode(int state[][], PSTNode parent,String action, int depth, int path_cost, PSTNode up_child, PSTNode down_child, PSTNode left_child, PSTNode right_child)
    {
        this.state=state; 
	this.parent=parent; 
	this.action=action; 
	this.depth=depth; 
	this.path_cost=path_cost;
	this.up_child=up_child; 
	this.down_child=down_child; 
	this.left_child=left_child; 
	this.right_child=right_child; 
    }
   
}
