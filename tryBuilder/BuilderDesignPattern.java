class User {
    private String name;
    private String userName;
    private String userEmail;

    private User(UserBuilder userBuilder) {
        name = userBuilder.name;
        userName = userBuilder.userName;
        userEmail = userBuilder.userEmail;
    }

    @Override
    public String toString() {
        return "Name='" + name + "', userName='" + userName + "', userEmail='" + userEmail + "'";
    }

    public static class UserBuilder {
        private String name;
        private String userName;
        private String userEmail;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

class BuilderPattern {
    public static void main(String[] args) {
        User u1 = new User.UserBuilder()
                .setName("Aditya")
                .setUserName("AdityaKumar129")
                .setUserEmail("adityakumar93340@gmail.com")
                .build();
        System.out.println(u1.toString());
    }
}