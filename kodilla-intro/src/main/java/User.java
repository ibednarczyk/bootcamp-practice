public class User {
    String userName;
    int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;

    }
    public static void main(String[] args) {

        User[] person = new User[5];
        person[0] = new User("Ewa", 15);
        person[1] = new User("Olga", 7);
        person[2] = new User("Tomasz", 20);
        person[3] = new User("Wojtek", 13);
        person[4] = new User("Mikołaj", 5);

        int length = person.length;
        int suma = 0;
        int average;

        for (int i = 0; i <= (length); i++) {
            suma += person[i].userAge;
            System.out.println(suma);
            average = suma /length;
            System.out.println(average);
        }

        for (int i = 0; i <= (length); i++) {
            if (person[i].userAge < 12){
                System.out.println("Użytkownik poniżej średniej wieku to: "+ person[i].userName);

            }
        }
    }
}
