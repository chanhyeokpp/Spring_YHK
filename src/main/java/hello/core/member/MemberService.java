package hello.core.member;

public interface MemberService {
    // 2가지 기능이 있음, 회원가입, 회원 조회
    // 실제로 실행을 할 때 가장 중점이 되는 프로그램이라고 이해를 해야하나?
    // 회원가입이랑 회원조회를 한다고 다 되지는 않긴 함
    void join(Member member);
    Member findMember(Long memberId);

}
