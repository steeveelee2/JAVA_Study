package com.kh.array;

public class ArrayTest {
	// 기능 제공 메소드를 담은 클래스
	
	public void testArray1(){
		// 배열 사용하기
		
		// 변수만 사용한다면 . . .
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		// . . . 50개라면 . . . .
		
		// 5개의 변수의 합 구하기
		int sum = 0;
		
		// 변수의 이름 자체가 다르기 때문에
		// 반복문 조차도 사용할 수 없다.
		// 일일히 값을 더해 줘야 한다.
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		// 50 개 해야 한다...
		
		// 위의 코드를 
		// 배열을 통해 풀어 본다면...
		
		// 배열
		int[] arr = new int[5];
		// int arr[] = new int[5];
		
		// 각 배열의 방에 선언한 자료형과 
		// 일치하는 값(리터럴)을 저장한다.
		// 단, 시작은 0 부터
		/*
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;
		*/
		
		// 배열을 사용할 경우 값을 대입할 때에도
		// 반복문을 활용할 수 있다.
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = (i + 1) * 10;
		}
		
		// 배열을 이용한 합계 구하기
		
		int sum2 = 0;
		
		/*
			sum += arr[0];
			sum += arr[1];
			sum += arr[2];
			sum += arr[3];
			sum += arr[4];
		*/
		
		// 값을 연속적으로 계산할 때에도
		// 배열을 사용하면 반복문을
		// 수행할 수 있다.
		
		for(int i = 0; i < arr.length ; i++){
			sum2 += arr[i];
		}
		
		System.out.println("sum2 확인 : "+ sum2);
	}
	
	public void testArray2(){
		// 배열 사용 방법
		// 선언 방식
		// 자료형[] 변수명;
		// 자료형 변수명[];

		// 배열을 선언하면 Heap 메모리에
		// 배열의 크기만큼 공간을 할당하고
		// 가장 앞에 있는 공간의 주소값을
		// 가져와 Stack 메모리에 저장하여
		// 사용한다.
		
		// 생성 및 초기화 방식
		// 1. 공간만 할당하는 경우
		int[] iarr = new int[10];
		
		// 2. 배열의 값으로 초기화하며 할당하는 경우
		int[] iarr2 = new int[]{1, 2, 3, 4, 5};
		
		// 3. 배열 값으로 할당 시 앞의 'new 자료형[]'
		// 부분을 생략하는 경우
		int[] iarr3 = {1, 2, 3, 4, 5};
		
		// ** 배열 선언 시에
		// 배열의 크기와 초기값을 같이 선언할 수는 없다.
		// int[] iarr4 = new int[10]{1, 2, 3, 4, 5};
		
		// 참조 자료형
		// String, 배열 등과 같이
		// Heap 메모리에 저장되는 변수들은
		// 별도의 주소값을 가지고 있다.
		// 그래서 new 로 생성되는 변수들은 별도의
		// 주소값을 통해서 간접적으로 접근한다. 
		// 따라서 변수 자체는 주소값을 가지고 있고,
		// 사용 시 해당 주소값을 통해 본래의 값에 접근한다
		// 라는 의미로 참조 자료형(레퍼런스 변수)이라고 말한다.
		
		int[] arrTest1 = new int[10];
		char[] arrTest2 = new char[10];
		
		// heap 메모리는 우리가 직접 접근을 할 수 없는데,
		// 고유의 값이라는 걸 간접적으로나마 확인할 수는 있다.
		
		System.out.println("arrTest1 : " + arrTest1);
		System.out.println("arrTest2 : " + arrTest2);
		
		// 위의 방식 외에도 고유의 값이라는 걸 확인할 수 있는
		// 메소드가 있는데 hashcode() 메소드가 바로 그 메소드다.
		// java에서는 직접적으로 하드웨어(메모리영역)에 접근할 수
		// 없기 때문에 정확한 메모리 저장 위치는 알 수 없다.
		// 각 객체(참조형 변수)가 고유의 값이라는 걸 해시 알고리즘을
		// 통해 산출한 숫자 데이터로 증명은 할 수 있다.
		
		System.out.println("arrTest1.hashcode() : "
						+ arrTest1.hashCode());
		System.out.println("arrTest2.hashcode() : "
						+ arrTest2.hashCode());
		
	}
	
	public void testArrayCopy(){
		// 얕은 복사와 깊은 복사
		// (ShallowCopy & DeepCopy)
		// 얕은 복사는 배열의 주소값만을 복사하는 방법으로
		// 마치 바로가기 아이콘 처럼
		// 실제 원본이 변했을 경우 원본의 변경된 내용
		// 그대로 복사한 배열도 참조가 일어난다.
		
		// 깊은 복사는 배열 안의 실제 값 자체를 복사하기 때문에
		// 원본의 배열이 변경되도 복사한 배열은 영향을 받지 않는다.
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr;
		
		// 안에 있는 값을 출력할 때에도
		// 반복문을 사용하면 편리하다.
		// 원본 배열 출력
		System.out.print("원본 배열 : ");

		for(int i=0;i<originArr.length; i++){
			System.out.print(originArr[i]+" ");
		}
		
		System.out.println("\n------------");
		
		// 사본 배열 출력
		System.out.print("사본 배열 : ");
		
		for(int i = 0 ; i < copyArr.length ; i ++){
			System.out.print(copyArr[i] + " ");
		}
		
		System.out.println("\n================");
		
		// 원본 배열의 0번째 값을 99로 변경한 뒤
		// 다시 원본 배열과 사본 배열을 비교
		
		originArr[0] = 99;
		
		System.out.print("원본 배열 변경 후 : ");
		
		for(int i = 0 ; i < originArr.length; i++){
			System.out.print(originArr[i] + " ");
		}
		
		System.out.println("\n-------------");
		
		System.out.print("사본 배열 : ");
		
		for(int i = 0; i < copyArr.length ; i++){
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		
		// 해시코드 비교
		
		System.out.println("원본 배열 해시코드 : "
							+originArr.hashCode());
		System.out.println("사본 배열 해시코드 : "
							+copyArr.hashCode());
		
	}
	
	public void testArrayCopy2(){
		// 깊은 복사 테스트 1
		// for문을 활용한 1:1 깊은 복사 구현하기
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[originArr.length];
		
		// 복사하기 전 값 비교
		// 원본 배열 출력
		String str = "";
		for(int i = 0 ; i<originArr.length ; i++){
			if(i == originArr.length -1 ){
				str += originArr[i];
			} else {
				str += originArr[i] + " ";
			}
		}
		
		System.out.println("원본 배열 : "+ str);
		
		
		// 사본 배열 출력
		str = "";
		for(int i = 0 ; i<copyArr.length ; i++){
			if(i == copyArr.length -1 ){
				str += copyArr[i];
			} else {
				str += copyArr[i] + " ";
			}
		}
		
		System.out.println("사본 배열 : "+ str);

		// 원본 배열의 내용을 사본 배열로 복사하기
		// for문을 활용한 1:1 복사 방법
		
		for(int i = 0; i < originArr.length ; i++){
			copyArr[i] = originArr[i];
			//   0    <---    1
			//   0    <---    2
		}
		
		System.out.println("-----------------");
		
		// 복사한 이후 두 배열의 값 확인
		
		// 원본 배열 출력
		str = "";
		for(int i = 0 ; i<originArr.length ; i++){
			if(i == originArr.length -1 ){
				str += originArr[i];
			} else {
				str += originArr[i] + " ";
			}
		}
		
		System.out.println("원본 배열 : "+ str);
		
		
		// 사본 배열 출력
		str = "";
		for(int i = 0 ; i<copyArr.length ; i++){
			if(i == copyArr.length -1 ){
				str += copyArr[i];
			} else {
				str += copyArr[i] + " ";
			}
		}
		
		System.out.println("사본 배열 : "+ str);

		// 원본 배열의 값 한 개 바꾸기
		originArr[0] = 99;
		
		// 원본 배열 출력
		str = "";
		for(int i = 0 ; i<originArr.length ; i++){
			if(i == originArr.length -1 ){
				str += originArr[i];
			} else {
				str += originArr[i] + " ";
			}
		}
		
		System.out.println("원본 배열 : "+ str);
		
		
		// 사본 배열 출력
		str = "";
		for(int i = 0 ; i<copyArr.length ; i++){
			if(i == copyArr.length -1 ){
				str += copyArr[i];
			} else {
				str += copyArr[i] + " ";
			}
		}
		
		System.out.println("사본 배열 : "+ str);
		
		// 두 배열 간 해시 코드 비교
		System.out.println("원본 배열 해시 코드 : "
						  + originArr.hashCode());
		System.out.println("사본 배열 해시 코드 :"
						  + copyArr.hashCode());

	}
	
	public void testArrayCopy3(){
		// 깊은 복사 방법 2번째
		// System.arraycopy() 메소드 사용하기
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		// System.arraycopy(원본배열,원본 배열의 시작점,
		// 					사본배열,사본 배열의 시작점,
		//					복사할 개수)
		// 복사할 인덱스(배열의 순번)를 선택할 수 있다.
		System.arraycopy(
		  originArr, 0, copyArr, 3, originArr.length);
		
		// 복사한 정보 확인
		// 원본 배열 출력
		String str = "";
		for(int i = 0 ; i<originArr.length ; i++){
			if(i == originArr.length -1 ){
				str += originArr[i];
			} else {
				str += originArr[i] + " ";
			}
		}
		
		System.out.println("원본 배열 : "+ str);
		
		// 사본 배열 출력
		str = "";
		for(int i = 0 ; i<copyArr.length ; i++){
			if(i == copyArr.length -1 ){
				str += copyArr[i];
			} else {
				str += copyArr[i] + " ";
			}
		}
		
		System.out.println("사본 배열 : "+ str);

	}
	
	public void testArrayCopy4(){
		// 깊은 복사 3번째 방법
		// clone() 메소드를 활용하는 방법
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("사본 배열 해시코드 : "
		                    +copyArr.hashCode());
		
		// clone() 메소드를 사용하면
		// 이전에 어떤 배열로 선언되었던지 간에
		// 원본 배열을 복제한 새로운 배열로 다시 만들어 준다.
		// 따라서 copyArr 는 이전의 int[10] 배열 주소값이
		// 아니라 새로운 배열 int[5]의 주소값을 참조하게 된다.
		copyArr = originArr.clone();
		
		System.out.println("복제한 사본 배열 해시코드 : "
							+copyArr.hashCode());
		
		System.out.println("원본 배열 해시코드 : "
							+originArr.hashCode());
	}
	
	// 자료형 기본값 테스트 용 변수 선언
	boolean booleanChk;
	byte byteChk;
	short shortChk;
	char charChk;
	int intChk;
	long longChk;
	float floatChk;
	double doubleChk;
	
	String stringChk;
	
	public void testArray5(){
		// 각 기본 자료형 및 참조 자료형 변수는
		// 실제 값이 Heap 메모리에 저장되기 때문에
		// 처음 시작 시에 초기값을 정해주지 않으면
		// JVM이 명시하는 초기값을 가지게 된다.
		
		System.out.println("boolean 기본값 : "+ booleanChk);
		System.out.println("byte 기본값 : " + byteChk);
		System.out.println("short 기본값 : " + shortChk);
		System.out.println("char 기본값 : " + charChk);
		System.out.println("int 기본값 : " + intChk);
		System.out.println("long 기본값 : " + longChk);
		System.out.println("float 기본값 : " + floatChk);
		System.out.println("double 기본값 : " + doubleChk);
		System.out.println("String 기본값 : " + stringChk);
		
	}
	
	public void testArray6(){
		// 배열은 기본적으로 특정 길이를 할당하였을 때,
		// 즉, new int[10] 같이 공간을 한정지어서
		// 할당한 경우에 크기를 다시 수정할 수 없다.
		
		// 따라서 처음 지정한 길이 이상, 이하로 사용할 수
		// 없는 고정된 길이만을 가진다.
		
		int[] arr1 = new int[5];
		
		// 지정한 만큼 배열의 값을 저장하면 문제가 없다.
		for(int i = 0; i < arr1.length ; i++){
			arr1[i] = (i+1);
		}
		
		// 하지만, 지정한 값을 초과할 경우 에러가 발생한다.
		// arr1[5] = 10;
		
		// 또한, 인덱스값이 음수로 들어올 경우 에러가 발생한다.
		// arr1[-1] = 10;
		
	}
}
















