package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.nwdaf.analytics.model.NFType;
import io.nwdaf.analytics.model.PlmnId;
import io.nwdaf.analytics.model.PlmnIdNid;
import io.nwdaf.analytics.model.Snssai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains information related to the access token request
 */
@ApiModel(description = "Contains information related to the access token request")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class AccessTokenReq   {
  /**
   * Gets or Sets grantType
   */
  public enum GrantTypeEnum {
    CREDENTIALS("client_credentials");

    private String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantTypeEnum fromValue(String text) {
      for (GrantTypeEnum b : GrantTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("grant_type")
  private GrantTypeEnum grantType = null;

  @JsonProperty("nfInstanceId")
  private UUID nfInstanceId = null;

  @JsonProperty("nfType")
  private NFType nfType = null;

  @JsonProperty("targetNfType")
  private NFType targetNfType = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("targetNfInstanceId")
  private UUID targetNfInstanceId = null;

  @JsonProperty("requesterPlmn")
  private PlmnId requesterPlmn = null;

  @JsonProperty("requesterPlmnList")
  @Valid
  private List<PlmnId> requesterPlmnList = null;

  @JsonProperty("requesterSnssaiList")
  @Valid
  private List<Snssai> requesterSnssaiList = null;

  @JsonProperty("requesterFqdn")
  private String requesterFqdn = null;

  @JsonProperty("requesterSnpnList")
  @Valid
  private List<PlmnIdNid> requesterSnpnList = null;

  @JsonProperty("targetPlmn")
  private PlmnId targetPlmn = null;

  @JsonProperty("targetSnssaiList")
  @Valid
  private List<Snssai> targetSnssaiList = null;

  @JsonProperty("targetNsiList")
  @Valid
  private List<String> targetNsiList = null;

  @JsonProperty("targetNfSetId")
  private String targetNfSetId = null;

  @JsonProperty("targetNfServiceSetId")
  private String targetNfServiceSetId = null;

  @JsonProperty("hnrfAccessTokenUri")
  private String hnrfAccessTokenUri = null;

  public AccessTokenReq grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * Get grantType
   * @return grantType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public GrantTypeEnum getGrantType() {
    return grantType;
  }

  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }

  public AccessTokenReq nfInstanceId(UUID nfInstanceId) {
    this.nfInstanceId = nfInstanceId;
    return this;
  }

  /**
   * Get nfInstanceId
   * @return nfInstanceId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public UUID getNfInstanceId() {
    return nfInstanceId;
  }

  public void setNfInstanceId(UUID nfInstanceId) {
    this.nfInstanceId = nfInstanceId;
  }

  public AccessTokenReq nfType(NFType nfType) {
    this.nfType = nfType;
    return this;
  }

  /**
   * Get nfType
   * @return nfType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NFType getNfType() {
    return nfType;
  }

  public void setNfType(NFType nfType) {
    this.nfType = nfType;
  }

  public AccessTokenReq targetNfType(NFType targetNfType) {
    this.targetNfType = targetNfType;
    return this;
  }

  /**
   * Get targetNfType
   * @return targetNfType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NFType getTargetNfType() {
    return targetNfType;
  }

  public void setTargetNfType(NFType targetNfType) {
    this.targetNfType = targetNfType;
  }

  public AccessTokenReq scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="^([a-zA-Z0-9_:-]+)( [a-zA-Z0-9_:-]+)*$")   public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public AccessTokenReq targetNfInstanceId(UUID targetNfInstanceId) {
    this.targetNfInstanceId = targetNfInstanceId;
    return this;
  }

  /**
   * Get targetNfInstanceId
   * @return targetNfInstanceId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getTargetNfInstanceId() {
    return targetNfInstanceId;
  }

  public void setTargetNfInstanceId(UUID targetNfInstanceId) {
    this.targetNfInstanceId = targetNfInstanceId;
  }

  public AccessTokenReq requesterPlmn(PlmnId requesterPlmn) {
    this.requesterPlmn = requesterPlmn;
    return this;
  }

  /**
   * Get requesterPlmn
   * @return requesterPlmn
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PlmnId getRequesterPlmn() {
    return requesterPlmn;
  }

  public void setRequesterPlmn(PlmnId requesterPlmn) {
    this.requesterPlmn = requesterPlmn;
  }

  public AccessTokenReq requesterPlmnList(List<PlmnId> requesterPlmnList) {
    this.requesterPlmnList = requesterPlmnList;
    return this;
  }

  public AccessTokenReq addRequesterPlmnListItem(PlmnId requesterPlmnListItem) {
    if (this.requesterPlmnList == null) {
      this.requesterPlmnList = new ArrayList<>();
    }
    this.requesterPlmnList.add(requesterPlmnListItem);
    return this;
  }

  /**
   * Get requesterPlmnList
   * @return requesterPlmnList
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=2)   public List<PlmnId> getRequesterPlmnList() {
    return requesterPlmnList;
  }

  public void setRequesterPlmnList(List<PlmnId> requesterPlmnList) {
    this.requesterPlmnList = requesterPlmnList;
  }

  public AccessTokenReq requesterSnssaiList(List<Snssai> requesterSnssaiList) {
    this.requesterSnssaiList = requesterSnssaiList;
    return this;
  }

  public AccessTokenReq addRequesterSnssaiListItem(Snssai requesterSnssaiListItem) {
    if (this.requesterSnssaiList == null) {
      this.requesterSnssaiList = new ArrayList<>();
    }
    this.requesterSnssaiList.add(requesterSnssaiListItem);
    return this;
  }

  /**
   * Get requesterSnssaiList
   * @return requesterSnssaiList
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<Snssai> getRequesterSnssaiList() {
    return requesterSnssaiList;
  }

  public void setRequesterSnssaiList(List<Snssai> requesterSnssaiList) {
    this.requesterSnssaiList = requesterSnssaiList;
  }

  public AccessTokenReq requesterFqdn(String requesterFqdn) {
    this.requesterFqdn = requesterFqdn;
    return this;
  }

  /**
   * Get requesterFqdn
   * @return requesterFqdn
  **/
  @ApiModelProperty(value = "")
  
    public String getRequesterFqdn() {
    return requesterFqdn;
  }

  public void setRequesterFqdn(String requesterFqdn) {
    this.requesterFqdn = requesterFqdn;
  }

  public AccessTokenReq requesterSnpnList(List<PlmnIdNid> requesterSnpnList) {
    this.requesterSnpnList = requesterSnpnList;
    return this;
  }

  public AccessTokenReq addRequesterSnpnListItem(PlmnIdNid requesterSnpnListItem) {
    if (this.requesterSnpnList == null) {
      this.requesterSnpnList = new ArrayList<>();
    }
    this.requesterSnpnList.add(requesterSnpnListItem);
    return this;
  }

  /**
   * Get requesterSnpnList
   * @return requesterSnpnList
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<PlmnIdNid> getRequesterSnpnList() {
    return requesterSnpnList;
  }

  public void setRequesterSnpnList(List<PlmnIdNid> requesterSnpnList) {
    this.requesterSnpnList = requesterSnpnList;
  }

  public AccessTokenReq targetPlmn(PlmnId targetPlmn) {
    this.targetPlmn = targetPlmn;
    return this;
  }

  /**
   * Get targetPlmn
   * @return targetPlmn
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PlmnId getTargetPlmn() {
    return targetPlmn;
  }

  public void setTargetPlmn(PlmnId targetPlmn) {
    this.targetPlmn = targetPlmn;
  }

  public AccessTokenReq targetSnssaiList(List<Snssai> targetSnssaiList) {
    this.targetSnssaiList = targetSnssaiList;
    return this;
  }

  public AccessTokenReq addTargetSnssaiListItem(Snssai targetSnssaiListItem) {
    if (this.targetSnssaiList == null) {
      this.targetSnssaiList = new ArrayList<>();
    }
    this.targetSnssaiList.add(targetSnssaiListItem);
    return this;
  }

  /**
   * Get targetSnssaiList
   * @return targetSnssaiList
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<Snssai> getTargetSnssaiList() {
    return targetSnssaiList;
  }

  public void setTargetSnssaiList(List<Snssai> targetSnssaiList) {
    this.targetSnssaiList = targetSnssaiList;
  }

  public AccessTokenReq targetNsiList(List<String> targetNsiList) {
    this.targetNsiList = targetNsiList;
    return this;
  }

  public AccessTokenReq addTargetNsiListItem(String targetNsiListItem) {
    if (this.targetNsiList == null) {
      this.targetNsiList = new ArrayList<>();
    }
    this.targetNsiList.add(targetNsiListItem);
    return this;
  }

  /**
   * Get targetNsiList
   * @return targetNsiList
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1)   public List<String> getTargetNsiList() {
    return targetNsiList;
  }

  public void setTargetNsiList(List<String> targetNsiList) {
    this.targetNsiList = targetNsiList;
  }

  public AccessTokenReq targetNfSetId(String targetNfSetId) {
    this.targetNfSetId = targetNfSetId;
    return this;
  }

  /**
   * Get targetNfSetId
   * @return targetNfSetId
  **/
  @ApiModelProperty(value = "")
  
    public String getTargetNfSetId() {
    return targetNfSetId;
  }

  public void setTargetNfSetId(String targetNfSetId) {
    this.targetNfSetId = targetNfSetId;
  }

  public AccessTokenReq targetNfServiceSetId(String targetNfServiceSetId) {
    this.targetNfServiceSetId = targetNfServiceSetId;
    return this;
  }

  /**
   * Get targetNfServiceSetId
   * @return targetNfServiceSetId
  **/
  @ApiModelProperty(value = "")
  
    public String getTargetNfServiceSetId() {
    return targetNfServiceSetId;
  }

  public void setTargetNfServiceSetId(String targetNfServiceSetId) {
    this.targetNfServiceSetId = targetNfServiceSetId;
  }

  public AccessTokenReq hnrfAccessTokenUri(String hnrfAccessTokenUri) {
    this.hnrfAccessTokenUri = hnrfAccessTokenUri;
    return this;
  }

  /**
   * Get hnrfAccessTokenUri
   * @return hnrfAccessTokenUri
  **/
  @ApiModelProperty(value = "")
  
    public String getHnrfAccessTokenUri() {
    return hnrfAccessTokenUri;
  }

  public void setHnrfAccessTokenUri(String hnrfAccessTokenUri) {
    this.hnrfAccessTokenUri = hnrfAccessTokenUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenReq accessTokenReq = (AccessTokenReq) o;
    return Objects.equals(this.grantType, accessTokenReq.grantType) &&
        Objects.equals(this.nfInstanceId, accessTokenReq.nfInstanceId) &&
        Objects.equals(this.nfType, accessTokenReq.nfType) &&
        Objects.equals(this.targetNfType, accessTokenReq.targetNfType) &&
        Objects.equals(this.scope, accessTokenReq.scope) &&
        Objects.equals(this.targetNfInstanceId, accessTokenReq.targetNfInstanceId) &&
        Objects.equals(this.requesterPlmn, accessTokenReq.requesterPlmn) &&
        Objects.equals(this.requesterPlmnList, accessTokenReq.requesterPlmnList) &&
        Objects.equals(this.requesterSnssaiList, accessTokenReq.requesterSnssaiList) &&
        Objects.equals(this.requesterFqdn, accessTokenReq.requesterFqdn) &&
        Objects.equals(this.requesterSnpnList, accessTokenReq.requesterSnpnList) &&
        Objects.equals(this.targetPlmn, accessTokenReq.targetPlmn) &&
        Objects.equals(this.targetSnssaiList, accessTokenReq.targetSnssaiList) &&
        Objects.equals(this.targetNsiList, accessTokenReq.targetNsiList) &&
        Objects.equals(this.targetNfSetId, accessTokenReq.targetNfSetId) &&
        Objects.equals(this.targetNfServiceSetId, accessTokenReq.targetNfServiceSetId) &&
        Objects.equals(this.hnrfAccessTokenUri, accessTokenReq.hnrfAccessTokenUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, nfInstanceId, nfType, targetNfType, scope, targetNfInstanceId, requesterPlmn, requesterPlmnList, requesterSnssaiList, requesterFqdn, requesterSnpnList, targetPlmn, targetSnssaiList, targetNsiList, targetNfSetId, targetNfServiceSetId, hnrfAccessTokenUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenReq {\n");
    
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    nfInstanceId: ").append(toIndentedString(nfInstanceId)).append("\n");
    sb.append("    nfType: ").append(toIndentedString(nfType)).append("\n");
    sb.append("    targetNfType: ").append(toIndentedString(targetNfType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    targetNfInstanceId: ").append(toIndentedString(targetNfInstanceId)).append("\n");
    sb.append("    requesterPlmn: ").append(toIndentedString(requesterPlmn)).append("\n");
    sb.append("    requesterPlmnList: ").append(toIndentedString(requesterPlmnList)).append("\n");
    sb.append("    requesterSnssaiList: ").append(toIndentedString(requesterSnssaiList)).append("\n");
    sb.append("    requesterFqdn: ").append(toIndentedString(requesterFqdn)).append("\n");
    sb.append("    requesterSnpnList: ").append(toIndentedString(requesterSnpnList)).append("\n");
    sb.append("    targetPlmn: ").append(toIndentedString(targetPlmn)).append("\n");
    sb.append("    targetSnssaiList: ").append(toIndentedString(targetSnssaiList)).append("\n");
    sb.append("    targetNsiList: ").append(toIndentedString(targetNsiList)).append("\n");
    sb.append("    targetNfSetId: ").append(toIndentedString(targetNfSetId)).append("\n");
    sb.append("    targetNfServiceSetId: ").append(toIndentedString(targetNfServiceSetId)).append("\n");
    sb.append("    hnrfAccessTokenUri: ").append(toIndentedString(hnrfAccessTokenUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
