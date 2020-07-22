package com.nine.javapoetdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.nine.Person;
import com.nine.lib_javapoet.Bind;
import com.nine.lib_javapoet.HelloAnnotation;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.inject.Inject;

@HelloAnnotation()
@Bind(10)
public class MainActivity extends AppCompatActivity {

    /**
     * 参考资料
     * https://blog.csdn.net/hq942845204/article/details/81185693 Android(Java)代码生成技术--JavaPoet初体验之手动实现依赖注入
     * BUG: https://blog.csdn.net/cpcpcp123/article/details/103871815 AutoService注解无法生成META-INF文件
     * https://blog.csdn.net/qiyei2009/article/details/79947352?utm_source=blogxgwz6 java注解之编译时注解RetentionPolicy.CLASS 基本用法
     * https://blog.csdn.net/u013045971/article/details/53509237  //一小时搞明白注解处理器
     */


    private String demo;
    @Inject
    Person person;

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
                new Family().initFamily();

            }
        });
        tv.setText(str1);

    }

    private void initAn() {
        // 获取类模板
        Class c = MainActivity.class;
        // 获取所有字段
//        for (Field  f : c.getDeclaredFields()) {
//            // 判断这个字段是否有MyField注解
//            if (f.isAnnotationPresent(HelloAnnotation.class)) {
//                HelloAnnotation annotation1 = f.getAnnotation(HelloAnnotation.class);
//                Log.e("HelloAnnotation","字段:[" + f.getName() + "], 描述:[" + annotation1.titleName());
//            }
//        }
    }

}
