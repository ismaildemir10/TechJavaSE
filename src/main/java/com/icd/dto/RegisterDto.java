package com.icd.dto;

import lombok.*;

import java.io.Serializable;
import java.net.IDN;
import java.util.Date;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
//@Builder
@ToString
public class RegisterDto extends BaseDto implements Serializable {
    public static final long serialVersionUID=1L;

    private String nickName;
    private String emailAddress;
    private String passWord;
    private String role;
    private String phoneNumber;
    private Boolean isPassive;

    public RegisterDto() {
    }

    public RegisterDto(Long ID, Date createDate, String nickName, String emailAddress, String passWord, String role, String phoneNumber, Boolean isPassive) {
        super(ID, createDate);
        this.nickName = nickName;
        this.emailAddress = emailAddress;
        this.passWord = passWord;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.isPassive = isPassive;
    }

    @Override
    public String toString() {
        return "RegisterDto{" +
                "nickName='" + nickName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", passWord='" + passWord + '\'' +
                ", role='" + role + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isPassive=" + isPassive +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        /* RegisterDto registerDto = RegisterDto();
                .builder()
                .emailAddress("a@gmail.com")
                .passWord("123456")
                .isPassive(false)
                .nickName("Computer science")
                .role(ERoles.ADMIN.toString())
                .build();*/
        RegisterDto registerDto = new RegisterDto();
        registerDto.setID(1L);
        registerDto.setNickName("Computer science");
        registerDto.setEmailAddress("a@gamil");
        registerDto.setPassWord("123456");
        registerDto.setIsPassive(Boolean.FALSE);
        registerDto.setRole(ERoles.ADMIN.toString());
        System.out.println(registerDto);


    }

}
