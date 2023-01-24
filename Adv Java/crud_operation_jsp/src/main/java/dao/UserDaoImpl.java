package dao;

import pojos.User;
import org.hibernate.*;
import static utils.DbUtils.getSF;

public class UserDaoImpl implements UserDao {

	@Override
	public String addUserDetails(User user) {
		// 1. get hibernate session from sf
		Session session = getSF().getCurrentSession();// getcurrent for not req close method
		Transaction tf = session.beginTransaction();
		String msg = "Adding User Failed";
		try {
			// session API : public serializable save(Object transiObj) throw hibernate exp
			Integer id = (Integer) session.save(user);
			tf.commit();
			msg = "Added User Details" + id;
		} catch (RuntimeException re) {
			if (tf != null)
				tf.rollback();
			// re throw the same exp to caller
			throw re;
		}
		return msg;
	}
}
