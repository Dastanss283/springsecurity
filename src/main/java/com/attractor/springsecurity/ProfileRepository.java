package com.attractor.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfileRepository {

    private List<Profile> profileList = new ArrayList<>();

    @Autowired
    private UserRepository repo;

    public ProfileRepository() {
        profileList.add(new Profile(1, "Name1 Surname1", LocalDate.of(1990,1,1), false));
        profileList.add(new Profile(2, "Name2 Surname2", LocalDate.of(1991,2,2), true));
        profileList.add(new Profile(3, "Name3 Surname3", LocalDate.of(1992,3,3), false));
        profileList.add(new Profile(4, "Name4 Surname4", LocalDate.of(1993,4,4), true));
        profileList.add(new Profile(5, "Name5 Surname5", LocalDate.of(1994,5,5), false));
        profileList.add(new Profile(6, "Name6 Surname6", LocalDate.of(1995,6,6), true));

        //repo.save(new User(1, "admin", "test123"));
        //repo.save(new User(2, "user1", "123user"));
        //repo.save(new User(3, "guest", "guest2"));
    }

    public Profile getProfileById(int id) {
        return profileList.stream().filter(p -> p.getId() == id).findFirst().get();
    }
}
