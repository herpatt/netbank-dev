package com.dhanjyothi.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhanjyothi.dao.AccountDao;
import com.dhanjyothi.model.Account;
import com.dhanjyothi.model.Beneficiaries;
import com.dhanjyothi.model.Transaction;
import com.dhanjyothi.model.User;

@Repository
public class AccountDaoImpl implements AccountDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	public Account getAccountDetails(int userId, String accountType) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, userId);
		String hql = "from Account a where a.user=:user and a.accountType=:accountType";
		List<Account> li = (List)session.createQuery(hql).setParameter("user", user).setParameter("accountType", accountType);
		Account ac = null;
		if(li!=null){
			ac = (Account) li.get(0);
		}
		
		return ac;
	}

	public void openSavingsAccount(Account account, boolean isSavingsAccountExists) throws Exception {
           if(!isSavingsAccountExists) {
        	   Session session = sessionFactory.getCurrentSession();
        	   session.persist(account);
           }
	}

	public void openTermAccount(Account account) throws Exception {
		Session session = sessionFactory.getCurrentSession();
 	    session.persist(account);
	}

	public List<Account> getTermAccountDetails(int userId, String accountType) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, userId);
		String hql = "from Account a where a.user=:user and a.accountType=:accountType";
		List<Account> li = (List)session.createQuery(hql).setParameter("user", user).setParameter("accountType", accountType);
		
		return li;
	}

	public User getUserDetails(User user) throws Exception {

		return user;
	}

	public void saveBeneficiaries(Beneficiaries beneficiaries) throws Exception {
		Session session = sessionFactory.getCurrentSession();
 	    session.persist(beneficiaries);

	}

	public Account checkAccountExists(int accountId) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Account ac = session.get(Account.class, accountId);
		
		return ac;
	}

	public List<Beneficiaries> getAllBeneficiaries(int accountId) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		//String hql = "select a.user from Account a where a.accountId = accountId";
		//List

		return null;
	}

	public void updateTransactionDetails(Transaction transaction) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(transaction);
	}

	public List<Transaction> loadAllTransactions(int accountId) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM Transaction t Where t.transactionId=:accountId";
		List<Transaction> results = (List) session.createQuery(hql).setParameter("accountId", accountId);
		
		return results;
	}

	public User isUserNameExists(String userName) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM User u Where u.userName= :userName";
		List results = (List) session.createQuery(hql).setParameter("userName", userName);
		
		User us = null;
		if(results.size()>0)
		us = (User) results.get(0);
		return us;
	}

	public User getUserById(int userId) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		User us = (User)session.get(User.class, userId);
		return us;
	}

}
