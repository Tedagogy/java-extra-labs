package C2_Java.L1_Reflection_Class;

import org.junit.Assert;
import org.junit.Test;

public class ClassReflectionTest {
    ClassReflection cr = new ClassReflection();
    @Test
    public void getClassTest1(){
        Class cl = cr.getMyClass();
        Assert.assertEquals(cl, ClassReflection.class);
    }
}
