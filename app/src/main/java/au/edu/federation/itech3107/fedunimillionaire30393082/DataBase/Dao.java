package au.edu.federation.itech3107.fedunimillionaire30393082.DataBase;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import au.edu.federation.itech3107.fedunimillionaire30393082.Bean.History;

@androidx.room.Dao
public interface Dao {
    @Insert
    void InsertHis(History history);
   @Query("select * from History")
    List<History> QueryHis();
    @Query("Delete from History where id =:id")
    void DeleteHis(int id);
}
