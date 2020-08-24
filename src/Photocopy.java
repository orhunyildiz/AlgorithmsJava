public class Photocopy {
    public static void main(String[] args) {
        int fotokopi = 125;
        int ₺ = 0;
        int fiyat = fiyatHesapla(fotokopi);
        if (fiyat / 100 >= 1) {
            ₺ = fiyat / 100;
            fiyat %= 100;
        }
        System.out.println("Fiyat: " + ₺ + " TL " + fiyat + " kuruş.");
    }

    public static int fiyatHesapla(int n) {
        int fiyat = 0;
        int count25 = 0, count12 = 0;
        while (n > 12) {
            if (n / 25 >= 1) {
                count25 = n / 25;
                fiyat = count25 * 100 + fiyat;
                n %= 25;
            }
            if (n / 12 >= 1) {
                count12 = n / 12;
                fiyat = count12 * 50 + fiyat;
                n %= 12;
            }
        }
        fiyat += n;
        return fiyat;
    }
}
