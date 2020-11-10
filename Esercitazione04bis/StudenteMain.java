public class StudenteMain {
    public static void main(String args[]){
        Studente s1, s2, s3;
        Date2 dn = new Date2(1, 1, 2000);

        s1 = new Studente("Mario", "Rossi", 12345, dn);

        s2 = new Studente("Peppe", "Verdi", 13248, new Date2(1, 1, 2000));

        s3 = new Studente("Mario", "Rossi", 12345, 1, 12, 2000);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
