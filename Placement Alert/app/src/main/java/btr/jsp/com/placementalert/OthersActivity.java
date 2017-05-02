package btr.jsp.com.placementalert;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OthersActivity extends AppCompatActivity
{
    Button about_cdac,cdac_centers,cdac_course;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        about_cdac=(Button)findViewById(R.id.btn_about_cdac);
        cdac_centers=(Button)findViewById(R.id.btn_cdac_centers);
        cdac_course=(Button)findViewById(R.id.btn_cdac_courses);

        about_cdac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://cdac.in/index.aspx?id=CorporateProfile"));
                startActivity(i);
            }
        });

        cdac_centers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=contact"));
                startActivity(i);
            }
        });

        cdac_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent in5=new Intent(OthersActivity.this,CourseActivity.class);
                startActivity(in5);
            }
        });

    }
}
