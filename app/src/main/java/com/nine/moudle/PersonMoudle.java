package com.nine.moudle;


import com.nine.Person;

import dagger.Module;
import dagger.Provides;

// 第一步 添加@Module 注解
// https://developer.android.google.cn/training/dependency-injection/dagger-android#injecting-activities

@Module
public class PersonMoudle {
    //第二步 使用Provider 注解 实例化对象
    @Provides
    Person providerPerson() {
        return new Person();
    }

}
