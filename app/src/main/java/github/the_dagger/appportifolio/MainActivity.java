package github.the_dagger.appportifolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hey There!", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void streamer(View view){
        Toast.makeText(this, "Launching the Spotify Streamer App", Toast.LENGTH_SHORT).show();
    }
    public void score(View view){
        Toast.makeText(this,"Launching the Scores App",Toast.LENGTH_SHORT).show();
    }
    public void library(View view){
        Toast.makeText(this,"Launching the Library App",Toast.LENGTH_SHORT).show();
    }
    public void bigger(View view){
        Toast.makeText(this,"Launching the Build It Bigger App",Toast.LENGTH_SHORT).show();
    }
    public void xyz(View view){
        Toast.makeText(this,"Launching the XYZ Reader App",Toast.LENGTH_SHORT).show();
    }
    public void capstone(View view){
        Toast.makeText(this,"Launching the Capstone App",Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
