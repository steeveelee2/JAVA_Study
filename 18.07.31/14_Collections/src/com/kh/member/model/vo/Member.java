package com.kh.member.model.vo;

public class Member {
	// 회원 관리 프로그램에서 사용할 객체 틀
	// 1. 필드 | 멤버 | 전역변수(global)
	// (-;private < ~;default < #;protected < +;public)
	
	private String name;     // 이름
	private String id;       // 아이디
	private String password; // 비밀번호
	private String email;    // 이메일
	private String phone;    // 연락처
	private char gender;     // 성별
	private int age;         // 나이
	
	// 2. 생성자
	// 기본 생성자 : 선언하지 않으면 JVM이 컴파일 시에  
	//            자동으로 만들어 주지만,
	//            이후 상속을 통해서 자식으로 생성을 하거나
	//            부모 객체로써 생성할 때에는 자동으로 
	//            만들어 주지 않기 때문에 반드시 선언함을
	//            원칙으로 합시다!
	public Member(){ }
	
	// 생성자
	public Member(String name, String id, 
			String password, String email,
			String phone, char gender,
			int age){
		// 모든 필드를 초기화하는 생성자
		
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.age = age;
	}
	
	// Getter, Setter
	
	// ----- Getter ----- //
	public String getName(){
		return this.name;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public String getPhone(){
		return this.phone;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public char getGender(){
		return this.gender;
	}
	
	public int getAge(){
		return this.age;
	}
	
	// ----- Setter ----- //
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	// 회원 정보 출력용 기능 메소드
	public String memberInfo(){
		return name + ", " + id 
				+ ", " + password 
				+ ", " + email
				+ ", " + phone
				+ ", " + gender
				+ ", " + age+"세";
	}
	@Override
	public String toString(){
		return name+"\t"+id+"\t"+password+"\t"+email+"\t"+phone+"\t"+gender+"\t"+age;
	}
	
	
}











