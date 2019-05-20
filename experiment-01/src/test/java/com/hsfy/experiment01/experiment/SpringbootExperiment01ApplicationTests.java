package com.hsfy.experiment01.experiment;

import com.hsfy.experiment01.experiment.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootExperiment01ApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void addAddressTest() {
       userRepository.addUserAddress();
    }
}