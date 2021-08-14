package com.dogyun.chapter2;

import com.dogyun.jdbc.util.JDBCConnectionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class JDBCConnectionManagerRunner implements ApplicationRunner {

    @Autowired
    private JDBCConnectionManager connectionManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Connection Manager : " + connectionManager.toString());        
    }
    
}
