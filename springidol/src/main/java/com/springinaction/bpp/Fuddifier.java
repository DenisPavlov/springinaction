package com.springinaction.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class Fuddifier implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        try {
            for(int i=0; i < fields.length; i++) {             // Преобразует все
                if(fields[i].getType().equals(String.class)) { // строковые свойства
                                                               // компонентов
                    fields[i].setAccessible(true);
                    String original = (String) fields[i].get(bean);
                    fields[i].set(bean, fuddify(original));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return bean;
    }

    private String fuddify(String orig) { // Преобразует все строковые
        if(orig == null) return orig;     // свойства компонентов
        return orig.replaceAll("(r|l)", "w")
                .replaceAll("(R|L)", "W");
    }
}
