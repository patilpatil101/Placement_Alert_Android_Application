package btr.jsp.com.placementalert;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class CourseActivity extends Activity {
    ListView list_view;
    String[] course_name = {
            "PG Diploma in Advanced Computing",
            "PG Diploma in Mobile Computing",
            "PG Diploma in Embedded System and Design",
            "PG Diploma in VLSI Design",
            "PG Diploma in Big Data Analytics",
            "PG Diploma in Internet of Things",
            "PG Diploma in System Software Development",
            "PG Diploma in IT Infrastructure,System and Security",
            "PG Diploma in Geoinformatics",
            "PG Diploma in Biomedical Instrumentation and HI",
            "PG Diploma in HPC System Administration",
    } ;
    Integer[] imageId = {
            R.drawable.daclogo,
            R.drawable.dmclogo,
            R.drawable.desdlogo,
            R.drawable.vlsilogo,
            R.drawable.dbdalogo,
            R.drawable.diotlogo,
            R.drawable.dssdlogo,
            R.drawable.ditisslogo,
            R.drawable.dgilogo,
            R.drawable.dbihilogo,
            R.drawable.hspcscalogo,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        CustomList adapter = new
                CustomList(CourseActivity.this, course_name, imageId);
        list_view=(ListView)findViewById(R.id.list);
        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position==0)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=DAC&courseid=0"));
                    startActivity(i);
                }
                else if (position==1)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=DMC&courseid=26"));
                    startActivity(i);
                }
                else if (position==2)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=DESD&courseid=22"));
                    startActivity(i);
                }
                else if (position==3)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=DVLSI&courseid=20"));
                    startActivity(i);
                }
                else if (position==4)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=DBDA&courseid=65"));
                    startActivity(i);
                }
                else if (position==5)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=DIoT&courseid=67"));
                    startActivity(i);
                }
                else if (position==6)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=DSSD&courseid=29"));
                    startActivity(i);
                }
                else if (position==7)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=DITISS&courseid=28"));
                    startActivity(i);
                }
                else if (position==8)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=PG-DGI&courseid=21"));
                    startActivity(i);
                }
                else if (position==9)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=DBIHI&courseid=66"));
                    startActivity(i);
                }
                else if (position==10)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cdac.in/index.aspx?id=DHPCSA&courseid=98"));
                    startActivity(i);
                }
            }
        });

    }

}