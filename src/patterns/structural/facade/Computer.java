package patterns.structural.facade;

public class Computer {
    CPU cpu = new CPU();
    Memory memory = new Memory();
    HardDrive hardDrive = new HardDrive();

    void run(){
        cpu.calculate();
        memory.allocate();
        hardDrive.storeData();
    }
}
