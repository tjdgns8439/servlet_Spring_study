package hello.servlet.web.frontcontroller;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;


public class ModelView {
    private String viewName;//논리 이름
    private Map<String, Object> model = new HashMap<>();//데이터 담을 객체

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }


    public ModelView(String viewName) {
        this.viewName = viewName;
    }
}
