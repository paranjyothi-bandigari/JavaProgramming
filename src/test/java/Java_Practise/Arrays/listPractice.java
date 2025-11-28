package Java_Practise.Arrays;

import java.util.*;

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

//Find 2nd max
List<Integer> num= Arrays.asList(2,3,4,5,3,4,5,7);
int fmax=Integer.MIN_VALUE;
int smax=Integer.MIN_VALUE;
for(int numb:num){
    if(numb>fmax){
        fmax=numb;
    }else
        continue;

} System.out.println(fmax);
        for(int numb:num){
            if(numb>smax && numb!=fmax){
                smax=numb;
            }else
                continue;

        }System.out.println(smax);

        List<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        Set<Integer> set = new LinkedHashSet<>(listWithDuplicates);
        List<Integer> listWithoutDuplicates = new ArrayList<>(set);
        System.out.println(set+" list with duplicates");
        System.out.println(listWithoutDuplicates+ " list without Duplicates");
    }
}
