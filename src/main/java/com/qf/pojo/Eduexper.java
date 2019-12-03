package com.qf.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "eduexper")
@Data
@Component
//简历表  教育经历
public class Eduexper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String school;
    private String major;//专业
    private String academic;//学历
    private Date inschool;//入学时间
    private Date outschool;//离校时间
    private String exper;//经历
}
