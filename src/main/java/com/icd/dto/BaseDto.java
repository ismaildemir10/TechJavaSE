package com.icd.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
//@Data
@Setter
@Getter
//@AllArgsConstructor
@ToString
//@Builder
abstract public class BaseDto  implements Serializable {
    public static final long serialVersionUID=1L;

    private Long ID;
    @Builder.Default
    private Date createDate=new Date(System.currentTimeMillis());

    public BaseDto(Long ID, Date createDate) {
        this.ID = ID;
        this.createDate = createDate;
    }

    public BaseDto(){
        System.out.println("Hashcode: "+BaseDto.class.hashCode());
    }



}
