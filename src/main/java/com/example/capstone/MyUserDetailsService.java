// package com.example.capstone;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import java.util.Optional;

// @Service
// public class MyUserDetailsService implements UserDetailsService {

//     @Autowired
//     UserRepository userRepository;

//     @Override
//     public UserDetails loadUserByUsername(String NET_ID) throws UsernameNotFoundException {
//         Optional<User> user = userRepository.findByUserName(NET_ID);
       
//         // user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

//         return user.map(MyUserDetails::new).get();
//     }
// }