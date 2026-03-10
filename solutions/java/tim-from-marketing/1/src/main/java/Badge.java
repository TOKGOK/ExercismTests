class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder sb = new StringBuilder();
        if(id != null){
            sb.append("[").append(id).append("] - ");
        }
        return sb.append(name).append(" - ")
            .append(department == null ? "OWNER" : department.toUpperCase() ).toString();
    }
}
