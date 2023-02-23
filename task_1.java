import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;


public class task_1 {
    public static void main( String[] args ) {
        System.out.println( "\n### Программа выполняет разворот списка, без обращений по индексам\n" );

        LinkedList<Integer> list = generate_linkedlist();
        System.out.println( "Исходный список:\t" + list );

        // <!-- Разворот LinkedList<Integer>
        ListIterator<Integer> iterator = list.listIterator( list.size() );
        LinkedList<Integer> reversed_list = new LinkedList<>();
        while ( iterator.hasPrevious() ) {
            reversed_list.add( iterator.previous() );
        }
        // Разворот LinkedList<Integer> -->

        System.out.println( "Перевернутый список:\t" + reversed_list + "\n" );
    }


    // Генератор для LinkedList<Integer>
    // Можно добавить передачу параметров
    // int min, int max, int count
    public static LinkedList<Integer> generate_linkedlist() {
        LinkedList<Integer> list = new LinkedList<>();

        Random random = new Random();
        int size = random.nextInt( 10 ) + 11; // генерация случайного размера списка от 11 до 20
        for ( int i = 0; i < size; i++ ) {
            list.add( random.nextInt( 100 ) ); // добавление случайного числа от 0 до 99 в список
        }

        return list;
    }
}