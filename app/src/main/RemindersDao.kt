import androidx.room.Dao
import androidx.room.Query
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update


@Dao
interface RemindersDao {
    @Insert
    suspend fun insertReminder(reminder: Reminders)

    @Query("SELECT * FROM reminders")
    suspend fun getAllReminder(): List<Reminders>

    @Query("SELECT * FROM courses WHERE reminder_id = :reminderId")
    suspend fun getReminderById(reminder: Reminders): Reminders?

    @Update
    suspend fun updateReminder(reminder: Reminders)

    @Delete
    suspend fun deleteReminder(reminder: Reminders)
}