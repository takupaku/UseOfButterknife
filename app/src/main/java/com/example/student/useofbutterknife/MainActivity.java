package com.example.student.useofbutterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.user)
    EditText user;
    @BindView(R.id.txtId)
    TextView txtId;
    @BindView(R.id.logInBtn)
    Button logInBtn;
    @BindView(R.id.SignUpBtn)
    Button SignUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.txtId)
    public void onTxtIdClicked() {
    }

    @OnClick(R.id.logInBtn)
    public void onLogInBtnClicked() {
    }

    @OnClick(R.id.SignUpBtn)
    public void onSignUpBtnClicked() {
    }
}
