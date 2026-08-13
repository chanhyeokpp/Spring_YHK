package hello.core.member;
import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long,Member> store = new HashMap<>();
// store라는 일종의 dictionary를 만들고 그 안에다가 저장해주는 save()와,
// key(=memberId)를 사용하여 member를 찾아내는 findById()
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
