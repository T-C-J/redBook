package com.tcj.red_book.service.impl;

import com.tcj.red_book.entity.domain.Category;
import com.tcj.red_book.entity.domain.Record;
import com.tcj.red_book.entity.domain.User;
import com.tcj.red_book.entity.domain.UserConfig;
import com.tcj.red_book.repository.CategoryRepository;
import com.tcj.red_book.repository.RecordRepository;
import com.tcj.red_book.repository.UserConfigRepository;
import com.tcj.red_book.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private UserConfigRepository userConfigRepository;
    @Autowired
    private RecordRepository recordRepository;


    @Override
    public boolean register(User user) {
        try{
            userConfigRepository.save(UserConfig.defaultUserConfig(user.getId()));
            Category category = categoryRepository.save(Category.defaultCategory(user.getId()));
            recordRepository.save(Record.defaultRecord(user.getId(), category.getId()));
            return true;
        }catch (Exception e){
        }
        return false;
    }
}
