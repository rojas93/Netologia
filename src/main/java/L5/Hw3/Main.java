package L5.Hw3;

public class Main {
    public static void main(String[] args) {

        User user = new User("jonnsnow@ya.com", "Jonn", "Snow");
        User user2 = new User("fedyasmolov@ya.com", "Fedya", "Smolov");
        User user3 = new User("leodicaprio@ya.com", "Leo", "Dicaprio");

        System.out.println(User.totalOnline);
    }
}
