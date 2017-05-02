package btr.jsp.com.placementalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class notification_activity extends AppCompatActivity {
    ListView listView;
    String[] company_name = {
            "CDAC R & D"
    } ;

    String[] company_date = {
            "02 AUG 2016"
    } ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_activity);

        CustomList_notification adapter = new
                CustomList_notification(notification_activity.this, company_name, company_date);
        listView=(ListView)findViewById(R.id.listView_notification);
        listView.setAdapter(adapter);
    }
}
