package model.domain;
import java.util.Set;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity@javax.persistence.Table(name = "ROLETABLE")
public class Role
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Column(name = "IDCOLUMN")
	protected int id;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Column(name = "NAMECOLUMN")
	protected String name;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToMany(mappedBy = "role")
	protected Set<Group> group;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToMany(mappedBy = "role")
	protected Set<Privilege> privilege;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	protected Long id;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Role(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public int getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getName() {
		return this.name;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Group> getGroup() {
		if(this.group == null) {
				this.group = new HashSet<Group>();
		}
		return (Set<Group>) this.group;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Privilege> getPrivilege() {
		if(this.privilege == null) {
				this.privilege = new HashSet<Privilege>();
		}
		return (Set<Privilege>) this.privilege;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllGroup(Set<Group> newGroup) {
		if (this.group == null) {
			this.group = new HashSet<Group>();
		}
		for (Group tmp : newGroup)
			tmp.addRole(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllPrivilege(Set<Privilege> newPrivilege) {
		if (this.privilege == null) {
			this.privilege = new HashSet<Privilege>();
		}
		for (Privilege tmp : newPrivilege)
			tmp.addRole(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllGroup(Set<Group> newGroup) {
		if(this.group == null) {
			return;
		}
		
		this.group.removeAll(newGroup);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllPrivilege(Set<Privilege> newPrivilege) {
		if(this.privilege == null) {
			return;
		}
		
		this.privilege.removeAll(newPrivilege);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setId(int myId) {
		this.id = myId;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setName(String myName) {
		this.name = myName;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addGroup(Group newGroup) {
		if(this.group == null) {
			this.group = new HashSet<Group>();
		}
		
		if (this.group.add(newGroup))
			newGroup.addRole(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addPrivilege(Privilege newPrivilege) {
		if(this.privilege == null) {
			this.privilege = new HashSet<Privilege>();
		}
		
		if (this.privilege.add(newPrivilege))
			newPrivilege.addRole(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setId(long myId) {
		this.id = myId;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetId() {
		this.id = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetName() {
		this.name = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeGroup(Group oldGroup) {
		if(this.group == null)
			return;
		
		if (this.group.remove(oldGroup))
			oldGroup.removeRole(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removePrivilege(Privilege oldPrivilege) {
		if(this.privilege == null)
			return;
		
		if (this.privilege.remove(oldPrivilege))
			oldPrivilege.removeRole(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetId() {
		this.id = 0L;	
	}
	
}

