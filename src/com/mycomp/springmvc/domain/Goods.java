package com.mycomp.springmvc.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Goods {
    private String goods_name;
    private Double goods_price;
    private String[] goods_scale;
    private Pat pat;
    private List<Component> components;

    @Override
    public String toString() {
        return "Goods{" +
                "goods_name='" + goods_name + '\'' +
                ", goods_price=" + goods_price +
                ", goods_scale=" + Arrays.toString(goods_scale) +
                ", pat=" + pat +
                ", components=" + components +
                '}';
    }
}
