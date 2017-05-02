package btr.jsp.com.placementalert;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rohit Patil on 28-07-2016.
 */
public class CustomList_notification extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] company_name;
    private final String[] company_date;

    public CustomList_notification(Activity context, String[] company_name, String[] company_date) {
        super(context,R.layout.notification_list_view,company_name);
        this.context = context;
        this.company_name = company_name;
        this.company_date = company_date;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.notification_list_view, null, true);
        TextView txt_company_name = (TextView) rowView.findViewById(R.id.txt_name);
        TextView txt_date = (TextView) rowView.findViewById(R.id.txt_date);


        txt_company_name.setText(company_name[position]);
        txt_date.setText(company_date[position]);
        return rowView;
    }
}
