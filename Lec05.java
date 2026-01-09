void main() {
    User john = new User("John" ,1954,2,18);
    john.displayInfo();
    Admin nicolas = new Admin("Nicolas",1964,1,7);
    nicolas.displayInfo(true);
    nicolas.displayInfo(false);
}
