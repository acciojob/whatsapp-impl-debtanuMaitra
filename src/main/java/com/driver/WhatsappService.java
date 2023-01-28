package com.driver;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WhatsappService {
    WhatsappRepository whatsappRepository = new WhatsappRepository();

    public String createUser(String name, String mobile) throws Exception {
        return whatsappRepository.createUser(name, mobile);
    }
    public Group createGroup(List<User> users) {
        return whatsappRepository.createGroup(users);
    }
    public int sendMessageToGroup(Message message, User sender, Group group) throws Exception {
        return whatsappRepository.sendMessageToGroup(message, sender, group);
    }
    public String changeAdmin(User approver, User user, Group group) throws Exception {
        return whatsappRepository.changeAdmin(approver, user, group);
    }
    public int createMessage(String message) {
        return whatsappRepository.createMessage(message);
    }
}
