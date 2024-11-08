package edu.icet.service.impl;

import edu.icet.dto.Member;
import edu.icet.entity.MemberEntity;
import edu.icet.repository.MemberRepository;
import edu.icet.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService {

    final MemberRepository repository;
    final ModelMapper mapper;

    @Override
    public void saveMember(Member member) {
        repository.save(mapper.map(member, MemberEntity.class));
    }

    @Override
    public List<Member> getAllMembers() {
        List<Member> memberList = new ArrayList<>();
        repository.findAll().forEach(entity ->memberList.add(mapper.map(entity, Member.class)));
        return memberList;
    }

    @Override
    public Member getMemberById(Integer id) {return mapper.map(repository.findById(id),Member.class);}

    @Override
    public List<Member> getMembersByName(String name) {
        List<Member> memberList = new ArrayList<>();
        repository.findByName(name).forEach(entity -> memberList.add(mapper.map(entity,Member.class)));
        return memberList;
    }

    @Override
    public List<Member> getMembersByEmail(String email) {
        List<Member> memberList = new ArrayList<>();
        repository.findByEmail(email).forEach(entity -> memberList.add(mapper.map(entity,Member.class)));
        return memberList;
    }

    @Override
    public List<Member> getMembersByPhone(String phone) {
        List<Member> memberList = new ArrayList<>();
        repository.findByPhone(phone).forEach(entity -> memberList.add(mapper.map(entity,Member.class)));
        return memberList;
    }

    @Override
    public Boolean deleteMemberById(Integer id) {
        repository.deleteById(id);
        return true;
    }
}
