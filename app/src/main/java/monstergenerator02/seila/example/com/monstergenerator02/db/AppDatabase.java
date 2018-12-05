package monstergenerator02.seila.example.com.monstergenerator02.db;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import monstergenerator02.seila.example.com.monstergenerator02.models.Monster;

@Database(entities = {Monster.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase{
    public abstract MonstersDAO getMonstersDao();
}



