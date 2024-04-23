package com.my.roomdbcompose

import androidx.room.Database
import androidx.room.RoomDatabase
import com.my.roomdbcompose.ui.theme.ContactDao


@Database(
    entities = [Contact::class],
    version = 1)
abstract class ContactDataBase:RoomDatabase() {

    abstract val dao:ContactDao

}