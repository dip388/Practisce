
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {
    public void print() { System.out.println("Printing"); }
    public void scan()  { System.out.println("Scanning"); }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.print();
        m.scan();
    }
}
