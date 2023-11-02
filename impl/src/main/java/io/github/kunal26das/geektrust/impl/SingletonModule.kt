package io.github.kunal26das.geektrust.impl

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.kunal26das.geektrust.data.di.DataModule

@Module(
    includes = [
        DataModule::class,
    ]
)
@InstallIn(SingletonComponent::class)
object SingletonModule