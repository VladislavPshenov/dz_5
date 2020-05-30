package my_project;

public class Main {

    public static void main(String[] args) {
        Employee [] persArray = new Employee [5];
        persArray [0] = new Employee("Боброва Елена Викторовна", "инженер", "kup@ev.ru", "89305234872", 80000, 34);
        persArray [1] = new Employee("Собакина Анна Борисовна", "бухгалтер", "sobaka@mail.ru", "89869026540", 50000, 45);
        persArray [2] = new Employee("Смоловик Алексей Николаевич", "начальник", "smolan@mail.ru", "89228757081", 200000, 50);
        persArray [3] = new Employee("Костина Кристина Петровна", "инженер", "kykyshka@gmail.com", "89325447969", 75000, 38);
        persArray [4] = new Employee("Шишкин Максим Александрович", "охранник", "security@mail.ru", "89124523597", 25000, 62);

        for (int i = 0; i < persArray.length; i++)
        {
            if ( persArray [i].getAge() > 40)
            {
                persArray[i].printInfo();
            }
            else
            {
                System.out.println();
            }
            System.out.println();
        }
    }
}
