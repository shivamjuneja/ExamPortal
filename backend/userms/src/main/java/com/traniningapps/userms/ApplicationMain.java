package com.traniningapps.userms;


import com.traniningapps.userms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationMain implements CommandLineRunner {
    @Autowired
    private UserService userService;
    public static void main(String args[]){
        SpringApplication.run(ApplicationMain.class,args);
//        FrontEnd frontEnd=context.getBean(FrontEnd.class);
//        frontEnd.runUI();
    }
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:4200")
//                .allowedHeaders("*")
//                .allowedMethods("*")
//                .exposedHeaders(HttpHeaders.SET_COOKIE);
//    }
    @Override
    public void run(String... args) throws Exception {
//        User user=new User();
//        user.setFirstName("Shivam");
//        user.setLastName("Juneja");
//        user.setUsername("shivamjuneja");
//        user.setPassword("Shivam@12");
//        user.setEmail("ShivamJuneja22081998@gail.com");
//        user.setPhone("9870971089");
//
//        Role role=new Role();
//
//        role.setRoleId(44L);
//        role.setRoleName("admin");
//        Set<UserRole> userRoles=new HashSet<>();
//
//        UserRole userRole=new UserRole();
//        userRole.setRole(role);
//        userRole.setUser(user);
//
//        userRoles.add(userRole);
//
//        User local=userService.createUser(user,userRoles);
//        System.out.println(local.getUsername());



    }
}
