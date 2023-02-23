import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;


public class task_3 {
    public static void main( String[] args ) {
        System.out.println( "\n### Программа для рассчета суммы элементов, используя итератор.\n" );

        LinkedList<Integer> list = generate_linkedlist();
        System.out.println( "Исходный список:\t" + list );

        // <!-- Рассет суммы элементов
        int sum = 0;
        ListIterator<Integer> iterator = list.listIterator();
        while ( iterator.hasNext() ) {
            sum += iterator.next();
        }
        // Рассет суммы элементов -->

        System.out.println( "Сумма элементов:\t" + sum + "\n" );
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
