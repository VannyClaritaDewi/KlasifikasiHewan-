public class main {
    public static void main (String [] args){

        klasifikasi hewan = new klasifikasi();


        hewan.contohk = "singa, macan, harimau, cheetah, piranha, ikan arwana";
        hewan.contohh = " kambing, unta, kerbau, kelinci";
        hewan.contoho = "tikus, ikan hias, ikan mujair, ayam";
        hewan.contohi = "cicak, kadal, bunglon, tapir";
        hewan.Makank = " daging";
        hewan.Makanh = "tumbuhan";
        hewan.Makano = "daging dan tumbuhan";
        hewan.Makani = "serangga";

        hewan.Kelompok();
        hewan.Karnivora();
        hewan.Herbivora();
        hewan.Omnivora();
        hewan.insektivora();
    }
}
