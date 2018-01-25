package cn.edu.gdmec.android.androiddialog;

import android.app.ProgressDialog;
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
       /* AlertDialog dialog = new AlertDialog.Builder ( this ).setTitle ( "请选择性别" )
                .setIcon ( R.mipmap.ic_launcher )//设置图标
                .setPositiveButton ( "确定",null )//添加确定按钮
                .setSingleChoiceItems ( new String[]{"男", "女"}, -1, new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                } ).create ();

        dialog.show ();*/


       //创建多选对话框
       /* AlertDialog dialog = new AlertDialog.Builder ( this ).setTitle ( "请添加兴趣爱好" )

                .setIcon ( R.mipmap.ic_launcher )//设置图标
                .setPositiveButton ( "确定",null )//添加确定按钮

                .setMultiChoiceItems ( new String[]{"汽车1","汽车2","汽车3","汽车4",},null,null)
                .create ();

        dialog.show();*/

       //创建进度条对话框
        ProgressDialog prodialog = new ProgressDialog ( this );
        prodialog.setTitle ( "进度条对话框" );
        prodialog.setIcon ( R.mipmap.ic_launcher );
        prodialog.setMessage ( "正在下载，请稍后" );

        prodialog.setProgressStyle ( ProgressDialog.STYLE_HORIZONTAL );
        prodialog.show ();
    }
}
