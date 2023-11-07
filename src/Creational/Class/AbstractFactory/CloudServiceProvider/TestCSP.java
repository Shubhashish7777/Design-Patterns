package Creational.Class.AbstractFactory.CloudServiceProvider;

import Creational.Class.AbstractFactory.CloudServiceProvider.abstractFactory.cloudServiceProvider;
import Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.CSP.AmazonCSP;
import Creational.Class.AbstractFactory.CloudServiceProvider.concreteImplementations.CSPImplementations.CSP.AzureCSP;

public class TestCSP {

    public static void main(String args[]){


        cloudServiceProvider  cloudServiceProvider = new AmazonCSP();
        cloudServiceProvider.createStorage().run();
        cloudServiceProvider.createVirtualMachine().run();

        cloudServiceProvider = new AzureCSP();
        cloudServiceProvider.createStorage().run();
        cloudServiceProvider.createVirtualMachine().run();








    }


}
