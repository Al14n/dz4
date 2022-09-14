public class Труба implements Инструмент {
    public int diametr;
    public Труба(int dia){
        diametr= dia;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + diametr);
    }
}
