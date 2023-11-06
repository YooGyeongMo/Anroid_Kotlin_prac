package com.gmlab.benew_practice_myself


import java.lang.NumberFormatException
import kotlin.ArithmeticException

/*
* 예외란 ?
* 프로그램의 런타임문제고 프로그램의 종료를 유발한다.
* 피해야하기위해서 핸들링한다.
* 저장공간부족, Out of bound 배열, 0으로 나눈 조건
* 예외처리를 핸들링하기위해서 예외처리한다.
* 예외가 여전히 있을 수 있다.
* 인터넷 접속이 불가능한 예외에 연결이 안되니 오류발생 -> 예외처리하지 않는다면? 앱이 고장날 수 있다.
* 예외를 처리하고, 사용자에게 메시지를 띄워줘서 해결방법을 찾는다.
* 해당 디버깅할 때도 전체 if-else로 전체 예외가 불가능하니 이것으로 대체한다.
* try, catch , finally,throw
* try - > 블록은 예외를 발생시킬수 있는 구문 뒤에 무조건 catch, finally 따라와야함 많은 오류나 문제가 발생할 수 있는 코드
* catch -> try에서 던져진 예외를 잡는다. 연결이 되지 않으면 catch 문작동
* finally - > 예외가 처리되는지 말든지 실행된다. 버퍼를 닫는거나 저장을 처리하는 버퍼를 열리면 닫혀야하는 것들 무조건 실행되어야하는 코드.
* 정리하자면 finally는 try - catch로도 잡히지 않는 문제를 finally로 선언
* throw - > 명료하게 예외를 던지게해준다. 예외를 던지고 오류를 일으키기 위해서 입력하는 것이다. 오류가 어디서 나는지 테스트할 때 매우 유용
*
* Unchcked 예외
*  코드 문제로 런타임 예외 클래스에서 발생. 실행 버튼을 눌러서 앱을 실행할 때가 아닌 코드에서 에러발생
* 숫자를 0으로 나눈 ArithmeticException
* ArrayIndexOutOfBoundExceptions 배열 인덱스 초과 발생
* security exception 보안 위반. 예) GPS 사용시 GPS 사용할 권리 주지 않아 접근 불가능
* Null pointer exception 예) NUll로 비어있는 객체에 접근하려 했을때 나오는 오류다.

* checked 예외
* 컴파일 타임에서 확인되는 예외
* 우리가 쓴코드안에서, Throwable 클래스는 예외 함수
* 입력 출력예외 IOexception
* SQLE exception 그외에도 많이있다.

try {
* 예외 발생할 수 있는 코드 적기
* }catch(어떠한 예외) {
* }

 */

fun main(){
    val str = getNumber("10")
    println(str)

    val str2 = getNumber2("10.5")
    println(str2)
}

//예외 발생하지않음
fun getNumber(str:String):Int{
    return try {
        Integer.parseInt(str)
    }catch (e:ArithmeticException){
    0
    }// 코드 문제 있는지 체크 {

}

//예외처리 발생 예
fun getNumber2(str:String) : Int{
    return try {
        Integer.parseInt(str)
    }catch(e:NumberFormatException){ //NumberFormatException 숫자 자료형 타입이 맞지않을때 예외처리
        0
    }
}

