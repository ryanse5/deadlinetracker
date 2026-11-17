import androidx.room.Dao
import androidx.room.Query
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update


@Dao
interface AssignmentsDao {
    @Insert
    suspend fun insertAssignment(assignment: Assignments)

    @Query("SELECT * FROM assignments")
    suspend fun getAllAssignments(): List<Assignments>

    @Query("SELECT * FROM courses WHERE assignment_id = :assignmentId")
    suspend fun getAssignmentById(assignment: Assignments): Courses?

    @Update
    suspend fun updateAssignment(assignment: Assignments)

    @Delete
    suspend fun deleteAssignment(assignment: Assignments)
}