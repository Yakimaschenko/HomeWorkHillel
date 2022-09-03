import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        int arrayStatic[] = {3, 5, 8, 11, 16};
        System.out.println(sumCoincidence(arrayStatic, 16));

    }

    public static boolean sumCoincidence(int[] arrayStatic, int num) {
        return sumCoincidence(arrayStatic, num, 0, arrayStatic.length - 1);
    }

    public static boolean sumCoincidence(int[] arr, int num, int first, int second) {
        int summa = arr[first] + arr[second];
        if (summa == num) return true;
        if (second < first && first == second) return false;
        if (first < arr.length - 1 && second != first)
            return sumCoincidence(arr, num, first, second - 1) || sumCoincidence(arr, num, first + 1, second);
        else return false;
    }

}



