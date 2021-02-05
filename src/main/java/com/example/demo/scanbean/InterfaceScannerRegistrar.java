package com.example.demo.scanbean;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author zhixin.wu
 * @date 2021/2/4 17:15
 */
public class InterfaceScannerRegistrar implements ImportBeanDefinitionRegistrar, ResourceLoaderAware {
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {

    }

/*
        public void setResourceLoader(ResourceLoader resourceLoader) {

        }

        public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
            IfaceClassPathScanner ifaceClassPathScanner = new IfaceClassPathScanner(registry) ;
            ifaceClassPathScanner.addIncludeFilter(new TypeFilter() {
                public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
                    return true;
                }
            });
            AnnotationAttributes annoAttrs = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(Mock.class.getName()));
            String[] basePackages = annoAttrs.getStringArray("ifacePackages") ;
            ifaceClassPathScanner.doScan(basePackages) ;
        }*/




}
