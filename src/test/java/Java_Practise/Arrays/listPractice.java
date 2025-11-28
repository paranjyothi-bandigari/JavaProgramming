package Java_Practise.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listPractice {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(12);
        list.add(24);
        list.add(34);

        List<String> aList=new ArrayList<>();
        aList.add("Delhi");
        aList.add("kolkatha");
        aList.add("Pune");
        aList.remove("Pune");
        System.out.println(aList.get(0));
        aList.set(1,"Hyderabad");

        System.out.println(aList.contains("Delhi"));
        System.out.println(list);
        System.out.println(aList);

        cities cty1=new cities();
        cty1.setCityName("Delhi");
        cty1.setCityTemp(45);

        cities cty2=new cities();
        cty2.setCityName("Hyderabad");
        cty2.setCityTemp(40);

        cities cty3=new cities();
        cty3.setCityName("Pune");
        cty3.setCityTemp(43);
List<cities> cityTempName=new ArrayList<>();
        cityTempName.add(cty1);
        cityTempName.add(cty2);
        cityTempName.add(cty3);
        for(int i=0;i<=cityTempName.size()-1;i++){
            System.out.println(cityTempName.get(i).getCityName()+" : "+cityTempName.get(i).getCityTemp());
        }
        System.out.println("##############");
        System.out.println(cityTempName.get(0).getCityName()+" : "+cityTempName.get(0).getCityTemp());
        System.out.println(cityTempName.get(1).getCityName()+" : "+cityTempName.get(1).getCityTemp());
        System.out.println(cityTempName.get(2).getCityName()+" : "+cityTempName.get(2).getCityTemp());




    }
}
