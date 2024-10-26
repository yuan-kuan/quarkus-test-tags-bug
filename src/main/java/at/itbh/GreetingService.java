package at.itbh;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
class GreetingService {
  
  String getSpecialGreet() {
    return "special greeting";
  }
}
