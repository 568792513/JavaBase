package classLoader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderTest {
    public static void main(String[] args) throws IOException {

        // 获取系统类加载器
        ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器： " + systemLoader);
        /*
        获取系统类加载器的加载路径——通常由CLASSPATH环境变量指定
        如果操作系统没有指定CLASSPATH环境变量，则默认以当前路径作为系统类加载器的加载路径
         */
        Enumeration<URL> em1 = systemLoader.getResources("");
        while (em1.hasMoreElements()) {
            System.out.println("加载路径: " + em1.nextElement());
        }
        // 获取系统类加载器的父类加载器，得到扩展类加载器
        ClassLoader extensionLoader = systemLoader.getParent();
        System.out.println("扩展类加载器： " + extensionLoader);
        System.out.println("加载路径： " + System.getProperty("java.ext.dirs"));
        System.out.println("根类加载器： " + extensionLoader.getParent());
    }
}
