# 코틀린 실행방법

### 버전확인

* kotlinc-jvm -version

### 코틀린 스크립트로 실행

* kotlinc-jvm -script test.kts

# 챕터2. Java 개발자를 위한 코틀린 필수 사항

* 더적은 타이핑
    * 세미콜론 생략가능
    * 변수타입을 지정 생략 가능
    * 클래스와 함수는 생략 가능
    * try ~ catch는 선택사항
* 현명한 경고
* val 보드는 val
    * val는 상수값을 정의하기위한 명령어이다.(java로 치면 final)
* 향상된 동일성 체크
* 문자열 템플릿
* Raw 문자열
    * 이스케이프 사용 X
    * 멀티라인 문자열
* 표현식은 많이, 명령문은 적게

## 챕터2. 정리

* 프로그래밍 작업에서 사용되는 관용적인 코드를 없애고, java보다 더 적은 코드로 작업 가능
* 오류로부터 경고를 해준다.
* 변수의 이뮤터빌리티와 뮤터빌리티를 미리 선택하기 때문에 프로그램의 안정성이 올라간다.
* 비교를 할때 null 오류가 발생되지 않는다.