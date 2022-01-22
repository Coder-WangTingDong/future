package com.fwtd.designpattern;

class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
    }
}

public class Observer {
    public static void main(String[] args) {
        Child child = new Child();
        // 观察什么时候cry，然后停止，一直循环，占用CPU
        while (!child.isCry()) {
            System.out.println("observing...");
        }
    }
}
