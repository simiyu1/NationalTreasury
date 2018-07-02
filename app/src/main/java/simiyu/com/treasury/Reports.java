package simiyu.com.treasury;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Reports extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);


        TabHost tabHost =(TabHost)getTabHost();

        // Tab for Sector reports
        TabHost.TabSpec photospec = tabHost.newTabSpec("Sector Reports");
        // setting Title and Icon for the Tab
        photospec.setIndicator("Sector Reports");
        Intent photosIntent = new Intent(this, SectorReports.class);
        photospec.setContent(photosIntent);

        // Tab for Customer Reports
        TabHost.TabSpec songspec = tabHost.newTabSpec("Customer Satisfactory Reports");
        songspec.setIndicator("Customer Satisfactory Reports");
        Intent songsIntent = new Intent(this, CustomerSatisfactoryReports.class);
        songspec.setContent(songsIntent);

        // Adding all TabSpec to TabHost
        tabHost.addTab(photospec);
        tabHost.addTab(songspec);

    }
}
