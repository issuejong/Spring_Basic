package hello.core.disconut;

import hello.core.member.Grade;
import hello.core.member.Member;

//implements : 구현체
public class FixDiscountPolicy implements DiscountPolicy{

    //1000원 할인
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        //조건 : VIP
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }
        else {
            return 0;
        }
    }
}
