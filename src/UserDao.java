public class UserDao {
	static User user;
	UserDao(){
		user = new User();
	}
	public User getUser() {
		return UserDao.user;
	}
}
