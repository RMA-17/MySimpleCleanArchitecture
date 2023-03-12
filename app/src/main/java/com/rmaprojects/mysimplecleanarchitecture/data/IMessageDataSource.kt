package com.rmaprojects.mysimplecleanarchitecture.data

import com.rmaprojects.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}