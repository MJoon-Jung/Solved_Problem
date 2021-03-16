package programmers_problem;

public class code1 {

	public static void main(String[] args) {
//		
//		문제 설명
//		문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 
//		홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
//
//		제한 사항
//		문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
//		첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
		System.out.println(solution2("try hello worldsadf sdfs asdfas dafsfs"));

	}
	 public static String solution(String s) {
	        String [] ar = s.split(" ");
	        int count = 1;
	        for(int i = 0; i < ar.length; i++) {
	        	String temp = "";
		        char temp2;
	        	for(int j = 0; j < ar[i].length(); j++) {
	        		if(count % 2 == 1) {
	        			temp2= Character.toUpperCase(ar[i].charAt(j));
	        			temp += temp2;
	        			count++;
	        		}
	        		else {
	        			temp += ar[i].charAt(j);
	        			count++;
	        		}
	        	}
	        	ar[i] = temp;
	        	count++;
	        }
	        String answer ="";
	        for(int i = 0; i < ar.length-1; i++) {
	        	answer += ar[i];
	        	answer += " ";
	        }
	        answer += ar[ar.length-1];
	        return answer;
	        
	    }
	 public static String solution2(String s) {
		 String [] ar = s.split("");
		 int count = 1;
		 String answer = "";
		 for(int i = 0; i < ar.length; i++) {
			 if(!ar[i].equals(" ")) {
				 if(count % 2 == 1) {
					 answer += ar[i].toUpperCase();
					 count++;
				 }
				 else {
					 answer += ar[i];
					 count++;
				 }	 
			 }
			 else {
				 count = 1;
				 answer += " ";
			 }
		 }
		 return answer;
	 }
}
