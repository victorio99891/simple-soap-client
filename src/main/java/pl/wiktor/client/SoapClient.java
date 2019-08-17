package pl.wiktor.client;

import lombok.extern.slf4j.Slf4j;
import pl.wiktor.first_soap_example.*;

@Slf4j
public class SoapClient {

    public static void main(String[] args) {

        UserServicePortService service = new UserServicePortService();
        UserServicePort port = service.getUserServicePortSoap11();
        GetUserRequest request = new GetUserRequest();
        request.setName("asdasdasd");
        GetUserResponse response = port.getUser(request);
        if (response.getUser() != null) {
            log.info(response.getUser().toString());
        } else {
            log.info(String.format("User %s doesn't exist in database!", request.getName()));
        }


        AddUserRequest addUserRequest = new AddUserRequest();
        User user = new User();
        user.setName("Holender");
        user.setSalary(10000.00);
        user.setEmpId(99);

        addUserRequest.setNewUser(user);

        AddUserResponse response1 = port.addUser(addUserRequest);
        log.info(response1.getInfoMessage());


    }
}
