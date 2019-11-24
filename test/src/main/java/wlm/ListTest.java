package wlm;


import java.util.ArrayList;

public class ListTest {
    ArrayList<String> list=new ArrayList<>();
   public static void main(String[] args) {
       test1();
   } 

   public static void test1() {
       ArrayList<String> list=new ArrayList<>();
       String[] strings={"111","222","333"};
       for (String s : strings) {
           list.add(s);
           System.out.println(s);
       }
       list.remove(0);
       list.remove(0);
       
       System.out.println(list.get(0));
       for(String s:list){
           System.out.println(s);
       }

    }

    public void test2(){
        System.out.println(list.size());
        list.clear();
        ArrayList<String> lArrayList=new ArrayList<>();
        lArrayList.add("1");
        list=lArrayList;
    }
}