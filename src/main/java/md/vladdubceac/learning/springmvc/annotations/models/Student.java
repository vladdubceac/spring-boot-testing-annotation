package md.vladdubceac.learning.springmvc.annotations.models;

import org.springframework.stereotype.Component;

@Component
public interface Student {

   public String studentInformation();

   public String getFullName();

}
