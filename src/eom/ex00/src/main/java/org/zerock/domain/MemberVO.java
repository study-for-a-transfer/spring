package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MemberVO {
    private String userid;
    private String userpw;
    private String username;
    private String email;
    private Date regdate;
    private Date updatedate;

    @Override
    public String toString() {
        return "MemberVO [" +
                "userid=" + userid +
                ", userpw='" + userpw +
                ", username='" + username +
                ", email='" + email +
                ", regdate=" + regdate +
                ", updatedate=" + updatedate +
                '}';
    }
}
