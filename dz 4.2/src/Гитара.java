public class Гитара implements Инструмент {
    private int kolvo_strun;
    public Гитара(int kol){
        kolvo_strun= kol;
    }


    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн " + kolvo_strun);
    }
}
