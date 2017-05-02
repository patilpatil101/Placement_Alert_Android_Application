package btr.jsp.com.placementalert;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class StudentDetails extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
        UpcomingCompanies upcomingCompanies = UpcomingCompanies.newInstance("StudentDetails","UpcomingCompanies");
        fragmentTransaction1.add(R.id.framelayout2,upcomingCompanies);
        fragmentTransaction1.commit();
        FragmentManager fragmentManager1 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction2 = fragmentManager1.beginTransaction();
        RecentCompanies recentCompanies = RecentCompanies.newInstance("StudentDetails","UpcomingCompanies");
        fragmentTransaction2.add(R.id.frameLayout1,recentCompanies);
        fragmentTransaction2.commit();




     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.student_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_alrm)
        {
            Toast.makeText(StudentDetails.this, "Notification Button is pressed!!!!", Toast.LENGTH_SHORT).show();
            Intent in=new Intent(this,notification_activity.class);
            startActivity(in);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();
        if (id == R.id.nav_companies_visited)
        {
            Intent in = new Intent(getApplicationContext(),recent_companies_activity.class);
            startActivity(in);

        } else if (id == R.id.nav_upcoming_companies)
        {
            Intent in = new Intent(getApplicationContext(),upcoming_companies_activity.class);
            startActivity(in);

        } else if (id == R.id.nav_about_cdac)
        {
            Intent in = new Intent(StudentDetails.this,OthersActivity.class);
            startActivity(in);

        } else if (id == R.id.nav_latest_update)
        {
            Intent in=new Intent(this,notification_activity.class);
            startActivity(in);
        }
        else if (id == R.id.logout)
        {
            Intent in=new Intent(this,MainActivity.class);
            startActivity(in);
        }

        // Highlight the selected item has been done by NavigationView
       // item.setChecked(true);
        // Set action bar title
        //setTitle(item.getTitle());
        // Close the navigation drawer
        //drawer.closeDrawers();*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
