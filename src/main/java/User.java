


public class User<T> {
    Integer id;
    String name;
    String password;
    T data;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public User(int id, String name, T data) {
        this.id = id;
        this.name = name;
        System.out.println(data.getClass());
        this.data = data;
    }
    public void m(T data){
        System.out.println(data);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }
}
