package com.nine.lib_dagger.moudle;

import com.nine.lib_dagger.Person;

import dagger.Module;
import dagger.Provides;

//第一步 添加@Module 注解
public class PersonMoudle {
    //第二步 使用Provider 注解 实例化对象
    Person providerPerson() {
        return new Person();
    }
}
