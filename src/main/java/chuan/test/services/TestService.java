package chuan.test.services;

import chuan.test.services.interfaces.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {


    @Override
    public String toLowerCase(String text) {
        return text.toLowerCase();
    }

    @Override
    public String toUpperCase(String text) {
        return text.toUpperCase();
    }
}
