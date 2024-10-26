package at.itbh;

import io.quarkus.test.junit.QuarkusTestProfile;
import java.util.Collections;
import java.util.Set;

public class MockProfile implements QuarkusTestProfile {
  // @Override
  // public Set<Class<?>> getEnabledAlternatives() {
  // return Collections.singleton(MockVodService.class);
  // }

  public static class NoTags implements QuarkusTestProfile {
    @Override
    public String getConfigProfile() {
      return "test-no-tags";
    }
  }

  public static class ATag implements QuarkusTestProfile {
    @Override
    public String getConfigProfile() {
      return "test-a-tag";
    }

    @Override
    public Set<String> tags() {
      return Set.of("a");
    }
  }
  
  public static class BTag implements QuarkusTestProfile {
    @Override
    public String getConfigProfile() {
      return "test-b-tag";
    }

    @Override
    public Set<String> tags() {
      return Set.of("b");
    }
  }

}