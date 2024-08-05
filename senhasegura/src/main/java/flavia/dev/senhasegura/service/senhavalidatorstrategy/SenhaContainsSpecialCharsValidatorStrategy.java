package flavia.dev.senhasegura.service.senhavalidatorstrategy;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class SenhaContainsSpecialCharsValidatorStrategy implements SenhaValidatorStrategy {

    @Override
    public SenhaValidatorResponse isValid(String senha) {
        if (!Pattern.matches(".*\\W.*", senha)) {
            return new SenhaValidatorResponse(false, "A senha deve possuir pelo menos um caractere especial.");
        }

        return new SenhaValidatorResponse(true, null);
    }
}