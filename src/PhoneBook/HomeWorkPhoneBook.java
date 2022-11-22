package PhoneBook;

import java.util.Map;
//Домашнее задание 1 - 1
public class HomeWorkPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone("Сергей Бессмертный", "89999999999");
        phoneBook.addPhone("Василий Стрельников", "89999999991");
        phoneBook.addPhone("Игорь Ложкин", "89999999992");
        phoneBook.addPhone("Раймонд Головачев", "89999999993");
        phoneBook.addPhone("Ренат Магазов", "89999999994");
        phoneBook.addPhone("Магаз Ренатов", "89999999995");
        phoneBook.addPhone("Кудайберген Тудайберген", "89999999996");
        phoneBook.addPhone("Алабама Василькова", "89999999997");
        phoneBook.addPhone("Кисловодск наАмуре", "89999999998");
        phoneBook.addPhone("Тайпси Лайтнингов", "89999999911");
        phoneBook.addPhone("Субару Импрезов", "89999999922");
        phoneBook.addPhone("Кассиопея Жижулина", "89999999933");
        phoneBook.addPhone("Ставрид Карпов", "89999999944");
        phoneBook.addPhone("Назар Балабанов", "89999999959");
        phoneBook.addPhone("Товар Лицом", "89999999956");
        phoneBook.addPhone("Александр Овечкин", "89999999988");
        phoneBook.addPhone("Кети Топурия", "89999999978");
        phoneBook.addPhone("Аскар Вафельник", "89999999945");
        phoneBook.addPhone("Жора Крыжовников", "89999999963");
        phoneBook.addPhone("Игорь Игорев", "89999999970");
        phoneBook.addPhone("Анатолий Анатооолий", "89999999905");

        for(Map.Entry<String,String> entry :phoneBook.getEntries()){
            System.out.printf("%s - %s%n", entry.getKey(),entry.getValue());
        }
    }
}
