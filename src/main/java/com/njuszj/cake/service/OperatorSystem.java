package com.njuszj.cake.service;

public interface OperatorSystem {
    /*
    * 返回本机家目录的SSH公钥
    * */
    String getMyPublicKey();
    /*
    * 获取当前主机的资源利用率
    * */
    Float getCurrentResourceUsage();
}
