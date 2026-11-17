import androidx.room.Dao
import androidx.room.Query
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update


@Dao
interface CoursesDao {
    @Insert
    suspend fun insertCourse(course: Courses)

    @Query("SELECT * FROM courses")
    suspend fun getAllCourses(): List<Courses>

    @Query("SELECT * FROM courses WHERE course_id = :courseId")
    suspend fun getStudentById(courseId: Int): Courses?

    @Update
    suspend fun updateStudent(course: Courses)

    @Delete
    suspend fun deleteStudent(course: Courses)
}