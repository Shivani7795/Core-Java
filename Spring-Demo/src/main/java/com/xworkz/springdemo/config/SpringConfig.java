package com.xworkz.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springdemo.component")
public class SpringConfig {
    public SpringConfig(){
        System.out.println("const in SpringConfig");
    }
    @Bean
    public String name(){
        System.out.println("String Name method");
        return "name";
    }
    @Bean
    public String address(){
        System.out.println("String address method");
        return "address";
    }
    @Bean
    public String email(){
        System.out.println("String email method");
        return "email";
    }
    @Bean
    public String contact(){
        System.out.println("String contact method");
        return "contact";
    }
    @Bean
    public String gender(){
        System.out.println("String Name method");
        return "gender";
    }

    @Bean
    public Object pillow() {
        System.out.println("Object pillow method");
        return new Object();
    }
    @Bean
    public Object comb() {
        System.out.println("Object comb method");
        return new Object();
    }
    @Bean
    public Object pen() {
        System.out.println("Object pen method");
        return new Object();
    }
    @Bean
    public Object phone() {
        System.out.println("Object phone method");
        return new Object();
    }
    @Bean
    public Object keyboard() {
        System.out.println("Object keyboard method");
        return new Object();
    }
    @Bean
    public Integer even() {
        System.out.println("Integer even method");
        return 0;
    }

    @Bean
    public Integer odd() {
        System.out.println("Integer odd method");
        return 1;
    }

    @Bean
    public Double rupee() {
        System.out.println("Double rupee method");
        return 1.5;
    }

    @Bean
    public Double kilogram() {
        System.out.println("Double kilogram method");
        return 5.5;
    }

    @Bean
    public Boolean isHoliday() {
        System.out.println("Boolean isHoliday method");
        return true;
    }

    @Bean
    public Boolean isExam() {
        System.out.println("Boolean isExam method");
        return false;
    }

    @Bean
    public Character vowels() {
        System.out.println("Character vowels method");
        return 'a';
    }

    @Bean
    public Character constants() {
        System.out.println("Character constants method");
        return 'b';
    }

    @Bean
    public Long phoneNo() {
        return 987654321L;
    }

    @Bean
    public Long aadharNo() {
        return 25467386647477L;
    }

    @Bean
    public Byte num5() {
        System.out.println("Byte num5 method");
        return 10;
    }
    @Bean
    public Byte num6() {
        System.out.println("Byte num6 method");

        return 20;
    }

    @Bean
    public Short num3() {
        System.out.println("Short num3 method");

        return 100;
    }
    @Bean
    public Short num4() {
        System.out.println("Short num4 method");
        return 200;
    }

    @Bean
    public Float num1() {
        System.out.println("Float num1 method");
        return 1.5f;
    }
    @Bean
    public Float num2() {
        System.out.println("Float num2 method");
        return 2.5f;
    }

    @Bean
    public ArrayList<Character> arrayListChar() {
        System.out.println("Creating arrayListChar");
        return new ArrayList<>(Arrays.asList('A', 'B', 'C'));
    }

    @Bean
    public ArrayList<String> arrayListStr() {
        System.out.println("Creating arrayListStr");
        return new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four"));
    }

    @Bean
    public ArrayList<Integer> arrayListInt() {
        System.out.println("Creating arrayListInt");
        return new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    }

    @Bean
    public ArrayList<String> arrayListStr2() {
        System.out.println("Creating arrayListStr2");
        return new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
    }

    @Bean
    public ArrayList<Boolean> arrayListBool() {
        System.out.println("Creating arrayListBool");
        return new ArrayList<>(Arrays.asList(true, false, true, false));
    }

    @Bean
    public LinkedList<Character> linkedListChar() {
        System.out.println("Creating linkedListChar");
        return new LinkedList<>(Arrays.asList('X', 'Y', 'Z', 'W'));
    }

    @Bean
    public LinkedList<String> linkedListStr() {
        System.out.println("Creating linkedListStr");
        return new LinkedList<>(Arrays.asList("Apple", "Banana", "Orange"));
    }

    @Bean
    public LinkedList<Integer> linkedListInt() {
        System.out.println("Creating linkedListInt");
        return new LinkedList<>(Arrays.asList(10, 20, 30, 40));
    }

    @Bean
    public LinkedList<String> linkedListStr2() {
        System.out.println("Creating linkedListStr2");
        return new LinkedList<>(Arrays.asList("Dog", "Cat", "Horse"));
    }

    @Bean
    public LinkedList<Boolean> linkedListBool() {
        System.out.println("Creating linkedListBool");
        return new LinkedList<>(Arrays.asList(false, false, true, true));
    }

    @Bean
    public HashSet<Character> hashSetChar() {
        System.out.println("Creating hashSetChar");
        return new HashSet<>(Arrays.asList('P', 'Q', 'R', 'S'));
    }

    @Bean
    public HashSet<String> hashSetStr() {
        System.out.println("Creating hashSetStr");
        return new HashSet<>(Arrays.asList("Circle", "Square", "Triangle"));
    }

    @Bean
    public HashSet<Integer> hashSetInt() {
        System.out.println("Creating hashSetInt");
        return new HashSet<>(Arrays.asList(100, 200, 300, 400));
    }

    @Bean
    public HashSet<String> hashSetStr2() {
        System.out.println("Creating hashSetStr2");
        return new HashSet<>(Arrays.asList("Alpha", "Beta", "Gamma"));
    }

    @Bean
    public HashSet<Boolean> hashSetBool() {
        System.out.println("Creating hashSetBool");
        return new HashSet<>(Arrays.asList(true, false));
    }

    @Bean
    public LinkedHashSet<Character> linkedHashSetChar() {
        System.out.println("Creating linkedHashSetChar");
        return new LinkedHashSet<>(Arrays.asList('L', 'M', 'N', 'O'));
    }

    @Bean
    public LinkedHashSet<String> linkedHashSetStr() {
        System.out.println("Creating linkedHashSetStr");
        return new LinkedHashSet<>(Arrays.asList("HTML", "CSS", "JS"));
    }

    @Bean
    public LinkedHashSet<Integer> linkedHashSetInt() {
        System.out.println("Creating linkedHashSetInt");
        return new LinkedHashSet<>(Arrays.asList(11, 22, 33, 44));
    }

    @Bean
    public LinkedHashSet<String> linkedHashSetStr2() {
        System.out.println("Creating linkedHashSetStr2");
        return new LinkedHashSet<>(Arrays.asList("Admin", "User", "Guest"));
    }

    @Bean
    public LinkedHashSet<Boolean> linkedHashSetBool() {
        System.out.println("Creating linkedHashSetBool");
        return new LinkedHashSet<>(Arrays.asList(false, true));
    }

    @Bean
    public TreeSet<Character> treeSetChar() {
        System.out.println("Creating treeSetChar");
        return new TreeSet<>(Arrays.asList('K', 'B', 'D', 'A'));
    }

    @Bean
    public TreeSet<String> treeSetStr() {
        System.out.println("Creating treeSetStr");
        return new TreeSet<>(Arrays.asList("Zebra", "Monkey", "Apple", "Bear"));
    }

    @Bean
    public TreeSet<Integer> treeSetInt() {
        System.out.println("Creating treeSetInt");
        return new TreeSet<>(Arrays.asList(3, 1, 2, 4));
    }

    @Bean
    public TreeSet<String> treeSetStr2() {
        System.out.println("Creating treeSetStr2");
        return new TreeSet<>(Arrays.asList("Linux", "Windows", "Mac", "Ubuntu"));
    }

    @Bean
    public TreeSet<Boolean> treeSetBool() {
        System.out.println("Creating treeSetBool");
        return new TreeSet<>(Arrays.asList(true, false));
    }

    @Bean
    public HashMap<String, Character> hashMapChar() {
        System.out.println("Creating hashMapChar");
        HashMap<String, Character> map = new HashMap<>();
        map.put("grade", 'A');
        map.put("section", 'B');
        return map;
    }

    @Bean
    public HashMap<String, String> hashMapStr() {
        System.out.println("Creating hashMapStr");
        HashMap<String, String> map = new HashMap<>();
        map.put("country", "India");
        map.put("state", "Karnataka");
        return map;
    }

    @Bean
    public HashMap<String, Integer> hashMapInt() {
        System.out.println("Creating hashMapInt");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("year", 2025);
        map.put("month", 7);
        return map;
    }

    @Bean
    public HashMap<String, String> hashMapStr2() {
        System.out.println("Creating hashMapStr2");
        HashMap<String, String> map = new HashMap<>();
        map.put("language", "Java");
        map.put("framework", "Spring");
        return map;
    }

    @Bean
    public HashMap<String, Boolean> hashMapBool() {
        System.out.println("Creating hashMapBool");
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("isLoggedIn", true);
        map.put("isAdmin", false);
        return map;
    }

    @Bean
    public LinkedHashMap<String, Character> linkedHashMapChar() {
        System.out.println("Creating linkedHashMapChar");
        LinkedHashMap<String, Character> map = new LinkedHashMap<>();
        map.put("symbol", '@');
        map.put("currency", '$');
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMapStr() {
        System.out.println("Creating linkedHashMapStr");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("name", "Shivani");
        map.put("city", "Bengaluru");
        return map;
    }

    @Bean
    public LinkedHashMap<String, Integer> linkedHashMapInt() {
        System.out.println("Creating linkedHashMapInt");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("score", 95);
        map.put("level", 2);
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMapStr2() {
        System.out.println("Creating linkedHashMapStr2");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("dept", "CSE");
        map.put("semester", "6th");
        return map;
    }

    @Bean
    public LinkedHashMap<String, Boolean> linkedHashMapBool() {
        System.out.println("Creating linkedHashMapBool");
        LinkedHashMap<String, Boolean> map = new LinkedHashMap<>();
        map.put("active", false);
        map.put("verified", true);
        return map;
    }

    @Bean
    public TreeMap<String, Character> treeMapChar() {
        System.out.println("Creating treeMapChar");
        TreeMap<String, Character> map = new TreeMap<>();
        map.put("initial", 'S');
        map.put("end", 'E');
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMapStr() {
        System.out.println("Creating treeMapStr");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("browser", "Chrome");
        map.put("editor", "VSCode");
        return map;
    }

    @Bean
    public TreeMap<String, Integer> treeMapInt() {
        System.out.println("Creating treeMapInt");
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("rank", 1);
        map.put("attempt", 2);
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMapStr2() {
        System.out.println("Creating treeMapStr2");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("os", "Windows");
        map.put("version", "11");
        return map;
    }

    @Bean
    public TreeMap<String, Boolean> treeMapBool() {
        System.out.println("Creating treeMapBool");
        TreeMap<String, Boolean> map = new TreeMap<>();
        map.put("enabled", true);
        map.put("debug", false);
        return map;
    }

    @Bean
    public Properties propertiesOne() {
        System.out.println("Creating propertiesOne");
        Properties p = new Properties();
        p.setProperty("username", "admin");
        p.setProperty("password", "1234");
        return p;
    }

    @Bean
    public Properties propertiesTwo() {
        System.out.println("Creating propertiesTwo");
        Properties p = new Properties();
        p.setProperty("env", "production");
        p.setProperty("region", "IN");
        return p;
    }

    @Bean
    public Properties propertiesThree() {
        System.out.println("Creating propertiesThree");
        Properties p = new Properties();
        p.setProperty("encoding", "UTF-8");
        p.setProperty("font", "Arial");
        return p;
    }

    @Bean
    public Properties propertiesFour() {
        System.out.println("Creating propertiesFour");
        Properties p = new Properties();
        p.setProperty("theme", "dark");
        p.setProperty("layout", "grid");
        return p;
    }

    @Bean
    public Properties propertiesFive() {
        System.out.println("Creating propertiesFive");
        Properties p = new Properties();
        p.setProperty("timeout", "3000");
        p.setProperty("retry", "2");
        return p;
    }

    @Bean
    public Hashtable<String, Character> hashtableChar() {
        System.out.println("Creating hashtableChar");
        Hashtable<String, Character> table = new Hashtable<>();
        table.put("charKey", 'Z');
        table.put("symbol", '#');
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtableStr() {
        System.out.println("Creating hashtableStr");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("type", "admin");
        table.put("mode", "read-only");
        return table;
    }

    @Bean
    public Hashtable<String, Integer> hashtableInt() {
        System.out.println("Creating hashtableInt");
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("count", 50);
        table.put("limit", 100);
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtableStr2() {
        System.out.println("Creating hashtableStr2");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("msg", "Welcome");
        table.put("status", "Success");
        return table;
    }

    @Bean
    public Hashtable<String, Boolean> hashtableBool() {
        System.out.println("Creating hashtableBool");
        Hashtable<String, Boolean> table = new Hashtable<>();
        table.put("valid", true);
        table.put("logged", false);
        return table;
    }
    @Bean
    public ArrayList<String> arrayListOfNames1() {
        System.out.println("Creating ArrayList of Names 1");
        return new ArrayList<>(Arrays.asList("Ramesh", "Suresh", "Asha", "Deepa"));
    }

    @Bean
    public ArrayList<String> arrayListOfNames2() {
        System.out.println("Creating ArrayList of Names 2");
        return new ArrayList<>(Arrays.asList("Rahul", "Sneha", "Vikram", "Priya"));
    }

    @Bean
    public ArrayList<String> arrayListOfNames3() {
        System.out.println("Creating ArrayList of Names 3");
        return new ArrayList<>(Arrays.asList("John", "David", "Steve"));
    }
    @Bean
    public ArrayList<String> arrayListOfNames4() {
        System.out.println("Creating ArrayList of Names 4");
        return new ArrayList<>(Arrays.asList("Aarav","Sunil", "Geeta", "Ritu"));
    }

    @Bean
    public ArrayList<String> arrayListOfNames5() {
        System.out.println("Creating ArrayList of Names 5");
        return new ArrayList<>(Arrays.asList("Arjun", "Tina", "Harsh", "Rekha"));
    }

}
