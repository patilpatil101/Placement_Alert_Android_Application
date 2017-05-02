package btr.jsp.com.placementalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UpcomingCompanies_description extends AppCompatActivity {
    TextView company_name,about_company, eligibility_criteria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_companies_description);
        company_name=(TextView)findViewById(R.id.tv_company_name);
        about_company=(TextView) findViewById(R.id.tv_about);
        eligibility_criteria=(TextView) findViewById(R.id.tv_eligibility_criteria);
        Intent in=getIntent();
        if(in.hasExtra("position"))
        {
            int data=in.getIntExtra("position",10);
            if(data==0)
            {
                company_name.setText("Nokia");
                about_company.setText("rehgfhguyhiudw bfjhiusdfui sdfjuge jasudfwge jdhgdfshghfdg gfrtfygasdfuywe sbdfhegwtrewq eruityeurityuierytuiyiuer ehgtyegreyrutg");
                eligibility_criteria.setText("Throught 70%");
            }
            if(data==3)
            {
                company_name.setText("CDAC R & D");
                about_company.setText("rehgfhguyhiudw bfjhiusdfui sdfjuge jasudfwge");
                eligibility_criteria.setText("CDAC - 60%");
            }
        }
    }
}
