package com.plugin.example.plugin2.service;

import com.plugin.example.start.plugin.ConsoleName;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author zhangzhuo
 * @version 1.0
 */
@Component
public class ConsoleNameImpl implements ConsoleName {
    @Override
    public String name() {
        return "My name is Plugin2";
    }
}