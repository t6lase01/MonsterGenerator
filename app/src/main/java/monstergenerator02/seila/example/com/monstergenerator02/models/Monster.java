package monstergenerator02.seila.example.com.monstergenerator02.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Monster")
public class Monster {

    public int id;
    @PrimaryKey
    @NonNull
    private String MonsterName;
    private Integer STR;
    private Integer CON;
    private Integer SIZ;
    private Integer POW;
    private Integer DEX;
    private String Move;
    private Integer HP;

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getMonsterName() {
        return MonsterName;
    }

    public void setMonsterName(@NonNull String monsterName) {
        MonsterName = monsterName;
    }

    public Integer getSTR() {
        return STR;
    }

    public void setSTR(Integer STR) {
        this.STR = STR;
    }

    public Integer getCON() {
        return CON;
    }

    public void setCON(Integer CON) {
        this.CON = CON;
    }

    public Integer getSIZ() {
        return SIZ;
    }

    public void setSIZ(Integer SIZ) {
        this.SIZ = SIZ;
    }

    public Integer getPOW() {
        return POW;
    }

    public void setPOW(Integer POW) {
        this.POW = POW;
    }

    public Integer getDEX() {
        return DEX;
    }

    public void setDEX(Integer DEX) {
        this.DEX = DEX;
    }

    public String getMove() {
        return Move;
    }

    public void setMove(String move) {
        Move = move;
    }

    public Integer getHP() {
        return HP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

}
