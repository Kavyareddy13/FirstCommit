package Grouping;

import org.testng.annotations.Test;

public class Functional {
    
    @Test(priority=1, groups="{sanity,regression}")
    void both1() {
        System.out.println("both sanity & regression 1");
    }
    
    @Test(priority=2, groups="{sanity,regression}")
    void both2() {
        System.out.println("both sanity & regression 2");
    }
}
