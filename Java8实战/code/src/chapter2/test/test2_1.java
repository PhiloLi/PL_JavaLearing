package chapter2.test;

import java.util.ArrayList;
import java.util.List;

public class test2_1 {
    public static void prettyPrintApple(List<Apple> inventy, AppleFormat f){
        for(Apple apple: inventy){
            String s = f.accept(apple);
            System.out.println(s);
        }
    }
    public static void main(String[] argv){
        Apple apple = new Apple();
        apple.setWeight(100);
        List inventy = new ArrayList();
        inventy.add(apple);
       test2_1.prettyPrintApple(inventy,new GetWeight());
    }
}
class GetWeight implements AppleFormat{

    @Override
    public String accept(Apple apple) {
        if(apple.getWeight() > 10){
            return "heavy";
        }
        return "light";
    }
}
