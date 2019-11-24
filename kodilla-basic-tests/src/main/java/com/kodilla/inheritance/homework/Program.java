package com.kodilla.inheritance.homework;

import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

public class Program {

    public static void main (String[] arg){

        OperatingSystem system = new OperatingSystem(1956);
        system.turnOn();

        OperatingSystem.Windows windows = new OperatingSystem.Windows(1985);
        windows.turnOff();
        System.out.println(windows.getManufactureYear());
        windows.displayManufactureYear();

        OperatingSystem.Linux linux = new OperatingSystem.Linux(1991);
        System.out.println(linux.getManufactureYear());
        linux.displayManufactureYear();




    }
}
