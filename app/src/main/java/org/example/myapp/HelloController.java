package org.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 이거 붙이면 프론트 컨트롤러가 이 클래스는 클라이언트 요청을 처리하는 메소드를 갖고있는 클래스라 인식함. 객체 생성 및 여길 페이지 컨트롤러라 인식함.
public class HelloController {

  @GetMapping("/hello") // HTTP GET 요청을 처리하는 메서드 지정 기본은 /root임?
  public String hello() { // 클라이언트에게 보낼 것이 메시지면 String
    return "hello, world"; // 클라이언트에게 리턴할 콘텐트
  }

  @GetMapping("/hello2") // URL 경로에서 name 값을 받음
  public String helloWithName(String name) {
    return "안녕하세요, " + name + "님!"; // 입력받은 이름을 포함한 메시지 리턴
  }
}
