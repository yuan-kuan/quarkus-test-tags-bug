package at.itbh;

import io.quarkus.test.junit.TestProfile;
import io.quarkus.test.junit.main.Launch;
import io.quarkus.test.junit.main.LaunchResult;
import io.quarkus.test.junit.main.QuarkusMainTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusMainTest
@TestProfile(MockProfile.ATag.class)
public class BugTest {
    @Test
    @Launch({"person"})
    public void bugTest(LaunchResult result) {
        System.out.println("B tag test run"); 
        Assertions.assertTrue(result.getOutput().contains("Hello person, mocked greeting!"));
    }
}
