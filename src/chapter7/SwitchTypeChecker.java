package chapter7;

/**
 * Created by hadeslee on 2016-12-21.
 */
public class SwitchTypeChecker {
    public static Class varTypeClass(Object o) { return o.getClass(); };
    public static Class varTypeClass(Enum e) { return e.getClass().getSuperclass(); };
    public static Class varTypeClass(char c) { return char.class; };
    public static Class varTypeClass(byte b) { return byte.class; };
    public static Class varTypeClass(short s) { return short.class; };
    public static Class varTypeClass(int i) { return int.class; };
    public static Class varTypeClass(long l) { return long.class; };
    public static Class varTypeClass(float f) { return float.class; };
    public static Class varTypeClass(double d) { return double.class; };
    public static Class varTypeClass(boolean d) { return boolean.class; };
}
