package Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory;

public interface cloudServiceProvider {

    VirtualMachine createVirtualMachine ();
    Storage createStorage();
}
