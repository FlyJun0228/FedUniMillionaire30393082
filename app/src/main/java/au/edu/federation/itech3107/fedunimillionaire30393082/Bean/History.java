package au.edu.federation.itech3107.fedunimillionaire30393082.Bean;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class History {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int Id;
    @ColumnInfo(name = "name")
    private String time;
    @ColumnInfo(name = "bonus")
    private int bonus;

    public History(String time,int bonus){
        this.time = time;
        this.bonus = bonus;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBonus() {
        return bonus;
    }

    public String getTime() {
        return time;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
