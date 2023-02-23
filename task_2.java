import java.util.LinkedList;
import java.util.Random;


public class task_2 {
    public static void main( String[] args ) {
        System.out.println( "\n### Программа реализует очередь.\n" );

        LinkedList<Integer> list = generate_linkedlist();
        System.out.println( "Исходный список:\t" + list );

        // <!-- Тест функционала
        enqueue( list, 666 );
        System.out.println( "Добавили 666 в конец:\t" + list + "\n" );

        System.out.println( "Забрали первый и удалили:\t" + dequeue( list ) );
        System.out.println( "Итоговый список:\t" + list  + "\n" );

        System.out.println( "Забрали первый не удаляя:\t" + first( list ) );
        System.out.println( "Итоговый список:\t" + list  + "\n" );
        // Тест функционала -->
    }


    // Помещает элемент в конец очереди
    public static void enqueue( LinkedList<Integer> list, int num ) {
        list.addLast( num );
    }


    // Возвращает первый элемент из очереди и удаляет его
    public static int dequeue( LinkedList<Integer> list ) {
        int num = 0;
        num = list.get( 0 );
        list.remove( 0 );
        return num;
    }


    // Возвращает первый элемент из очереди, не удаляя
    public static int first( LinkedList<Integer> list ) {
        int num = 0;
        num = list.get( 0 );
        return num;
    }


    // Генератор для LinkedList<Integer>
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