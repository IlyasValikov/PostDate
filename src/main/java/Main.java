public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.telephone = "8 (999) 999 99 99";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = "12";
        post.birthday.month = "11";
        post.birthday.year = "2000";

    }
}
