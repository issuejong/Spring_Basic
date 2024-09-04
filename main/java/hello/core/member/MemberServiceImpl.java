package hello.core.member;

public class MemberServiceImpl implements MemberService {

    //회원을 찾기 위해서는 멤버 리포지토리 인터페이스가 필요하다
    //인터페이스만 갖고 있으면 null 오류가 생기므로 new를 해주는 것
    private final MemberRepository memberRepository;

    //생성자를 통해 memberRepository에 구현체가 무엇이 들어갈지 결정함
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
