package com.myblog.myblog11;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass1 {
    public static void main(String[] args) {
        //List<String> numbers = Arrays.asList("mike", "adam", "mike", "satllin");
        //List<String> data1 =  numbers.stream().filter(n -> n.startsWith("m")).collect(Collectors.toList());
        // List<String> data2 =  numbers.stream().filter(n -> n.startsWith("mike")).collect(Collectors.toList());
        //List<String> data3 =  numbers.stream().filter(n -> n.endsWith("n")).collect(Collectors.toList());
        //System.out.println(data1);
        //System.out.println(data2);
        //System.out.println(data3);

        // # FUNCTIONAL INTERFACE
        //   Function<Integer,Integer> result = i->i+10;
        // Integer val = result.apply(40);
        //System.out.println(val);

//        List<Integer> data = Arrays.asList(10, 20, 30, 60, 90);
//        List<Integer> newNumbers = data.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(newNumbers);
        // # SORTED NUMBERS
//        List<Integer> data = Arrays.asList(15, 10, 3, 40, 100, 5);
//        List<Integer> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);
        // #DUPLICATES ELEMENTS
//        List<Integer> data = Arrays.asList(15, 3, 100, 3, 40, 100, 60, 40, 5);
//        List<Integer> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);

        // # CONSUMER FUNCTIONAL
//        Consumer<Integer> result = number-> System.out.println(number);
//        result.accept(100);

//        List<String> names = Arrays.asList("mike", "adam", "sam");
//        Consumer<String> val = name-> System.out.println(name);
//        names.forEach(val);
        // # SUPPLIER
//   Supplier<Integer> x = () -> new Random().nextInt(500);
//       Integer y = x.get();
//       System.out.println(y);


List<Login> logins = Arrays.asList(
        new Login("mike","255075"),
        new Login("stallin", "255075"),
        new Login("adam", "255075")
);
     List<LoginDto> dtos =   logins.stream().map(login->mapToDto(login)).collect(Collectors.toList());
     System.out.println(dtos);
    }
   static LoginDto mapToDto(Login login){
        LoginDto dto = new LoginDto();
        dto.setUserName(login.getUserName());
        dto.setPassword(login.getPassword());
        return dto;
    }
}
