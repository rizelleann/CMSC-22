package rulethirty;

import java.util.Scanner;

public class Rule30Tester {

    public static void main(String[] args) throws Exception {
    
        System.out.println("Enter size: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
       
        long startTime = System.currentTimeMillis();
        Rule30 ruleThirty = new Rule30(x);
        ruleThirty.run();
        System.out.println("time consumed in ms: " + (System.currentTimeMillis() - startTime));
    }

}
