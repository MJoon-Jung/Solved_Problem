package Algorithm.Recursion;

public class CountCell {
	private static int N = 8;
	private static int [][] cells = {
			{1,0,0,0,0,0,0,1},
			{0,1,1,0,0,1,0,0},
			{1,1,0,0,1,0,1,0},
			{0,0,0,0,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{1,0,0,0,1,0,0,1},
			{0,1,1,0,0,1,1,1}
	};
	private static int BACKGROUND_CELL = 0;
	private static int IMAGE_CELL = 1;
	private static int ALREADY_CELL = 2;
	public static int countCells(int x,int y) {
		if(x < 0 || y < 0 || x >= N || y >= N) {
			return 0;
		}
		else if(cells[x][y] != IMAGE_CELL) {
			return 0;
		}
		else {
			cells[x][y] = ALREADY_CELL;
			return 1 + countCells(x+1,y) + countCells(x+1,y-1) + countCells(x+1,y+1) + countCells(x,y+1) + countCells(x,y-1) + countCells(x-1,y) + countCells(x-1,y+1) + countCells(x-1,y-1);
		}
		
	}
	
	public static void main(String[] args) {
		int result = countCells(7,7);
		System.out.println("result : " + result);
	}
}
