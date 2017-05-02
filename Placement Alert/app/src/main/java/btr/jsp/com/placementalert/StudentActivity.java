package btr.jsp.com.placementalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity
{
    EditText edprn,edpwd;
    Button btn_login,btn_cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        edprn=(EditText)findViewById(R.id.editText_prn);
        edpwd=(EditText)findViewById(R.id.editText_pwd);
        btn_cancel=(Button)findViewById(R.id.button_cancel);
        btn_login=(Button)findViewById(R.id.button_login);

        btn_login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String prn=edprn.getText().toString();
                String pwd1=edpwd.getText().toString();


                if (prn.length()!=0 && pwd1.length()!=0) {
                if (prn.length()==12 && pwd1.length()==12) {
                    String str1 = prn.substring(4, 7);

                    if (str1.equals("501") || str1.equals("519")) {
                        Intent in = new Intent(StudentActivity.this, StudentDetails.class);
                        startActivity(in);
                    } else {
                        Toast.makeText(StudentActivity.this, "Invalid PRN NO", Toast.LENGTH_SHORT).show();
                        Toast.makeText(StudentActivity.this, "Or Password", Toast.LENGTH_SHORT).show();
                    }
                }
                    else
                {
                    Toast.makeText(StudentActivity.this, "Invalid PRN NO", Toast.LENGTH_SHORT).show();
                    Toast.makeText(StudentActivity.this, "Or Password", Toast.LENGTH_SHORT).show();
                }
                }

                else if (prn.length()==0 && pwd1.length()!=0)
                {
                    edprn.setError("Enter PRN Number");
                }

                else if (prn.length()!=0 && pwd1.length()==0)
                {
                    edpwd.setError("Enter Password");
                }

                else
                {
                    edprn.setError("Enter PRN Number");
                    edpwd.setError("Enter Password");
                }
            }

        });
        btn_cancel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });






    }
}
