/**
 * 
 */
package com.tamc.oauth.repository;


import com.tamc.oauth.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component("memberRepository")
public interface MemberRepository extends JpaRepository<Member, Long> {
	Member findOneByUsername(String username);
}
