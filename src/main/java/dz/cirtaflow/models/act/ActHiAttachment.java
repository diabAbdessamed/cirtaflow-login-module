/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.cirtaflow.models.act;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author diab
 */
@Entity
@Table(name = "ACT_HI_ATTACHMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActHiAttachment.findAll", query = "SELECT a FROM ActHiAttachment a")
    , @NamedQuery(name = "ActHiAttachment.findById", query = "SELECT a FROM ActHiAttachment a WHERE a.id = :id")
    , @NamedQuery(name = "ActHiAttachment.findByRev", query = "SELECT a FROM ActHiAttachment a WHERE a.rev = :rev")
    , @NamedQuery(name = "ActHiAttachment.findByUserId", query = "SELECT a FROM ActHiAttachment a WHERE a.userId = :userId")
    , @NamedQuery(name = "ActHiAttachment.findByName", query = "SELECT a FROM ActHiAttachment a WHERE a.name = :name")
    , @NamedQuery(name = "ActHiAttachment.findByDescription", query = "SELECT a FROM ActHiAttachment a WHERE a.description = :description")
    , @NamedQuery(name = "ActHiAttachment.findByType", query = "SELECT a FROM ActHiAttachment a WHERE a.type = :type")
    , @NamedQuery(name = "ActHiAttachment.findByTaskId", query = "SELECT a FROM ActHiAttachment a WHERE a.taskId = :taskId")
    , @NamedQuery(name = "ActHiAttachment.findByProcInstId", query = "SELECT a FROM ActHiAttachment a WHERE a.procInstId = :procInstId")
    , @NamedQuery(name = "ActHiAttachment.findByUrl", query = "SELECT a FROM ActHiAttachment a WHERE a.url = :url")
    , @NamedQuery(name = "ActHiAttachment.findByContentId", query = "SELECT a FROM ActHiAttachment a WHERE a.contentId = :contentId")
    , @NamedQuery(name = "ActHiAttachment.findByTime", query = "SELECT a FROM ActHiAttachment a WHERE a.time = :time")})
public class ActHiAttachment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_", nullable = false, length = 64)
    private String id;
    @Column(name = "REV_")
    private Integer rev;
    @Column(name = "USER_ID_", length = 255)
    private String userId;
    @Column(name = "NAME_", length = 255)
    private String name;
    @Column(name = "DESCRIPTION_", length = 4000)
    private String description;
    @Column(name = "TYPE_", length = 255)
    private String type;
    @Column(name = "TASK_ID_", length = 64)
    private String taskId;
    @Column(name = "PROC_INST_ID_", length = 64)
    private String procInstId;
    @Column(name = "URL_", length = 4000)
    private String url;
    @Column(name = "CONTENT_ID_", length = 64)
    private String contentId;
    @Column(name = "TIME_")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    public ActHiAttachment() {
    }

    public ActHiAttachment(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRev() {
        return rev;
    }

    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActHiAttachment)) {
            return false;
        }
        ActHiAttachment other = (ActHiAttachment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cirtaflow.business.cirtaflow.ActHiAttachment[ id=" + id + " ]";
    }
    
}
