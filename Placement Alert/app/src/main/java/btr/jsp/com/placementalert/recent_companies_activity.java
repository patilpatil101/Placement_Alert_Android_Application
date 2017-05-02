package btr.jsp.com.placementalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class recent_companies_activity extends AppCompatActivity {
    ListView recent_comapnies;
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_companies_activity);
        recent_comapnies = (ListView) findViewById(R.id.listView_recent_companies);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        list.add("CDAC R&D");
        list.add("Tech Mahindra");
        list.add("Nokia");
        list.add("Cap gemini");
        recent_comapnies.setAdapter(arrayAdapter);
    }
}
