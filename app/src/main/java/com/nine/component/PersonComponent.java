package com.nine.component;


import com.nine.javapoetdemo.Family;
import com.nine.javapoetdemo.MainActivity;
import com.nine.moudle.PersonMoudle;
import com.nine.moudle.PetMoudle;

import dagger.Component;

//第一步 添加@Component
//第二步 添加module
@Component(modules = {PersonMoudle.class, PetMoudle.class})
public interface PersonComponent {
    //第三步  写一个方法 绑定Activity /Fragment
    void inject(Family family);
}
