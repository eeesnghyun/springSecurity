# Spring Boot + Security 예제
✔️ **프로젝트 구조**
- - -
```
.
└── src/
    └── main/
        └── java/
            ├── springSecurity/
            │   ├── component
            │   ├── config
            │   ├── user
            │   ├── HomeController.java
            │   └── SpringSecurityApplication.java
            └── resources/
                ├── static
                ├── templates
                └── application.properties        
```
* src/main/java/springSecurity/component : Security 관련 인터페이스 구현체 관리
* src/main/java/springSecurity/config : Config 클래스 관리
* src/main/java/springSecurity/user : 회원 관리
* src/main/java/springSecurity/HomeController.java : 화면 컨트롤러
* src/main/java/springSecurity/SpringSecurityApplication.java : Spring Boot 시작 클래스
* src/main/java/resources/static : 정적 자원 파일 관리
* src/main/java/resources/templates : 뷰 템플릿 파일 관리(Thymeleaf)
* src/main/java/resources/application.properties : DB 접속 정보, 로그 레벨 관리
