package cn.edu.gdmec.android.androiddialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        //创建对话框
        /*AlertDialog dialog=new AlertDialog.Builder ( this ).setTitle ( "Dialog" )
                .setMessage ( "是否确定退出" )//设置提示信息
                .setIcon ( R.mipmap.ic_launcher )//设置图标
                .setPositiveButton ( "确定", null )//设置按钮
                .setNegativeButton ( "取消", null )//设置按钮
                .create ();

        dialog.show ();*/

        //单选对话框
        AlertDialog dialog = new AlertDialog.Builder ( this ).setTitle ( "请选择性别" )
                .setIcon ( R.mipmap.ic_launcher )//设置图标
                .setPositiveButton ( "确定",null )//添加确定按钮
                .setSingleChoiceItems ( new String[]{"男", "女"}, -1, new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                } ).create ();

        dialog.show ();
    }
}
