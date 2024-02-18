import java.util.*;
class Main{
    public static void main(String[] a){
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] target=new int[nums.length];
        ArrayList al=new ArrayList();
        for(int i=0;i<nums.length;i++){
            al.add(index[i],nums[i]);
        }
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
