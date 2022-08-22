// Pattern 1-> 
// *****
// *****
// *****
// *****
// *****
import java.util.*;

import javax.annotation.processing.SupportedOptions;
public class pattern1 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
