import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "courses")
data class Courses (
    @PrimaryKey
    @ColumnInfo(name = "course_id") var id: Int,
    @ColumnInfo(name = "user_id") var userId: Int,
    @ColumnInfo(name = "course_name") var courseName: String,
    @ColumnInfo(name = "course_code") var courseCode: String
)