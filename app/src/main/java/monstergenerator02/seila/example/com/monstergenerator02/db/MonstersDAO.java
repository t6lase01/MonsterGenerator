package monstergenerator02.seila.example.com.monstergenerator02.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import monstergenerator02.seila.example.com.monstergenerator02.models.Monster;

@Dao
public interface MonstersDAO {

    @Insert
    public void insert(Monster... Monsters);

    @Update
    public void update(Monster... Monsters);

    @Delete
    public void delete(Monster... Monster);

    @Query("SELECT * FROM Monster")
    public List<Monster> getMonsters();

    @Query("SELECT * FROM Monster WHERE id = :number")
    public Monster getMonsterWithId(int number);
}
