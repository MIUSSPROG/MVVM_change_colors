package com.example.mvvm.utils

typealias ResourceAction<T> = (T) -> Unit

class ResourceActions<T> {

    private val actions = mutableListOf<ResourceAction<T>>()

    var resource: T? = null
        set(newValue) {
            field = newValue
            if (newValue != null){
                actions.forEach { it(newValue) }
            }
        }

    operator fun invoke(action: ResourceAction<T>){
        val resource = this.resource
        if (resource == null){
            actions += action
        }else{
            action(resource)
        }
    }

    fun clear(){
        actions.clear()
    }
}