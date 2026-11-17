import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase

@Database(entities= [Student::class, Courses::class, Reminders::class, Assignments::class], version = 1)
abstract class TrackerDatabase: RoomDatabase() {

    abstract fun assignmentsDao(): AssignmentsDao
    abstract fun coursesDao(): CoursesDao
    abstract fun studentsDao(): StudentsDao
    abstract fun remindersDao(): Reminders

    companion object{
        @Volatile

        private var INSTANCE: TrackerDatabase? = null

        fun getDatabase(context: Context): TrackerDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = databaseBuilder(
                    context.applicationContext,
                    TrackerDatabase::class.java,
                    "tracker_database"
                ).build()
                INSTANCE = instance
                instance
            }

        }
    }
}