public class Main {
    public static void main(String[] args) {
        Инструмент ins[] = {new Барабан(3), new Гитара(5),new Труба(2)};

        for (int i =0;i<ins.length;i++){
            ins[i].play();
        }
    }

}