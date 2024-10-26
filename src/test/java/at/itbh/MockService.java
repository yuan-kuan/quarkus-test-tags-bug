package at.itbh;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;

@Alternative
@ApplicationScoped
public class MockService extends GreetingService {
    @Override
    String getSpecialGreet() {
        return "mocked greeting";
    }
}
