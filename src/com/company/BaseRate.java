package com.company;

public interface BaseRate {
    default double getBaseRate(){
        return 2.5;
    }
}
