package com.application.development.Backendproject.controller;

        import com.application.development.Backendproject.dto.LoginRQ;
        import com.application.development.Backendproject.dto.UserDTO;
        import com.application.development.Backendproject.service.UserService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getLoggedUser", method = RequestMethod.POST)
    public ResponseEntity<UserDTO>getLoggedUser(@RequestBody LoginRQ loginRQ){
        UserDTO userDTO = this.userService.getLoggedUser(loginRQ);

        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }


}
