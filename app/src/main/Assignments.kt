import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "assignments")
data class Assignments (
    @PrimaryKey @ColumnInfo(name = "assignment_id") var assignmentId: Int,
    @ColumnInfo(name = "course_id") var courseId: Int,
    @ColumnInfo(name = "title") var title: String,
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "due_date") var dueDate: Date,
    @ColumnInfo(name = "priority") var priority: String,
    @ColumnInfo(name = "status") var status: String
)