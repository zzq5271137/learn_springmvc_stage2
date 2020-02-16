package com.mycomp.springmvc.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pat {
    private String pat_name;
    private Integer pat_age;

    @Override
    public String toString() {
        return "Pat{" +
                "pat_name='" + pat_name + '\'' +
                ", pat_age=" + pat_age +
                '}';
    }
}
