package com.cb.test.amstest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author: bincao2
 * @date: 2022/1/27 11:18
 * @desc: 描述
 * @updateUser: 更新者
 * @updateDate: 2022/1/27 11:18
 * @updateRemark: 更新说明
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(v ->{
            //执行插桩
            Test test = new Test();
            test.test();
        });
    }
}
