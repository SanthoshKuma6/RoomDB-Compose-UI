package com.my.roomdbcompose.ui.theme

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Index
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import com.my.roomdbcompose.Contact
import java.util.concurrent.Flow

@Dao
interface ContactDao {

    @Upsert
   suspend fun insertContact(contacts: Contact)

    @Delete
    suspend fun deleteContact(contacts: Contact)

    @Query("SELECT * FROM contact ORDER BY firstName ASC")
    suspend fun getContactOrderByFirstName(): kotlinx.coroutines.flow.Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY lastName ASC")
    suspend fun getContactOrderByLastName():kotlinx.coroutines.flow.Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY phoneNumber ASC")
    suspend fun getContactOrderByPhoneNumber():kotlinx.coroutines.flow.Flow<List<Contact>>
}