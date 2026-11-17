import androidx.room.Dao
import androidx.room.Query
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update


@Dao
interface StudentsDao {
    @Insert
    suspend fun insertStudent(student: Student)

    @Query("SELECT * FROM students")
    suspend fun getAllStudents(): List<Student>

    @Query("SELECT * FROM students WHERE student_id = :studentId")
    suspend fun getStudentById(studentId: Int): Student?

    @Update
    suspend fun updateStudent(student: Student)

    @Delete
    suspend fun deleteStudent(student: Student)
}