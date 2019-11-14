package com.zt.pos.base

import com.zt.pos.impl.PermissionImpl

interface IPermission {
    val instance: PermissionImpl
        get() = PermissionImpl()

    fun request() {

    }
}