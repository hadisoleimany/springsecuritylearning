package com.hadi.repository;

import com.hadi.dto.UserDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private JdbcTemplate jdbcTemplate;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void saveUser(UserDto userDto) {

        jdbcTemplate.update("insert into users(username, password, enabled) values (?,?,?);",
                userDto.getUserName(), userDto.getPassword(), true);

        jdbcTemplate.update("insert into authorities(username, authority) values (?,?);",
                userDto.getUserName(),"USER");
    }
}
