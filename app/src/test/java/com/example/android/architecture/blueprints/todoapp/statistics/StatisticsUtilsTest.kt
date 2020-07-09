package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import org.hamcrest.Matchers.`is`
import org.junit.Assert.*
import org.junit.Test

// since no runner is specified the system default JUnitRunner is used
class StatisticsUtilsTest {

    // naming convention is subjectUnderTest_actionOrInput_resultState
    @Test
    fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {

        // create an active task
        val tasks = listOf<Task>(Task("title", "desc", isCompleted = false))

        // call your function
        val result = getActiveAndCompletedStats(tasks)

        // check the result using Truth (Google code base)
//        assertEquals(result.completedTasksPercent, 0f)
//        assertEquals(result.activeTasksPercent, 100f)

        // check the result using Hamcrest matcher
        assertThat(result.activeTasksPercent, `is`(100f))
        assertThat(result.completedTasksPercent, `is`(0f))
    }
}