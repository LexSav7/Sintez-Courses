public class ThirdTask {

// Ссылку на метод передать в другой метод (со статическим и нестатическим методом).
// Попробовать передать конструктор как ссылку (в метод).

    // Следующий пример
    class User {
        private String name;

        public User (String name) {
            this.name = name;
        }
    }

    interface UserBuilder {
        User create (String name) ;
    }

    UserBuilder builder = User :: new;


    // ссылка на конструктор класса User
    // часто используется в стримах и коллекциях

//    User user = builder.create(“Alex”);
}
