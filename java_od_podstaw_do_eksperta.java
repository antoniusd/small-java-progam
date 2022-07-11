package java_od_podstaw_do_eksperta;

public class java_od_podstaw_do_eksperta {
    public static void main(String[] args) {
        int i = 0;
            int[] tab = new int[10];

            tab[0] = 10;
            tab[1] = 20;
            tab[2] = 30;
            tab[3] = 40;
            tab[4] = 50;
            tab[5] = 60;
            tab[6] = 70;
            tab[7] = 80;
            tab[8] = 90;
            tab[9] = 100;

        i = 0;
        do {
            System.out.println(tab[i]);
            i++;
        } while(i < tab.length);

        System.out.println();
        System.out.println("New while (not do... while)");
        System.out.println();

        i = 0;
        while(i < tab.length) {
            System.out.println(tab[i]);
            i++;
        };

// ------------------------------------------------------------------------------------------------------------------ //

        System.out.println("-----------------------------------------------------------------------------------");

        String app = "working";

        if (app == "working")
            System.out.println("program is succefull");
        else
        {
                System.out.println("error: application not working");
                System.out.println("Intellij has'nt got any arguments");
                System.out.println("please restarting application");
        };
    }
}

