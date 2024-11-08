package edu.icet.repository;

import edu.icet.dto.Member;
import edu.icet.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<MemberEntity,Integer> {
    List<Member> findByName(String name);
    List<Member> findByEmail(String email);
    List<Member> findByPhone(String phone);
}
