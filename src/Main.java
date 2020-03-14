import java.util.*;

//1. Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
//    - Найти список слов, из которых состоит текст (дубликаты не считать);
//    - Посчитать сколько раз встречается каждое слово (использовать HashMap);

public class Main { //1 задание

    public static void main(String[] args) {
        int count;
	    String str = "ой вань гляди какие клоуны " +
                "рот хоть завязочки пришей " +
                "ой до чего вань размалеваны " +
                "и голос как у алкашей " +
                "а тот похож нет правда вань " +
                "на шурина такая ж пьянь " +
                "ну нет ты глянь нет нет ты глянь " +
                "я вправду вань " +
                "послушай зин не трогай шурина " +
                "какой ни есть а он родня " +
                "сама намазана прокурена " +
                "гляди дождешься у меня ";

	    String[] words = str.split(" ");

        ArrayList<String> list = new ArrayList<>();//список перебрать можно обычныым FOR
        for (int i = 0; i < words.length; i++){
            list.add(words[i]);
        }
        //System.out.println("Получилось " + words.length + " слов в массиве.");
        System.out.println(list);
        System.out.println("Получилось " + list.size() + " слов в листе (с повторами).");
//        for (int i = 0; i< list.size(); i++){
//            System.out.println(list.get(i));
//        }

        LinkedHashSet<String> seti = new LinkedHashSet<>();
        //если правильно понял, чтобы не городить цикл, можно использовать
        //HashSet(Collection<? extends Е> сollection), но как? (сделать Set из List)
        for (int i = 0; i < words.length; i++){
            seti.add(list.get(i));
        }
        System.out.println(seti);
        System.out.println("Получилось " + seti.size() + " слов в сэте (без повторов).");

        LinkedHashMap<String, Integer> map = new LinkedHashMap <> ();
        Iterator<String> iter = seti.iterator();

        //for (int i = 0; i<seti.size(); i++ ){
        while (iter.hasNext()) {
            String st = iter.next();
            count = 0;
            for (int j = 0; j<list.size(); j++){
                if (st.equals(list.get(j))) count++;
            }
            map.put(st, count);
        }
        System.out.println("Повторяются слова:");
        System.out.println(map);




        //2. Написать простой класс PhoneBook(внутри использовать HashMap):
        //    - В качестве ключа использовать фамилию
        //    - В каждой записи всего два поля: phone, e-mail
        //    - Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов),
        //    и отдельный метод для поиска e-mail по фамилии. Следует учесть, что под одной фамилией может быть
        //    несколько записей. Итого должно получиться 3 класса Main, PhoneBook, Person.


    }
}
