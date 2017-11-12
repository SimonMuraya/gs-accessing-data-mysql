package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Community_updates {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String water_point_id;

    private String attribute;

    private String condition;

//    public Integer getId() {
//        return id;
//    }

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getWater_point_id() {
        return water_point_id;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getCondition() {
        return attribute;
    }


}
