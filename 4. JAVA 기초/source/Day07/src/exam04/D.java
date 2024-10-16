package exam04;

public class D implements C {

    // Override로 재정의하였기 때문에 추상클래스를 사용함.
    // Override를 사용하므로써 실행을 시켜줌

    @Override
    public void methodA() {
        System.out.println("methodA 호출");
    }

    @Override
    public void methodB() {
        System.out.println("methodB 호출");
    }

    @Override
    public void methodC() {
        System.out.println("methodC 호출");
    }

    @Override
    public void common() {
        System.out.println("Common 호출!");
    }
}
