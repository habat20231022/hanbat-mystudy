package org.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
// 스프링 부트를 실행할 수 있도록 기본 정보를 자동으로 설정하는 에노테이션
@EnableAutoConfiguration // 톰캣 서버(스프링부트 논스탑 실행) 실행에 관련된 기초 설정을 자동으로 처리

// 현재 클래스와 같은 패키지 및 하위 패키지를 다 뒤져서 컴포넌트를 찾아 자동 생성하라는 설정!
@ComponentScan
// => @Component, @RestController, @Controller, @Service, @Repository 등이 붙은 클래스를 찾는다.
*/
@SpringBootApplication // = @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
public class App {
  public static void main(String[] args) {

    SpringApplication.run(App.class, args);
    System.out.println("스프링부트 서버 시작!");
    //    String result = String.join(",", "aaa", "bbb", "ccc"); // 첫번째는 반드시 String, 그다음부터 0개 이상의
    // 문자열
    //    System.out.println(result);
    //
    //    int r = Math.abs(-100); // 앞에 꼭 속한 static을 써주고 뒤에 추가적으로 요구하는 아규먼트를 넣어줘야 함.
    //    System.out.println(r);
    //    // 여기까진 static
    //
    //    // 얘는 non
    //    String str = "abcdefghijklmn";
    //    str.substring(2, 4); // 필수 데이터에서 부가적인 작업을 하는 것. 데이터가 필요한 메소드 -> nonstatic
    //
    //    // join과 substring 둘다 String 클래스에 있지만, join은 값 필요없이 걍 받아서 쓰면 되지만, substring은 주어진 데이터가 있어야
    // 한다.
    //
    //    int[] arr1 = new int[] {100, 200, 300, 400, 500};
    //    int[] arr2 = Arrays.copyOf(arr1, 2);
    //    // copyof() 는 static임. 모든 작업하는데 필요한 데이터를 파라미터로 받는거임. class만 있음
    //    for (int v : arr2) {
    //      System.out.print(v + ", ");
    //    }
    //    System.out.println();
    //
    //    ArrayList list1 = null; // ArrayList 객체-> ArrayList 작업하는데 필요한 변수 준비
    //    list1.add(100); // add는 배열 주소를 알아야 작업을 할 수 있다. 이게 바로 non static!

    //    class Calculater {
    //      int result;
    //
    //      void plus(int a) {
    //        this.result += a;
    //      }
    //
    //      void minus(int a) {
    //        this.result -= a;
    //      }
    //    }
    //
    //    Calculater c1 = new Calculater(); // 이때 c1은 main 메소드의 로컬 변수이다.
    //    Calculater c2 = new Calculater();
    //
    //    c1.plus(100);
    //    c2.plus(555);

    //    Scanner scanner = new Scanner(System.in); // console 입력 장치(엔진) System.in ->변수 scanner가읽어들일
    // 데이터
    //    System.out.print("이름? "); // console 기본 출력 장치 sout
    //    String name = scanner.nextLine(); // non static
    //    System.out.printf("안녕하세요 %s 님!\n", name);
    //    scanner.close();
  }
}
