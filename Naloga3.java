import java.util.*;
public class Naloga3 {
	
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {

		String alg = in.nextLine();
		String[] besede = alg.split(" ");
		int dolzinaIzpisa;

		
		System.out.printf("besede[0]: %s\n", besede[0]);
		if (besede.length > 1) {
			dolzinaIzpisa = Integer.parseInt(besede[1]);
			System.out.printf("besede[1]: %d\n", dolzinaIzpisa);
		}

		int[][] graph;
		int numOfVertices = in.nextInt();	// St. vozlisc v grafu
		int numOfPairs = in.nextInt();		// St. povezav v grafu

		graph = new int[numOfVertices][numOfVertices];



		for (int i = 0; i < numOfPairs; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			graph[a][b] = 1;
			//graph[b][a] = 1;
		}

		print(graph);

		switch (alg) {
			case ("2c"):
				
				break;
			case ("gr"):
				
				break;
			case ("ex"):
				
				break;
			case ("bt"):
				
				break;
			default:
			
				break;
		}
	}

	public static void print(int[][] g) {
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g[i].length; j++) {
				System.out.printf("%s ", g[i][j]);
			}
			System.out.printf("\n");
		}
	}
}