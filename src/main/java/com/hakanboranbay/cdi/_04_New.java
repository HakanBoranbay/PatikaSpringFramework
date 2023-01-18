package com.hakanboranbay.cdi;

import com.hakanboranbay.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New implements Serializable {

    // üretilen
    @Produces
    public String uretilenData( @New StudentDto studentDto) {
        studentDto = StudentDto.builder().studentId(0L).studentName("Hakan").build();
        return studentDto.getStudentName();
    }

    @Getter
    @Inject
    private String tuketilenData;

}
