package at.itbh;

import io.quarkus.test.junit.TestProfile;
import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(MockProfile.BTag.class)
public class NormalTest {
    @Test
    public void testOk() {
      Assertions.assertTrue(true);
    }
}
