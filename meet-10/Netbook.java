package tugasmodul9;
class Netbook extends Komputer implements Mouse, Keyboard, Printer{

    void hidupkan_os() {
        System.out.println("Status Netbook : Menyalakan Netbook...");
    }

    void matikan_os() {
        System.out.println("Status Netbook : Mematikan Netbook...");
    }

    public void klik_kanan() {
        System.out.println("Mouse Netbook : Klik Kanan...");
    }

    public void klik_kiri() {
        System.out.println("Mouse Netbook : Klik Kiri...");
    }

    public void tekan_enter() {
        System.out.println("Keyboard Netbook : Tekan Enter...");
    }

    public void cetak_data() {
        System.out.println("Printer Netbook : Mencetak Data...");
    }
    
}
