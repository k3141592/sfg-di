package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Profile({"NL", "default"})
@Service("i18nService")
public class I18NDutchService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo werleld - NL";
    }
}
