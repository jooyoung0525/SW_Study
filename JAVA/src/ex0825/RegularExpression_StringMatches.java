package ex0825;

public class RegularExpression_StringMatches {
	public static void main(String[] args) {
		String regex,s;
		
		//1~3자리 숫자
		regex = "\\d{1,3}";
		s = "100";
		
		/*
		if(Pattern.matches(regex, s)){
			System.out.println(s+" : 1~3이내의 숫자");
		}else {
			System.out.println(s+" : 1~3이내의 숫자가 아닙니다.");
		}
		*/
		
		/*
		if(s.matches(regex)){
			System.out.println(s+" : 1~3이내의 숫자");
		}else {
			System.out.println(s+" : 1~3이내의 숫자가 아닙니다.");
		}
		*/
		
		
		/*
		//전화번호
		//regex = "(^010|^017|^016)-(\\d{4}|\\d{3})-\\d{4}$"; //^ :시작, \\d{4}: 숫자 네자리, $ :마지막
		
		regex = "^01(?:0|1|[6-9])-\\d{3,4}-\\d{4}$"; //^01(?:0|1|[6-9]) :01로시작+그다음이 0또는1또는 6~9 
		                                             //\\d{3,4} : 숫자인데 3-4자리
													 //한자리 이상 :\\d+
		s="017-1234-6566";
		
		if(s.matches(regex)) {
			System.out.println(s+" : 정상적인 전화번호");
		} else {
			System.out.println(s+ " : 잘못된 전화번호");
		}
		*/
		
		
		/*
		regex ="^[가-힣]+$"; //유니코드 : \uac00-\ud7a3 , +:한자리이상
		s="자바ㅁ";
		if(s.matches(regex))System.out.println(s+" : 정상");
		else System.out.println(s+" : 잘못");
		*/
		
		
		/*
		//이미지파일검사
		regex ="[^\\s]+(\\.(?i)(jpg|png|gif|bmp))$"; 
		s="a.gif1";
		if(s.matches(regex))System.out.println(s+" : 정상");
		else System.out.println(s+" : 잘못");
		*/
		
		
		
		//영문자와 숫자 또는 특수문자를 포함한 5~10자이내
		regex="^(?=.*[a-zA-Z])(?=.*[~!@#$%^&*()]|.*[0-9]).{5,10}$"; //^$:시작과 끝, .뭐든지 상관없음 , * 0개이상
		                                                            //a{5,10} --> a가 최소 5개 최대10
		s="abc2def";
		if(s.matches(regex))System.out.println(s+" : 정상");
		else System.out.println(s+" : 잘못");
	}
}
