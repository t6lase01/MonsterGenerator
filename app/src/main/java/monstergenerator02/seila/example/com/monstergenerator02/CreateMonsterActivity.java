package monstergenerator02.seila.example.com.monstergenerator02;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;

import monstergenerator02.seila.example.com.monstergenerator02.db.AppDatabase;
import monstergenerator02.seila.example.com.monstergenerator02.db.MonstersDAO;

public class CreateMonsterActivity extends AppCompatActivity {

        private Spinner s_Level;
        private Spinner s_Monstertype;
        private NumberPicker np_HowMany;
        private Button b_Create;
        private MonstersDAO mMonstersDAO;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.generator);

            mMonstersDAO = Room.databaseBuilder(this,AppDatabase.class,"db-monsters")
                            .allowMainThreadQueries()
                            .build()
                            .getMonstersDao();

            s_Level = findViewById(R.id.s_Level);
            s_Monstertype = findViewById(R.id.s_MonsterType);
            np_HowMany = (NumberPicker) findViewById(R.id.s_HowMany);
            b_Create = findViewById(R.id.b_Create);

            b_Create.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Level = s_Level.getSelectedItem().toString();
                    String MonsterType = s_Monstertype.getSelectedItem().toString();
                    Integer HowMany = np_HowMany.getValue();

                    //tähän sitä vitun taikuutta sitten


                }
            });
        }
}
