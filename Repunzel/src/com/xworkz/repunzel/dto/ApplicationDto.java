package com.xworkz.repunzel.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class ApplicationDto implements Comparable<ApplicationDto>{
    private String appName;
    private LocalDate cratedDate;
    private String size;
    private boolean free;
    private int chargePerUse;
    private ApplicationVersion version;
    private ApplicationType type;
    private List<UserDto> userName;


    @Override
    public int compareTo(ApplicationDto o) {
        return 0;
    }
}
