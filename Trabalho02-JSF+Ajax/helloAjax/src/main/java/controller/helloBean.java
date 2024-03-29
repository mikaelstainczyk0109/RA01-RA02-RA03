/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;

@Named(value = "helloBean")
@SessionScoped
public class helloBean implements Serializable {

    private String Program;
    private Date someDate;
    private String program;

    public helloBean() {
    }
       
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSayWelcome() {
        //check if null?
        if ("".equals(name) || name == null) {
            return "";
        } else {
            return "Ajax message : Welcome " + name;
        }
    }
    
    
    
    
    public String getProgram() {
        return Program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Date getSomeDate() {
        return someDate;
    }

    public void setSomeDate(Date someDate) {
        this.someDate = someDate;
    }

    public String getSayProgram() {
        String outStr = "";
        //check if null?
        if ("".equals(program) || program == null) {
            return "";
        } else {
            int num = Integer.parseInt(program);
            switch (num) {
                case 1:
                    outStr = "Programa: Tecnologias para desenvolvimento Web";
                    break;
                case 2:
                    outStr = "Programa: Oficina Certificadora";
                    break;
                case 3:
                    outStr = "Programa: Outra disciplina";
                    break;
            }
            return outStr;
        }
    }
}
