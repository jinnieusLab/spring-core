package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int distcountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        // VIP만
        if (member.getGrade() == Grade.VIP)
            return price * distcountPercent/100;
        else{
            return 0;
        }
    }
}
