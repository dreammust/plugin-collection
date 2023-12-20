package com.plugin.collect.thirdparty;

public class ThirdPartyServiceUtils {

    public static String getName(String service) {
        String result = "";
        switch (service) {
            case "user":
                result = " #### user  ####";
                break;
            case "role":
                result = " #### role  ####";
                break;
            case "menu":
                result = " #### menu  ####";
                break;
        }
        return result;
    }
}
