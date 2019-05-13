package com.javaman.annotation;

import lombok.Data;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author pengzhe
 * @date 2019-05-13 09:52
 */
@Data
public class ImportBean implements ImportSelector {
    private String beanName = "importBean";

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[0];
    }


}
