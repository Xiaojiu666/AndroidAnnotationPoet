package com.nine.javapoetdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.nine.lib_javapoet.HelloAnnotation;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {


    @HelloAnnotation(titleName = "demo")
    private String demo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        String str1 = "Aaaaaa";

//        str1 += HelloWorld.hello1() + " ";
//        str1 += HelloWorld.hello2() + " ";
//        str1 += HelloWorld.hello3();
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initAn();
            }
        });
        tv.setText(str1);

    }

    private void initAn() {
        // 获取类模板
        Class c = MainActivity.class;
        // 获取所有字段
        for (Field  f : c.getDeclaredFields()) {
            // 判断这个字段是否有MyField注解
            if (f.isAnnotationPresent(HelloAnnotation.class)) {
                HelloAnnotation annotation1 = f.getAnnotation(HelloAnnotation.class);
                Log.e("HelloAnnotation","字段:[" + f.getName() + "], 描述:[" + annotation1.titleName());
            }
        }
    }

}
