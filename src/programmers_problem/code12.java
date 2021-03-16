package programmers_problem;
import java.util.Arrays;

public class code12 {

	public static void main(String[] args) {

//		H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 
//		위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
//
//		어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 
//		h의 최댓값이 이 과학자의 H-Index입니다.
//
//		어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를
//		return 하도록 solution 함수를 작성해주세요.
//
//		제한사항
//		과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
//		논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
//		citations	return
//				[3, 0, 6, 1, 5]	3
//				입출력 예 설명
//				이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다.
//		그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.
		int [] citations = {3,0,6,1,5};
		int [] citations1 = {12,11,10,9,8,1};
		int [] citations2 = {6, 6, 6, 6, 6, 1};
		int [] citations3 = {4, 4, 4};
		int [] citations4 = {4, 4, 4, 5, 0, 1, 2, 3};
		int [] citations5 = {10, 11, 12, 13};
		int [] citations6 = {3, 0, 6, 1, 5};
		int [] citations7 = {0, 0, 1, 1};
		int [] citations8 = {0, 1};
		int [] citations9 = {10, 9, 4, 1, 1};
//		[12, 11, 10, 9, 8, 1] 5
//		[6, 6, 6, 6, 6, 1] 5
//		[4, 4, 4] 3 예외 citations3
//		[4, 4, 4, 5, 0, 1, 2, 3] 4
//		[10, 11, 12, 13] 4  예외 citations5
//		[3, 0, 6, 1, 5] 3
//		[0, 0, 1, 1] 1
//		[0, 1] 1
//		[10, 9, 4, 1, 1] 3
//		Arrays.sort(citations);
//		System.out.println(citations[5]);
		System.out.println(solution(citations3));
		
	}
	static int ar_min(int [] citations) {
        int min = citations[0];
        for(int i = 0; i < citations.length; i++) {
            if(min > citations[i]) {
                min = citations[i];             
            }
        }
        return min;
    }
    static int solution(int[] citations) {
	    int answer = -1;
	    int MIN = ar_min(citations);
	    int k = citations.length;
	    if(k == 1){
	        answer = citations[0];
	        return answer;
	    }
	    else if(MIN>= k){
	        return k;
	    }
	    else{
	        Arrays.sort(citations);
	        for(int i = k-1; i >= 0; i--) {
	            int count = 0;
	            for(int j = k-1; j >= 0; j--) {
	                if(i<=citations[j]) {
	                    count++;
	                    if(i <= count) {
	                        answer = i;
	                        break;
	                    }
	                }
	            }
	            if(answer != -1) {
	                break;
	            }   
	        }
	        return answer;
	    }
    }
}

