package at.itbh;

import io.quarkus.test.junit.TestProfile;
import jakarta.inject.Inject;
import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(MockProfile.BTag.class)
public class NormalTest {
    @Inject
    GreetingService greetingService;
    @Test
    public void testOk() {
      System.out.println("B tag test run");
      
      Assertions.assertEquals("special greeting", greetingService.getSpecialGreet());
    }
}
