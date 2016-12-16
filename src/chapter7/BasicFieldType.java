package chapter7;

/**
 * Project: Java8Recipes
 * FileName: BasicFieldType
 * Date: 2016-12-14
 * Time: 오후 3:42
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class BasicFieldType {
    public enum FieldType {PASSWORD, EMAIL_ADDRESS, PHONE_NUMBER, SOCIAL_SECURITY_NUMBER}

    public static void main(String[] args) {
        FieldType field = FieldType.EMAIL_ADDRESS;
        System.out.println("field.name() : " + field.name());
        System.out.println("field.ordinal() : " + field.ordinal());
        System.out.println("field.toString() : " + field.toString());

        System.out.println("field.isEqual(EMAIL_ADDRESS): " +
                field.equals(FieldType.EMAIL_ADDRESS));
        System.out.println("field.isEqual(\"EMAIL_ADDRESS\"'): " + field.equals("EMAIL_ADDRESS"));

        System.out.println("field == EMAIL_ADDRESS: " + (field == FieldType.EMAIL_ADDRESS));
// Won't compile – illustrates type safety of enum
// System.out.println("field == \”EMAIL_ADDRESS\": " + (field == "EMAIL_ADDRESS"));
    }

}
