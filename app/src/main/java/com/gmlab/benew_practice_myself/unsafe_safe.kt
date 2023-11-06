package com.gmlab.benew_practice_myself

/*
unsafe 캐스트

as 키워드가 사용된다. infix 연산자와 as에 의해 실행된다.

?가 있는 nullable 타입은 as 연산자를 사용하면 non-null 예외 오류가 발생한다.

any 타입의 변수는 as String으로 선언하면. 정수는 String이 될 수 없다 를 의미한다. -> 자료형 변환 사용하여야함.

Any타입의 nullable 변수가 "String" 으로 선언이되면 as  String? 으로한다면 실행하고 unsafe cast라고 출력된다.

* */

/*
* safe 캐스트
* as? 연산자가 사용된다.
*  좀 더 쉽게 사용가능.
* */