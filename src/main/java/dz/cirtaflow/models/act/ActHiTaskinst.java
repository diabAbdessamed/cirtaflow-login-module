/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.cirtaflow.models.act;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author diab
 */
@Entity
@Table(name = "ACT_HI_TASKINST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActHiTaskinst.findAll", query = "SELECT a FROM ActHiTaskinst a")
    , @NamedQuery(name = "ActHiTaskinst.findById", query = "SELECT a FROM ActHiTaskinst a WHERE a.id = :id")
    , @NamedQuery(name = "ActHiTaskinst.findByProcDefId", query = "SELECT a FROM ActHiTaskinst a WHERE a.procDefId = :procDefId")
    , @NamedQuery(name = "ActHiTaskinst.findByTaskDefKey", query = "SELECT a FROM ActHiTaskinst a WHERE a.taskDefKey = :taskDefKey")
    , @NamedQuery(name = "ActHiTaskinst.findByProcInstId", query = "SELECT a FROM ActHiTaskinst a WHERE a.procInstId = :procInstId")
    , @NamedQuery(name = "ActHiTaskinst.findByExecutionId", query = "SELECT a FROM ActHiTaskinst a WHERE a.executionId = :executionId")
    , @NamedQuery(name = "ActHiTaskinst.findByName", query = "SELECT a FROM ActHiTaskinst a WHERE a.name = :name")
    , @NamedQuery(name = "ActHiTaskinst.findByParentTaskId", query = "SELECT a FROM ActHiTaskinst a WHERE a.parentTaskId = :parentTaskId")
    , @NamedQuery(name = "ActHiTaskinst.findByDescription", query = "SELECT a FROM ActHiTaskinst a WHERE a.description = :description")
    , @NamedQuery(name = "ActHiTaskinst.findByOwner", query = "SELECT a FROM ActHiTaskinst a WHERE a.owner = :owner")
    , @NamedQuery(name = "ActHiTaskinst.findByAssignee", query = "SELECT a FROM ActHiTaskinst a WHERE a.assignee = :assignee")
    , @NamedQuery(name = "ActHiTaskinst.findByStartTime", query = "SELECT a FROM ActHiTaskinst a WHERE a.startTime = :startTime")
    , @NamedQuery(name = "ActHiTaskinst.findByClaimTime", query = "SELECT a FROM ActHiTaskinst a WHERE a.claimTime = :claimTime")
    , @NamedQuery(name = "ActHiTaskinst.findByEndTime", query = "SELECT a FROM ActHiTaskinst a WHERE a.endTime = :endTime")
    , @NamedQuery(name = "ActHiTaskinst.findByDuration", query = "SELECT a FROM ActHiTaskinst a WHERE a.duration = :duration")
    , @NamedQuery(name = "ActHiTaskinst.findByDeleteReason", query = "SELECT a FROM ActHiTaskinst a WHERE a.deleteReason = :deleteReason")
    , @NamedQuery(name = "ActHiTaskinst.findByPriority", query = "SELECT a FROM ActHiTaskinst a WHERE a.priority = :priority")
    , @NamedQuery(name = "ActHiTaskinst.findByDueDate", query = "SELECT a FROM ActHiTaskinst a WHERE a.dueDate = :dueDate")
    , @NamedQuery(name = "ActHiTaskinst.findByFormKey", query = "SELECT a FROM ActHiTaskinst a WHERE a.formKey = :formKey")
    , @NamedQuery(name = "ActHiTaskinst.findByCategory", query = "SELECT a FROM ActHiTaskinst a WHERE a.category = :category")
    , @NamedQuery(name = "ActHiTaskinst.findByTenantId", query = "SELECT a FROM ActHiTaskinst a WHERE a.tenantId = :tenantId")})
public class ActHiTaskinst implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_", nullable = false, length = 64)
    private String id;
    @Column(name = "PROC_DEF_ID_", length = 64)
    private String procDefId;
    @Column(name = "TASK_DEF_KEY_", length = 255)
    private String taskDefKey;
    @Column(name = "PROC_INST_ID_", length = 64)
    private String procInstId;
    @Column(name = "EXECUTION_ID_", length = 64)
    private String executionId;
    @Column(name = "NAME_", length = 255)
    private String name;
    @Column(name = "PARENT_TASK_ID_", length = 64)
    private String parentTaskId;
    @Column(name = "DESCRIPTION_", length = 4000)
    private String description;
    @Column(name = "OWNER_", length = 255)
    private String owner;
    @Column(name = "ASSIGNEE_", length = 255)
    private String assignee;
    @Basic(optional = false)
    @Column(name = "START_TIME_", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "CLAIM_TIME_")
    @Temporal(TemporalType.TIMESTAMP)
    private Date claimTime;
    @Column(name = "END_TIME_")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "DURATION_")
    private BigInteger duration;
    @Column(name = "DELETE_REASON_", length = 4000)
    private String deleteReason;
    @Column(name = "PRIORITY_")
    private Integer priority;
    @Column(name = "DUE_DATE_")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    @Column(name = "FORM_KEY_", length = 255)
    private String formKey;
    @Column(name = "CATEGORY_", length = 255)
    private String category;
    @Column(name = "TENANT_ID_", length = 255)
    private String tenantId;

    public ActHiTaskinst() {
    }

    public ActHiTaskinst(String id) {
        this.id = id;
    }

    public ActHiTaskinst(String id, Date startTime) {
        this.id = id;
        this.startTime = startTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    public String getTaskDefKey() {
        return taskDefKey;
    }

    public void setTaskDefKey(String taskDefKey) {
        this.taskDefKey = taskDefKey;
    }

    public String getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getClaimTime() {
        return claimTime;
    }

    public void setClaimTime(Date claimTime) {
        this.claimTime = claimTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigInteger getDuration() {
        return duration;
    }

    public void setDuration(BigInteger duration) {
        this.duration = duration;
    }

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getFormKey() {
        return formKey;
    }

    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
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
        if (!(object instanceof ActHiTaskinst)) {
            return false;
        }
        ActHiTaskinst other = (ActHiTaskinst) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cirtaflow.business.cirtaflow.ActHiTaskinst[ id=" + id + " ]";
    }
    
}
