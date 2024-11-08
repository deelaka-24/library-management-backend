package edu.icet.service;

import edu.icet.dto.Member;

import java.util.List;

public interface MemberService {
    void saveMember(Member member);
    List<Member> getAllMembers();
    Member getMemberById(Integer id);
    List<Member> getMembersByName(String name);
    List<Member> getMembersByEmail(String email);
    List<Member> getMembersByPhone(String phone);
    Boolean deleteMemberById(Integer id);
}
