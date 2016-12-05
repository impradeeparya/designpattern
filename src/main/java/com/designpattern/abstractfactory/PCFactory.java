package com.designpattern.abstractfactory;

/**
 * Created by pradeep on 4/12/16.
 */
public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}