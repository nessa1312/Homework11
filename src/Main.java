public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println();
        // Задание 2
        System.out.println("Задание 2");
        String fullName1 = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника — " + upperFullName);

        System.out.println();
        // Задание 3
        System.out.println("Задание 3");
        String fullName2 = "Иванов Семён Семёнович";
        String fixedFullName = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fixedFullName);
    }
}