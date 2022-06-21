package me.xjliao.xjlib.annotation

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * @author lxj990@gmail.com
 */
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
annotation class Progress(
    val isDeployAble: Boolean = true,
    val isDialogAble: Boolean = true,
    val beforeProgressMsg: String = "即将处理",
    val progressMsg: String = "处理中...",
    val afterProgressMsg: String = "处理完毕",
    val errorProgressMsg: String = "处理错误"
)
