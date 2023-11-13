package com.application.development.Backendproject.service;

        import com.application.development.Backendproject.Dao.UserDao;
        import com.application.development.Backendproject.dto.LoginRQ;
        import com.application.development.Backendproject.dto.UserDTO;
        import com.application.development.Backendproject.model.User;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserDTO getLoggedUser(LoginRQ loginRQ){

        User user = this.userDao.findByUserNameAndPassword(loginRQ.getUserName(),loginRQ.getPassword());

        UserDTO userDTO = null;
        if (user != null){
            userDTO = new UserDTO(user);
        }

        return userDTO;
    }
}
