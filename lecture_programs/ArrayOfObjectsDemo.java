package lecture_programs;

import java.util.Scanner;

class Student {

    int rno;
    String name;
    double cpi;

    Student() {
        rno = 1;
        name = "abc";
        cpi = 7.5;
    }

    Student(int rno, String name, double cpi) {
        this.rno = rno;  //datamember = local variable
        this.name = name;
        this.cpi = cpi;
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public double getCpi() {
        return cpi;
    }

    void displayData() {
        System.out.println("Roll No. is :" + this.getRno() + " Name is : " + this.getName() + " Cpi is : " + this.getCpi());
    }
}

class ArrayOfObjectsDemo {

    public static void main(String[] args) {
        Student[] list = new Student[5];
        list[0] = new Student();
        list[0].displayData();
        Scanner sc = new Scanner(System.in);
        int r;
        String n;
        double c;
        for (int i = 1; i < list.length; i++) {
            System.out.println("Enter Values for roll no, name and cpi : ");
            r = sc.nextInt();
            n = sc.next();
            c = sc.nextDouble();
            list[i] = new Student(r, n, c);
            list[i].displayData();
        }
    }
}
