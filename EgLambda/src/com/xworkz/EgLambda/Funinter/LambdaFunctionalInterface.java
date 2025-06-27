package com.xworkz.EgLambda.Funinter;

import java.util.Date;
import java.util.function.*;

public class LambdaFunctionalInterface {
    public static void main(String[] args) {
        // 1. Predicate<T>
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println("Predicate: " + isNotEmpty.test("Hello"));

        // 2. BiPredicate<T, U>
        BiPredicate<String, String> startsWith = (s, prefix) -> s.startsWith(prefix);
        System.out.println("BiPredicate: " + startsWith.test("Java", "J"));

        // 3. Consumer<T>
        Consumer<String> print = System.out::println;
        print.accept("Consumer: Hello");

        // 4. BiConsumer<T, U>
        BiConsumer<String, Integer> biConsumer = (product, price) ->
                System.out.println("BiConsumer - Product: " + product + ", Price: " + price);
        biConsumer.accept("Phone", 30000);

        // 5. Supplier<T>
        Supplier<Date> dateSupplier = Date::new;
        System.out.println("Supplier: " + dateSupplier.get());

        // 6. Function<T, R>
        Function<String, Integer> lengthFunction = String::length;
        System.out.println("Function: Length = " + lengthFunction.apply("Lambda"));

        // 7. BiFunction<T, U, R>
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("BiFunction: Sum = " + add.apply(10, 20));

        // 8. UnaryOperator<T>
        UnaryOperator<String> toUpper = String::toUpperCase;
        System.out.println("UnaryOperator: " + toUpper.apply("hello"));

        // 9. BinaryOperator<T>
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("BinaryOperator: Product = " + multiply.apply(5, 4));

        // 10. BooleanSupplier
        BooleanSupplier boolSupplier = () -> 5 > 2;
        System.out.println("BooleanSupplier: " + boolSupplier.getAsBoolean());

        // 11. IntSupplier
        IntSupplier intSupplier = () -> 100;
        System.out.println("IntSupplier: " + intSupplier.getAsInt());

        // 12. LongSupplier
        LongSupplier longSupplier = () -> 999999999L;
        System.out.println("LongSupplier: " + longSupplier.getAsLong());

        // 13. DoubleSupplier
        DoubleSupplier doubleSupplier = () -> Math.PI;
        System.out.println("DoubleSupplier: " + doubleSupplier.getAsDouble());

        // 14. IntConsumer
        IntConsumer intConsumer = i -> System.out.println("IntConsumer: " + i);
        intConsumer.accept(10);

        // 15. LongConsumer
        LongConsumer longConsumer = l -> System.out.println("LongConsumer: " + l);
        longConsumer.accept(100000L);

        // 16. DoubleConsumer
        DoubleConsumer doubleConsumer = d -> System.out.println("DoubleConsumer: " + d);
        doubleConsumer.accept(12.34);

        // 17. ObjIntConsumer<T>
        ObjIntConsumer<String> objIntConsumer = (s, i) -> System.out.println(s + ": " + i);
        objIntConsumer.accept("Quantity", 5);

        // 18. ObjLongConsumer<T>
        ObjLongConsumer<String> objLongConsumer = (s, l) -> System.out.println(s + ": " + l);
        objLongConsumer.accept("File Size", 1024L);

        // 19. ObjDoubleConsumer<T>
        ObjDoubleConsumer<String> objDoubleConsumer = (s, d) -> System.out.println(s + ": " + d);
        objDoubleConsumer.accept("Price", 49.99);

        // 20. IntFunction<R>
        IntFunction<String> intToString = i -> "Number: " + i;
        System.out.println("IntFunction: " + intToString.apply(42));

        // 21. LongFunction<R>
        LongFunction<String> longToString = l -> "Long: " + l;
        System.out.println("LongFunction: " + longToString.apply(999999999L));

        // 22. DoubleFunction<R>
        DoubleFunction<String> doubleToString = d -> "Double: " + d;
        System.out.println("DoubleFunction: " + doubleToString.apply(3.14));

        // 23. ToIntFunction<T>
        ToIntFunction<String> stringToInt = String::length;
        System.out.println("ToIntFunction: " + stringToInt.applyAsInt("length"));

        // 24. ToLongFunction<T>
        ToLongFunction<String> stringToLong = s -> s.length() * 1000L;
        System.out.println("ToLongFunction: " + stringToLong.applyAsLong("long"));

        // 25. ToDoubleFunction<T>
        ToDoubleFunction<String> stringToDouble = s -> s.length() * 1.5;
        System.out.println("ToDoubleFunction: " + stringToDouble.applyAsDouble("double"));

        // 26. ToIntBiFunction<T, U>
        ToIntBiFunction<String, String> compareLength = (a, b) -> a.length() + b.length();
        System.out.println("ToIntBiFunction: " + compareLength.applyAsInt("Java", "Lambda"));

        // 27. ToLongBiFunction<T, U>
        ToLongBiFunction<String, String> lengthTimes = (a, b) -> (a.length() + b.length()) * 1000L;
        System.out.println("ToLongBiFunction: " + lengthTimes.applyAsLong("Hi", "There"));

        // 28. ToDoubleBiFunction<T, U>
        ToDoubleBiFunction<String, String> avgLength = (a, b) -> (a.length() + b.length()) / 2.0;
        System.out.println("ToDoubleBiFunction: " + avgLength.applyAsDouble("Hello", "World"));

        // 29. IntUnaryOperator
        IntUnaryOperator square = x -> x * x;
        System.out.println("IntUnaryOperator: " + square.applyAsInt(6));

        // 30. LongUnaryOperator
        LongUnaryOperator longSquare = x -> x * x;
        System.out.println("LongUnaryOperator: " + longSquare.applyAsLong(8));

        // 31. DoubleUnaryOperator
        DoubleUnaryOperator half = x -> x / 2;
        System.out.println("DoubleUnaryOperator: " + half.applyAsDouble(100.0));

        // 32. IntBinaryOperator
        IntBinaryOperator addInts = (a, b) -> a + b;
        System.out.println("IntBinaryOperator: " + addInts.applyAsInt(10, 15));

        // 33. LongBinaryOperator
        LongBinaryOperator addLongs = (a, b) -> a + b;
        System.out.println("LongBinaryOperator: " + addLongs.applyAsLong(100L, 200L));

        // 34. DoubleBinaryOperator
        DoubleBinaryOperator multiplyDoubles = (a, b) -> a * b;
        System.out.println("DoubleBinaryOperator: " + multiplyDoubles.applyAsDouble(1.5, 2.0));

        // 35. IntPredicate
        IntPredicate isEven = x -> x % 2 == 0;
        System.out.println("IntPredicate: " + isEven.test(4));

        // 36. LongPredicate
        LongPredicate isBig = l -> l > 1_000_000;
        System.out.println("LongPredicate: " + isBig.test(2_000_000L));

        // 37. DoublePredicate
        DoublePredicate isPositive = d -> d > 0.0;
        System.out.println("DoublePredicate: " + isPositive.test(3.14));

        // 38. IntToLongFunction
        IntToLongFunction intToLong = i -> i * 1000L;
        System.out.println("IntToLongFunction: " + intToLong.applyAsLong(7));

        // 39. IntToDoubleFunction
        IntToDoubleFunction intToDouble = i -> i * 1.1;
        System.out.println("IntToDoubleFunction: " + intToDouble.applyAsDouble(10));

        // 40. LongToIntFunction
        LongToIntFunction longToInt = l -> (int) (l / 1000);
        System.out.println("LongToIntFunction: " + longToInt.applyAsInt(3000L));

        // 41. LongToDoubleFunction
        LongToDoubleFunction longToDouble = l -> l * 0.5;
        System.out.println("LongToDoubleFunction: " + longToDouble.applyAsDouble(1000L));

        // 42. DoubleToIntFunction
        DoubleToIntFunction doubleToInt = d -> (int) d;
        System.out.println("DoubleToIntFunction: " + doubleToInt.applyAsInt(9.99));

        // 43. DoubleToLongFunction
        DoubleToLongFunction doubleToLong = d -> (long) d;
        System.out.println("DoubleToLongFunction: " + doubleToLong.applyAsLong(5.75));
    }
}
