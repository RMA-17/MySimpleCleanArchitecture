package com.rmaprojects.mysimplecleanarchitecture.di

import com.rmaprojects.mysimplecleanarchitecture.data.IMessageDataSource
import com.rmaprojects.mysimplecleanarchitecture.data.MessageDataSource
import com.rmaprojects.mysimplecleanarchitecture.data.MessageRepository
import com.rmaprojects.mysimplecleanarchitecture.domain.IMessageRepository
import com.rmaprojects.mysimplecleanarchitecture.domain.MessageInteractor
import com.rmaprojects.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}