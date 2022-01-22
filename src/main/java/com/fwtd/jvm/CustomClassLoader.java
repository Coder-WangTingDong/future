package com.fwtd.jvm;

/**
 * @classname: CustomClassLoader
 * @description: 自定义classloader
 * @date: 2021/12/16/9:26 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class CustomClassLoader extends ClassLoader{

    private final String FILE_PATH = "";

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // 将全路径名中"."转换为"/",拼接后缀.class(concat() 方法用于将指定的字符串参数连接到字符串上。)
        final String replaceName = name.replaceAll(".", "/").concat(".class");
        // 文件路径名
        String fileName = FILE_PATH + replaceName;

        return super.findClass(name);
    }
}
