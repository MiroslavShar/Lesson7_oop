public class Gun { // Класс Пушка
    int ammoCount;

    public Gun(){
        this.reload();
    }
    public void reload(){
        this.ammoCount = 10;
    }

    public int fire(){
        this.ammoCount -= 1;
        return ammoCount;
    }


}
