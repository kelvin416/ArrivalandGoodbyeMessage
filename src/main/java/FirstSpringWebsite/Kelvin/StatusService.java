package FirstSpringWebsite.Kelvin;

import org.springframework.stereotype.Service;

@Service
public class StatusService {

    public String processStatus(boolean arriving) {
        if (arriving) {
            return "springfundamentals/hello";
        } else {
            return "springfundamentals/goodbye";
        }
    }

    public String processSuccess(){
        return "springfundamentals/success";
    }
}
