public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private String address;

    public User(String firstName, String lastName, int age, String email, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;

        User user = new UserBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .setEmail("johndoe@example.com")
                .setPhone("123-456-7890")
                .setAddress("123 Main St, Anytown USA")
                .build();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}

