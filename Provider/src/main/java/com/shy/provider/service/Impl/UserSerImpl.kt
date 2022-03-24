package com.shy.provider.service.Impl

import com.shy.provider.service.UserSer
import org.apache.dubbo.config.annotation.DubboService

@DubboService(interfaceClass = UserSer::class, timeout = 15000)
class UserSerImpl : UserSer {
    override fun S(id: Int): String {
        return "kotlin"
        TODO("Not yet implemented")
    }
}