package com.maxnerva.aaplication.interf;

import com.maxnerva.aaplication.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignClientFallbackFactory implements FallbackFactory<UserFeginClient>
{
    @Override
    public UserFeginClient create(Throwable casuse) {
        return new UserFeginClient() {
            @Override
            public User findById(long id) {
                User user = new User();
                if (casuse instanceof  IllegalArgumentException)
                {
                    user.setId(-1);
                    user.setUsername("default");
                }
                else
                {
                    user.setId(-2);
                    user.setUsername("default");
                }
                return user;
            }
        };
    }
}
