package Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations;

import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.Storage;
import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.VirtualMachine;
import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.cloudServiceProvider;

public class AmazonCSP implements cloudServiceProvider {


    @Override
    public VirtualMachine createVirtualMachine() {
        return new AmazonVirtualMachine();
    }

    @Override
    public Storage createStorage() {
        return new AmazonStorage();
    }
}
