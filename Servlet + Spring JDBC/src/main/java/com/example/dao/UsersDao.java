/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.models.User;
import java.util.List;


public interface UsersDao extends CrudDao<User>{
    
    List<User> findAllByFirstName(String firstName);

}
