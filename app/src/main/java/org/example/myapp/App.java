package org.example.myapp;

import java.util.Scanner;

/**
 * 이 클래스는 한밭대학교 특강 실습 예제를 위한 첫 번째 클래스입니다.<br>
 * <code>App</code> 클래스!
 */
public class App {
  /**
   * 이 메서드는 entry point(진입점) 메서드이다. 콘솔에 "Hello!" 메시지를 출력합니다.
   *
   * @param args 명령행 인수 배열 (이 프로그램에서는 사용되지 않음)
   */
  public static void main(String[] args) {
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

    Scanner scanner = new Scanner(System.in); // console 입력 장치(엔진) System.in ->변수 scanner가 읽어들일 데이터
    System.out.print("이름? "); // console 기본 출력 장치 sout
    String name = scanner.nextLine(); // non static
    System.out.printf("안녕하세요 %s 님!\n", name);
    scanner.close();
  }
}
