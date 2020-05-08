import org.springframework.stereotype.Repository;

@Repository
public class FakeRepo implements FakeRepoInterface {

    User array;

    @Override
    public void insertUser(long id, String name, String surname) {
        array.setId(id);
        array.setName(name);
        array.setSurname(surname);
    }

    @Override
    public void findUserById(long id) {
        if(array.getId() == id){
            System.out.println(array.getName() + array.getSurname());
        }
    }

    @Override
    public void deleteUser(long id) {
        if(array.getId() == id){
            System.out.println(array.getName() + array.getSurname() + " deleted");
        }
    }
}
