package com.jason.boot.mybatis.oracle;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Author: jason
 * On: 2017-10-09  13:07
 */
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class MyDataSourceConfigProperties {

    private String driverClassName;

    private String jdbcUrl;

    private String username;

    private String password;

    private int  idleTimeout;

    private int  connectionTimeout;

    private int  maxLifetime;

    private int maximumPoolSize;



}
