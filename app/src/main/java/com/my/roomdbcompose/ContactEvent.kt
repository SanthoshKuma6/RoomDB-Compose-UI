package com.my.roomdbcompose

sealed interface  ContactEvent {
    object SaveContact:ContactEvent
    data class setFirstName(val firstName:String):ContactEvent
    data class setLastName(val lastName:String):ContactEvent
    data class setPhoneNumber(val phoneNumber:String):ContactEvent

    object showDialodge:ContactEvent
    object hideDialodge:ContactEvent
    data class SortContact(val sortType:SortType):ContactEvent
    data class DeleteContact(val contact: Contact):ContactEvent
}