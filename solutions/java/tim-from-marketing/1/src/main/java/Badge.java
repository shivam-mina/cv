class Badge {
    public String print(Integer id, String name, String department) {
        String a,c;
        a = null == id ? "" : "[" + String.valueOf(id) + "] - ";
        c= null == department ? " - OWNER" : " - " + department.toUpperCase();
        return a + name + c ;
    }
}
