package com.example.demo.wuzhixintest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhixin.wu
 * @date 2021/1/29 14:06
 */
public class TestSpringboot {

    public static void main(String[] args) {
        String remarkTags = null;
        List<String> remarkTagsList = new ArrayList<>();

            String[] split = remarkTags.split(",");
            Arrays.stream(split).forEach((target) -> {
                remarkTagsList.add(target);
            });


    }

}
