package Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.CSP;

import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.Storage;
import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.VirtualMachine;
import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.cloudServiceProvider;
import Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.Storage.AmazonStorage;
import Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.VirtualMachine.AmazonVirtualMachine;

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
