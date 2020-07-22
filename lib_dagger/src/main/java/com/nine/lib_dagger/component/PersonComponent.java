package com.nine.lib_dagger.component;


import com.nine.lib_dagger.moudle.PersonMoudle;

import dagger.Component;

//第一步 添加@Component
//第二步 添加module
public interface PersonComponent {
    //第三步  写一个方法 绑定Activity /Fragment
    void inject();
}
