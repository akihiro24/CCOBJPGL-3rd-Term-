public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        ShihPom myPet = new ShihPom();

        myPet.bark();
        System.out.println("Size: " + myPet.size);
        System.out.println("Hair Colors: " + myPet.hairColors);
    }
}
