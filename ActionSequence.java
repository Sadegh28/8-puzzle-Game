class ActionSequence {
    int size; 
    Action header, trailer; 
    
    //Constructor
    ActionSequence(){
        size=0; 
        header=new Action(null, null, null); 
        trailer=new Action(null, header, null); 
        header.next=trailer; 
    }
    
    
    //Add an element to the last of the action sequence. 
    void addLast(Action v){
        v.next=trailer; 
        v.prev=trailer.prev; 
        trailer.prev.next=v; 
        trailer.prev=v; 
        size++;                 
    }
    
    
    
    //Print all elements of the action sequence.
    void printList(){
        Action current=header.next; 
        while(current!=trailer){
            System.out.print("\t"+current.element); 
            current=current.next;
        }
        System.out.println(); 
    }
    
    
}
