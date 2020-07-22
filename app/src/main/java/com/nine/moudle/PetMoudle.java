package com.nine.moudle;


import com.nine.Person;
import com.nine.Pet;

import dagger.Module;
import dagger.Provides;

//第一步 添加@Module 注解
@Module
public class PetMoudle {
    //第二步 使用Provider 注解 实例化对象
    @Provides
    Pet providerPerson() {
        return new Pet();
    }
}
