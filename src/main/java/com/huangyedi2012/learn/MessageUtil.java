package com.huangyedi2012.learn;

/**
 * Created by IntelliJ IDEA.
 *
 * @author liaozexiang
 * @since 2018/6/23 10:05
 */

public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
