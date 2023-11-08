package Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.Storage;

import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.Storage;

public class AzureStorage implements Storage {
    @Override
    public void run() {
        System.out.println("AzureStorage Running");
    }
}
