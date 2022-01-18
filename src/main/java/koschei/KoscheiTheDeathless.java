package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {
    @Autowired
    private  Ocean1 ocean1;
    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean1.toString();
    }
}

