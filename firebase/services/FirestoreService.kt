package ie.setu.tazq.firebase.services

import ie.setu.tazq.data.model.TaskModel
import kotlinx.coroutines.flow.Flow

typealias Task = TaskModel
typealias Tasks = Flow<List<Task>>

interface FirestoreService {
    suspend fun getAll(email: String): Tasks
    suspend fun get(email: String, taskId: String): Task?
    suspend fun insert(email: String, task: Task)
    suspend fun update(email: String, task: Task)
    suspend fun delete(email: String, taskId: String)
}