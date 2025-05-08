package com.example.demo.domain.repository;

import com.example.demo.domain.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void t1() throws Exception{
        // INSERT
//        User user =
//                User.builder()
//                        .username("dong")
//                        .password("1234")
//                        .role("")
//                        .build();
////                userRepository.save(user);
//
//        // UPDATE
//        user.setPassword("12345");
//        user.setRole("4");
//        userRepository.save(user);

        // DELETE
//        userRepository.deleteById("dong");
    }
    @Test
    public void t2() throws Exception{
//        List<User> list = userRepository.selectByRole("ROLE_USER");
//        list.stream().forEach(System.out::println);

//        List<User> list = userRepository.selectByRoleAndPassword("ROLE_USER","1234");
//        list.stream().forEach(System.out::println);

//        List<User> list = userRepository.selectByPassword("1234");
//        list.stream().forEach(System.out::println);

        List<User> list = userRepository.selectAllLikeUsername("a");
        list.stream().forEach(System.out::println);
    }


}