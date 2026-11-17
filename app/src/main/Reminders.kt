import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "reminders")
data class Reminders (
    @PrimaryKey @ColumnInfo(name = "reminder_id") var reminderId: Int,
    @ColumnInfo(name = "assignment_id") var assignmentId: Int,
    @ColumnInfo(name = "reminder_date_time") var reminderDateTime: Date,
    @ColumnInfo(name = "is_sent") var isSent: String,

)