package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscribers {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String water_point_id;

    private String session_chat_id;

    private String telegram_chat_id;

    private String province;

    private String district;

    private String chiefdom;

    public Integer getId() {
        return id;
    }

    public String getWater_point_id() {
        return water_point_id;
    }

    public String getSession_chat_id() {
        return session_chat_id;
    }

    public String getTelegram_chat_id() {
        return telegram_chat_id;
    }

    public String getProvince() {
        return province;
    }

    public String getDistrict() {
        return district;
    }

    public String getChiefdom() {
        return chiefdom;
    }
}
