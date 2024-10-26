package at.itbh;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "greeting", mixinStandardHelpOptions = true)
public class GreetingCommand implements Runnable {

    @Inject
    GreetingService greetingService;

    @Parameters(paramLabel = "<name>", defaultValue = "picocli",
        description = "Your name.")
    String name;

    @Override
    public void run() {
        System.out.printf("Hello %s, %s!\n", name, greetingService.getSpecialGreet());
    }

}
