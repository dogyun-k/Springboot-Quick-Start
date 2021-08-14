package com.dogyun.jdbc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "board.jdbc")
public class JDBCConnectionManagerProperties {
    private String driverClass;
    private String url;
    private String username;
    private String passowrd;
    
    public String getDriverClass() {
        return driverClass;
    }
    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassowrd() {
        return passowrd;
    }
    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    
}
