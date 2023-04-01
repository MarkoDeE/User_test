public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .setEmail("johndoe@example.com")
                .setPhone("123-456-7890")
                .setAddress("123 Main St, Anytown USA")
                .build();

        System.out.println("Created user: " + user.getFirstName() + " " + user.getLastName());
    }
}

