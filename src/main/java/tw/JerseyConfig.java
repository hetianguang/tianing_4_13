package tw;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by tghe on 4/13/17.
 */

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("tw");
    }
}