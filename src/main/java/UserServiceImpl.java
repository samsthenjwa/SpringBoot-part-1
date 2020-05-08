public class UserServiceImpl implements FakeRepoInterface {

    User user;

    @Override
    public void insertUser(long id, String name, String surname) {

        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        System.out.println(user.getId() + user.getName() + user.getSurname());
    }

    @Override
    public void findUserById(long id) {
        user.setId(id);
        System.out.println("Hello " + user.getName());
    }

    @Override
    public void deleteUser(long id) {
        if(user.getId() == id){
            System.out.println(user.getName() + user.getSurname() + " removed");
        }
    }
}
