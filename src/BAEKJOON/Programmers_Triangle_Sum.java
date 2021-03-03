package BAEKJOON;

public class Programmers_Triangle_Sum {
	public static void main(String[] args) {
		int [][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		System.out.println(solution(triangle));
	}
    static int solution(int[][] triangle) {
        int [][] dp = new int [triangle.length][triangle[0].length];
        int answer = Integer.MIN_VALUE;
        
        for(int i = 1; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                if(j == 0){
                    triangle[i][j] += triangle[i-1][j];
                }
                else if(j == triangle[i].length - 1){
                    triangle[i][j] = triangle[i-1][j-1];
                }
                else{
                    triangle[i][j] += Math.max(triangle[i-1][j],triangle[i-1][j-1]);
                }
                answer = Math.max(answer, triangle[i][j]);
            }
        }
        return answer;
    }
}
