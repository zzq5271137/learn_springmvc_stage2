package com.mycomp.springmvc.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Component {

    private String component_name;
    private Double component_price;

    @Override
    public String toString() {
        return "Component{" +
                "component_name='" + component_name + '\'' +
                ", component_price=" + component_price +
                '}';
    }
}
