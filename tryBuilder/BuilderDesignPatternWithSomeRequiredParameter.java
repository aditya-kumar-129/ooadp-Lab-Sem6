class User {
    // ✅ Required fields
    private final String userName;
    private final String userEmail;

    // 🟡 Optional fields
    private final String name;
    private final String phoneNumber;

    // private constructor (only builder can call)
    private User(UserBuilder builder) {
        this.userName = builder.userName;
        this.userEmail = builder.userEmail;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" + "userName='" + userName + '\'' + ", userEmail='" + userEmail + '\'' + ", name='" + name + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
    }

    // ---------------- Builder Class ----------------
    public static class UserBuilder {
        // required
        private final String userName;
        private final String userEmail;

        // optional
        private String name;
        private String phoneNumber;

        // ✅ Constructor for required parameters
        public UserBuilder(String userName, String userEmail) {
            this.userName = userName;
            this.userEmail = userEmail;
        }

        // 🟡 Optional setters (return builder for chaining)
        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // ✅ Final build method
        public User build() {
            return new User(this);
        }
    }
}
class BuilderDesignPatternWithSomeRequiredParameter {
    public static void main(String[] args) {
        // Required fields via constructor, optional via methods
        User user = new User.UserBuilder("aditya123", "aditya@example.com")
                .setName("Aditya Kumar")
                .setPhoneNumber("9876543210")
                .build();

        System.out.println(user);
    }
}
