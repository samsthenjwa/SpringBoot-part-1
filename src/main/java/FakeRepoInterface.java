public interface FakeRepoInterface {

    public void insertUser(long id, String name, String surname);
    public void findUserById(long id);
    public void deleteUser(long id);

}
