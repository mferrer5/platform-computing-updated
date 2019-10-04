import java.util.Queue;

public class WeightedGraphTester {
	public static void main(String[] args) {
		WeightedGraph<String> graph= new WeightedGraph<>();
		graph.addVertex("Philly");
		graph.addVertex("Denver");
		graph.addVertex("San Francisco");
		graph.addVertex("Chicago");
		
		graph.addEdge("Philly", "Denver", 2000);
		graph.addEdge("Denver", "Philly", 2000);
		graph.addEdge("Denver", "San Francisco", 1300);
		graph.addEdge("Denver", "Chicago", 1000);
		graph.addEdge("San Francisco", "Denver", 1300);
		graph.addEdge("Chicago", "San Francisco", 1700);
	
		//where can I fly from Denver?
		//gettoVertices
		Queue<String> denverFlights= graph.getToVertices("Denver");
		System.out.println("From Denver, you can fly to: "
		+denverFlights);
		
		//how far is flight from SF to Denver?
		//weightIs
		System.out.println("Distance from San Francisco to Denver is: " +
		graph.weightIs("San Francisco", "Denver")
		+ " miles");
		
		//is there a path... use breadth first and depth first searches
		
	}
}
