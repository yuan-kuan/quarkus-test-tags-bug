package at.itbh;

import io.quarkus.test.junit.TestProfile;
import io.quarkus.test.junit.main.Launch;
import io.quarkus.test.junit.main.LaunchResult;
import io.quarkus.test.junit.main.QuarkusMainTest;
import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusMainTest
@TestProfile(MockProfile.ATag.class)
public class BugTest {
    @Test
    @Launch({"tableA"})
    public void bugTest(LaunchResult result) {
        System.out.println("bug test ran");
        Assertions.assertTrue(result.getOutput().contains("Hello tableA,"));
    }
}
