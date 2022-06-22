package tugasmodul9;
class PC extends Komputer implements Mouse, Keyboard, Printer{

    void hidupkan_os() {
        System.out.println("Status PC : Menyalakan PC...");
    }

    void matikan_os() {
        System.out.println("Status PC : Mematikan PC...");
    }

    public void klik_kanan() {
        System.out.println("Mouse PC : Klik Kanan...");
    }

    public void klik_kiri() {
        System.out.println("Mouse PC : Klik Kiri...");
    }

    public void tekan_enter() {
        System.out.println("Keyboard PC : Tekan Enter...");
    }

    public void cetak_data() {
        System.out.println("Printer PC : Mencetak Data...");
    }
    
}
