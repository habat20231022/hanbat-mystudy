package org.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // request handler의 리턴 값은 Thymeleaf가 실행할 View(HTML 탬플릿 파일) 이름이다.
public class HelpController {

  @GetMapping("/help") // 여기서 path= (이건 value=과 같음) 는 생략 가능함. 자바 에노테이션 문법임.
  public String help() {
    return "help"; // View 이름을 리턴 한다. 리턴 값은 클라이언트에게 보낼 콘텐트가 아닌다. Thymeleaf 엔진에게 알려줄 템플릿 파일 이름이다.
  }
}
