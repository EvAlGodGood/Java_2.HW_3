import java.util.HashMap;

public class PhoneBook {
    HashMap<String, Persons> phoneBook = new HashMap<>();

    public PhoneBook (){
        phoneBook.put("Weagor", new Persons ("swdfotaj@mail.ru", "89340594857"));
        phoneBook.put("Retrer", new Persons ("titutkgk@mail.ru", "89540594857"));
        phoneBook.put("Tyllur", new Persons ("werrefjfaj@mail.ru", "8968584857"));
        phoneBook.put("Retrer", new Persons ("trtyutkgk@mail.ru", "89545294857"));
        phoneBook.put("Tyllur", new Persons ("werfjfaj@mail.ru", "893993284857"));

    }

}


