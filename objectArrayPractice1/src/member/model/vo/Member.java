package member.model.vo;

public class Member {
	// 회원 정보 클래스 (변수는 여기서 캡슐화해 전부 처리)
	
	// 필드 구성
	private String id; // 아이디
	private String name; // 이름
	private String password; // 패스워드
	private String email; // 이메일주소
	private char gender; // 성별
	private int age; // 나이
	
	// 기본 생성자
	public Member() {}
	
	// 매개변수 있는 생성자
	public Member(String id,String name,String password,String email,char gender,int age) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.email=email;
		this.gender=gender;
		this.age=age;
	}
	
	// setter 만들기(암호, 이메일, 나이만)
	public void setPassword(String password) {
		this.password=password;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	// getter 만들기(암호 제외(
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	
	// 필드값 확인용 메소드 (문자열 함친 결과를 리턴)
	public String memberInfo() {
		return "아이디 : "+id+" 이름 : "+name+" 비밀번호 : "+password+" 이메일 :  "+email+" 성별 :  "+gender+" 나이 :  "+age;
	}
}
