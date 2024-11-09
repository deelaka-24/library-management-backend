package edu.icet.controller;

import edu.icet.dto.Member;
import edu.icet.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
@CrossOrigin
public class MemberController {
    final MemberService memberService;

    @PostMapping("/save-member")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveMember(@RequestBody Member member){
        memberService.saveMember(member);
    }

    @PutMapping("/update-member")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBook(@RequestBody Member member){
        memberService.saveMember(member);
    }

    @GetMapping("/view-all-members")
    @ResponseStatus(HttpStatus.OK)
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @DeleteMapping("/delete-member-by-id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteMember(@PathVariable Integer id) {
        return memberService.deleteMemberById(id);
    }

    @GetMapping("/get-member-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Member getMemberById(@PathVariable Integer id) {
        return memberService.getMemberById(id);
    }

    @GetMapping("/get-member-by-name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<Member> getMembersByName(@PathVariable String name) {
        return memberService.getMembersByName(name);
    }

    @GetMapping("/get-member-by-email/{email}")
    @ResponseStatus(HttpStatus.OK)
    public List<Member> getMembersByEmail(@PathVariable String email) {
        return memberService.getMembersByEmail(email);
    }

    @GetMapping("/get-member-by-phone/{phone}")
    @ResponseStatus(HttpStatus.OK)
    public List<Member> getMembersByPhone(@PathVariable String phone) {
        return memberService.getMembersByPhone(phone);
    }
}
