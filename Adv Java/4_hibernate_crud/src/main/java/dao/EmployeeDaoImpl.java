package dao;

import static utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Department;
import pojos.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String addEmpDetails(Employee newEmp) {
		// newEmp : TRANSIENT
		String mesg = "Adding emp failed !!!!!!!!!!!!!!";
		// 1. get Session from SF(session factory)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		try {
			// Session API : public Serializable save(Object
			// transientObjRef) throws HibernateExc.
			Long empId = (Long) session.save(newEmp);
			// newEmp : PERSISTENT => entity ref added to L1 cache
			tx.commit();// Hibernate perform auto. dirty chking --> session.flush()
			// DML --insert --session.close() => L1 cache destroyed ,
			// rets DB cn to the DBCP
			// (db connection pool)
			// newEmp : DETACHED (from L1 cache)
			mesg = "Added emp details , ID =" + empId;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller :
			// so that caller will know about the exc
			throw e;
		}
		return mesg;
	}

	@Override
	public List<Employee> getEmpsByDeptAndSalary(Department dept, double minSal) {
		List<Employee> emps = null;
		String jpql = "select e from Employee e where e.dept=:department and e.salary > :sal";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			emps = session.createQuery(jpql, Employee.class).setParameter("department", dept)
					.setParameter("sal", minSal).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return emps;
	}

	@Override
	public List<Employee> getEmpWithSpecificDetails() {
		List<Employee> emps = null;
		String jpql = "select new pojos.Employee(empId,firstName,lastName,salary) from Employee e where e.isPermanent=true";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			emps = session.createQuery(jpql, Employee.class).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return emps;
	}

	@Override
	public String transferAndRaise(String fn, String ln, Department dept, double sal) {
		String jpql = "select e from Employee e where e.firstName=:first and e.lastName=:last";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		Employee emp = null;
		String msg = "Failed";
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			emp = session.createQuery(jpql, Employee.class).setParameter("first", fn).setParameter("last", ln)
					.getSingleResult();
			emp.setDept(dept);
			emp.setSalary(sal);
			msg = "success";
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return msg;
	}

	@Override
	public String deleteAllTempEmp(Department department) {
		String jpql = "select e from Employee e where e.dept=:dept";
		String msg = "failed";
		List<Employee> list = null;
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			list = session.createQuery(jpql, Employee.class).setParameter("dept", department).getResultList();
			list.forEach(e -> session.delete(e));
			msg = "success" + list.size();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return msg;
	}
}
