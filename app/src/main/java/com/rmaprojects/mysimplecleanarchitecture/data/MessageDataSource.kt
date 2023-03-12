package com.rmaprojects.mysimplecleanarchitecture.data

import com.rmaprojects.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name, welcome!")
    }
}