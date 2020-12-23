package com.example.learn.javese.chapter5;

import java.util.Arrays;

public enum SizeEnum {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");

    private String abbreviation;

    private SizeEnum(String abbreviation) { this.abbreviation = abbreviation; }
    public String getAbbreviation() { return abbreviation; }

    SizeEnum s = Enum.valueOf(SizeEnum.class, "SMALL");
    SizeEnum[] values = SizeEnum.values() ;

    @Override
    public String toString() {
        return "Size{" +
                "abbreviation='" + abbreviation + '\'' +
                ", s=" + s +
                ", values=" + Arrays.toString(values) +
                '}';
    }

    public static void main(String[] args){
        SizeEnum sizeEnum = SizeEnum.SMALL;
    }
}
