public class Client {
    private String firstName;
    private String lastName;

    Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName.toUpperCase();
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
