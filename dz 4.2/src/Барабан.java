public class Барабан implements Инструмент  {
    private int razmer;
    public Барабан(int razmer1){
        razmer= razmer1;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + razmer);
    }
}
