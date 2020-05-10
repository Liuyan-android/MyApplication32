package cn.edu.sdwu.android02.home.sn170507180102;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);
        Button button=(Button) findViewById(R.id.homework_btn1);
        Button button2=(Button) findViewById(R.id.homework_btn2);
        Button button3=(Button) findViewById(R.id.homework_btn3);



    }


    //作业一跳转
    //作业1 跳转
    public void startmain1(View view){
        //界面跳转
        Intent intent=new Intent(this,ly12Activity2.class);
        startActivity(intent);
    }
    //作业2 跳转
    public void startmain2(View view){
        //界面跳转
        Intent intent=new Intent(this,ly2Activity.class);
        startActivity(intent);
    }
    public void startmain3(View view){
        //界面跳转
        Intent intent=new Intent(this,ly3Activity.class);
        startActivity(intent);
    }

}


