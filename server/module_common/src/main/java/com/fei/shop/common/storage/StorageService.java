package com.fei.common.storage;

import com.fei.shop.entities.po.SysStorage;
import jodd.util.CharUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * 提供存储服务类，所有存储服务均由该类对外提供
 */
public class StorageService {
    private String active;
    private com.fei.common.storage.Storage storage;
    @Autowired
    private com.fei.common.storage.SysStorageService storageService;

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public com.fei.common.storage.Storage getStorage() {
        return storage;
    }

    public void setStorage(com.fei.common.storage.Storage storage) {
        this.storage = storage;
    }

    /**
     * 存储一个文件对象
     *
     * @param inputStream   文件输入流
     * @param contentLength 文件长度
     * @param contentType   文件类型
     * @param fileName      文件索引名
     */
    public SysStorage store(InputStream inputStream, long contentLength, String contentType, String fileName) {
        String key = generateKey(fileName);
        storage.store(inputStream, contentLength, contentType, key);

        String url = generateUrl(key);
        SysStorage storageInfo = new SysStorage();
//        storageInfo.setName(fileName);
//        storageInfo.setSize((int) contentLength);
//        storageInfo.setType(contentType);
//        storageInfo.setKey(key);
//        storageInfo.setUrl(url);
        storageService.add(storageInfo);

        return storageInfo;
    }

    private String generateKey(String originalFilename) {
        int index = originalFilename.lastIndexOf('.');
        String suffix = originalFilename.substring(index);

        String key = null;
        SysStorage storageInfo = null;

        do {

            key =  CharUtil.int2hex(20) + suffix;
            storageInfo = storageService.findByKey(key);
        }
        while (storageInfo != null);

        return key;
    }

    public Stream<Path> loadAll() {
        return storage.loadAll();
    }

    public Path load(String keyName) {
        return storage.load(keyName);
    }

    public Resource loadAsResource(String keyName) {
        return storage.loadAsResource(keyName);
    }

    public void delete(String keyName) {
        storage.delete(keyName);
    }

    private String generateUrl(String keyName) {
        return storage.generateUrl(keyName);
    }
}
