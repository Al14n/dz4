public class Book implements Printable {

    public String name;
    public Book(String name1){
        name = name1;

    }

    @Override
    public void print(){
        System.out.println(name);
    }
    public static void printBooks(Printable[] printable){
        for(int i = 0;i<printable.length;i++){
            if( printable[i] instanceof Book){
                printable[i].print();
            }
        }
    }

}

