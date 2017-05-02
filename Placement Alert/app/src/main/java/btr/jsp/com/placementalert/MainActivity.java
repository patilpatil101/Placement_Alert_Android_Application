package btr.jsp.com.placementalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView img;
    Button btn_stud,btn_oth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.imageView_img1);
        img.setImageResource(R.drawable.download);
        btn_stud=(Button)findViewById(R.id.button_students);
        btn_oth=(Button)findViewById(R.id.button_others);

        btn_stud.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent in=new Intent(MainActivity.this,StudentActivity.class);
                startActivity(in);
            }
        });
        btn_oth.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               Intent in1 = new Intent(MainActivity.this,OthersActivity.class) ;
                startActivity(in1);
            }
        });

    }
}
