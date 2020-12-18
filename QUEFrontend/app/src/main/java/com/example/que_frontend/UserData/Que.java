package com.example.que_frontend.UserData;

public class Que {
    public static String id;
    public static Integer count = 0;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Que.id = id;
    }

    public static Integer getCount() {
        return count;
    }

    public static void setCount(Integer count) {
        Que.count = count;
    }
}
