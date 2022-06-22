package tugasmodul9;
class Laptop extends Komputer implements Mouse, Keyboard, Printer{

    void hidupkan_os() {
        System.out.println("Status Laptop : Menyalakan Laptop...");
    }

    void matikan_os() {
        System.out.println("Status Laptop : Mematikan Laptop...");
    }

    public void klik_kanan() {
        System.out.println("Mouse Laptop : Klik Kanan...");
    }

    public void klik_kiri() {
        System.out.println("Mouse Laptop : Klik Kiri...");
    }

    public void tekan_enter() {
        System.out.println("Keyboard Laptop : Tekan Enter...");
    }

    public void cetak_data() {
        System.out.println("Printer Laptop : Mencetak Data...");
    }
    
}
