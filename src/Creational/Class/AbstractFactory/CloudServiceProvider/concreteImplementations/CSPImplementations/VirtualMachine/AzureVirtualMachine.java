package Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.VirtualMachine;

import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.VirtualMachine;

public class AzureVirtualMachine implements VirtualMachine {
    @Override
    public void run() {
        System.out.println("AzureVirtualMachine running");
    }
}
