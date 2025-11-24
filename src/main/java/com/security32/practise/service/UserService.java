package com.security32.practise.service;

// import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.Authentication;
import com.security32.practise.model.Users;
import com.security32.practise.repository.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    @Autowired
    private AuthenticationManager authManager;
    @Autowired
    private JWTService jwtService;
    
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    public Users register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
//	public String verify(User user) {
//                Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
//
//		// TODO Auto-generated method stub
//		// Authentication authentication = 
//        // authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword() ));
//        // authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
//		if(authentication.isAuthenticated())
//            return jwtService.genrateToken(); 
//
//        return "fail";    
//	}
	public String verify(Users user){
        Authentication authentication = authManager.authenticate
        (new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		// TODO Auto-generated method stub
        if (authentication.isAuthenticated()) {
         return jwtService.generateToken()  ;
        } else {
            return "fail";
        }
    
		// return null;
	}
    
}
