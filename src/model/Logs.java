package model;
// default package
// Generated Mar 15, 2014 7:27:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Logs generated by hbm2java
 */
@Entity
@Table(name = "logs")
public class Logs implements java.io.Serializable {

	private Integer logId;
	private Account account;
	private Date logDate;
	private String logger;
	private String level;
	private String message;

	public Logs() {
	}

	public Logs(Account account, Date logDate, String logger, String level) {
		this.account = account;
		this.logDate = logDate;
		this.logger = logger;
		this.level = level;
	}

	public Logs(Account account, Date logDate, String logger, String level,
			String message) {
		this.account = account;
		this.logDate = logDate;
		this.logger = logger;
		this.level = level;
		this.message = message;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "LOG_ID", unique = true, nullable = false)
	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACC_ID", nullable = true)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOG_DATE", nullable = false, length = 19)
	public Date getLogDate() {
		return this.logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	@Column(name = "LOGGER", nullable = false, length = 100)
	public String getLogger() {
		return this.logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	}

	@Column(name = "LEVEL", nullable = false, length = 10)
	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Column(name = "MESSAGE", length = 1000)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}