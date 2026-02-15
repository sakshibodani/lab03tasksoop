//25k-3044
class Computer {
    String SystemID;
    String processor;
    int RamSize;
    String os;
    public Computer(String SystemID, String processor, int RamSize, String os) {
        this.SystemID=SystemID;
        this.processor=processor;
        this.RamSize=RamSize;
        this.os=os;
    }
    void display() {
        System.out.println("System ID: "+ SystemID+" Processor "+processor+ " RAM size: "+ RamSize+" os: "+ os);
    }
}

class comp {
    public static void main(String[] args) {
        Computer c1=new Computer("LAB 01", "intel", 16, "Windows 11");
        Computer c2=new Computer("LAB 02", "AMD", 8, "Ubuntu ");
        Computer c3=new Computer("LAB 03", "Apple M2", 32, "macOS");
        c1.display();
        c2.display();
        c3.display();
    }
}