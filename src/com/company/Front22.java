package com.company;

/**
 * Created by ridita on 4/4/17.
 */
public class Front22 {

    public String front22(String str) {

        String answerString = "";

        if (str.length() < 2) {
            for (int i = 0; i < 3; i++) {
                answerString += str;
            }

            return answerString;

        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }

    }

}
