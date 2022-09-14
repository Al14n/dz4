public class Magazine implements Printable{

    public String Mag;

    public Magazine (String magz){
        Mag = magz;
    }
    @Override
    public void print() {
        System.out.println(Mag);
    }
    public static void printMagazines(Printable[] printable){
        for(int i = 0;i<printable.length;i++){
            if( printable[i] instanceof Magazine){
                printable[i].print();
            }
        }
    }
}
