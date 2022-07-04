//The Main Class. 
class Puzzle{
	public static void main(String args[]) {
		int[][] initial_state={{1,-1,3},{8,6,4},{7,5,2}};


		Problem problem=new Problem(initial_state); 

		PSearcher searcher=new PSearcher(problem); 

		ActionSequence AS=searcher.Search("BFS"); 
		AS.printList(); 
	}
}
