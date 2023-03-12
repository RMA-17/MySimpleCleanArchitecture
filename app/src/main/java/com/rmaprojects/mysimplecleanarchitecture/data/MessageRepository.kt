package com.rmaprojects.mysimplecleanarchitecture.data

import com.rmaprojects.mysimplecleanarchitecture.domain.IMessageRepository
import com.rmaprojects.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}