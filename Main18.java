import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running){
            System.out.println("Mau menghitung luas apa?");
        System.out.println("1. Luas persegi(s)");
        System.out.println("2. Luas persegi(p,l)");
        System.out.println("3. Luas segitiga(a,t)");
        System.out.println("4. Luas lingkaran(r)");
        System.out.print("Masukkan pilihan(1-4): ");
        int pilihan = in.nextInt();

        switch (pilihan){
            case 1:
            System.out.print("Masukkan s: ");
            int s = in.nextInt();
            cetakLuas(s);
            break;
            case 2:
            System.out.print("Masukkan p: ");
            int p = in.nextInt();
            System.out.print("Masukkan l: ");
            int l = in.nextInt();
            cetakLuas(p, l);
            break;
            case 3:
            System.out.print("Masukkan a: ");
            int a = in.nextInt();
            System.out.print("Masukkan t: ");
            int t = in.nextInt();
            cetakL(a, t);
            break;
            case 4:
            System.out.print("Masukkan r: ");
            int r = in.nextInt();
            cetakL(r);
            break;
            default:
                continue;
                    }
            System.out.print("Mau menghitung lagi? (y/n): ");
            char ulang = in.next().charAt(0);
            if (ulang == 'n' || ulang == 'N') {
                running = false;
                System.out.println("Program selesai.");
            }
                }

        }




    public static int luasPersegi(int s) {
        int luas = s * s;
        return luas;
    }

    public static int luasPersegi(int p, int l) {
        int luas = p * l;
        return luas;
    }

    public static int luasSegitiga(int a, int t) {
        int luas = (1 / 2) * a * t;
        return luas;
    }

    public static double luasLingkaran(int r) {
        double luas = Math.PI * r * r;
        return luas;
    }

    public static void cetakLuas(int s) {
        System.out.println(luasPersegi(s));
    }

    public static void cetakLuas(int p, int l) {
        System.out.println(luasPersegi(p, l));
    }

    public static void cetakL(int a, int t) {
        System.out.println(luasSegitiga(a, t));
    }

    public static void cetakL(int r) {
        System.out.println(luasLingkaran(r));
    }}

