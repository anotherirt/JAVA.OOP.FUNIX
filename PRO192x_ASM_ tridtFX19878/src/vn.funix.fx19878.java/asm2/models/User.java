package vn.funix.fx19878.java.asm2.models;

import java.util.regex.Pattern;

public class User {
    private String name;
    private String customerId;

    public User(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }
    // KIỂM TRA SỐ CCCD NHẬP VÀO CÓ ĐÚNG ĐỊNH DẠNG
    public static boolean validateCustomerId(String idNumbers){
        Pattern pattern = Pattern.compile("^\\d{12}$");
        return pattern.matcher(idNumbers).find();
    }
    public void setCustomerId(String customerId) {
        if(validateCustomerId(customerId)){
            this.customerId = customerId;
        }
    }

}
