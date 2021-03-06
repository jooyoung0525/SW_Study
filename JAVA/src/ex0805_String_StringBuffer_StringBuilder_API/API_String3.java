package ex0805_String_StringBuffer_StringBuilder_API;

public class API_String3 {
	public static void main(String[] args) {
		
		
			String s = "seoul korea"; 
			String s1;
			
			System.out.println("s:"+s);
			
			int a = s.length();
			System.out.println("문자열 길이 : "+a);
		
			
			
			
			//<<substring>>
			s1 = s.substring(6,9); //s.substring(a,b) : a번째 인덱스에서 b-1까지의 문자열을 추출
								   //인덱스는 무조건 0부터 시작
			System.out.println(s1); //kor
			
			s1 = s.substring(6,6);
			System.out.println(s1); //아무것도출력안함
			
			s1 = s.substring(6); // korea : 6번째 인덱스부터 끝까지
			System.out.println(s1);
			
			//s1 = s.substring(6,5); //런타임 오류
			
			
			
			
			
			//<<charAt()>>
			char c = s.charAt(6); // k: 6번째 인덱스에 있는 한 문자를 출력
			System.out.println(c);

			
			
			
			//<<equals()>>
			boolean b;
			b = s.equals("seoul korea"); //값비교
			System.out.println(b);       //true
			
			b = s.equals("Seoul Korea"); 
			System.out.println(b);       //false
			
			
			
			
			//<<equalsIgnoreCase>>
			//대소문자 구분 안함
			b = s.equalsIgnoreCase("Seoul KOREA"); 
			System.out.println(b);      //true
			
			System.out.println(s.equals("seoul")); //false
			
			
			
			
			//<<startsWith(), endsWith()>>
			System.out.println(s.startsWith("seoul")); //true --> 앞에 문자열만 비교
			System.out.println(s.endsWith("korea")); //true --> 뒤에 문자열만 비교
			
			
			
			
			//<<compareTo()>>
			// "seoul korea" >> "seoul ccatstststs"(사전식 배열)
			// System.out.println( s> "seoul ccatstststs"); 컴파일 오류
			// 문자열의 비교
			System.out.println(s.compareTo("seoul ccatstststs")); // 8 --> k(107)- c(99)
			                                                      // 사전식으로 
			
			
			//<<indexOf()>>
			//kor의 위치(인덱스)?
			System.out.println(s.indexOf("kor"));//6
			System.out.println(s.indexOf("abc"));//-1 : 찾는 문자열이 없으면
			
			System.out.println(s.indexOf("o")); //2 찾는 문자가 많으면 처음값 리턴
			System.out.println(s.indexOf("o",5)); //5번째 인덱스 부터 "o"있는지 검사 --> 7
			
			System.out.println(s.lastIndexOf("o")); //뒤에서 부터 "o"찾아서 해당인덱스 리턴
			
			
			
			
			
			//<<replace()>>
			//replace : 정규식(패턴) 사용불가
			s = "우리나라 대한민국 대한 대한 하하";
			s1 = s.replace("대한", "大韓");
			System.out.println(s1); //우리나라 大韓민국 大韓 大韓 하하
			
			
			
			//<<replaceAll()>>
			//replaceAll : 정규식 사용
			s1 = s.replaceAll("대한", "大韓"); 
			System.out.println(s1); //우리나라 大韓민국 大韓 大韓 하하
			
	
			//공백이랑 숫자없애기
			s = "대한 123 민국 하하 5678 호호";    
			s1 = s.replaceAll("\\d|\\s", ""); // 정규식에서 숫자:\\d, 또는:|, 엔터와 탭을 포함한 공백:\\s
			System.out.println(s1); //대한민국하하호호
			
			
			//한글만 없애기
			s = "대한 123 민국 하하 5678 호호";     
			s1 = s.replaceAll("[가-힣]", ""); // 대괄호하고 가~힣까지
			System.out.println(s1); // 123   5678 
			
			
			
			
			//<<trim()>>
			//trim():가장왼쪽과 가장오른쪽의 공백제거
			s = "    사  랑  ";
			System.out.println(":"+s+":");
			System.out.println(":"+s.trim()+":");
			System.out.println(":"+s.replaceAll("\\s","")+":");
			
			
			
			
			//<<format()>>
			//3자리마다 , 하고 string으로 변경
			a=123456;
			s = String.format("%,d", a); //printf와 사용방법 동일
			System.out.println(s);
			
			
			
			//<<split()>>
			//split
			String tel = "010-1111-2222";
			String[] ss = tel.split("-"); //split은 배열로 반환
			for(String x:ss)
				System.out.print(x+" ");
			System.out.println();
			
			
			
			//<<getBytes()>>
			//getBytes
			s = "KOREA";
			byte[] bb = s.getBytes(); //해당되는 문자의 아스키값을 배열로 반환
			for(int x : bb)
				System.out.print(x+" ");
			System.out.println();
	}
}
