package com.herald.blankapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	EditText mEditTextYikatong; //EditText: һ��ͨ��
	EditText mEditTextPassword; //EditText: ����
	Button mButtonLogin;		//Button: ��½��ť

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		mEditTextYikatong = (EditText)findViewById(R.id.editTextYikatong);
		mEditTextPassword = (EditText)findViewById(R.id.editTextPassword);
		mButtonLogin = (Button)findViewById(R.id.buttonLogin);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	public void OnClickBtnLogin (View v){
		// ���µ�½��ťʱ����Ӧ����
		String numYikatong = mEditTextYikatong.getText().toString();
		String numPassword = mEditTextPassword.getText().toString();
		boolean canLogin = true;
		if ( canLogin ){
			//���ϵ�½����
			//TODO:��ʾ��½�ɹ�
			Toast.makeText(getBaseContext(), "��½�ɹ�...", Toast.LENGTH_SHORT).show();
			//Ȼ��Intent���µ�Activity
			startActivity(new Intent(this, MainActivity.class));
			finish(); //�ս��Լ�
		} else{
			//��Ȼ
			//TODO:��ʾ��½ʧ��
			Toast.makeText(getBaseContext(), "��½ʧ��...", Toast.LENGTH_SHORT).show();
		}
	}

}