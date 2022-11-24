package au.edu.federation.itech3107.fedunimillionaire30393082.DataBase;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import au.edu.federation.itech3107.fedunimillionaire30393082.Bean.History;

@Database(entities = {History.class},version = 1,exportSchema = false)
public abstract class HisDataBase extends RoomDatabase {
    private static HisDataBase hisDataBase;
    @NonNull
    public static HisDataBase getDataBase(Context context){
        if (hisDataBase == null){
            hisDataBase = Room.databaseBuilder(context,HisDataBase.class,"History")
                    .allowMainThreadQueries()
                    .build();
        }
        return hisDataBase;
    }
    public abstract Dao getDao();
}
