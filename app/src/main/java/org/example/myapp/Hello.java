package org.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 무조건 객체를 생성. 생성하게 되면, 클래스와 똑같은 메소드를 호출한다.
@RequestMapping(path = "/hello")
public class Hello {

  public Hello() {
    System.out.println("Hello의 생성자가 호출됨!");
  }

  @GetMapping(path = "/hi") // URL 맵핑
  public String hi() { // 요청을 처리하는 메서드 => request handler (요청이 들어왔을 때 이게 호출됨)
    return "Hello!";
  }

  @GetMapping("/hi2") // URL 경로에서 name 값을 받음
  public String hi2(String name) {
    return "안녕하세요, " + name + "님!"; // 입력받은 이름을 포함한 메시지 리턴
  }

  @GetMapping(path = "/hi3") // URL 맵핑
  public String hi3() { // 요청을 처리하는 메서드 => request handler (요청이 들어왔을 때 이게 호출됨)
    return "Hello3!";
  }

  @GetMapping(path = "/hi4") // URL 맵핑
  public String hi4() { // 요청을 처리하는 메서드 => request handler (요청이 들어왔을 때 이게 호출됨)
    return "Hello4!";
  }

  @GetMapping(path = "/hi5") // URL 맵핑
  public String hi5() { // 요청을 처리하는 메서드 => request handler (요청이 들어왔을 때 이게 호출됨)
    return "Hello5!";
  }

  @GetMapping(path = "/hi6") // URL 맵핑
  public String hi6() { // 요청을 처리하는 메서드 => request handler (요청이 들어왔을 때 이게 호출됨)
    return "Hello6!";
  }

  @GetMapping(path = "/hi7") // URL 맵핑
  public String hi7() { // 요청을 처리하는 메서드 => request handler (요청이 들어왔을 때 이게 호출됨)
    return "Hello7!";
  }

  @GetMapping(path = "/hi8") // URL 맵핑
  public String hi8() { // 요청을 처리하는 메서드 => request handler (요청이 들어왔을 때 이게 호출됨)
    return "Hello8!";
  }
}
