package Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.CSP;

import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.Storage;
import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.VirtualMachine;
import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.cloudServiceProvider;
import Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.Storage.AzureStorage;
import Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.VirtualMachine.AzureVirtualMachine;

public class AzureCSP implements cloudServiceProvider {
    @Override
    public VirtualMachine createVirtualMachine() {
        return new AzureVirtualMachine();
    }

    @Override
    public Storage createStorage() {
        return new AzureStorage();
    }
}
