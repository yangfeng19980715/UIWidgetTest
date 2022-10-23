package com.example.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

/** 使用匿名类的方式注册监听器 **/
/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("hello, onClick");
            }

        });

    }
}
*/

/** 使用实现接口的方式注册监听器 **/
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    static int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_1);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_1:
                /*
                String input_text = editText.getText().toString();
                Toast.makeText(MainActivity.this, input_text, Toast.LENGTH_SHORT).show();
                System.out.println("hello, onClick");
                 */

                /*
                i++;
                if (i % 2 == 0)
                    imageView.setImageResource(R.drawable.img_2);
                else
                    imageView.setImageResource(R.drawable.img_1);
                 */

                /*
                if (progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                }
                else {
                    progressBar.setVisibility(View.GONE);
                }
                */

                /*
                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);
                 */

                /*
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);  // 创建

                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important."); // 设置内容
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {  // 确定按钮的点击事件
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                dialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {  // 取消按钮的点击事件
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                 */

                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);

                progressDialog.setTitle("This is a ProgressDialog");
                progressDialog.setMessage("loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();


                break;

            default:
                break;

        }


    }

}



















