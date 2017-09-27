package st.malike.auth.server.model.additionals;

import st.malike.auth.server.model.ClientDetail;

import javax.persistence.*;

@Table(name = "t_additional_information")
@Entity
public class AdditionalInformation {
    @Id
    private Integer additionalInformationId;
    @ManyToOne
    @JoinColumn(name = "client_detail_id")
    private ClientDetail clientDetail;
    private String mapKey;
    private String mapValue;

    public Integer getAdditionalInformationId() {
        return additionalInformationId;
    }

    public void setAdditionalInformationId(Integer additionalInformationId) {
        this.additionalInformationId = additionalInformationId;
    }

    public ClientDetail getClientDetail() {
        return clientDetail;
    }

    public void setClientDetail(ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }

    public String getMapKey() {
        return mapKey;
    }

    public void setMapKey(String mapKey) {
        this.mapKey = mapKey;
    }

    public String getMapValue() {
        return mapValue;
    }

    public void setMapValue(String mapValue) {
        this.mapValue = mapValue;
    }
}
