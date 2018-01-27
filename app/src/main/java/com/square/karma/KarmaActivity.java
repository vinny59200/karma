package com.square.karma;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class KarmaActivity extends AppCompatActivity {


    Button btnCourtesyMinus, btnCourtesyPlus,
            btnCourageMinus, btnCouragePlus,
            btnHonestyMinus, btnHonestyPlus,
            btnHonorMinus, btnHonorPlus,
            btnModestyMinus, btnModestyPlus,
            btnRespectMinus, btnRespectPlus,
            btnSelfControlMinus, btnSelfControlPlus,
            btnFriendshipMinus, btnFriendshipPlus;
    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karma);
        final DBHelper dbH= new DBHelper(this);

        score=(TextView) findViewById(R.id.score);
        score.setText(dbH.getKarma());

        btnCourtesyMinus=(Button)findViewById(R.id.btnCourtesyMinus);
        btnCourtesyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue-1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnCourtesyPlus=(Button)findViewById(R.id.btnCourtesyPlus);
        btnCourtesyPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue+1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnCourageMinus=(Button)findViewById(R.id.btnCourageMinus);
        btnCourageMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue-1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnCouragePlus=(Button)findViewById(R.id.btnCouragePlus);
        btnCouragePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue+1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnHonestyMinus=(Button)findViewById(R.id.btnHonestyMinus);
        btnHonestyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue-1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnHonestyPlus=(Button)findViewById(R.id.btnHonestyPlus);
        btnHonestyPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue+1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnHonorMinus=(Button)findViewById(R.id.btnHonorMinus);
        btnHonorMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue-1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnHonorPlus=(Button)findViewById(R.id.btnHonorPlus);
        btnHonorPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue+1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnModestyMinus=(Button)findViewById(R.id.btnModestyMinus);
        btnModestyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue-1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnModestyPlus=(Button)findViewById(R.id.btnModestyPlus);
        btnModestyPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue+1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnRespectMinus=(Button)findViewById(R.id.btnRespectMinus);
        btnRespectMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue-1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnRespectPlus=(Button)findViewById(R.id.btnRespectPlus);
        btnRespectPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue+1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnSelfControlMinus=(Button)findViewById(R.id.btnSelfControlMinus);
        btnSelfControlMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue-1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnSelfControlPlus=(Button)findViewById(R.id.btnSelfControlPlus);
        btnSelfControlPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue+1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnFriendshipMinus=(Button)findViewById(R.id.btnFriendshipMinus);
        btnFriendshipMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue-1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });
        btnFriendshipPlus=(Button)findViewById(R.id.btnFriendshipPlus);
        btnFriendshipPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreValue=new Integer(score.getText().toString()).intValue();
                scoreValue=scoreValue+1;
                score.setText(String.valueOf(scoreValue));
                dbH.update(scoreValue+"");
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_karma, menu);
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
}
