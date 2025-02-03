public class iPhone extends AppleProduct {
    private String color;
    private String storage;

    public iPhone(String name, int price, String model, String color, String storage) {
        super(name, price, model);
        this.color = color;
        this.storage = storage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("색상: " + color);
        System.out.println("저장 용량: " + storage);
    }
}