package personal.entity;

import java.util.Date;

public class VoteAdvertising {

	private Long advId;

    private Long vId;

    private Long copId;

    private Integer channelName;

    private String positionName;

    private String advTag;

    private Integer advType;

    private Date createTime;

    private Date endTime;

    private Integer advNum;

    private Integer tlength;

    private Double gwidth;

    private Double gheight;

    private Double gpwidth;

    private Double gpheight;

    private Integer advOrder;

    public Long getAdvId() {
        return advId;
    }

    public void setAdvId(Long advId) {
        this.advId = advId;
    }

    public Long getvId() {
        return vId;
    }

    public void setvId(Long vId) {
        this.vId = vId;
    }

    public Long getCopId() {
        return copId;
    }

    public void setCopId(Long copId) {
        this.copId = copId;
    }

    public Integer getChannelName() {
        return channelName;
    }

    public void setChannelName(Integer channelName) {
        this.channelName = channelName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getAdvTag() {
        return advTag;
    }

    public void setAdvTag(String advTag) {
        this.advTag = advTag == null ? null : advTag.trim();
    }

    public Integer getAdvType() {
        return advType;
    }

    public void setAdvType(Integer advType) {
        this.advType = advType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getAdvNum() {
        return advNum;
    }

    public void setAdvNum(Integer advNum) {
        this.advNum = advNum;
    }

    public Integer getTlength() {
        return tlength;
    }

    public void setTlength(Integer tlength) {
        this.tlength = tlength;
    }

    public Double getGwidth() {
        return gwidth;
    }

    public void setGwidth(Double gwidth) {
        this.gwidth = gwidth;
    }

    public Double getGheight() {
        return gheight;
    }

    public void setGheight(Double gheight) {
        this.gheight = gheight;
    }

    public Double getGpwidth() {
        return gpwidth;
    }

    public void setGpwidth(Double gpwidth) {
        this.gpwidth = gpwidth;
    }

    public Double getGpheight() {
        return gpheight;
    }

    public void setGpheight(Double gpheight) {
        this.gpheight = gpheight;
    }

    public Integer getAdvOrder() {
        return advOrder;
    }

    public void setAdvOrder(Integer advOrder) {
        this.advOrder = advOrder;
    }
    
    @Override
   	public String toString() {
   		return "VoteAdvertising [advId=" + advId + ", positionName=" + positionName + ", createTime=" + createTime
   				+ "]";
   	}
}