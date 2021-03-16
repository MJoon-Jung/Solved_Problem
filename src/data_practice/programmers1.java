package data_practice;

public class programmers1 {

	public static void main(String[] args) {
//		배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
//		예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//
//		array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//		1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//		2에서 나온 배열의 3번째 숫자는 5입니다.
//		배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
//		commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
		int [] array = {1,5,2,6,3,7,4};
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int [] answer = new int [commands.length];
		int i = 0;
		int j = 0;
		int k = 0;
		for(int x = 0; x < commands.length; x++){
            i = commands[x][0];
            j = commands[x][1];
            k = commands[x][2];
            answer[x] = renum(sort(i,j,array),k);
        }
		for(int z = 0; z < answer.length; z++) {
			System.out.println(answer[z]);
		}
    }
	static int [] sort (int i, int j, int [] array){
        int [] cr = new int [j-i+1];
		int n = 0;
        for(int x = i-1; x < j; x++) {
			int temp  = array[x];
			if(n==0) {
				cr[n] = temp;
				n++;
				continue;
			}
			int z = n;
			while(z > 0 && cr[z-1] > temp) {
				cr[z] = cr[z-1];
				z--;
			}
			cr[z] = temp;
			n++;
        }
        return cr;
    }
	static int renum(int [] cr,int k) {
        return cr[k-1];
    }
}

