package chapter4.recipe_04_04;

/**
 * Created by hadeslee on 2016-11-12.
 */
public class recipe04_04 {
    public static void main(String[] args) {
        Float float1 = new Float("9.675");
        Float float2 = new Float("7.3826");
        Float float3 = new Float("23467.373");

        System.out.println(float1.compareTo(float3)); //result : -1
        System.out.println(float2.compareTo(float3)); //result : -1
        System.out.println(float1.compareTo(float1)); //result : 0
        System.out.println(float3.compareTo(float2)); //result : 1
    }
}
