package Algorithm;

public class programmer2016 {

	public static void main(String[] args) {
//		문제 설명
//		2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 
//				2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
//				요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//
//		입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
//
//		제한 조건
//		2016년은 윤년입니다.
//		2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

		int a = 5;
		int b = 24;
		System.out.println(Solution(a,b));
		
		
	}
	static String Solution(int a, int b) {
		String answer ="";
		int day_num = days(a,b);
		switch (day_num%7) {
			case 0:{
				answer = "FRI";
				break;
			}
			case 1:{
				answer = "SAT";
				break;
			}
			case 2:{
				answer = "SUN";
				break;
			}
			case 3:{
				answer = "MON";
				break;
			}
			case 4:{
				answer = "TUE";
				break;
			}
			case 5:{
				answer = "WED";
				break;
			}
			case 6:{
				answer = "THU";
				break;
			}
		}
		
		
		return answer;
	}
	static int days(int a,int b) {
		int day = 0;
		switch (a) {
			case 2:{
				day += 31;
				break;
			}
			case 3:{
				day += 60;
				break;
			}
			case 4:{
				day += 91;
				break;
			}
			case 5:{
				day += 121;
				break;
			}
			case 6:{
				day += 152;
				break;
			}
			case 7:{
				day += 182;
				break;
			}
			case 8:{
				day += 213;
				break;
			}
			case 9:{
				day += 244;
				break;
			}
			case 10:{
				day += 274;
				break;
			}
			case 11:{
				day += 305;
				break;
			}
			case 12:{
				day += 335;
				break;
			}	
		}
		day += b;
		return day-1;
	}

}
