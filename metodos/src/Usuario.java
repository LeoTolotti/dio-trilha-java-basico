public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        smartTv.mudarCanal(12);
        smartTv.descerCanal();
        smartTv.subirVolume();
        smartTv.status();
    }
}
