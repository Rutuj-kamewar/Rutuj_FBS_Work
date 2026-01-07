class Date {
    int day, month, year;
    String dow;

    Date() {
        this.day = 31;
        this.month = 03;
        this.year = 2004;
    }

    Date(int day, int month, int year, String dow) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dow = dow;
    }

    void setDay(int d) {
        this.day = d;
    }

    void setMonth(int m) {
        this.month = m;
    }

    void setYear(int y) {
        this.year = y;
    }

    void setDow(String str) {
        this.dow = str;
    }

    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    void display() {
            System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

}// date class ends here

class Test {
    public static void main(String[] args) {
        // Date d1 = new Date();
        // Date d2 = new Date();
        // // d2.setDay(30);
        // // d2.setMonth(11);
        // // d2.setYear(2003);
        // d1.setDay(31);
        // d1.setMonth(03);
        // d1.setYear(2003);
        // d1.setDow("Wednesday");

        // System.out.println(d2.day);

        // if (d1.getMonth() > d2.getMonth()) {
        //     System.out.println("d1 is younger");
        // } else if (d1.getYear() > d2.getYear()) {
        //     System.out.println("d1 is younger");
        // } else {
        //     System.out.println("d2 is younger");
        // }


        Date arr[] = new Date[3];
        arr[0] = new Date();
        arr[1] = new Date(7,11,2025,"friday");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            arr[i].display();
        }





    }// main ends here
}// Test class ends here