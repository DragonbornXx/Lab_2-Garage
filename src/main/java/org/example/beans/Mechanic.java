package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mechanic {
    private String name;
    private Tool tool;

    public Mechanic(String name) {
        this.name = name;
    }

    @Autowired
    public void setTool(Tool tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "Mechanic [name=" + name + ", tool=" + tool + "]";
    }
}