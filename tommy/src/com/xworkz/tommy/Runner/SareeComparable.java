package com.xworkz.tommy.Runner;

public interface SareeComparable extends Comparable{
    @Override
    default int compareTo(Object o) {
        return 0;
    }
}
