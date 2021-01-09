package xml;
public class LoggingAdvice {
	public void before() {
		System.out.println("[LA]메서드 실행 전  전처리 수행 기능");
	}
	//ret : 정상종료후 전달되는 핵심알고리즘의 리턴값
	public void afterReturning(Object ret) { 
		System.out.println("[LA]메서드 정상 처리 후 수행 함. ret="+ret);
	}
	//ex : 발생된 예외객체
	public void afterThrowing(Throwable ex) {
		System.out.println
		  ("[LA]메서드 예외 발행 후 수행함. 발생 예외:" + ex.getMessage());
	}
	public void afterFinally() {
		System.out.println("[LA]메서드 실행 후 수행함.");
	}
}