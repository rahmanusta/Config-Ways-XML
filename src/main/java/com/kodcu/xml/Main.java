package com.kodcu.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 9/22/12
 * Time: 9:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config-xml.xml");
        /*
        Alternatif

        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/resources/spring-config-xml.xml");
        */

        Galeri galeri = context.getBean("galeri", Galeri.class);

        /* Alternatif

        Galeri galeri = context.getBean(Galeri.class);
        Galeri galeri = (Galeri) context.getBean("galeri");
        */

        galeri.getArac().calis();

    }

}
