public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Константин";
        post.patronymic = "Константинович";
        post.surname = "Рокоссовский";
        post.birthday.day = 21;
        post.birthday.month = 12;
        post.birthday.year = 1896;
        post.passport = "9999 № 999999";
        post.phone = "+9 (999)-999-99-99";
        post.subscription = true;
    }
}