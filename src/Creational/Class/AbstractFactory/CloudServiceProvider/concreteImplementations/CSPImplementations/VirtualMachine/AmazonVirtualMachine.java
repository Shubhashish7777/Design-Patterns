package Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.VirtualMachine;

import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.VirtualMachine;

public class AmazonVirtualMachine implements VirtualMachine {
    @Override
    public void run() {
        System.out.println("Amazon Virtual Machine running");
    }
}
