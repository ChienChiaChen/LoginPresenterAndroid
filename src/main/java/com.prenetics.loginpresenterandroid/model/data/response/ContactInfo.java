package com.prenetics.loginpresenterandroid.model.data.response;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jianjiacheng on 10/2/17.
 */

public class ContactInfo {
    private String email;
    private String phone;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
