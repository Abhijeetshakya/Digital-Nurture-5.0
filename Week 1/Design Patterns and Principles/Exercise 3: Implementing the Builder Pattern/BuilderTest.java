public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingPc = new Computer.Builder()
                .setCpu("Intel Core i9")
                .setRam("32GB")
                .setStorage("2TB SSD")
                .setGpu("RTX 4090")
                .setOs("Windows 11")
                .build();

        Computer officePc = new Computer.Builder()
                .setCpu("Intel Core i5")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .setOs("Windows 11")
                .build();

        Computer budgetLaptop = new Computer.Builder()
                .setCpu("AMD Ryzen 3")
                .setRam("8GB")
                .setStorage("256GB SSD")
                .setOs("Ubuntu")
                .build();

        System.out.println("Gaming PC: " + gamingPc);
        System.out.println("Office PC: " + officePc);
        System.out.println("Budget Laptop: " + budgetLaptop);
    }
}
