package model;

// default package
// Generated Mar 15, 2014 7:27:54 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role")
public class Role implements java.io.Serializable {

	private Integer roleId;
	private String roleName;
	private String roleDesc;
	private Set<RolePermissionMap> rolePermissionMaps = new HashSet<RolePermissionMap>(
			0);
	private Set<AccountRoleMap> accountRoleMaps = new HashSet<AccountRoleMap>(0);

	public Role() {
	}

	public Role(final String roleName) {
		this.roleName = roleName;
	}

	public Role(final String roleName, final String roleDesc,
			final Set<RolePermissionMap> rolePermissionMaps,
			final Set<AccountRoleMap> accountRoleMaps) {
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.rolePermissionMaps = rolePermissionMaps;
		this.accountRoleMaps = accountRoleMaps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ROLE_ID", unique = true, nullable = false)
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(final Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "ROLE_NAME", nullable = false)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(final String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "ROLE_DESC", length = 65535)
	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(final String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role", cascade = {CascadeType.ALL}, orphanRemoval = true)
	public Set<RolePermissionMap> getRolePermissionMaps() {
		return this.rolePermissionMaps;
	}

	public void setRolePermissionMaps(final Set<RolePermissionMap> rolePermissionMaps) {
		this.rolePermissionMaps = rolePermissionMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role", cascade = {CascadeType.ALL}, orphanRemoval = true)
	public Set<AccountRoleMap> getAccountRoleMaps() {
		return this.accountRoleMaps;
	}

	public void setAccountRoleMaps(final Set<AccountRoleMap> accountRoleMaps) {
		this.accountRoleMaps = accountRoleMaps;
	}

}