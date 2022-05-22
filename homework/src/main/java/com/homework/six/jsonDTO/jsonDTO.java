package com.homework.six.jsonDTO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class jsonDTO {
    public double price;
    public Info info;

    public static class Info {
        @JsonFormat(pattern="yyyy-MM-dd")
        public String data;
    }

    public jsonDTO(double price, Info info){
        this.price = price;
        this.info = info;
    }
}
