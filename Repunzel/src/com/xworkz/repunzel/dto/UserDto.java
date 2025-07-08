package com.xworkz.repunzel.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class UserDto {
    private String userName;
    private String email;
    private long phoneNo;
}
