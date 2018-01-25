package cn.edu.gdmec.android.androiddialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jack on 2018/1/25.
 */

public class MyDialog extends Dialog {

    private String dialogMane;
    private TextView tvMsg;
    private Button btnOk;
    private Bundle btnCancel;

    public MyDialog(Context context,String dialogMane){
        super(context);
        this.dialogMane = dialogMane;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate ( savedInstanceState );
        requestWindowFeature ( Window.FEATURE_NO_TITLE );//去标题
        setContentView ( R.layout.my_dialog );

        tvMsg = (TextView) findViewById ( R.id.tv_msg );
        btnOk = (Button) findViewById ( R.id.btn_ok );
        btnCancel = (Button) findViewById ( R.id.btn_cancel );

        //自定义对话框显示的内容
        tvMsg.setText(dialogMane);

        //给按钮设置点击事件
        btnOk.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View v){

            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View v){
                dismiss ();

            }
        });

    }
}
