import java.util.*;
public class Naloga3 {
	
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {

		String alg = in.nextLine();
		String[] besede = alg.split(" ");
		int output = -1;
		if (besede.length > 1) {
			output = Integer.parseInt(besede[1]);
		}

		switch (alg) {
			case ("2c"):
				graphColouring();
				break;
			case ("gr"):
				greedy();
				break;
			case ("ex"):
				
				break;
			case ("bt"):
				
				break;
			default:
			
				break;
		}
	}

	public static void greedy() {
		int[][] graph;
		int numOfVertices = in.nextInt();	// St. vozlisc v grafu
		int numOfPairs = in.nextInt();		// St. povezav v grafu

		for (int i = 0; i < numOfPairs; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			graph[a][b] = 1;
			//graph[b][a] = 1;
		}
		int stBarve = 0;

		print(graph);

	}

	public static void print(int[][] g) {
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g[i].length; j++) {
				System.out.printf("%s ", g[i][j]);
			}
			System.out.printf("\n");
		}
	}

	public static void graphColouring() {
		
		

		int[][] graph;
		int numOfVertices = in.nextInt();	// St. vozlisc v grafu
		int numOfPairs = in.nextInt();		// St. povezav v grafu

		graph = new int[numOfVertices][numOfVertices];
		for (int i = 0; i < numOfVertices; i++) {
			for (int j = 0; j < numOfVertices; j++) {
				graph[i][j] = -1;
			}
		}
		int[][] g2 = graph;
		int razdalja = 0;

		for (int i = 0; i < numOfPairs; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			graph[a][b] = 0;
			//graph[b][a] = 1;
		}
		print(graph);

		for (int i = 0; i < numOfVertices; i++) {
			graph(graph, i);
		}
	}

	public static void graph(int[][] g, int dist) {

	}
}