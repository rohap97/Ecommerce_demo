package com.dekucodes.dreamshops.service.user;

import com.dekucodes.dreamshops.dto.UserDto;
import com.dekucodes.dreamshops.model.User;
import com.dekucodes.dreamshops.request.CreateUserRequest;
import com.dekucodes.dreamshops.request.UpdateUserRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UpdateUserRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
