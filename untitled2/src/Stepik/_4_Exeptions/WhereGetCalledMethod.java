package Stepik._4_Exeptions;
import java.util.logging.*;
public class WhereGetCalledMethod {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        java.lang.StackTraceElement[] stack = new Throwable().getStackTrace();
        if (stack.length < 3) {
            return null;
        }
        return stack[2].getClassName() + "#" + stack[2].getMethodName();
    }
}