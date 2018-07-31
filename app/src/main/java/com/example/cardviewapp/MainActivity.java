package com.example.cardviewapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.DialogFragment;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    static String aboutApp = "Predicts the growth in GDP for the G20 nations " +
                             "over the next two years. View important factors of GDP growth. " +
                             "Created by Mayank Kumar.";
    static String usage = "Click on a country's card to view the data. " +
                          "Click the map button to view the G20 nations on a map.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, G20Map.class);
                startActivity(intent);
            }
        });

        CardView usa = findViewById(R.id.cardView);
        usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "USA");
                startActivity(intent);

            }
        });

        CardView china = findViewById(R.id.cardView2);
        china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "CHN");
                startActivity(intent);

            }
        });

        CardView japan = findViewById(R.id.cardView3);
        japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "JPN");
                startActivity(intent);

            }
        });

        CardView germany = findViewById(R.id.cardView4);
        germany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "DEU");
                startActivity(intent);

            }
        });

        CardView france = findViewById(R.id.cardView5);
        france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "FRA");
                startActivity(intent);

            }
        });

        CardView uk = findViewById(R.id.cardView6);
        uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "GBR");
                startActivity(intent);

            }
        });

        CardView india = findViewById(R.id.cardView7);
        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "IND");
                startActivity(intent);

            }
        });

        CardView brazil = findViewById(R.id.cardView8);
        brazil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "BRA");
                startActivity(intent);

            }
        });

        CardView italy = findViewById(R.id.cardView9);
        italy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "ITA");
                startActivity(intent);

            }
        });

        CardView canada = findViewById(R.id.cardView10);
        canada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "CAN");
                startActivity(intent);

            }
        });

        CardView sk = findViewById(R.id.cardView11);
        sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "KOR");
                startActivity(intent);

            }
        });

        CardView russia = findViewById(R.id.cardView12);
        russia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "RUS");
                startActivity(intent);

            }
        });

        CardView australia = findViewById(R.id.cardView13);
        australia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "AUS");
                startActivity(intent);

            }
        });

        CardView spain = findViewById(R.id.cardView14);
        spain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "ESP");
                startActivity(intent);

            }
        });

        CardView mexico = findViewById(R.id.cardView15);
        mexico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "MEX");
                startActivity(intent);

            }
        });

        CardView indonesia = findViewById(R.id.cardView16);
        indonesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "IDN");
                startActivity(intent);

            }
        });

        CardView turkey = findViewById(R.id.cardView17);
        turkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "TUR");
                startActivity(intent);

            }
        });

        CardView netherlands = findViewById(R.id.cardView18);
        netherlands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "NLD");
                startActivity(intent);

            }
        });

        CardView switzerland = findViewById(R.id.cardView19);
        switzerland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "CHE");
                startActivity(intent);

            }
        });

        CardView saudi = findViewById(R.id.cardView20);
        saudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Web.class);
                intent.putExtra("country", "SAU");
                startActivity(intent);

            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intent = new Intent(MainActivity.this, Web2.class);
            intent.putExtra("page", "G20");
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(MainActivity.this, Web2.class);
            intent.putExtra("page", "growth");
            startActivity(intent);
        } else if (id == R.id.nav_slideshow) {
            DialogFragment dialog = new UsageDialogFragment();
            dialog.show(getSupportFragmentManager(), "UsageDialogFragmentTag");
        } else if (id == R.id.nav_send) {
            DialogFragment dialog = new AboutDialogFragment();
            dialog.show(getSupportFragmentManager(), "AboutDialogFragmentTag");
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public static class AboutDialogFragment extends DialogFragment {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            // Use the Builder class for convenient dialog construction
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("About");
            builder.setMessage(MainActivity.aboutApp);
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // You don't have to do anything here if you just
                    // want it dismissed when clicked
                }
            });

            // Create the AlertDialog object and return it
            return builder.create();
        }
    }

    public static class UsageDialogFragment extends DialogFragment {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            // Use the Builder class for convenient dialog construction
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("Usage");
            builder.setMessage(MainActivity.usage);
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // You don't have to do anything here if you just
                    // want it dismissed when clicked
                }
            });

            // Create the AlertDialog object and return it
            return builder.create();
        }
    }
}
